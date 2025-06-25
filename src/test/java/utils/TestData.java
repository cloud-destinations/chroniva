package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestData {
	
	public static final ArrayList<String> EXPECTED_TABS_NAMES = new ArrayList<>(Arrays.asList("Supply Fans", "Return Fans", "Exhaust Fans"));
	public static final ArrayList<String> EXPECTED_DAYS_NAMES = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Holiday"));
	                                                                                       
	public static final ArrayList<String> EXPECTED_MONTH_NAMES = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

	public static final ArrayList<String> EXPECTED_LABELS_TESTPAGE = new ArrayList<>(Arrays.asList("Fans", "Dampers", "Heat Wheel", "Heating", "Dehum", "Pre-heat", "Heat Pump", "Cooling"));
	public static final ArrayList<String> EXPECTED_TABS_FANS = new ArrayList<>(Arrays.asList("Supply Fans", "Return Fans", "Exhaust Fans"));
	
	public static final ArrayList<String> EXPECTED_TABS_SETTINGS = new ArrayList<>(Arrays.asList("App Mode", "Display", "Time", "Temp Scale"));
	            
	public static final ArrayList<String> EXPECTED_TABS_SETTINGS_AFTER_LOGIN = new ArrayList<>(Arrays.asList("App Mode", "Display", "Time", "Temp Scale", "User Settings"));
	
	public static final String password = "Testuser@123";
	public static final String pin = "12121212";
	public static final ArrayList<String> User_Table_Header_Name = new ArrayList<>(Arrays.asList("Name", "Password", "PIN", "Role"));
	public static final String fullname = "Pavithra Babu";

	public static final HashSet<String> EXPECTED_MONITORING_DASHBOARD_VALUES = new HashSet<>(Arrays.asList("Space Temperature","Space Temperature Setpoint","Space Air Humidity","Outdoor Air Damper Position","Supply Air Temperature","Supply Air Temperature Setpoint","Supply Air Humidity","Outdoor Air Temperature","Building Pressure","Building Pressure Setpoint","Exhaust Fan Speed","Outdoor Air Humidity","Duct Static Pressure","Duct Static Pressure Setpoint","Supply Fan Speed","Outdoor Air CFM"));
	public static final ArrayList<String> EXPECTED_TEMPERATURE_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Supply Air Temperature", "Supply Air Temperature Setpoint", "Return Air Temperature", "Outdoor Air Temperature", "Space Temperature", "Space Temperature Setpoint"));
	public static final ArrayList<String> EXPECTED_PRESSURE_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Duct Static Pressure", "Duct Static Pressure Setpoint", "Building Pressure", "Building Pressure Setpoint", "Plenum Pressure" ));
	
	public static final ArrayList<String> EXPECTED_HUMIDITY_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Supply Air Humidity", "Return Air Humidity", "Outdoor Air Humidity", "Space Air Humidity"));
	public static final ArrayList<String> EXPECTED_DAMPER_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Minimum Damper Position", "Exhaust Damper Position", "Outdoor Air Damper Position", "Return Air Damper Position", "Return Air Bypass Damper Position", "Heat Wheel Bypass Damper Position"));
	public static final ArrayList<String> EXPECTED_FANS_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Supply Fan Speed", "Return Fan Speed", "Exhaust Fan Speed", "Condenser Fan Speed"));	
	public static final ArrayList<String> EXPECTED_Filter_By = new ArrayList<>(Arrays.asList("EVAC", "Charge", "Test", "Air Balance", "Alarms"));
    //Settings	
	public static final ArrayList<String> EXPECTED_AIRFLOW_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Outdoor Air CFM"	));
	public static final ArrayList<String> EXPECTED_MISC_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList("Superheat", "Superheat Setpoint", "Subcooling", "CO2 Level", "CO2 Level Setpoint"));
	public static final ArrayList<String> EXPECTED_TELEMETRY_VALUES = new ArrayList<>(Arrays.asList( "Temperature", "Humidity", "Pressure", "Damper", "Fans", "Airflow", "Misc."));
	                                                                                               
	public static final ArrayList<String> EXPECTED_SPACETEMP_VALUES = new ArrayList<>(Arrays.asList( "Occupied Space Temp SP", "Unoccupied Space Temp SP",	"Occupied Cooling Setpoint", "Unoccupied Cooling Setpoint", "Occupied Heating Setpoint", "Unoccupied Heating Setpoint" ));
	public static final ArrayList<String> EXPECTED_MODE_VALUES = new ArrayList<>(Arrays.asList( "Cool", "Heat", "Auto", "Vent" ));
	public static final ArrayList<String> EXPECTED_ECONOMIZER_VALUES = new ArrayList<>(Arrays.asList( "Economizer Setpoint", "Economizer Position", "Coil Setpoint High Reset Limit", "Comp Eco Enabled Setpoint", "Comp Eco Enabled Deadband" ));
	public static final ArrayList<String> EXPECTED_SCHDULE_VALUES = new ArrayList<>(Arrays.asList( "Auto", "Force Occupied", "Force Unoccupied" ));
    //unit settings
	public static final ArrayList<String> EXPECTED_CONFIG_VALUES = new ArrayList<>(Arrays.asList("Setpoint Summary", "Alarm Enables", "Unit Settings", "Sensors", "OA Damper", "Cooling", "Heating", "Dehum", "Building Pressure", "Fans", "Energy Recovery Source", "Preheat", "Filters"));
	public static final ArrayList<String> EXPECTED_UNITSETTINGS_VALUES = new ArrayList<>(Arrays.asList("Boards", "App Type", "Scalings", "Daylight Savings", "Simultaneous Heat/Cool"));
	public static final ArrayList<String> EXPECTED_APPTYPE_VALUES = new ArrayList<>(Arrays.asList("Space Control", "Standard (Default)", "Precision", "VAV Control", "Outdoor Air Control", "Has Return Air", "Return Air Control", "3rd Party Interface", "Enable Unoccupied Setpoints"));
	public static final ArrayList<String> EXPECTED_VAVCONTROL_VALUES = new ArrayList<>(Arrays.asList("Config", "Duct Static SP", "SAT Reset"));
	public static final ArrayList<String> EXPECTED_VAVCONFIG_ELEMENTS = new ArrayList<>(Arrays.asList("Morning Warm Up", "Morning Cool Down", "Enable Unit Heating"));
	public static final ArrayList<String> EXPECTED_MORNING_WARMUP_SETPOINTS = new ArrayList<>(Arrays.asList("Return Air Temp", "Time Period", "Supply Air Heating"));
	public static final ArrayList<String> EXPECTED_MORNING_COOLDOWN_SETPOINTS = new ArrayList<>(Arrays.asList("Return Air Temp", "Time Period", "Supply Air Heating"));
	public static final ArrayList<String> EXPECTED_VAV_SATRESET = new ArrayList<>(Arrays.asList("No SAT Reset", "Enable SAT Reset"));
	public static final ArrayList<String> EXPECTED_VAV_SAT_SOURCE_TYPE = new ArrayList<>(Arrays.asList("Outside Air", "Space Air", "Return Air", "Supply Fan VFD", "Remote Voltage Signal"));
	public static final ArrayList<String> EXPECTED_RVS_SAT_RESET_SETPOINTS = new ArrayList<>(Arrays.asList("Min Voltage", "Max Voltage", "Min Volt Cooling Temp", "Max Volt Cooling Temp", "Min Volt Heating Temp", "Max Volt Heating Temp"));
	public static final ArrayList<String> EXPECTED_SPACECONTROL_AUTO_SETPOINTS = new ArrayList<>(Arrays.asList("Occupied Winter SP", "Occupied Summer SP", "Unocc Heat Winter SP", "Unocc Heat Summer SP", "Unocc Cool Winter SP", "Unocc Cool Summer SP", "High Tolerance", "Low Tolerance", "Winter OA Enable SP", "Summer OA Enable SP", "Szn Changeover Time", "Szn Changeover Duration"));
	public static final ArrayList<String> EXPECTED_SPACECONTROL_STANDARD_SETPOINTS = new ArrayList<>(Arrays.asList("Occupied Cooling SP", "Occupied Heating SP", "Cooling Limit Offset", "Heating Limit Offset"));
	public static final ArrayList<String> EXPECTED_SPACECONTROL_PRECISION_MANUAL_SETPOINTS = new ArrayList<>(Arrays.asList("Unoccupied Cooling SP", "Unoccupied Heating SP", "Low Tolerance", "High Tolerance", "Occ Space Temp SP"));
	public static final ArrayList<String> EXPECTED_SYPPLY_FAN_VFD_SAT_SETPOINTS = new ArrayList<>(Arrays.asList("Heat SAT Low", "Heat SAT High", "Source Heat SAT Low", "Source Heat SAT High", "Cool SAT Low", "Cool SAT High", "Source Cool SAT Low", "Source Cool SAT High"));
	public static final ArrayList<String> EXPECTED_Supply_FAN_VFD_SAT_Source_SetpointsS = new ArrayList<>(Arrays.asList("Heat SAT Low", "Cool SAT High", "Source Heat SAT Low", "Source Heat SAT High", "Cool SAT Low", "Cool SAT High", "Source Cool SAT Low", "Source Cool SAT High"));
                                                                                                                         	
	public static final ArrayList<String> EXPECTED_OUTSIDE_AIR_CONTROL_SETPOINTS = new ArrayList<>(Arrays.asList("Occupied Cooling SP", "Occupied Heating SP"));
	
	public static final ArrayList<String> EXPECTED_OUTSIDE_AIR_RETURN_AIR_SETPOINTS = new ArrayList<>(Arrays.asList("Unocc Space Cooling SP", "Unocc Space Heating SP"));
	public static final ArrayList<String> EXPECTED_RETURN_AIR_CONTROL_SETPOINTS = new ArrayList<>(Arrays.asList("Occupied Cooling SP", "Unoccupied Cooling SP", "Occupied Heating SP", "Unoccupied Heating SP"));
	public static final ArrayList<String> EXPECTED_3RD_PARTY_INTERFACE_TYPE = new ArrayList<>(Arrays.asList("Thermostat (Default)", "Heat Pump Thermostat", "DDC"));

	public static final ArrayList<String> EXPECTED_HEAT_PUMP_THERMOSTAT_TYPE = new ArrayList<>(Arrays.asList("Fail to Cool", "Fail to Heat"));
	public static final ArrayList<String> EXPECTED_DCC_CONTROL_ENABLES = new ArrayList<>(Arrays.asList("Heat Wheel", "Supply Fan", "Return/Exhaust Fan", "OA/Econ Damper", "SAT Reset"));
	public static final ArrayList<String> EXPECTED_DCC_SUPPLY_FAN_SETPOINTS = new ArrayList<>(Arrays.asList("Min Voltage", "Max Voltage"));
	public static final ArrayList<String> EXPECTED_HEATING_SETPOINTS = new ArrayList<>(Arrays.asList("Stage Up Window", "Stage Down Window", "Stage Up Timer", "Stage Down Timer", "Min Run Time", "Min Off Time", "Heating OAT Lockout", "Heat SAT Setpoints", "High SAT Cutoff", "Heating Min Fan Speed", "Heat Control Window", "Heating Max Fan Speed", "Changeover Delay Time"));
	public static final ArrayList<String> EXPECTED_NIGHT_SETBACK_SETPOINTS = new ArrayList<>(Arrays.asList("Unoccupied Cooling SP", "Unoccupied Heating SP"));
	public static final ArrayList<String> EXPECTED_TEMP_SCALINGS = new ArrayList<>(Arrays.asList("Fahrenheit (Default)", "Celsius"));
	public static final ArrayList<String> EXPECTED_DAYLIGHT_SAVINGS = new ArrayList<>(Arrays.asList("Start Date", "End Date"));
	public static final ArrayList<String> EXPECTED_SIM_HEAT_COOL = new ArrayList<>(Arrays.asList("Disabled", "Enabled"));
    //unit settings Boards	
	public static final String Boards_ipv4 = "192.168.100.100";
	public static final String Boards_gatewayAddress = "192.168.100.1";
	public static final String Boards_netmask = "255.255.255.0";  	
	public static final String Boards_DNS_Server_Address = "255.255.255.52";  
	public static final String Boards_BBMD_IPv4_Address = "192.168.100.100";  
	public static final String Boards_Network_Port = "255.255.255.0";  

	public static final ArrayList<String> EXPECTED_Baud_Rate = new ArrayList<>(Arrays.asList("4800", "9600", "19200", "38400 (Default)", "57600", "115200"));
	public static final ArrayList<String> EXPECTED_MAC_Address = new ArrayList<>(Arrays.asList("MAC Address"));
	public static final ArrayList<String> EXPECTED_Device_ID = new ArrayList<>(Arrays.asList("Device ID"));
	public static final ArrayList<String> EXPECTED_Boards_VALUES = new ArrayList<>(Arrays.asList("Unit Manager", "Power-Comm Board", "Air Handler Board", "Cooling Board", "Heating Board", "Energy Recovery Board", "Preheat Board", "Outside Air Board"));
	public static final ArrayList<String> EXPECTED_Power_Comm_Board_Count = new ArrayList<>(Arrays.asList("1 Board", "2 Boards", "3 Boards", "4 Boards", "5 Boards", "6 Boards"));
	public static final ArrayList<String> EXPECTED_Unique_ID= new ArrayList<>(Arrays.asList("None", "0000000", "0001112"));
	public static final ArrayList<String> EXPECTED_Disabled_Enabled= new ArrayList<>(Arrays.asList("Disabled", "Enabled"));
	public static final ArrayList<String> EXPECTED_Comm_1_Enabled = new ArrayList<>(Arrays.asList("None", "Sporlan", "Sporlan Vapor Injection","Sanhua"));
	public static final ArrayList<String> EXPECTED_EXV1 = new ArrayList<>(Arrays.asList("Inside", "Outside"));
	public static final ArrayList<String> EXPECTED_EXV2 = new ArrayList<>(Arrays.asList("None", "Inside", "Outside"));
	public static final ArrayList<String> EXPECTED_Air_Handler_Board = new ArrayList<>(Arrays.asList("1 Board", "2 Boards"));
	public static final ArrayList<String> EXPECTED_VFD_Port_Num = new ArrayList<>(Arrays.asList("Not Used", "Supply Fan", "Return Fan","Exhaust Fan","Condenser Fan","Heat Wheel"));
	public static final ArrayList<String> EXPECTED_Supply_Fan_Type = new ArrayList<>(Arrays.asList("None", "Communicating", "0-10V"));
	public static final ArrayList<String> EXPECTED_Supply_0_10V = new ArrayList<>(Arrays.asList("Min Voltage", "Max Voltage"));	                                                                                    
	public static final ArrayList<String> EXPECTED_Supply_Fan_EM_Rating = new ArrayList<>(Arrays.asList("Motor HP", "Motor RPM", "Service Factor", "Motor FLA", "Drive Min Frequency", "Drive Max Frequency"));
	public static final ArrayList<String> EXPECTED_Voltage = new ArrayList<>(Arrays.asList("None", "208 vac", "230 vac","460 vac","575 vac"));
	public static final ArrayList<String> EXPECTED_Damper_Port = new ArrayList<>(Arrays.asList("Not Used", "Return Air", "Return Air Bypass","Exhaust Air"));	
	public static final ArrayList<String> EXPECTED_Thermistor_Num = new ArrayList<>(Arrays.asList("Not Used", "Supply Air Temp", "Space Temperature", "Space Slide Adjust", "Return Air Temp", "BACnet Passthrough"));
	public static final ArrayList<String> EXPECTED_Analog_Output_Num = new ArrayList<>(Arrays.asList("None", "Modulating Chilled Water", "Modulating Hot Water/Steam", "Modulating Preheat", "BACnet Passthrough"));
	public static final ArrayList<String> EXPECTED_Binary_Input_Num = new ArrayList<>(Arrays.asList("Not Used", "Hood On", "Remote Shutdown", "Remote Occupied", "Defrost Switch", "Heat Wheel Rotating", "Proof of Waterflow", "Supply Airflow Switch", "Return Airflow Switch", "Exhaust Airflow Switch", "BACnet Passthrough"));
	public static final ArrayList<String> EXPECTED_Mout_Num = new ArrayList<>(Arrays.asList("Not Used", "Reversing Valve", "ERV", "Morning Warmup/Cooldown", "Low Ambient Enable", "Supply Fan Enable", "Return Fan Enable", "Exhaust Fan Enable", "Condenser Fan Enable", "Econ Active"));
	public static final ArrayList<String> EXPECTED_Mout_NextPage = new ArrayList<>(Arrays.asList("Occupied Active", "Override Active", "Alarm Active", "Reheat Active", "Heat Enable", "Cool Enable", "Preheat Enable", "BACnet Passthrough"));                                                                                             
	public static final ArrayList<String> EXPECTED_Cooling_Board = new ArrayList<>(Arrays.asList("1 Board", "2 Boards", "3 Boards", "4 Boards"));
	public static final ArrayList<String> EXPECTED_Compressor_1_Type = new ArrayList<>(Arrays.asList("Digital", "VFD", "On/Off", "2-Step"));
	public static final ArrayList<String> EXPECTED_Tonnage = new ArrayList<>(Arrays.asList("Tonnage"));
	public static final ArrayList<String> EXPECTED_Voltage_VAC= new ArrayList<>(Arrays.asList("208 vac", "230 vac","460 vac","575 vac"));
	public static final ArrayList<String> EXPECTED_Mout = new ArrayList<>(Arrays.asList("Not Used", "Unloader","Compressor Enable (Step)","Startup Solenoid", "Reversing Valve" ,"BACnet Passthrough"));
	public static final ArrayList<String> EXPECTED_Reheat_Valve_Step_Configuration = new ArrayList<>(Arrays.asList("2800 steps", "3500 steps","6386 steps","Factory Custom"));
	public static final ArrayList<String> EXPECTED_Damper_Type = new ArrayList<>(Arrays.asList("None", "Outside Air","Return Air","Return Air Bypass", "Exhaust Air", "Supply ERV Bypass", "Exhaust ERV Bypass", "Single Supply/Exhaust ERV Bypass"));
	public static final ArrayList<String> EXPECTED_Binary_Input = new ArrayList<>(Arrays.asList("Not Used", "Supply Airflow Switch","Return Airflow Switch","Exhaust Airflow Switch", "Dirty Filter Switch", "Dirty Pre-Filter Switch", "BACnet Passthrough"));
	public static final ArrayList<String> EXPECTED_Thermistor = new ArrayList<>(Arrays.asList("Not Used", "Intake Leaving Air Temp","Exhaust Leaving Air Temp"));
	//Sensors
	public static final ArrayList<String> EXPECTED_CO2_Sensor_Offset = new ArrayList<>(Arrays.asList("CO2 Sensor Offset", "CO2 Setpoint"));
	public static final ArrayList<String> EXPECTED_Ignition_Control_Boards = new ArrayList<>(Arrays.asList("Ign. Ctrl. 1", "Ign. Ctrl. 2","Ign. Ctrl. 3","Ign. Ctrl. 4","Ign. Ctrl. 5","Ign. Ctrl. 6","Ign. Ctrl. 7","Ign. Ctrl. 8"));	
	//OA Damper
	public static final ArrayList<String> EXPECTED_OA_DAMPER_CONFIG = new ArrayList<>(Arrays.asList("No Economizer Control", "Standard Economizer Control", "Econo Control w/ IAQ Override", "Building Pressure Control", "Allow Econo During Unoccupied Mode", "Fault Detection Diagnostics"));
	public static final ArrayList<String> EXPECTED_CO2_SENSOR_TYPE = new ArrayList<>(Arrays.asList("No CO2 Sensor", "Digital", "Reads CO2 Broadcast", "Reads CO2 From BACnet"));
	public static final ArrayList<String> EXPECTED_CO2_SETPOINTS = new ArrayList<>(Arrays.asList("CO2 Sensor Offset", "CO2 Setpoint"));
	public static final ArrayList<String> EXPECTED_SUPPLYFAN_SETPOINTS = new ArrayList<>(Arrays.asList("Bldg Pr Setpoint", "Bldg Pr Setpoint"));
	public static final ArrayList<String> EXPECTED_BP_RETURN_FAN_CONTROL = new ArrayList<>(Arrays.asList("On/Off", "Modulating"));
	public static final ArrayList<String> EXPECTED_EXAUST_DAMPER_SETPOINTS = new ArrayList<>(Arrays.asList("Exhaust Damper SP", "Exhaust Damper DB"));
	public static final ArrayList<String> EXPECTED_DUCT_STATIC_PRESSURE_SENSOR = new ArrayList<>(Arrays.asList("Duct Static Pr SP", "Duct Static Pr DB"));
	public static final ArrayList<String> EXPECTED_FAN_TRACKING = new ArrayList<>(Arrays.asList("Tracking %", "Min Fan Speed"));
	public static final ArrayList<String> EXPECTED_OUTSIDE_AIR_SETPOINT = new ArrayList<>(Arrays.asList("OA Enable SP"));
	public static final ArrayList<String> EXPECTED_COMP_ENTH_LIMIT_SETPOINT = new ArrayList<>(Arrays.asList("OA Limit SP","OA Enthalpy","Enthalpy DB"));
	public static final ArrayList<String> EXPECTED_COMP_ENTH_DRYBULB_SETPOINT = new ArrayList<>(Arrays.asList("OA Enthalpy","Enthalpy DB"));
	public static final ArrayList<String> EXPECTED_ECO_VOLTAGES_SETPOINT = new ArrayList<>(Arrays.asList("Min Econo Voltage","Max Econo Voltage"));
	public static final ArrayList<String> EXPECTED_BP_SENSOR_TYPE = new ArrayList<>(Arrays.asList("None", "Analog", "Exhaust Fan", "Outside Air Damper"));
	//Dehum
	public static final ArrayList<String> EXPECTED_DEHUM_CONFIG_LABLES = new ArrayList<>(Arrays.asList("No Dehum", "Humidity Control", "Dewpoint Control", "Enable Dehum in All Unit Operations", "Vent (Standard Mode Only)", "Cool", "Heat", "Unoccupied"));
	public static final ArrayList<String> EXPECTED_DEHUM_CONFIG_SENSOR_LABLES = new ArrayList<>(Arrays.asList("No Enable Sensor", "Space Sensor", "Return Sensor", "OA Sensor", "Supply Air Dewpoint Control"));
	public static final ArrayList<String> EXPECTED_REHEAT_CONFIG_LABLES = new ArrayList<>(Arrays.asList("No Reheat", "Modulating HGR", "+ Aux Heat (HP Req.)", "+ Unit Heat (call factory)", "Unit Heat for Reheat", "On/Off", "+ Unit Heat", "Has Return Bypass Control", "SAT Control"));
	public static final ArrayList<String> EXPECTED_REHEAT_MOD_HGR_LABLES = new ArrayList<>(Arrays.asList("Enable Startup Flush", "Enable Reheat Flush", "Enable Condenser Flush", "Enable Cooling Flush"));
	public static final ArrayList<String> EXPECTED_SPACE_SENSOR_HUMIDITY_SETPOINTS = new ArrayList<>(Arrays.asList("Humidity SP", "OAT Lockout"));
	public static final ArrayList<String> EXPECTED_SPACE_SENSOR_DEWPOINT_SETPOINTS = new ArrayList<>(Arrays.asList("Dewpoint SP", "OAT Lockout"));
	//Filters
	public static final ArrayList<String> EXPECTED_FILTER_TYPES = new ArrayList<>(Arrays.asList("Pre", "Main", "Return Air Bypass", "Heat Wheel OA", "Heat Wheel Exhaust", "Preheat"));
	public static final ArrayList<String> EXPECTED_MONITORING_FILTER_TYPES = new ArrayList<>(Arrays.asList("Binary", "Differential Pressure", "Change Interval"));
	public static final ArrayList<String> EXPECTED_DIFF_PRESSURE_SETPOINTS = new ArrayList<>(Arrays.asList("Differential Pr. Threshold"));
	//Preheat
	public static final ArrayList<String> EXPECTED_PREHEAT_TYPES = new ArrayList<>(Arrays.asList("None", "Electric", "Water/Steam"));
	public static final ArrayList<String> EXPECTED_REHEAT_VALVE = new ArrayList<>(Arrays.asList("None"));
	public static final ArrayList<String> EXPECTED_STARTUPSOLENOID = new ArrayList<>(Arrays.asList("None", "Cooling Board 1, Mout 1", "Cooling Board 2, Mout 1"));
	public static final ArrayList<String> EXPECTED_CFS = new ArrayList<>(Arrays.asList("AHU Board 1, VFD Port 1", "AHU Board 1, VFD Port 2"));
	public static final ArrayList<String> EXPECTED_HEAT_TYPES = new ArrayList<>(Arrays.asList("None", "Heat Pump", "Gas", "Heating Tempering", "Electric", "Water/Steam", "Direct Fire"));
	public static final ArrayList<String> EXPECTED_COMPRESSORS_TYPES = new ArrayList<>(Arrays.asList("None", "Cooling Board 1, Refrigeration 1, Single Compressor", "Cooling Board 1, Refrigeration 2, Tandem Compressors", "Cooling Board 2, Refrigeration 1, Single Compressor", "Cooling Board 2, Refrigeration 2, Tandem Compressors"));
	public static final ArrayList<String> EXPECTED_AUXHEAT_TYPES = new ArrayList<>(Arrays.asList("None", "Gas", "Heating Tempering", "Aux Heat", "Emergency Heat", "Electric", "Water/Steam"));
	public static final ArrayList<String> EXPECTED_ELECTRIC_SETPOINTS = new ArrayList<>(Arrays.asList("Stage Up Window", "Stage Down Window", "Stage Up Timer", "Stage Down Timer"));
	public static final ArrayList<String> EXPECTED_PREHEAT_SETPOINTS = new ArrayList<>(Arrays.asList("OAT Enable SP", "Cool Leaving Air SP", "Heat Leaving Air SP", "Vent Leaving Air SP"));
	public static final ArrayList<String> EXPECTED_HEATPUMP_SETPOINTS = new ArrayList<>(Arrays.asList("Aux Off Delay", "Aux On Delay", "Aux Off Window", "Aux On Window", "Cool Superheat SP", "Heat Superheat SP", "Heat Pump OAT Lockout"));
	public static final ArrayList<String> EXPECTED_COOLING_SETPOINTS = new ArrayList<>(Arrays.asList("Stage Up Window", "Stage Down Window", "Stage Up Timer", "Stage Down Timer", "Min Run Time", "Min Off Time", "Cooling OAT Lockout", "Cool SAT Setpoint", "Low SAT Cutoff", "Cool Min Fan Speed", "Cool Control Window", "Cool Superheat SP", "Changeover Delay Time"));
	//ERS
	public static final ArrayList<String> EXPECTED_MOD_ERS_SETPOINTS = new ArrayList<>(Arrays.asList("ERS Min Voltage", "ERS Max Voltage"));
	public static final ArrayList<String> EXPECTED_ERS_OA_ENTH_SETPOINTS = new ArrayList<>(Arrays.asList("Low OA Enthalpy SP", "High OA Enthalpy SP"));
	public static final ArrayList<String> EXPECTED_MOD_ERS_TYPES = new ArrayList<>(Arrays.asList("0-10V", "Communicating"));
	public static final ArrayList<String> EXPECTED_ERS_DEFROST_TYPES = new ArrayList<>(Arrays.asList("OA Temp", "OA Dewpoint"));
	public static final ArrayList<String> EXPECTED_IEXV = new ArrayList<>(Arrays.asList("None", "Power-Comm Board 1, Comm 1, Inside EXV 1", "Power-Comm Board 1, Comm 2, Inside EXV 2"));
	public static final ArrayList<String> EXPECTED_OEXV = new ArrayList<>(Arrays.asList("None", "Power-Comm Board 1, Comm 1, Outside EXV 2", "Power-Comm Board 1, Comm 2, Outside EXV 1"));
	public static final ArrayList<String> EXPECTED_DEFROST = new ArrayList<>(Arrays.asList("None", "AHU Board 1, Binary Input 1", "AHU Board 1, Binary Input 3"));
	public static final ArrayList<String> EXPECTED_RV = new ArrayList<>(Arrays.asList("None", "AHU Board 1, MOUT 1", "AHU Board 1, MOUT 3"));
	//Fans
	public static final ArrayList<String> EXPECTED_SUPPLY_FANS_CONFIG = new ArrayList<>(Arrays.asList("CAV", "Filter Loading", "SZVAV", "Building Pressure", "Controls Min OA", "Duct Static Control", "Has Static Reset", "Supply Fan Cycles w/ Heat/Cool", "SF Runs While Unoccupied"));
	public static final ArrayList<String> EXPECTED_SZVAV_SETPOINTS = new ArrayList<>(Arrays.asList("Heat Min VFD", "Heat Max VFD", "Cool Min VFD"));
	public static final ArrayList<String> EXPECTED_RETURN_FAN_CONFIG = new ArrayList<>(Arrays.asList("CAV (Default)", "Building Pressure Control"));
	public static final ArrayList<String> EXPECTED_GLOBAL_SUPPLYFAN_SETPOINTS = new ArrayList<>(Arrays.asList("Cool Min Speed", "Vent Speed", "Heat Min Speed", "Heat Max Speed", "# Of Allowed Fan Failures"));
	public static final ArrayList<String> EXPECTED_HPWHPG = new ArrayList<>(Arrays.asList("0% (32.0°F / 0°C Freezing Point)", "5% (29.1°F / -1.6°C Freezing Point)", "10% (26.1°F / -3.3°C Freezing Point)", "15% (22.9°F / -5.1°C Freezing Point)", "20% (19.2°F / -7.1°C Freezing Point)", "25% (14.7°F / -9.6°C Freezing Point)", "30% (9.2°F / -12.7°C Freezing Point)", "35% (2.4°F / -16.4°C Freezing Point)", "40% (-6.0°F / -21.1°C Freezing Point)"));
	
	
}
