@sensors @smoke
Feature: Sensors page in Config

@sensors1
  Scenario: Verify the Space values in Sensors
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option
  And the user selects the Space option to navigate to the Space Sensor section
  And the user verifies that the No Space Sensor option is clickable
  
  And the user selects the Analog radio button and clicks the arrow to navigate to the Analog Space Sensor
  Then the user verifies the Analog value in Sensors

  And the user selects the Digital radio button and clicks the arrow to navigate to the Digital Space Sensor
  Then the user verifies the Digital value in Sensors

  Then the user verifies that the TS Space Sensor option is clickable
  And the user verifies that the Humidity checkbox is clickable after BACnet Temp click
  Then the user verifies that the Remote Display option is clickable
  
@sensors2 
  Scenario: Verify the Return values in Sensors
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option
  And the user selects the Return option to navigate to the Return Air Sensor Type
  Then the user verifies that the No Return Sensor isclickable
  And the user selects the Analog and Digital radio button is clickable
  
  #And the user selects the Analog radio button and clicks the arrow to navigate to the Analog sensor
  #Then the user verifies the Analog value in Sensors
#
  #And the user selects the Digital radio button and clicks the arrow to navigate to the Digital sensor
  #Then the user verifies the Digital value in Sensors
   
  Then the user verifies that both the BACnet Temp option and the Humidity checkbox are clickable
 
@sensors3
  Scenario: Verify the Outdoor values in Sensors
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option
  And the user selects the Outdoor option to navigate to the Outdoor Air Sensor Options
  Then the user verifies that the No OA Sensor is clickable
  And the user selects the Analog and Digital radio button is clickable
  
  #And the user selects the Analog radio button and clicks the arrow to navigate to the Analog sensor
  #Then the user verifies the Analog value in Sensors
#
  #And the user selects the Digital radio button and clicks the arrow to navigate to the Digital sensor
  #Then the user verifies the Digital value in Sensors
  
  Then the user verifies that the Global Broadcast, BACnet Temp and Humidity checkbox are clickable
  
@sensors4
  Scenario: Verify the Supply values in Sensors
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option
  And the user selects the Supply option to navigate to the Supply Air Sensor Options
  Then the user selects the Analog and Digital radio button is clickable
  
  #And the user selects the Analog radio button and clicks the arrow to navigate to the Analog sensor
  #Then the user verifies the Analog value in Sensors
#
  #And the user selects the Digital radio button and clicks the arrow to navigate to the Digital sensor
  #Then the user verifies the Digital value in Sensors
  
@sensors5
  Scenario: Verify the CO2 values in Sensors
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option
  And the user selects the CO2 option to navigate to the CO2 Sensor Type 
  Then the user verifies that the  No CO2 Sensor option is clickable
  And the user selects the Digital radio button and clicks the arrow to navigate to the CO2 Setpoints
  Then Verify the fields in CO2 Setpoints page
  #And Verify the CO2 value Digital in Sensor
  Then the user verifies that the Reads CO2 Broadcast, Reads CO2 From BACnet
  