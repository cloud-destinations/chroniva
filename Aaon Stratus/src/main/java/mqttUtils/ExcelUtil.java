package mqttUtils;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	private static Workbook workbook;
	private static final Map<String, Sheet> sheets = new HashMap<>();

	static {
		loadWorkbook("Dev status - Configuration Topic Alignment Mastersheet1.2.0.xlsx");
	}

	public static void loadWorkbook(String fileName) {
		try {
			InputStream is = ExcelUtil.class.getClassLoader().getResourceAsStream("TestData/" + fileName);
			if (is == null)
				throw new RuntimeException("Excel file not found: " + fileName);
			workbook = new XSSFWorkbook(is);
		} catch (Exception e) {
			throw new RuntimeException("Failed to load Excel workbook: " + e.getMessage(), e);
		}
	}

	public static void loadSheet(String sheetName) {
		if (workbook == null)
			throw new IllegalStateException("Workbook not loaded.");
		Sheet sheet = workbook.getSheet(sheetName);
		if (sheet == null)
			throw new RuntimeException("Sheet not found: " + sheetName);
		sheets.put(sheetName, sheet);
	}

	public static Map<String, String> readRow(String sheetName, int rowNum) {
		Sheet sheet = sheets.get(sheetName);
		if (sheet == null)
			throw new IllegalStateException("Sheet not loaded: " + sheetName);
		Row headerRow = sheet.getRow(0);
		Row dataRow = sheet.getRow(rowNum - 1);
		if (dataRow == null)
			throw new RuntimeException("Row not found: " + rowNum);

		Map<String, String> rowData = new LinkedHashMap<>();
		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			String header = headerRow.getCell(i) != null ? headerRow.getCell(i).toString().trim() : "Col" + i;
			String value = dataRow.getCell(i) != null ? getCellValue(dataRow.getCell(i)) : "";
			rowData.put(header, value);
		}
		return rowData;
	}

	private static String getCellValue(Cell cell) {
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue().trim();
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case FORMULA:
			return cell.getCellFormula();
		case BLANK:
			return "";
		default:
			return cell.toString().trim();
		}
	}

	public static void loadSheetIgnoreCase(String requestedSheetName) {
		if (workbook == null)
			throw new IllegalStateException("Workbook not loaded.");

		for (Sheet sheet : workbook) {
			if (sheet.getSheetName().equalsIgnoreCase(requestedSheetName)) {
				sheets.put(requestedSheetName, sheet);
				return;
			}
		}
		throw new RuntimeException("Sheet not found (case-insensitive): " + requestedSheetName);
	}

	public static String getCellValue(String sheetName, int rowNum, String columnName) {
		Sheet sheet = sheets.get(sheetName);
		if (sheet == null)
			throw new IllegalStateException("Sheet not loaded: " + sheetName);

		Row headerRow = sheet.getRow(0);
		int colIndex = -1;

		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			String header = headerRow.getCell(i) != null ? headerRow.getCell(i).toString().trim() : "";
			if (header.equalsIgnoreCase(columnName)) {
				colIndex = i;
				break;
			}
		}

		if (colIndex == -1)
			throw new RuntimeException("Column not found: " + columnName);

		Row dataRow = sheet.getRow(rowNum - 1);
		if (dataRow == null || dataRow.getCell(colIndex) == null)
			return "";

		return getCellValue(dataRow.getCell(colIndex));
	}

	public static List<String> getAllPayloads(String sheetName, String columnName) {
		Sheet sheet = sheets.get(sheetName);
		if (sheet == null)
			throw new IllegalStateException("Sheet not loaded: " + sheetName);
		Row headerRow = sheet.getRow(0);
		int colIndex = -1;

		for (int i = 0; i < headerRow.getLastCellNum(); i++) {
			if (headerRow.getCell(i).toString().trim().equalsIgnoreCase(columnName)) {
				colIndex = i;
				break;
			}
		}
		if (colIndex == -1)
			throw new RuntimeException("Column not found: " + columnName);

		List<String> payloads = new ArrayList<>();
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			if (row != null && row.getCell(colIndex) != null) {
				String value = getCellValue(row.getCell(colIndex));
				if (!value.isEmpty())
					payloads.add(value);
			}
		}
		return payloads;
	}
}
