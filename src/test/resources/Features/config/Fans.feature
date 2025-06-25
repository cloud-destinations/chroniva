  @fans @smoke
Feature: Fans page in Config
  
  @fans1
  Scenario: Verify the fields in Supply Fan Config page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  Then Verify the fields in Supply Fan Config page
  Then Verify the fields in Filter Loading Setpoints page
  When User go to "Duct Static DB" page
  Then User enter the value with two decimals and verify the entered value
  
  @fans2
  Scenario: Verify the fields in SZVAV Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "SZVAV" next page button
  Then Verify the fields in SZVAV Setpoints page
  
  @fans3
  Scenario: Verify the fields in Duct Static Control Config page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Duct Static Control" radio button
  When User clicks "Has Static Reset" next page button
  Then Verify the fields in Has Static Reset Setpoints page
  When User clicks "Duct Static Control" next page button
  Then Verify the fields in Duct Static Control Setpoints page
  When User go to "Duct Static DB" page
  Then User enter the value with two decimals and verify the entered value  

  @fans41
  Scenario: Verify the fields in SF Runs While Unoccupied Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Supply Fan Cycles w/ Heat/Cool" radio button
  Then Alert should display with "Unit Must be in Standard Mode"
	Then Go back to Unit configuration page
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  When User selects "Standard (Default)" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Supply Fan Cycles w/ Heat/Cool" radio button
  Then Verify the fields Supply Fan Cycles should be selected

  @fans4
  Scenario: Verify the fields in SF Runs While Unoccupied Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "SF Runs While Unoccupied" next page button
  Then Verify the fields in SF Runs While Unoccupied Setpoints page

  @fans5
  Scenario: Verify the fields in Supply Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  #Then verify the "Control" description text should be "None" and click
  Then verify the Control description text 
  When User clicks "Supply Fan" next page button
  Then Verify the fields in Supply Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value
  
  @fans6
  Scenario: Verify the fields in Return Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  Then Alert should display with "Must Configure Return Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Return Fan" next page button
  #Then verify the "Fan Control" description text should be "On/Off" and click
  Then verify the Fan Control description text 
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Return Fan Setpoints page
  Then User enter the value with two decimals and verify the entered value
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans7
  Scenario: Verify the fields in Return Fan - Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  When User clicks "+ Exhaust Damper" next page button
  Then Verify the fields in Return Fan - Exhaust Damper Setpoints page
  When User go to "Exhaust Damper DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans8
  Scenario: Verify the fields in Exhaust Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Exhaust Fan" radio button
  Then Alert should display with "Must Configure Exhaust Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Fan" next page button
  Then verify the Fan Control description text 
  #Then verify the "Fan Control" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Exhaust Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans9
  Scenario: Verify the fields in Outside Air Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Outside Air Damper" radio button
  Then Alert should display with "Must Configure OA Damper for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Outside Air Damper" next page button
  Then Verify the fields in OA Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans10
  Scenario: Verify the fields in Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Damper" next page button
  Then Verify the fields in Exhaust Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans11
  Scenario: Verify the fields in Building Pressure Sensor Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Building Pressure Sensor" next page button
  Then verify the "Sensor Type" description text should be "None" and click
  When User selects "Analog" radio button and go back
  Then verify the "Sensor Type" description text should be "Analog" and click
  When User selects "Exhaust Fan" radio button and go back
  Then verify the "Sensor Type" description text should be "Exhaust Fan" and click
  When User selects "Outside Air Damper" radio button and go back
  Then verify the "Sensor Type" description text should be "Outside Air Damper" and click

  @fans12
  Scenario: Verify the fields in RF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in RF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans13
  Scenario: Verify the fields in EF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in EF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans14
  Scenario: Verify the fields in Exhaust Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in Exhaust Fan Tracking Setpoints page

  @fans15
  Scenario: Verify the fields in Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User clicks "Building Pressure" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in Return Fan Tracking Setpoints page

  @fans16
  Scenario: Verify the fields in Global Supply Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Setpoints" page
  Then Verify the fields in Global Supply Fan Setpoints page

  @fans17
  Scenario: Verify the fields in Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  Then Verify the fields in Return Fan Config page

  @fans18
  Scenario: Verify the fields in Supply Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  Then verify the Control description text 
  #Then verify the "Control" description text should be "None" and click
  #Then Alert should display with "Must Configure Supply Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Building Pressure" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Supply Fan" next page button
  Then Verify the fields in Supply Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value
  
  @fans19
  Scenario: Verify the fields in Return Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Return Fan" next page button
  Then verify the Fan Control description text 
  #Then verify the "Fan Control" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Return Fan Setpoints page
  Then User enter the value with two decimals and verify the entered value
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans20
  Scenario: Verify the fields in Return Fan - Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  When User clicks "+ Exhaust Damper" next page button
  Then Verify the fields in Return Fan - Exhaust Damper Setpoints page
  When User go to "Exhaust Damper DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans21
  Scenario: Verify the fields in Exhaust Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Exhaust Fan" radio button
  Then Alert should display with "Must Configure Exhaust Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Fan" next page button
  Then verify the Fan Control description text 
  #Then verify the "Fan Control" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Exhaust Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans22
  Scenario: Verify the fields in Outside Air Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Outside Air Damper" radio button
  Then Alert should display with "Must Configure OA Damper for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Outside Air Damper" next page button
  Then Verify the fields in OA Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans23
  Scenario: Verify the fields in Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Damper" next page button
  Then Verify the fields in Exhaust Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans24
  Scenario: Verify the fields in Building Pressure Sensor Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  Then verify the "Sensor Type" description text should be "None" and click
  When User selects "Analog" radio button and go back
  Then verify the "Sensor Type" description text should be "Analog" and click
  When User selects "Exhaust Fan" radio button and go back
  Then verify the "Sensor Type" description text should be "Exhaust Fan" and click
  When User selects "Outside Air Damper" radio button and go back
  Then verify the "Sensor Type" description text should be "Outside Air Damper" and click

  @fans25
  Scenario: Verify the fields in RF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in RF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans26
  Scenario: Verify the fields in EF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in EF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans27
  Scenario: Verify the fields in Exhaust Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in Exhaust Fan Tracking Setpoints page

  @fans28
  Scenario: Verify the fields in Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in Return Fan Tracking Setpoints page

  @fans29
  Scenario: Verify the fields in Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  Then Verify the fields in Exhaust Fan Config page
  
  @fans30
  Scenario: Verify the fields in Exhaust Supply Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  Then verify the Control description text 
  #Then verify the "Control" description text should be "None" and click
  #Then Alert should display with "Must Configure Supply Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Building Pressure" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Supply Fan" next page button
  Then Verify the fields in Supply Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value
  
  @fans31
  Scenario: Verify the fields in Exhaust Return Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  Then Alert should display with "Must Configure Return Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Return Fan" next page button
  Then verify the Fan Control description text 
  #Then verify the "Fan Control" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Return Fan Setpoints page
  Then User enter the value with two decimals and verify the entered value
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans32
  Scenario: Verify the fields in Exhaust - Return Fan - Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  When User clicks "+ Exhaust Damper" next page button
  Then Verify the fields in Return Fan - Exhaust Damper Setpoints page
  When User go to "Exhaust Damper DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans33
  Scenario: Verify the fields in Exhaust - Exhaust Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Fan" next page button
  Then verify the Fan Control description text 
  #Then verify the "Fan Control" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Fan Control" description text should be "Modulating" and click  
  Then Go to previous page
  When User go to "Setpoints" page
  Then Verify the fields in Exhaust Fan Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans34
  Scenario: Verify the fields in Exhaust - Outside Air Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Outside Air Damper" radio button
  Then Alert should display with "Must Configure OA Damper for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Outside Air Damper" next page button
  Then Verify the fields in OA Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans35
  Scenario: Verify the fields in Exhaust - Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Damper" next page button
  Then Verify the fields in Exhaust Damper Setpoints page
  When User go to "Bldg Pr Setpoint" page
  Then User enter the value with two decimals and verify the entered value

  @fans36
  Scenario: Verify the fields in Exhaust - Building Pressure Sensor Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  Then verify the "Sensor Type" description text should be "None" and click
  When User selects "Analog" radio button and go back
  Then verify the "Sensor Type" description text should be "Analog" and click
  When User selects "Exhaust Fan" radio button and go back
  Then verify the "Sensor Type" description text should be "Exhaust Fan" and click
  When User selects "Outside Air Damper" radio button and go back
  Then verify the "Sensor Type" description text should be "Outside Air Damper" and click

  @fans37
  Scenario: Verify the fields in Exhaust - RF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in RF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans38
  Scenario: Verify the fields in Exhaust - EF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in EF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @fans39
  Scenario: Verify the fields in Exhaust - Exhaust Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in Exhaust Fan Tracking Setpoints page

  @fans40
  Scenario: Verify the fields in Exhaust - Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in Return Fan Tracking Setpoints page

















  
  
  
  
  