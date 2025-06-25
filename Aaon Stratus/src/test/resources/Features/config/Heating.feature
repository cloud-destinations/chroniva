 @heating @smoke
Feature: Heating page in Config
  
  @heating1
  Scenario: Verify the fields in Heat Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  Then verify the "Type" description text should be "None" and click
  Then Verify the fields in Heat Type page
  When User selects "Heat Pump" radio button and go back
  Then verify the "Type" description text should be "Heat Pump" and click
  When User selects "Gas" radio button and go back
  Then verify the "Type" description text should be "Gas" and click
  When User selects "Electric" radio button and go back
  Then verify the "Type" description text should be "Electric" and click
  When User selects "Water/Steam" radio button and go back
  Then verify the "Type" description text should be "Water/Steam" and click
  
  @heating2
  Scenario: Verify the fields in Heat Pump Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  When User go to "Type" page
  When User clicks "Heat Pump" next page button
  Then verify the "Rev. Valve" description text should be "Fail to Heating" and click
  When User selects "Fail to Cooling" radio button and go back
  Then verify the "Rev. Valve" description text should be "Fail to Cooling" and click
  When User clicks back button
  When User go to "Setpoints" page
  Then Verify the fields in Heat Pump Setpoints page

  @heating3
  Scenario: Verify the fields in Heat Pump WHP Glycol page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  When User go to "Type" page
  When User clicks "Heat Pump" next page button
  Then verify the "Type" description text should be "Air Source" and click
  When User selects "Water" radio button and go back
  Then verify the "Type" description text should be "Water" and click
  When User clicks "Water" next page button
  Then Verify the fields in Heat Pump WHP Glycol page

  @heating4
  Scenario: Verify the fields in Water Steam page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  When User go to "Type" page
  When User clicks "Heat Pump" next page button
  When User go to "Aux/Emerg." page
  Then Verify the fields in Aux Emergency Heat page   
  When User clicks "Water/Steam" next page button
  Then Verify the fields in Water Steam page

  @heating5
  Scenario: Verify the fields in Water Steam page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  When User go to "Type" page
  When User clicks "Water/Steam" next page button
  Then Verify the fields in Water Steam page

  @heating6
  Scenario: Verify the fields in Water Steam page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Heating" page
  When User go to "Setpoints" page
  Then Verify the fields in Heating Setpoints page

  @heating7
  Scenario: Configure the fieds in Heating board and verify them in Heating module
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Heating Board" next page button
  When User clicks "2 Boards" next page button
  When User go to "Board 1" page
  #When User go to "Unique ID" page
  #When User selects "00000001" radio button
  #When User clicks back button
  When User go to "Valves" page
  When User go to "Valve 1" page
  When User selects "Disabled" radio button
  When User clicks back button
  When User clicks back button
  When User go to "Binary Inputs" page
  When User go to "Binary Input 1" page
  When User selects "Ignition Proof" radio button
  When User clicks back button
  When User go to "Binary Input 3" page
  When User selects "Ignition Proof" radio button
  When User clicks back button
  When User go to "Binary Input 4" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Binary Input 5" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User clicks back button
  When User go to "Mouts" page
  When User go to "Mout 1" page
  When User selects "SCR Signal" radio button
  When User clicks back button
  When User go to "Mout 2" page
  When User selects "Heat Enable" radio button
  When User clicks back button
  When User go to "Mout 3" page
  When User selects "Heat Enable" radio button
  When User clicks back button
  When User go to "Mout 4" page
  When User selects "Inducer Fan Low Speed" radio button
  When User clicks back button
  When User go to "Mout 5" page
  When User selects "Inducer Fan Low Speed" radio button
  When User clicks back button
  When User go to "Mout 6" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Mout 7" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Mout 8" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User clicks back button
  When User clicks back button
  When User go to "Board 2" page
  #When User go to "Unique ID" page
  #When User selects "00000002" radio button
  #When User clicks back button
  When User go to "Valves" page
  When User go to "Valve 1" page
  When User selects "Disabled" radio button
  When User clicks back button
  When User clicks back button
  When User go to "Binary Inputs" page
  When User go to "Binary Input 1" page
  When User selects "Ignition Proof" radio button
  When User clicks back button
  When User go to "Binary Input 3" page
  When User selects "Ignition Proof" radio button
  When User clicks back button
  When User go to "Binary Input 4" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Binary Input 5" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User clicks back button
  When User go to "Mouts" page
  When User go to "Mout 1" page
  When User selects "SCR Signal" radio button
  When User clicks back button
  When User go to "Mout 2" page
  When User selects "Heat Enable" radio button
  When User clicks back button
  When User go to "Mout 3" page
  When User selects "Heat Enable" radio button
  When User clicks back button
  When User go to "Mout 4" page
  When User selects "Inducer Fan Low Speed" radio button
  When User clicks back button
  When User go to "Mout 5" page
  When User selects "Inducer Fan Low Speed" radio button
  When User clicks back button
  When User go to "Mout 6" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Mout 7" page
  When User selects "BACnet Passthrough" radio button
  When User clicks back button
  When User go to "Mout 8" page
  When User selects "BACnet Passthrough" radio button
	Then Go back to Unit configuration page
  When User go to "Heating" page
  When User go to "Type" page
  When User clicks "Gas" next page button
  Then verify the "Heating Board 1" description
  
  #Then verify the "Heating Board 1" description text should be "00000001" and click
  When User go to "Ign. Ctrl. 1" page
  When User selects "Modulating" radio button
  When User clicks back button
  When User go to "Ign. Ctrl. 2" page
  When User selects "Fixed" radio button
  When User clicks back button
  When User clicks back button
  Then verify the "Heating Board 2" description
  
  #Then verify the "Heating Board 2" description text should be "00000002" and click
  When User go to "Ign. Ctrl. 1" page
  When User selects "Modulating" radio button
  When User clicks back button
  When User go to "Ign. Ctrl. 2" page
  When User selects "Fixed" radio button
  When User clicks back button
  When User clicks back button
  When User clicks back button
  When User clicks "Electric" next page button
  Then verify the "Heating Board 1" description
  
  #Then verify the "Heating Board 1" description text should be "00000001" and click
  When User go to "Mout 2" page
  When User selects "SCR Enable" radio button
  When User clicks back button
  When User go to "Mout 3" page
  When User selects "Fixed Enable" radio button
  When User clicks back button
  When User clicks back button
  Then verify the "Heating Board 2" description
  
  #Then verify the "Heating Board 2" description text should be "00000002" and click
  When User go to "Mout 2" page
  When User selects "SCR Enable" radio button
  When User clicks back button
  When User go to "Mout 3" page
  When User selects "Fixed Enable" radio button
  When User clicks back button
  When User clicks back button
  When User clicks back button
  When User clicks "Heat Pump" next page button
  
  When User go to "Aux/Emerg." page
  When User selects "Gas" radio button
  
  When User clicks "Aux Heat" next page button
  Then verify the "Heating Board 1" description
  
  #Then verify the "Heating Board 1" description text should be "00000001" and click
  Then verify the "Ign. Ctrl. 1" description text should be "Modulating"
  Then verify the "Ign. Ctrl. 2" description text should be "Fixed"
  When User clicks back button
  Then verify the "Heating Board 2" description
  
  #Then verify the "Heating Board 2" description text should be "00000002" and click
  Then verify the "Ign. Ctrl. 1" description text should be "Modulating"
  Then verify the "Ign. Ctrl. 2" description text should be "Fixed"
  When User clicks back button
  When User clicks back button
  When User clicks "Emergency Heat" next page button
  Then verify the "Heating Board 1" description
  
  #Then verify the "Heating Board 1" description text should be "00000001" and click
  Then verify the "Ign. Ctrl. 1" description text should be "Modulating"
  Then verify the "Ign. Ctrl. 2" description text should be "Fixed"
  When User clicks back button
  Then verify the "Heating Board 2" description
  
  #Then verify the "Heating Board 2" description text should be "00000002" and click
  Then verify the "Ign. Ctrl. 1" description text should be "Modulating"
  Then verify the "Ign. Ctrl. 2" description text should be "Fixed"
  When User clicks back button
  When User clicks back button
  When User clicks "Electric" next page button
  Then verify the "Heating Board 1" description
  
  #Then verify the "Heating Board 1" description text should be "00000001" and click
  Then verify the "Mout 2" description text should be "SCR Enable"
  Then verify the "Mout 3" description text should be "Fixed Enable"
  When User clicks back button
  Then verify the "Heating Board 2" description
  
  #Then verify the "Heating Board 2" description text should be "00000002" and click
  Then verify the "Mout 2" description text should be "SCR Enable"
  Then verify the "Mout 3" description text should be "Fixed Enable"
  
  #@heating8
  #Scenario: Verify the fields in Water Steam page
  #Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  #When User clicks Factory Reset button
  #When User go to "Heating" page
  #When User go to "Type" page
  #When User clicks "Heat Pump" next page button
  #When User go to "Aux/Emerg." page
  #Then Verify the fields in Aux Emergency Heat page  
  #When User selects "Gas" > "Aux Heat" and clicks "Heating Board 1" to verify the labels

  