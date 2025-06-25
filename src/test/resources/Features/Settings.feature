@smoke @Settings
Feature: Settings page functionality

@Settings1 @check
  Scenario: Verify the settings page
  Then Navigate to settings screen
  Then Verify the tabs on the left hand side
  
  @Settings3 @check
  Scenario: Verify the Display tab values
  Given Navigate to settings screen
  When click on Display tab
  Then Verify the fields in Display tab
  
   @Settings4 @check
  Scenario: Verify the Time tab values
  Given Navigate to settings screen
  When click on Time tab
  Then Verify the fields in Time tab
  
   @Settings5
  Scenario: Verify Auto time in settings
  Given Navigate to settings screen
  When click on Time tab
  Then Should show the system time
  
   @Settings6
  Scenario: Verify Temp scale values in settings
  Given Navigate to settings screen
  And Go to Temp scale tab
  Then Verify the values in Temp scale tab
  Then change the values in Temp scale sceen and verify
  
   @Settings7
  Scenario: Verify Network Settings in settings
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  And Go to User Settings tab
  Then Verify the values in Network Settings tab

  @Settings8
  Scenario: Verify the settings page after login
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  Then Verify the tabs on the left hand side afer login
  
  
  @UserSettings1
  Scenario: Verify the user creation in the user settings page.
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add
  Then User verify the User Settings page and its labels.
  When User enter valid details in the User Settings page and Save
  Then User verify the usertable in the usersetting page.
  When User delete the created user
  Then User verify the delete user in the table
  
    @UserSettings2
  Scenario: Verify the user creation in the user settings page.
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add
  When User enter valid details in the User Settings page and Save
  When User edits the created new user
  Then User verify the user details in edit user page.
  When User delete the created user
  Then User verify the delete user in the table

    @UserSettings3
  Scenario: Verify the user creation in the user settings page.
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add
  When User enter valid details in the User Settings page and Save
  Given User go to Landing page and click login
  When User login with newly created user user name and password
  When User edits the created new user
  Then User verify the user details in edit user page.
  Given User go to Landing page and click login
  Given Click login and login with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add
  
     @UserSettings4
  Scenario: Verify the user creation in the user settings page.
  Given Go to Tools and sign in with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add
  When User enter valid details in the User Settings page and Save
  Given User go to Landing page and click login
  When User login with newly created user user name and pin
  When User edits the created new user
  Then User verify the user details in edit user page.
  Given User go to Landing page and click login
  Given Click login and login with "factoryadmin" and "Admin@123"
  Given Navigate to settings screen
  When User click on the User Settings page and click add