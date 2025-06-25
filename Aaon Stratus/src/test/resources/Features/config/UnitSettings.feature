  @unitsettings @smoke
Feature: Unit Settings page in Config
  
  @unitsettings1
  Scenario: Verify the Unit settings page values in Config
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  Then Verify the fields in Unit settings page
  
  @unitsettings2
  Scenario: Verify fields in App type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  Then Verify the fields in App type page
  When User selects VAV Control radio button
  Then Verify the App type value "VAV Control" in Unit settings
  When User selects precision radio button
  Then Verify the App type value "Space Control" in Unit settings
  When User selects Outdoor Air Control radio button
  Then Verify the App type value "Outdoor Air Control" in Unit settings
  When User selects Standard radio button
  Then Verify the App type value "Space Control" in Unit settings
  When User selects Return Air Control radio button
  Then Verify the App type value "Return Air Control" in Unit settings
  When User selects 3rd Party Interface radio button
  Then Verify the App type value "3rd Party Interface" in Unit settings
  
  @unitsettings3
  Scenario: Verify the fields in Morning Warm Up page in VAV - Config
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  Then Verify the fields in VAV Control page
  When User go to "Config" page
  Then Verify the fields in VAV - Config page
  When User clicks "Morning Warm Up" next page button
  Then Verify the fields in Morning Warm Up Setpoints page
  
  @unitsettings4
  Scenario: Verify the fields in Morning Cool Down page in VAV - Config
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "Config" page
  Then Verify the fields in VAV - Config page
  When User clicks "Morning Cool Down" next page button
  Then Verify the fields in Morning Cool Down Setpoints page
  
  @unitsettings5
  Scenario: Verify the fields in Enable Unit Heating in VAV - Config page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "Config" page
  Then Verify the fields in VAV - Config page
  When User clicks "Enable Unit Heating" next page button
  Then Verify the fields in Unit Heating Setpoints page
  Then User enter the value and verify the entered value
  When User go to "Heat OAT Enable SP" page
  Then User enter the value and verify the entered value
  
  @unitsettings6
  Scenario: Verify the fields in Duct Static SP page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "Duct Static SP" page
  Then Verify the fields in Duct Static SP page
  
  @unitsettings7
  Scenario: Verify Outside Air page in VAV - SAT Source Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "SAT Reset" page
  Then Verify the fields in SAT Reset page
  When User clicks "Enable SAT Reset" next page button
  Then Verify the fields in Enable SAT Reset page
  When User clicks "Outside Air" next page button
  Then Verify the fields in OA Control - SAT Source Setpoints page
  
  @unitsettings8
  Scenario: Verify Space Air page in VAV - SAT Source Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "SAT Reset" page
  Then Verify the fields in SAT Reset page
  When User clicks "Enable SAT Reset" next page button
  Then Verify the fields in Enable SAT Reset page
  When User clicks "Space Air" next page button
  Then Verify the fields in Space Air - SAT Source Setpoints page
  
  @unitsettings9
  Scenario: Verify Return Air page in VAV - SAT Source Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "SAT Reset" page
  Then Verify the fields in SAT Reset page
  When User clicks "Enable SAT Reset" next page button
  Then Verify the fields in Enable SAT Reset page
  When User clicks "Return Air" next page button
  Then Verify the fields in Return Air - SAT Source Setpoints page
  
  @unitsettings10
  Scenario: Verify Supply Fan VFD page in VAV - SAT Source Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "SAT Reset" page
  Then Verify the fields in SAT Reset page
  When User clicks "Enable SAT Reset" next page button
  Then Verify the fields in Enable SAT Reset page
  When User clicks "Supply Fan VFD" next page button
  Then Verify the fields in Supply FAN VFD - SAT Source Setpoints page
  
  @unitsettings11
  Scenario: Verify Remote Voltage Signal page in VAV - SAT Source Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects VAV Control radio button
  When User clicks next page button of the selected option
  When User go to "SAT Reset" page
  Then Verify the fields in SAT Reset page
  When User clicks "Enable SAT Reset" next page button
  Then Verify the fields in Enable SAT Reset page
  When User clicks "Remote Voltage Signal" next page button
  Then Verify the fields in Remote Voltage Signal - SAT Reset Setpoints page
  
  @unitsettings12
  Scenario: Verify the fields in Space Control - Standard page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects Standard radio button
  When User clicks "Standard (Default)" next page button
  Then Verify the fields in Space Control - Standard page

  @unitsettings13
  Scenario: Verify the fields in Space Control - Precision - Manual page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects Standard radio button
  When User clicks "Precision" next page button
  When User clicks "Manual (Default)" next page button
	Then Verify the fields in Space Control - Precision - Manual page
  
  @unitsettings14
  Scenario: Verify Remote Voltage Signal page in Space Control - Precision - Auto Season Changeover Enable page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects Standard radio button
  When User clicks "Precision" next page button
  When User clicks "Auto Season Changeover Enable" next page button
	Then Verify the all the tiles functionality in Auto Season page
  
  @unitsettings15
  Scenario: Verify page functionality in Outside Air Control Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "Outdoor Air Control" next page button
  When User go to "Setpoints" page
	Then Verify page functionality in Outside Air Control Setpoints page
  
  @unitsettings16
  Scenario: Verify page functionality in Outside Air Control SAT Reset Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "Outdoor Air Control" next page button
  When User go to "SAT Reset" page
  When User clicks "Enable SAT Reset" next page button
  When User clicks "Outside Air" next page button
	Then Verify page functionality in OA Control SAT Reset Setpoints page
  When User clicks "Space Air" next page button
	Then Verify page functionality in OA Control SAT Reset Setpoints page
  When User clicks "Return Air" next page button
	Then Verify page functionality in OA Control SAT Reset Setpoints page
  When User clicks "Supply Fan VFD" next page button
	Then Verify page functionality in OA Control SAT Reset Setpoints page
  
  @unitsettings17
  Scenario: Verify page functionality in Outside Air Control SAT Reset Remote Voltage Signal Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "Outdoor Air Control" next page button
  When User go to "SAT Reset" page
  When User clicks "Enable SAT Reset" next page button
  When User clicks "Remote Voltage Signal" next page button
	Then Verify the fields in Remote Voltage Signal - SAT Reset Setpoints page
	
  @unitsettings18
  Scenario: Verify the fields in Outside Air - Return Air Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects Outdoor Air Control radio button
  When User clicks "Has Return Air" next page button
	Then Verify the fields in Outside Air - Return Air Setpoints page
	
  @unitsettings19
  Scenario: Verify the fields in Return Air Control page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "Return Air Control" next page button
	Then Verify the fields in Return Air Control page in app type

  @unitsettings20
  Scenario: Verify the fields in 3rd Party Interface page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "3rd Party Interface" next page button
	Then Verify the fields in third Party Interface Type page in app type
  When User clicks "Heat Pump Thermostat" next page button
	Then Verify the fields in Heat Pump Thermostat Type page
  When User clicks "DDC" next page button
	Then Verify the fields in DDC page
  When User clicks "Supply Fan" next page button
  Then Verify the fields in supply fan DDC page
  When User clicks "Return/Exhaust Fan" next page button
  Then Verify the fields in return exaust fan DDC page
  When User clicks "OA/Econ Damper" next page button
  Then Verify the fields in return exaust fan DDC page
  When User clicks "SAT Reset" next page button
  Then Verify the fields in DDC - SAT Reset Setpoints page

	@unitsettings21
  Scenario: Verify the fields in Enable Night Setback page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User clicks "Enable Unoccupied Setpoints" next page button
	Then Verify the fields in Enable Unoccupied Setpoints page in app type
	
	@unitsettings22
  Scenario: Verify the fields in Temp scaling page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to "Scalings" page
  When User go to "Temp" page
	Then Verify the fields in Temp scaling page

	@unitsettings23
  Scenario: Verify the fields in Daylight Savings page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to "Daylight Savings" page
  When User clicks "Daylight Savings Schedule Enable" next page button
	Then Verify the fields in Daylight Savings page
	
	@unitsettings24
  Scenario: Verify the fields in Simultaneous HeatCool page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to "Simultaneous Heat/Cool" page
	Then Verify the fields in Simultaneous HeatCool page
	