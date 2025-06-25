  @Unitsettings
Feature: MQTT Unit settings publishing

  Scenario: Test each Unit settings payload selection via MQTT
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  When User go to App type page in Unit settings
  
    When user loads data from Excel sheet "Unit Settings" row 2, publishes the MQTT message, and verifies the radio button name in row 2
    When user loads data from Excel sheet "Unit Settings" row 3, publishes the MQTT message, and verifies the radio button name in row 3
    When user loads data from Excel sheet "Unit Settings" row 4, publishes the MQTT message, and verifies the radio button name in row 4
    When user loads data from Excel sheet "Unit Settings" row 5, publishes the MQTT message, and verifies the radio button name in row 5
    When user loads data from Excel sheet "Unit Settings" row 6, publishes the MQTT message, and verifies the radio button name in row 6
  