
@smoke
Feature: Test login functionality
@Launch01
  Scenario: Check application access
    Given Launching the application   
    Then  the AAON logo and icons (time, temperature, settings, alarm) should be displayed in the header
    And User verifies all header modules Config, Monitoring, Service are displayed
    And User verifies the submodules under the Monitoring module are Dashboard, Space Temp, Economizer, Schedule, are displayed
