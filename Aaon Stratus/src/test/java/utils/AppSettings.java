package utils;

public class AppSettings {
	public static final int MAX_RETRIES = 1;
	//public static final String DOWNLOADS="D:\\a\\1\\s\\";   //folder path where app download, should end with double slash "\\"
	public static final String DOWNLOADS="C:\\Users\\PrakashArulmani\\Downloads\\";
	public static String APP_FOLDER="Yocto-win32-ia32 (5) 2";
	public static final String APP_PATH = DOWNLOADS+APP_FOLDER+"\\stratus_ui\\stratus_ui.exe";


	public static String APP_DOWNLOAD_PATH = "https://aaonqastratusstacc.blob.core.windows.net/aaon-stratus-qa-blob-windows/Yocto-win32-ia32.zip";
	public static final String variableValue = System.getenv("Build.SourceBranchName");

	public static void setAppDownloadPath() {

		System.out.println("variableValue:"+variableValue);
		if (variableValue != null) {
			switch (variableValue) {

			case "dev_automation_pipeline":
				APP_DOWNLOAD_PATH = "https://aaondevstratusstacc.blob.core.windows.net/aaon-stratus-dev-blob-windows/windows_build.zip";
				APP_FOLDER="windows_build";
				break;

			case "qa_automation_pipeline":
				APP_DOWNLOAD_PATH = "https://aaonqastratusstacc.blob.core.windows.net/aaon-stratus-qa-blob-windows/Yocto-win32-ia32.zip";
				break;

			case "stratus-uat":
				APP_DOWNLOAD_PATH = "https://aaonuatstratusstacc.blob.core.windows.net/aaon-stratus-uat-blob-windows/Yocto-win32-ia32.zip";
				break;

			case "Main":
				APP_DOWNLOAD_PATH = "https://aaonmainstratusstacc.blob.core.windows.net/aaon-stratus-main-blob-windows/Yocto-win32-ia32.zip";
				break;
			}
		}
	}
}

