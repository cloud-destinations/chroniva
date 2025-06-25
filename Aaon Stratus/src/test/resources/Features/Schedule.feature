@smoke  @schedule
Feature: Test Schedule page functionality
  
  @schedule1
  Scenario: Verify the Schedule page values 
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Schedule
  Then Verify the fields in Schedule page
  
  @schedule2
  Scenario: Verify the schedule creation functionality
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Schedule
  When Go to schedule creation page in Monday
  Then Verify the fields in Schedule creation page
  When Create second event in Schedule creation page
  Then Verify the second event in Schedule page
  Then Delete the second evenetin Schedule page
  
  @schedule3
  Scenario: Verify the Holiday creation functionalify
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Schedule
  When Create Holiday event in Holiday creation page
  Then Delete the created Holiday in Schedule page
  
  @schedule4
  Scenario: Verify the timeline page elements in Schedule
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123" and click Schedule
  When Go to Timeline page in Schedule
  Then Verify the elements in timeline page
