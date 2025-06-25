@MQTT  @Sensor
Feature: MQTT Sensor publishing

  Scenario: Test each sensor payload selection via MQTT
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When the user clicks on the Sensors option

  Then the user selects the Space option to navigate to the Space Sensor section
  When user loads data from Excel sheet "Sensors" row 2, publishes the MQTT message, and verifies the radio button name in row 2
  When user loads data from Excel sheet "Sensors" row 3, publishes the MQTT message, and verifies the radio button name in row 3
  When user loads data from Excel sheet "Sensors" row 4, publishes the MQTT message, and verifies the radio button name in row 4
  When user loads data from Excel sheet "Sensors" row 5, publishes the MQTT message, and verifies the radio button name in row 5
  When user loads data from Excel sheet "Sensors" row 6, publishes the MQTT message, and verifies the radio button name in row 6
  When user publishes MQTT message from sheet "Sensors" row 7 and verifies checkbox with label "+ Humidity" is selected
  When user loads data from Excel sheet "Sensors" row 8, publishes the MQTT message, and verifies the radio button name in row 7
  And User clicks back button

  Then the user selects the Return option to navigate to the Return Air Sensor Type
  When user loads data from Excel sheet "Sensors" row 15, publishes the MQTT message, and verifies the radio button name in row 15
  When user loads data from Excel sheet "Sensors" row 16, publishes the MQTT message, and verifies the radio button name in row 16
  When user loads data from Excel sheet "Sensors" row 17, publishes the MQTT message, and verifies the radio button name in row 17
  When user loads data from Excel sheet "Sensors" row 18, publishes the MQTT message, and verifies the radio button name in row 18
  When user publishes MQTT message from sheet "Sensors" row 19 and verifies checkbox with label "+ Humidity" is selected
  And User clicks back button
  
  Then the user selects the Outdoor option to navigate to the Outdoor Air Sensor Options
  When user loads data from Excel sheet "Sensors" row 20, publishes the MQTT message, and verifies the radio button name in row 20
  When user loads data from Excel sheet "Sensors" row 21, publishes the MQTT message, and verifies the radio button name in row 21
  When user loads data from Excel sheet "Sensors" row 22, publishes the MQTT message, and verifies the radio button name in row 22
  When user loads data from Excel sheet "Sensors" row 23, publishes the MQTT message, and verifies the radio button name in row 23
  When user publishes MQTT message from sheet "Sensors" row 24 and verifies checkbox with label "+ Humidity" is selected
  When user loads data from Excel sheet "Sensors" row 25, publishes the MQTT message, and verifies the radio button name in row 25
  And User clicks back button

  Then the user selects the Supply option to navigate to the Supply Air Sensor Options
  When user loads data from Excel sheet "Sensors" row 26, publishes the MQTT message, and verifies the radio button name in row 26
  When user loads data from Excel sheet "Sensors" row 27, publishes the MQTT message, and verifies the radio button name in row 27
  And User clicks back button

  Then the user selects the CO2 option to navigate to the CO2 Sensor Type 
  When user publishes MQTT message from sheet "Sensors" row 28 and verifies checkbox with label "No CO2 Sensor" is selected
  When user loads data from Excel sheet "Sensors" row 29, publishes the MQTT message, and verifies the radio button name in row 29
  

  