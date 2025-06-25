  @preheat @smoke
Feature: Preheat page in Config
  
  @preheat1
  Scenario: Verify the Preheat types screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Preheat" page
  Then verify the "Type" description text should be "None" and click
  Then Verify the fields in Preheat type page
  When User selects "Electric" radio button and go back
  Then verify the "Type" description text should be "Electric" and click
  When User selects "Water/Steam" radio button and go back
  Then verify the "Type" description text should be "Water/Steam" and click
  
  @preheat2
  Scenario: Verify the Preheat types all screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Preheat" page
  When User go to "Type" page
  When User clicks "Electric" next page button
  Then Verify the fields in Electric Setpoints page
  When User clicks "Water/Steam" next page button
  Then Verify the fields in WaterSteam Setpoints page
  
  @preheat3
  Scenario: Verify the Preheat Setpoints screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Preheat" page
  When User go to "Setpoints" page
  Then Verify the fields in Preheat Setpoints page
  
  
  
  