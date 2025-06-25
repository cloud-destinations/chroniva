@unitsettingsboards @smoke
Feature: Validate Boards Configuration in Unit Settings under Config

  Background:
      Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
      When User go to Unit settings page in Config
      And User navigates to the Boards page in Unit Settings

@unitsettingsboards1
Scenario: Verify the Unit Manager Configuration and Network Settings
    Then Verify the fields on the Boards page    
    When User selects the Unit Manager checkbox
    Then User clicks "Network" and verifies the Network settings
    Then User selects "BACnet" navigates to "MS/TP" and verifies "Baud Rate", "MAC Address", and "Device ID" labels
    And User selects "IP" and verifies the "BBMD" and "Device ID" labels
    Then User selects the "EBUS" label and Verify the "Low Speed" "High speed" radio button     
    
@unitsettingsboards2
Scenario: Verify Complete Configuration of Power-Comm Board Module
    When User selects the Power-Comm Board checkbox
    Then Verify "Power-Comm Board Count" and select "<numBoard>"     
    Then User verifies "Power-Comm Boards" and selects the "<Boardnum>" label
    #Then User selects the "Unique ID" label and Verify the "None" "0000000" "0001112" radio button  
    Then User selects the "24V Alert" label and Verify the "Disabled" "Enabled" radio button
    Then User selects the "PBO Alert" label and Verify the "Disabled" "Enabled" radio button     
    Then User selects the "PS Therm Alert" label and Verify the "Disabled" "Enabled" radio button           
    Then User selects the "<CommNumber>" label verifies the "Disabled" and "Enabled" radio buttons and navigates to "CommNum"
    Then User selects the "Sporlan" radio button and verifies the "EXV 1" "EXV 2"  
    Then User goes to EXV2 and verifies the "Pressure Sensor" and "Temperature Sensor " radio buttons under the "Inside" and "Outside"    
    Then User selects the "Sporlan Vapor Injection" radio button and verifies the "Disabled" and "Enabled"
    And User goes to EXV2 and verifies the "Pressure Sensor" and "Temperature Sensor " radio buttons under the "Inside" and "Outside"         
    Then User verifies "Sanhua" and back to label Page

  Examples:
  | numBoard | Boardnum | CommNumber |
  | 1 Board  | Board 1  | Comm 1     |
  | 2 Boards | Board 2  | Comm 2     |
  | 3 Boards | Board 3  | Comm 3     |
  | 4 Boards | Board 4  | Comm 4     |
  | 5 Boards | Board 5  | Comm 5     |
  | 6 Boards | Board 6  | Comm 6     |     
  
@unitsettingsboards3
    Scenario: Verify the A2L Ports and VFD Ports in Air Handler Board
    When User selects the Air Handler Board checkbox
    Then Verify "Air Handler Board" and select "<AirNumBoard>"     
    Then User verifies "Air Handler Board" and selects the "<AirBoardNum>" label            
    #Then User selects the "Unique ID" label and Verify the "None" "0000000" "0001112" radio button  
    Then User navigates to the "Port 1" section under "A2L Ports" label and verifies the "Not Used" "Cabinet" "Airstream" 
    Then User navigates to the "Port 2" section under "A2L Ports" label and verifies the "Not Used" "Cabinet" "Airstream" 
    Then User navigates to the "Port 3" section under "A2L Ports" label and verifies the "Not Used" "Cabinet" "Airstream"      
    Then User navigates to "VFD Ports" and selects "<Port>" label to verify the radio buttons
    Then User navigates "<VFDPortNum>" and selects the "Type" label     
    Then User verifies Fan Type and navigates to "Motor Type" under "Communicating"    
    Then User selects "Electromagnet Motor (EM)" and verifies the rating labels
    Then User selects "Permanent Magnet Motor (PMM)" and verifies the rating labels
    Then User selects the "Voltage" label and verifies the radio buttons
    Then User selects the "Lead / Lag" label and Verify the "Lead (Default)" "Lag" radio buttons
    And User selects "0-10V" and verifies the Min and Max Voltage labels
    Then User selects the "Overload Inp." label and Verify the "None" "Overload Input 1" "Overload Input 2" radio button
   
  Examples:
  | AirNumBoard | AirBoardNum | Port   | VFDPortNum    |
  | 1 Board     | Board 1     | Port 1 | Supply Fan    |
  | 1 Board     | Board 1     | Port 2 | Return Fan    |
  | 1 Board     | Board 1     | Port 3 | Exhaust Fan   |
  | 2 Boards    | Board 2     | Port 4 | Condenser Fan |
  | 2 Boards    | Board 2     | Port 5 | Heat Wheel    |
  
@unitsettingsboards4
    Scenario: Verify the Damper Port and Analogs in Air Handler Board
    When User selects the Air Handler Board checkbox 
    Then Verify "Air Handler Board" and select "<AirNumBoard>"     
    Then User verifies "Air Handler Board" and selects the "<AirBoardNum>" label   
    Then User selects the "Damper Port" label and verifies the Damper Port 
    Then User selects the "Return Air" and Verify the "Disabled" "Enabled" radio button
    Then User selects the "Return Air Bypass" and Verify the "Disabled" "Enabled" radio button
    Then User selects the "Exhaust Air" and Verify the "Disabled" "Enabled" radio button     
    Then User selects the "Static Pressure" under "Analog Inputs" Verify "Disabled" "Enabled" radio button 
    Then User selects "Thermistor 1" and verifies the radio buttons
    Then User selects "Thermistor 2" and verifies the radio buttons
    Then User selects the "0-10V" label and Verify the "Exhaust Duct Static Pressure" "Building Pressure" "BACnet Passthrough" radio button  
    Then User selects "<AnalogOutputs>" under "Analog Outputs" and verifies the analog output     
    #Then User verifies Fan Type and navigates to "Motor Type" under "<AnalogOutput>"    
    #Then User selects "Electromagnet Motor (EM)" and verifies the rating labels
    #Then User selects "Permanent Magnet Motor (PMM)" and verifies the rating labels
    #And User selects the "Voltage" label and verifies the radio buttons
    #Then User selects the "Lead / Lag" label and Verify the "Lead (Default)" "Lag" radio buttons
    
  Examples:
  | AirNumBoard | AirBoardNum | AnalogOutputs | AnalogOutput         |
  | 1 Board     | Board 1     | AO 1          | Analog Supply Fan    |
  | 1 Board     | Board 1     | AO 1          | Analog Return Fan    |
  | 2 Boards    | Board 2     | AO 2          | Analog Exhaust Fan   |
  | 2 Boards    | Board 2     | AO 2          | Analog Condenser Fan |
    
@unitsettingsboards5
    Scenario: Verify the Binary Inputs and Mouts in Air Handler Board
    When User selects the Air Handler Board checkbox 
    Then Verify "Air Handler Board" and select "<AirNumBoard>"     
    Then User verifies "Air Handler Board" and selects the "<AirBoardNum>" label   
    Then User selects "Binary Inputs" and verifies "<BinaryInputNum>"
    Then User selects "Mouts" and verifies "<MoutNum>" label    
    Then User selects "Supply Fan Enable" and verifies "None" radio buttons
    Then User selects "Return Fan Enable" and verifies "None" radio buttons
    And User selects "Exhaust Fan Enable" and verifies "None" radio buttons
    Then User selects "Condenser Fan Enable" and verifies "None" radio buttons
   
  Examples:
  | AirNumBoard | AirBoardNum | BinaryInputNum | MoutNum | 
  | 1 Board     | Board 1     | Binary Input 1 | Mout 1  | 
  | 1 Board     | Board 1     | Binary Input 2 | Mout 2  |
  | 1 Board     | Board 1     | Binary Input 3 | Mout 5  |
  | 2 Boards    | Board 2     | Binary Input 4 | Mout 6  |
  | 2 Boards    | Board 2     | Binary Input 7 | Mout 7  |
  | 2 Boards    | Board 2     | Binary Input 8 | Mout 8  |
 
@unitsettingsboards6
    Scenario: Verify the Refrigeration in Cooling Board 
    When User selects the Cooling Board checkbox  
    Then Verify "Cooling Board" and select "<CoolingNumBoard>"     
    Then User verifies "Cooling Boards" and selects the "<CoolingBoardsNum>" label  
    #Then User selects the "Unique ID" label and Verify the "None" "00000000" "00000001" radio button 
    Then User selects the "<Refrigeration>" and verifies "Compressor 1 Type" under "Single Compressor"
    Then User selects "<CompressorType>" and verifies "Compressor 1 Model" under "Copeland"   
    Then User selects "YAW0471E-5X9-ASH" and verifies "Tonnage" and "Voltage"
    Then User selects "YAW0471E-2X9-ASH" and verifies "Tonnage" and "Voltage"
    Then User selects "0-10V" and verifies the "Voltages"        
    Then User clicks "Tandem" and select "Compressor 1"  
    Then User selects "<CompressorType>" and verifies "Compressor 1 Model" under "Copeland"    
    Then User selects "YAW0471E-5X9-ASH" and verifies "Tonnage" and "Voltage"
    Then User selects "YAW0471E-2X9-ASH" and verifies "Tonnage" and "Voltage"
    Then User selects "0-10V" and verifies the "Voltages"   
    Then User clicks "Tandem" and select "Compressor 2" radio buttons   
    Then User selects "On/Off" and verifies "Compressor 2 Model" under "Copeland"   
    Then User selects "YAW0471E-5X9-ASH" and verifies "Tonnage" and "Voltage"
    Then User selects "YAW0471E-2X9-ASH" and verifies "Tonnage" and "Voltage"
    And User selects "0-10V" and verifies the "Voltages"   
    Then User clicks "Tandem" and select "Compressor 2" radio buttons
    
  Examples:
  | CoolingNumBoard  | CoolingBoardsNum | CompressorType | Refrigeration   |
  | 1 Board          | Board 1          | Digital        | Refrigeration 1 |
  | 2 Boards         | Board 2          | VFD            | Refrigeration 1 |
  | 3 Boards         | Board 3          | On/Off         | Refrigeration 2 |
  | 4 Boards         | Board 4          | 2-Step         | Refrigeration 2 |
  
@unitsettingsboard7
   Scenario: Verify the Mouts and Reheat in Cooling Board 
    When User selects the Cooling Board checkbox  
    Then Verify "Cooling Board" and select "<CoolingNumBoard>"     
    Then User verifies "Cooling Boards" and selects the "<CoolingBoardsNum>" label  
    And User selects "Mouts" label and verifies the "Mout 1" and "Mout 2" 
    Then User selects "Reheat" label and verifies the "Reheat Enable"
  
  Examples:
  | CoolingNumBoard  | CoolingBoardsNum |
  | 1 Board          | Board 1          | 
  | 2 Boards         | Board 2          |
  | 3 Boards         | Board 3          |
  | 4 Boards         | Board 4          |
  
@unitsettingsboards8
    Scenario: Verify the Complete Configuration of Heating Board
    When User selects the Heating Board checkbox       
    Then Verify "Heating Board" and select "1 Board"     
    #Then User selects the "Unique ID" label and Verify the "None" "00000000" "00000002" radio button     
    Then User navigates to the "Valve 1" section under "Valves" label and verifies the "Disabled" "Enabled" "Disabled" 
    Then User navigates to the "Valve 2" section under "Valves" label and verifies the "Disabled" "Enabled" "Disabled"              
    Then User navigates to the "<BinaryInput>" section under "Binary Inputs" label and verifies the "Ignition Proof" "BACnet Passthrough" "Not Used" 
    Then User selects the "<Mout>" under "Mouts" Verify "SCR Signal" "Heat Enable" "Inducer Fan Low Speed" "BACnet Passthrough" radio button
    Then User back to "Heating Board" selects "2 Boards" and navigates to "Board 2"   
    Then User navigates to the "Valve 1" section under "Valves" label and verifies the "Disabled" "Enabled" "Disabled" 
    Then User navigates to the "Valve 2" section under "Valves" label and verifies the "Disabled" "Enabled" "Disabled"    
    And User navigates to the "<BinaryInput>" section under "Binary Inputs" label and verifies the "Ignition Proof" "BACnet Passthrough" "Not Used" 
    Then User selects the "<Mout>" under "Mouts" Verify "SCR Signal" "Heat Enable" "Inducer Fan Low Speed" "BACnet Passthrough" radio button
    
  Examples:
  | BinaryInput    | Mout   |
  | Binary Input 1 | Mout 1 |
  | Binary Input 2 | Mout 2 |
  | Binary Input 3 | Mout 3 |
  | Binary Input 4 | Mout 7 |
  | Binary Input 5 | Mout 8 |
  
@unitsettingsboards9
    Scenario: Verify Thermistor, Binary Inputs and Dampers in Energy Recovery Board
    When User selects the "Energy Recovery Board" checkbox
    Then Verify "Energy Recovery Board" and select "<EnergyNumBoard>"     
    Then User verifies "Energy Recovery Boards" and selects the "<EnergyBoardNum>" label
    Then User navigates to the "Thermistor 1" section under "Thermistor" label and verifies the "Not Used" "Intake Leaving Air Temp" "Exhaust Leaving Air Temp" 
    Then User navigates to the "Thermistor 2" section under "Thermistor" label and verifies the "Not Used" "Exhaust Leaving Air Temp" "Intake Leaving Air Temp" 
    Then User navigates to the "Thermistor 3" section under "Thermistor" label and verifies the "Not Used" "Intake Leaving Air Temp" "Exhaust Leaving Air Temp" 
    Then User navigates to the "<Thermistor>" section under "Thermistor" label and verifies the "Not Used" "Exhaust Leaving Air Temp" "Intake Leaving Air Temp" 
    And User selects the "<BinaryInput>" under "Binary Inputs" Verify "Intake Filter Switch" "Exhaust Filter Switch" "Rotation Status" "BACnet Passthrough" radio button
    Then User selects "Supply Bypass" under "<Bypass>" in "Dampers" and verifies "Disabled" and "Enabled" radio buttons    
    
  Examples:
  | EnergyNumBoard | EnergyBoardNum | Thermistor   | Bypass   | BinaryInput    |
  | 1 Board        | Board 1        | Thermistor 4 | Bypass 1 | Binary Input 1 |
  | 2 Boards       | Board 2        | Thermistor 5 | Bypass 2 | Binary Input 1 |
  | 2 Boards       | Board 1        | Thermistor 6 | Bypass 1 | Binary Input 2 | 
  
@unitsettingsboards10
    Scenario: Verify VFD Settings and Mouts Configuration in Energy Recovery Board
    When User selects the "Energy Recovery Board" checkbox
    Then Verify "Energy Recovery Board" and select "<EnergyNumBoard>"     
    Then User verifies "Energy Recovery Boards" and selects the "<EnergyBoardNum>" label
    Then User selects "VFD" navigates to "Enabled" selects "Type" navigates to "Communicating" and selects "Motor Type"
    Then User selects "Electromagnet Motor (EM)" and verifies the rating labels
    Then User selects "Permanent Magnet Motor (PMM)" and verifies the rating labels
    Then User selects the "Voltage" label and verifies the radio buttons
    Then User selects navigation path and goes to "Heat Wheel Type" title
    Then User selects "0-10V" and verifies the Min and Max Voltage labels
    Then User selects the "Overload Inp." label and Verify the "None" "Overload Input 1" "Overload Input 2" radio button  
    When User clicks back button
    And User clicks back button
    Then User selects the "<EnergyMoutNum>" under "Mouts" Verify "Heat Wheel Enable" "Heat Wheel Low Speed" "Bypass Damper Enable" "BACnet Passthrough" radio button
    
  Examples:
  | EnergyNumBoard | EnergyBoardNum | EnergyMoutNum | 
  | 1 Board        | Board 1        | Mout 1        | 
  | 2 Boards       | Board 2        | Mout 2        | 
  | 2 Boards       | Board 1        | Mout 2        | 
    
    
@unitsettingsboards11
    Scenario: Verify the Complete Configuration of Preheat Board
    When User selects the "Preheat Board" checkbox
    Then Verify "Preheat Board Count" and select "<EnergyNumBoard>"     
    Then User verifies "Preheat Board Count" and selects the "<EnergyBoardNum>" label
    And User navigates to the "<PreheatTempNum>" section under "Temps" label and verifies the "Not Used" "Entering Air" "Leaving Air" 
    Then User selects the "<PreheatMoutNum>" under "Mouts" Verify "Not Used" "Heat Enable" "SCR Signal" "BACnet Passthrough" radio button
    
  Examples:
  | EnergyNumBoard | EnergyBoardNum | PreheatTempNum |PreheatMoutNum |
  | 1 Board        | Board 1        | Temp 1         | Mout 1        |
  | 2 Boards       | Board 2        | Temp 2         | Mout 2        |
  | 2 Boards       | Board 1        | Temp 3         | Mout 3        |
  | 1 Board        | Board 1        | Temp 4         | Mout 4        |
  | 2 Boards       | Board 2        | Temp 5         | Mout 5        |
  | 2 Boards       | Board 1        | Temp 6         | Mout 6        | 
  | 1 Board        | Board 1        | Temp 7         | Mout 7        |
  | 2 Boards       | Board 2        | Temp 8         | Mout 8        |
  | 2 Boards       | Board 1        | Temp 1         | Mout 9        |
  | 1 Board        | Board 1        | Temp 2         | Mout 10       |
  | 2 Boards       | Board 2        | Temp 3         | Mout 11       |
  | 2 Boards       | Board 1        | Temp 4         | Mout 12       | 
 
@unitsettingsboards12
    Scenario: Verify the Complete Configuration of Outside Air Board
    When User selects the "Outside Air Board" checkbox
    Then Verify "Outside Air Board Count" and select "<OutsideAirNumBoard>"     
    Then User verifies "Outside Air Boards" and selects the "<OutsideAirBoardNum>" label
    #Then User selects the "Unique ID" label and Verify the "None" "00000000" "00000002" radio button       
    Then User selects the "<DamperNum>" under "Dampers" and Verify the radio buttons
    Then User selects "Outside Air" and verifies "Enabled" radio buttons
    Then User selects "Return Air" and verifies "Enabled" radio buttons
    Then User selects "Return Air Bypass" and verifies "Enabled" radio buttons
    Then User selects "Exhaust Air" and verifies "Enabled" radio buttons
    Then User selects "Supply ERV Bypass" and verifies "Enabled" radio buttons
    And User selects the "<BinaryInput>" under "Binary Inputs" and Verify radio button
    Then User selects the "<Analog Inputs>" under "Analog Inputs" Verify "Disabled" "Enabled" radio button 
    
  Examples:
  | OutsideAirNumBoard | OutsideAirBoardNum | DamperNum  | BinaryInput    | Analog Inputs | 
  | 1 Board            | Board 1            | Damper 1   | Binary Input 1 | Outside Air   | 
  | 2 Boards           | Board 2            | Damper 2   | Binary Input 2 | Return Air    |
  | 1 Board            | Board 1            | Damper 3   | Binary Input 3 | Bldg. Pr      |
  | 2 Boards           | Board 2            | Damper 1   | Binary Input 4 | Exh Static Pr.|
  
  
  
  
  