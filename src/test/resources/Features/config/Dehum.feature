  @dehum @smoke
Feature: Dehum page in Config
  
  @dehum1
  Scenario: Verify the fields in Dehum Config page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  Then verify the "Config" description text should be "No Dehum" and click
  Then Verify the fields in Dehum Config page
  When User selects "Humidity Control" radio button and go back
  Then verify the "Config" description text should be "Humidity Ctrl" and click
  When User selects "Dewpoint Control" radio button and go back
  Then verify the "Config" description text should be "Dewpoint Ctrl" and click
  When User selects "Enable Dehum in All Unit Operations" radio button and go back
  Then verify the "Config" description text should be "Enable Dehum (All)" and click
  
  @dehum2
  Scenario: Verify the fields in Config - Humidity Control- Dehum Space Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Space Sensor" radio button
  Then Alert should display with "Must configure Space Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Space" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  When User clicks "Space Sensor" next page button
  Then Verify the fields in Dehum Space Sensor page
 
  @dehum3
  Scenario: Verify the fields in Config - Humidity Control-Dehum Return Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Return Sensor" radio button
  Then Alert should display with "Must configure Return Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Return" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  When User clicks "Return Sensor" next page button
  Then Verify the fields in Dehum Return Sensor page
 
  @dehum4
  Scenario: Verify the fields in Config - Humidity Control - OA Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "OA Sensor" radio button
  Then Alert should display with "Must configure OA Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Outdoor" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  When User clicks "OA Sensor" next page button
  Then Verify the fields in Dehum OA Sensor page
 
  @dehum5
  Scenario: Verify the fields in Config - Humidity Control - Supply Air Dewpoint Control page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Supply Air Dewpoint Control" radio button
  Then Alert should display with "Sensor must use Digital"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Supply" page
  When User selects "Digital" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Humidity Control" next page button
  When User clicks "Supply Air Dewpoint Control" next page button
  Then Verify the fields in Dehum Supply Air Dewpoint Control page
 
  @dehum6
  Scenario: Verify the fields in Config - Dewpoint - Dehum Space Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Space Sensor" radio button
  Then Alert should display with "Must configure Space Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Space" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  When User clicks "Space Sensor" next page button
  Then Verify the fields in Dehum Dewpoint Space Sensor page
 
  @dehum7
  Scenario: Verify the fields in Config - Dewpoint - Dehum Return Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Return Sensor" radio button
  Then Alert should display with "Must configure Return Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Return" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  When User clicks "Return Sensor" next page button
  Then Verify the fields in Dehum Dewpoint Return Sensor page
 
  @dehum8
  Scenario: Verify the fields in Config - Dewpoint - OA Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "OA Sensor" radio button
  Then Alert should display with "Must configure OA Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Outdoor" page
  When User selects "Analog" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  When User clicks "OA Sensor" next page button
  Then Verify the fields in Dehum Dewpoint OA Sensor page
 
  @dehum9
  Scenario: Verify the fields in Config - Dewpoint - Supply Air Dewpoint Control page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  Then Verify the fields in Dehum Enable Sensor page
  When User selects "Supply Air Dewpoint Control" radio button
  Then Alert should display with "Sensor must use Digital"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Supply" page
  When User selects "Digital" radio button
	Then Go back to Unit configuration page
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  When User clicks "Supply Air Dewpoint Control" next page button
  Then Verify the fields in Dehum Supply Air Dewpoint Control page
 
  @dehum11
  Scenario: Verify the fields in Config - Dehum Enable Sensor page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Config" page
  When User clicks "Dewpoint Control" next page button
  Then Verify the fields in Dehum Enable Sensor page

  @dehum12
  Scenario: Verify the fields in Reheat Config page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  Then verify the "Reheat" description text should be "No Reheat" and click
  Then Verify the fields in Reheat Config page
  When User selects "Modulating HGR" radio button and go back
  Then verify the "Reheat" description text should be "Modulating HGR" and click
  When User selects "Unit Heat for Reheat" radio button and go back
  Then verify the "Reheat" description text should be "Unit Heat (reheat)" and click
  When User selects "On/Off" radio button and go back
  Then verify the "Reheat" description text should be "On/Off" and click
  When User selects "Has Return Bypass Control" radio button and go back
  Then verify the "Reheat" description text should be "Return Bypass Ctrl" and click
  
  @dehum13
  Scenario: Verify the fields in Reheat - Modulating HGR page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Dehum" page
  When User go to "Reheat" page
  When User clicks "Modulating HGR" next page button
  Then Verify the fields in Modulating HGR page
  
  When User clicks "Enable Reheat Flush" next page button
  Then Verify the fields in Reheat Flush Interval page
  When User clicks "Enable Condenser Flush" next page button
  Then Verify the fields in Condenser Flush Interval page
  When User clicks "Enable Cooling Flush" next page button
  Then Verify the fields in Cooling Flush Interval page
  
  #--TemperatureLable not clickable
  