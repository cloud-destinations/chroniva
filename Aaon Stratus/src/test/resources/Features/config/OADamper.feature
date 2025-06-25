  @oadamper @smoke
Feature: OA Damper page in Config
  
@oadamper1
  Scenario: Verify the fields in OA Damper Config - CO2 Sensor Type
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Config" page
  Then Verify the fields in OA Damper Config
  When User clicks "Econo Control w/ IAQ Override" next page button
  Then Verify the fields in CO2 Sensor Type
  When User clicks "Digital" next page button
  Then Verify the fields in CO2 Setpoints
  
@oadamper2
  Scenario: Verify the fields in OA Damper Config - Building Pressure Control - Supply Fan
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Supply Fan" radio button
  Then Alert should display with "Must Configure Supply Fan for Bldg Pr"
	Then Go back to Unit configuration page
  When User go to "Fans" page
  When User go to "Supply" page
  When User go to "Config" page
  When User selects "Building Pressure" radio button
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Supply Fan" next page button
  Then Verify the fields in Supply Fan page in BPC
  
@oadamper3
  Scenario: Verify the fields in OA Damper Config - Building Pressure Control - Return Fan Control
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "OA Damper" page
  When User go to "Config" page
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
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Return Fan" next page button
  When User go to "Fan Control" page
  Then Verify the fields in Building Pressure - Return Fan Control
  When User go to "Setpoints" page
  Then Verify the fields in Building Pressure - Return Fan Setpoints
  
@oadamper4
  Scenario: Verify the fields in OA Damper Config - Building Pressure Control - Exhaust Damper
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Fans" page
  When User go to "Return" page
  When User selects "Building Pressure Control" radio button
	Then Go back to Unit configuration page
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User selects "Return Fan" radio button
  When User clicks "+ Exhaust Damper" next page button
  Then Verify the fields in Building Pressure - RF Exhaust Damper
  When User clicks "Outside Air Damper" next page button
  Then Verify the fields in Building Pressure - Outside Air Damper
  When User clicks "Exhaust Damper" next page button
  Then Verify the fields in Building Pressure - Exhaust Damper
  
@oadamper5
  Scenario: Verify the fields in OA Damper Config - Building Pressure Control - Exhaust Fan
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "OA Damper" page
  When User go to "Config" page
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
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Control" page
  When User clicks "Exhaust Fan" next page button
  When User go to "Fan Control" page
  Then Verify the fields in Building Pressure -Exhaust Fan Control
  When User go to "Setpoints" page
  Then Verify the fields in Building Pressure - Exhaust Fan Setpoints
  
@oadamper6
  Scenario: Verify the fields in OA Damper Config - Building Pressure - Sensor Type
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Building Pressure Sensor" next page button
  When User go to "Sensor Type" page
  Then Verify the fields in Building Pressure Sensor Type
  
@oadamper7
  Scenario: Verify the fields in OA Damper Config - Duct Static Pressure Sensor
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in RF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value
  
@oadamper8
  Scenario: Verify the fields in OA Damper Config - Duct Static Pressure Sensor
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Duct Static Pressure Sensor" next page button
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in EF Duct Static Pressure Setpoints page
  When User go to "Duct Static Pr DB" page
  Then User enter the value with two decimals and verify the entered value
  
@oadamper9
  Scenario: Verify the fields in OA Damper Config - Fan Tracking
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Config" page
  When User clicks "Building Pressure Control" next page button
  When User clicks "Fan Tracking" next page button
  When User clicks "Return Fan" next page button
  Then Verify the fields in Fan Tracking - Return Fan
  When User clicks "Exhaust Fan" next page button
  Then Verify the fields in Fan Tracking - Exhaust Fan
  
@oadamper10
  Scenario: Verify the fields in OA Damper - Min Eco Pos.
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Min Eco Pos." page
  Then Verify the fields in OA Damper - Min Eco Pos.
  
@oadamper11
  Scenario: Verify the fields in OA Damper - Economizer Enable
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Economizer Enable" page
  When User clicks "Outside Air Drybulb" next page button
  Then Verify the fields in OA Damper - Economizer Enable - Outside Air Drybulb
  When User clicks "Outside Air Wetbulb" next page button
  Then Verify the fields in OA Damper - Economizer Enable - Outside Air Wetbulb
  When User clicks "Outside Air Dewpoint" next page button
  Then Verify the fields in OA Damper - Economizer Enable - Outside Air Dewpoint
  When User clicks "Comparative Enthalpy w/ Drybulb Limit" next page button
  Then Verify the fields in OA Damper - Economizer Enable - Comparative Enthalpy Drybulb Limit
  When User clicks "Comparative Enthalpy" next page button
  Then Verify the fields in OA Damper - Economizer Enable - Comparative Enthalpy
  
@oadamper12
  Scenario: Verify the fields in OA Damper - Economizer Voltages
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "OA Damper" page
  When User go to "Economizer Voltages" page
  Then Verify the fields in OA Damper - Economizer Voltages
  
  
  
  
  
