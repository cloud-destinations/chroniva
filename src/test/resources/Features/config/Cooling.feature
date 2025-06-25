  @cooling @smoke
Feature: Cooling page in Config
  
  @cooling1
  Scenario: Verify the fields in Compressor, Reheat Valve and Solenoid after configuring the cooling board
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Cooling Board" next page button
	When Configure the Cooling Board
	Then Go back to Unit configuration page
  When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  Then Verify the fields in Compressors page
	Then Verify the fields in Reheat Valve page
	Then Verify the fields in Solenoid page
  
  @cooling2
  Scenario: Verify the fields in Condenser Fan Selection page after configuring the Air Handler board
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Cooling Board" next page button
	When Configure the Cooling Board with one board
	Then Go back to Unit configuration page
  When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  When User go to "Condenser Fan" page
  Then Alert should display with "Please configure at board level"
	Then Go back to Unit configuration page
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Air Handler Board" next page button
	When Configure the Air Handler Board
	Then Go back to Unit configuration page
	When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  Then Verify the fields in Condenser Fan Selection page
  
  @cooling3
  Scenario: Verify the fields in Inside EXV and Outside EXV after configuring Power-Comm Board board
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Cooling Board" next page button
	When Configure the Cooling Board with one board
	Then Go back to Unit configuration page
  When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  When User go to "Inside EXV" page
  Then Alert should display with "Please configure at board level"
	Then Go back to Unit configuration page
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Power-Comm Board" next page button
	When Configure the Power-Comm Board
	Then Go back to Unit configuration page
	When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  Then Verify the fields in Inside EXV page
  Then Verify the fields in Outside EXV page
  
    @cooling4
  Scenario: Verify the fields in Reversing Valve and Defrost after configuring the Air Handler board
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
  When User go to "Unit Settings" page
  When User go to "Boards" page
  When User clicks "Cooling Board" next page button
	When Configure the Cooling Board with one board
  When User clicks "Air Handler Board" next page button
	When Configure the Air Handler Board
	Then Go back to Unit configuration page
	When User go to "Cooling" page
  When User go to "Circuits" page
  When User go to "Circuit A" page
  Then Verify the fields in Reversing Valve page
  Then Verify the fields in Defrost page
  
    @cooling5
  Scenario: Verify the fields in Cooling Setpoints page
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User clicks Factory Reset button
	When User go to "Cooling" page
  When User go to "Setpoints" page
  Then Verify the fields in Cooling Setpoints page
  