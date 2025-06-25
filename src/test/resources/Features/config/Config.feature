  
Feature: Test Config page functionality
  
  @config1
  Scenario: Verify the Control mode page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Control Mode page in Setpoints
  Then Verify the fields in Control Mode page
  
  @config2
  Scenario: Verify the Cooling page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Cooling page in Setpoints
  Then Verify the fields in Cooling page
  
  @config3
  Scenario: Verify the Heating page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Heating page in Setpoints
  Then Verify the fields in Heating page

  @config4
  Scenario: Verify the Dehum page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Dehum page in Setpoints
  Then Verify the fields in Dehum page

  @config5
  Scenario: Verify the Preheat page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Preheat page in Setpoints
  Then Verify the fields in Preheat page

  @config6
  Scenario: Verify the Heat Wheel page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Heat Wheel page in Setpoints
  Then Verify the fields in Heat Wheel page

  @config7
  Scenario: Verify the Heat Pump page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Heat Pump page in Setpoints
  Then Verify the fields in Heat Pump page

  @config8
  Scenario: Verify the OA Damper page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to OA Damper page in Setpoints
  Then Verify the fields in OA Damper page

  @config9
  Scenario: Verify the FAN AFMS page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to FAN AFMS page in Setpoints
  Then Verify the fields in FAN AFMS page

  @config10
  Scenario: Verify the Pressure page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Pressure page in Setpoints
  Then Verify the fields in Pressure page

  @config11
  Scenario: Verify the Safety page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Safety page in Setpoints
  Then Verify the fields in Safety page

  @config12
  Scenario: Verify the Misc page values in Setpoints
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When Go to Misc page in Setpoints
  Then Verify the fields in Misc page
  
  @config13 @smoke
  Scenario: Verify the Config page values
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  Then Verify the fields in Config page