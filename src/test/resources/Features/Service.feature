  @service
Feature: Test Service page functionality
  @service1 @check @smoke 
  Scenario: Verify the Service page values
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  Then Verify the elements in Service page
  Then verified the Event Log in the Service module
  Then User clicks Filter By verifies the labels and selects the required checkboxes
  
  #@service2 @check
  #Scenario: Verify the start test page values
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  #When Click on Test button in Service page  
  #Then Verify the elements in caution page
  #When Click on Continue button in Test Page
  #Then Verify the elements in Test run page
  #Then Stop the test in Service test page
  
  #@service3
  #Scenario: Verify Fans test page functionality
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  #When Click on Test button in Service page  
  #When Click on Continue button in Test Page
  #When Click on Fans button in Service test page
  #Then Verify the elements in Fans test page
  #When I increase the temperatue and click force and confirm
  #Then Verify the temperature value is "2"
  #When I cleared the temperature with confirmation
  #Then Verify the temperature value is "0"
  #Then Stop the test in Service test page
  
   #@service4
  #Scenario: Verify Dampers test page functionality
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  #When Click on Test button in Service page  
  #When Click on Continue button in Test Page
  #When Click on Dampers button in Service test page
  #Then Verify the elements in Dampers test page
  #When I increase the temperatue and click force
  #Then Verify the temperature value is "2"
  #When I cleared the temperature
   #Then Verify the temperature value is "0"
  #Then Stop the test in Service test page
    
#@service12
 #Scenario: Verify navigation and confirmation in the Service Test Module
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  #When Click on test module
  #When Click on back button
  #And Click No button in the caution message
  #When Click Yes button in caution message
  #Then Verify service mode dashboard1
  
 
 
 
@service11
 Scenario: Verify test card functionality and back navigation
 
    Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
    When  Click on the fans card
    Then   verify that the corresponding fan page for is opened
    When   Click on the left arrow fansicon indicating back
    
    When  Click on the Damper card
    Then   verify that the corresponding damper page for is opened
    When   Click on the left arrow dampericon indicating back
    
    When  Click on the Heat Wheel card
    Then   verify that the corresponding heatwheel page for is opened
    When   Click on the left arrow heatwheelicon indicating back

    When  Click on the Pre-Heat card
    Then   verify that the corresponding pre-heat page for is opened
    When   Click on the left arrow preheaticon indicating back
   
    When  Click on the HeatPump card
    Then   verify that the corresponding heat pump page for is opened
    When  Click on the left arrow heatpumpicon indicating back
     
    When  Click on the Cooling card
    Then   verify that the corresponding cooling page for is opened
    When  Click on the left arrow coolingpageicon indicating back
   

 @service10
 Scenario: Verify all elements on the Cooling test screen
    Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
    When the user clicks on Cooling
    Then the Cooling screen should be displayed
    And a Left Arrow should be present on the top left indicating Back
    And the following header menu options should be present:
      | Menu Item       |
      | Compressors     |
      | Condenser Fans  |
      | CW Valve        |
    And the following buttons should be present below the right card:
      | Button         |
      | Stop Tests     |
      | Details        |
      | Event Log      | 

  
  @service5
  Scenario: Verify Heat Wheel test page functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Heat Wheel button in Service test page
  Then Verify the elements in Heat Wheel test page
  Then Verify the play and stop button in Heat Wheel
  Then Stop the test in Service test page
  
  @service6
  Scenario: Verify Pre-heat test page functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Pre-heat button in Service test page
  Then Verify the elements in Pre-heat test page
  When I increase the temperatue and click force
  Then Verify the temperature value is "2"
  When Navigate to Pre-heat page and click the SCR button
  When Navigate to supply fans page
  When I cleared the temperature
  Then Should show warning message in supply fans
  When Navigate to Pre-heat page and click the SCR button
  When Navigate to supply fans page
  When I cleared the temperature
  Then Verify the temperature value is "0"
  Then Verify the pre-heat tab status
  Then Stop the test in Service test page
  
  @service7
  Scenario: Verify Heat pump test page functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Heat pump button in Service test page
  Then Verify the elements in Heat pump test page
  Then Verify the play and stop button in Heat pump
  Then Stop the test in Service test page
  
  @service8
  Scenario: Verify Cooling test page functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Cooling button in Service test page
  Then Verify the elements in Cooling test page
  When I increase the temperatue and click force
  Then Verify the temperature value is "2"
  When Navigate to Compressors page in Cooling
  When I increase the temperatue and click force
  Then Verify the temperature value is "2"
  When Navigate to supply fans page
  When I cleared the temperature
  Then Should show warning message in supply fans in Cooling
  When Navigate to Compressors page in Cooling
  When I cleared the temperature
  Then Verify the temperature value is "0"
  When Navigate to supply fans page
  When I cleared the temperature
  Then Verify the temperature value is "0"
  Then Verify the Compressors tab status
  Then Stop the test in Service test page
  
   @service13
  Scenario: Verify Cooling test page functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Cooling button in Service test page
  Then Verify the elements in Cooling test page
  When I increase the temperatue and click force
  Then Verify the temperature value is "2"
  When Navigate to Compressors page in Cooling
  When Navigate to supply fans page
  When I cleared the temperature
  Then Verify the temperature value is "0"
  Then Verify the Compressors tab status
  Then Stop the test in Service test page
  
    @service9
  Scenario: Verify Condenser fans page in Cooling functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Cooling button in Service test page
  When Click on Condenser fans tab in Cooling
  Then Verify the elements in Condenser fans page
  When I increase the temperatue and click force and confirm
  Then Verify the temperature value is "2"
  When I cleared the temperature with confirmation
  Then Verify the temperature value is "0"
  Then Stop the test in Service test page
  
  @service10
  Scenario: Verify Return Fans page functionality in Fans
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Service
  When Click on Test button in Service page  
  When Click on Continue button in Test Page
  When Click on Fans button in Service test page
  When Navigate to Return Fans page in Fans
  Then Verify the elements in Return Fans test page
  When I increase the temperatue and click force and confirm
  Then Verify the temperature value is "2"
  When I cleared the temperature with confirmation
  Then Verify the temperature value is "0"

  
