@smoke @monitoring
Feature: Monitoring page functionality

@monitoring1
   Scenario: Verify telemetry labels and values
    Given User is on the Dashboard page
    Then User verifies the Airflow dropdown label is displayed as Airflow
    And User verifies all telemetry labels are displayed on the monitoring dashboard initially
	
	@monitoring2
  Scenario: Verify Edit Page Headings  
    Given User is on the Dashboard page  
    Given User navigates to Custom page and click the edit button
    Then User verifies the Edit page heading text  
    And User verifies the Telemetry name heading  
	
	@monitoring3
  Scenario: Verify Telemetry Labels and Values  
    Given User is on the Dashboard page  
    Given User navigates to Custom page and click the edit button
    
    When User clicks on the Temperature telemetry label 
    Then The Temperature telemetry details should be displayed  

    When User clicks on the Humidity telemetry label  
    Then The Humidity telemetry details should be displayed  

    When User clicks on the Pressure telemetry label   
    Then The Pressure telemetry details should be displayed  

    When User clicks on the Damper telemetry label   
    Then The Damper telemetry details should be displayed  

    When User clicks on the Fans telemetry label  
    Then The Fans telemetry details should be displayed  

    When User clicks on the Airflow telemetry label  
    Then The Airflow telemetry details should be displayed  

    When User clicks on the Misc telemetry label 
    Then The Misc telemetry details should be displayed  

@monitoring4
  Scenario: Verify Unchecked Telemetry Value is Not Displayed  
    Given User is on the Dashboard page  
    When User checks a telemetry value and saves  
    Then A Saved successfully popup should appear ans selected value should display
    When User unchecks a telemetry value and saves  
    And The unchecked telemetry value should disappear from the Dashboard  
    And The dropdown should update to Custom  

@monitoring5
  Scenario: Verify Submodule Navigation in the Application
Given User is on the Dashboard page 
When  the user selects the Space Temp submodule
Then the system should display the Space Temp page and verify its correctness.
#When the user selects the Mode submodule
#Then the system should display the Mode page and verify its correctness.
When the user selects the Economizer submodule 
Then the system should display the Economizer page and verify its correctness.
When the user selects the Schedule submodule 
Then the system should display the Schedule page and verify its correctness.
#When the user selects the Graphs submodule
#Then the system should display the Graphs page and verify its correctness.

  @monitoring6 @check
  Scenario: Verify the Space Temp page values
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  When Navigate to Space Temp screen in Monitoring
  Then Verify the fields in Space Temp page
  
  #Scenario: Verify the Mode page values
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  #When Navigate to Mode screen in Monitoring
  #Then Verify the fields in Mode page
  
  @monitoring7
  Scenario: Verify the Economizer page values
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  When Navigate to Economizer screen in Monitoring
  Then Verify the fields in Economizer page
  
  @monitoring8
  Scenario: Verify the Schedule page values
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  When Navigate to Schedule screen in Monitoring
  Then Verify the fields in Schedule page in Monitoring
  
  #Scenario: Verify the Graphs page values
  #Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  #When Navigate to Graphs screen in Monitoring
  #Then Verify the fields in Graphs page
  