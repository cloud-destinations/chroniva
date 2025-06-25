  @EnergyRecoverySource @smoke
Feature: Energy Recovery Source page in Config
  
  @ers1
  Scenario: Verify the ERS types screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  Then verify the "Type" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Type" description text should be "Modulating" and click
  
@ers2
  Scenario: Verify the fields in Modulating ERS Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  When User go to "Type" page
  When User clicks "Modulating" next page button
  Then Verify the fields in Modulating ERS Type page
  When User clicks "0-10V" next page button
  Then Verify the fields in Modulating ERS Setpoints page
  
 @ers3
  Scenario: Verify the fields in ERS OA Enthalpy Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  Then verify the "Disables" description text should be "Economizer" and click
  When User selects "OA Enthalpy" radio button
  Then Alert should display with "Must Configure Digital or BACnet OA Sensor"
	Then Go back to Unit configuration page
  When User go to "Sensors" page
  When User go to "Outdoor" page
  When User selects "BACnet Temp" radio button
	Then Go back to Unit configuration page
  When User go to "Energy Recovery Source" page
  When User go to "Disables" page
  When User clicks "OA Enthalpy" next page button
  Then Verify the fields in ERS OA Enthalpy Setpoints page

  @ers4
  Scenario: Verify the ERS Bypass screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  Then verify the "Bypass" description text should be "On/Off" and click
  When User selects "Modulating" radio button and go back
  Then verify the "Bypass" description text should be "Modulating" and click
  
  @ers5
  Scenario: Verify the fields in Modulating ERS Bypass Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  When User go to "Bypass" page
  When User clicks "Modulating" next page button
  Then Verify the fields in Modulating ERS Bypass Setpoints page
  Then User enter the value with in "1" and "58" and verify
  When User go to "Exh. ERV Bypass Min" page
  Then User enter the value with in "1" and "8" and verify
  When User go to "OA ERV Bypass Max" page
  Then User enter the value with in "1" and "58" and verify
  When User go to "Exh. ERV Bypass Max" page
  Then User enter the value with in "1" and "58" and verify
  When User go to "OA Diff Pr." page
  Then User enter the value with two decimals and verify the entered value
  When User go to "Exhaust Diff Pr." page
  Then User enter the value with two decimals and verify the entered value
  
    @ers6
  Scenario: Verify the ERS Defrost screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  Then verify the "Defrost" description text should be "No Defrost" and click
  When User selects "Defrost Enable" radio button and go back
  Then verify the "Defrost" description text should be "Defrost Enable" and click
  
  @ers7
  Scenario: Verify the fields in ERS Defrost Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Energy Recovery Source" page
  When User go to "Defrost" page
  When User clicks "Defrost Enable" next page button
  Then Verify the fields in ERS Defrost Setpoints page
  
  
  
  
  
  
  