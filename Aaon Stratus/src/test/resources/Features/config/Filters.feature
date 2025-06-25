  @filters @smoke
Feature: Filters page in Config
  
  @filters1
  Scenario: Verify the Filter types screen elements in Filters
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  Then Verify the fields in Filter types page
  
  @filters2
  Scenario: Verify the Pre Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Pre" next page button
  Then Verify the fields in Pre Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Pre-Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Pre-Filter Differential Pressure Setpoints page
  
  @filters3
  Scenario: Verify the Main Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Main" next page button
  Then Verify the fields in Main Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Main-Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Main-Filter Differential Pressure Setpoints page
  
  @filters4
  Scenario: Verify the Return Air Bypass Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Return Air Bypass" next page button
  Then Verify the fields in Return Air Bypass Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Return Air Bypass Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Return Air Bypass Filter Differential Pressure Setpoints page
  
  @filters5
  Scenario: Verify the Heat Wheel OA Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Heat Wheel OA" next page button
  Then Verify the fields in Heat Wheel OA Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Heat Wheel OA Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Heat Wheel OA Filter Differential Pressure Setpoints page
  
  @filters6
  Scenario: Verify the Heat Wheel Exhaust Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Heat Wheel Exhaust" next page button
  Then Verify the fields in Heat Wheel Exhaust Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Heat Wheel Exhaust Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Heat Wheel Exhaust Filter Differential Pressure Setpoints page
  
  @filters7
  Scenario: Verify the Preheat Filter type screen elements
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to "Filters" page
  When User clicks "Preheat" next page button
  Then Verify the fields in Preheat Filter Monitoring Type page
  When User clicks "Change Interval" next page button
  Then Verify the fields in Preheat Filter Change Interval Setpoints page
  When User clicks "Differential Pressure" next page button
  Then Verify the fields in Preheat Filter Differential Pressure Setpoints page
  
  
