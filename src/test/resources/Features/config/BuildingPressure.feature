  @buildingpressure @bp @smoke 
Feature: Building Pressure page in Config
  
  @bp1
  Scenario: Verify the fields in Supply Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  Then verify the Control description text 
  #Then Alert should display with "Must Configure Supply Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Building Pressure" radio button
	Then Go back to Unit configuration page
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Supply Fan" next page button
  Then Verify the fields in Supply Fan Setpoints page
  When User go to Bldg Pr Setpoint page
  Then User enter the value with two decimals and verify the entered value
  
  @bp2
  Scenario: Verify the fields in Return Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  Then Alert should display with "Must Configure Return Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Building Pressure" page
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
  #When User go to "Bldg Pr Setpoint" page
  When User go to Bldg Pr Setpoint page
  Then User enter the value with two decimals and verify the entered value

  @bp3
  Scenario: Verify the fields in Return Fan - Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  When User clicks "+ Exhaust Damper" next page button
  Then Verify the fields in Return Fan - Exhaust Damper Setpoints page
  When User go to "Exhaust Damper DB" page
  Then User enter the value with two decimals and verify the entered value

  @bp4
  Scenario: Verify the fields in Exhaust Fan Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Exhaust Fan" radio button
  Then Alert should display with "Must Configure Exhaust Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Exhaust" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Building Pressure" page
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
  #When User go to "Bldg Pr Setpoint" page
  When User go to Bldg Pr Setpoint page
  Then User enter the value with two decimals and verify the entered value

  @bp5
  Scenario: Verify the fields in Outside Air Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Outside Air Damper" radio button
  Then Alert should display with "Must Configure OA Damper for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Outside Air Damper" next page button
  Then Verify the fields in OA Damper Setpoints page
  #When User go to "Bldg Pr Setpoint" page
  When User go to Bldg Pr Setpoint page
  Then User enter the value with two decimals and verify the entered value

  @bp6
  Scenario: Verify the fields in Exhaust Damper Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Damper" next page button
  Then Verify the fields in Exhaust Damper Setpoints page
  #When User go to "Bldg Pr Setpoint" page
  When User go to Bldg Pr Setpoint page
  Then User enter the value with two decimals and verify the entered value

  @bp7
  Scenario: Verify the fields in Building Pressure Sensor Type page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Building Pressure Sensor" next page button
  Then verify the "Sensor Type" description text should be "None" and click
  When User selects "Analog" radio button and go back
  Then verify the "Sensor Type" description text should be "Analog" and click
  When User selects "Exhaust Fan" radio button and go back
  Then verify the "Sensor Type" description text should be "Exhaust Fan" and click
  When User selects "Outside Air Damper" radio button and go back
  Then verify the "Sensor Type" description text should be "Outside Air Damper" and click

  @bp8
  Scenario: Verify the fields in RF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in RF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @bp9
  Scenario: Verify the fields in EF Duct Static Pressure Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in EF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value

  @bp10
  Scenario: Verify the fields in Exhaust Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Fan Tracking" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in Exhaust Fan Tracking Setpoints page

  @bp11
  Scenario: Verify the fields in Return Fan Tracking Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Building Pressure" page
  When User clicks "Fan Tracking" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in Return Fan Tracking Setpoints page











