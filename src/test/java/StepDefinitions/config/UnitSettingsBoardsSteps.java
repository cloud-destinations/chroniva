package StepDefinitions.config;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.config.UnitSettingsBoardsPage;
import utils.TestData;

public class UnitSettingsBoardsSteps {
	UnitSettingsBoardsPage Boards = new UnitSettingsBoardsPage();

	@Then("User selects navigation path and goes to {string} title")
	public void user_selects_navigation_path_and_goes_to_title(String Topic) {
		Boards.selectNavigationPath(Topic);
	}

	@When("User navigates to the Boards page in Unit Settings")
	public void user_navigates_to_the_boards_page_in_unit_settings() {
		Boards.clickBoards();
	}

	@Then("Verify the fields on the Boards page")
	public void verify_the_fields_on_the_boards_page() {
		assertEquals(Boards.getPageTitle(), "Boards", "Boards lable not matched");
		Boards.verifyPageFieldLables(TestData.EXPECTED_Boards_VALUES);
	}

	@When("User selects the Unit Manager checkbox")
	public void user_selects_the_unit_manager_checkbox() {
		Boards.clickUnitManagerButton();
		Boards.clickSubmenu();
	}

	@Then("User clicks {string} and verifies the Network settings")
	public void user_clicks_and_verifies_the_network_settings(String Network) {
		Boards.selectLabels(Network);
		Boards.clickManual();
		Boards.clickIPv4();
		Boards.numbercontainer.sendKeys(TestData.Boards_ipv4);
		Boards.clickDone();

		Boards.clickGatewayAddress();
		Boards.numbercontainer.sendKeys(TestData.Boards_gatewayAddress);
		Boards.clickDone();

		Boards.clickNetmask();
		Boards.numbercontainer.sendKeys(TestData.Boards_netmask);
		Boards.clickDone();

		Boards.clickDNS();
		Boards.clickAdd();
		Boards.numbercontainer.sendKeys(TestData.Boards_DNS_Server_Address);
		Boards.clickDone();
		Boards.clickSaveButton();
		Boards.clickBackButton();
		// Boards.clickBackButton();
	}

	@Then("User selects {string} navigates to {string} and verifies {string}, {string}, and {string} labels")
	public void user_selects_navigates_to_and_verifies_and_labels(String BACnet, String MSTP, String BaudRate,
			String MAC, String ID) {
		// Boards.clickBackButton();
		Boards.selectLabels(BACnet);
		Boards.selectRadioButton(MSTP);
		Boards.clickSubmenu();
		Boards.selectLabels(BaudRate);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Baud_Rate);
		Boards.clickBackButton();
		Boards.selectLabels(MAC);
		Boards.validateOneTiles(TestData.EXPECTED_MAC_Address, 50, 95);
		Boards.selectLabels(ID);
		Boards.validateOneTiles(TestData.EXPECTED_Device_ID, 50, 95);
		Boards.clickBackButton();
	}

	@Then("User selects {string} and verifies the {string} and {string} labels")
	public void user_selects_and_verifies_the_and_labels(String IP, String BBMD, String ID) {
		Boards.selectRadioButton(IP);
		Boards.clickSubmenu();

		Boards.selectLabels(BBMD);
		Boards.ClickDisabled();

		Boards.clickEnabled();
		Boards.clickSubmenu();
		Boards.clickBBMD();
		Boards.numbercontainer.sendKeys(TestData.Boards_BBMD_IPv4_Address);
		Boards.clickDone();

		Boards.clickNetworkPort();
		Boards.numbercontainer.sendKeys(TestData.Boards_Network_Port);
		Boards.clickDone();
		Boards.clickBackButton();
		Boards.clickBackButton();

		Boards.selectLabels(ID);
		Boards.validateOneTiles(TestData.EXPECTED_Device_ID, 95, 95);
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@When("User selects the Power-Comm Board checkbox")
	public void user_selects_the_power_comm_board_checkbox() {
		Boards.clickPowerCommBoardButton();
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Power_Comm_Board_Count);
	}

	@Then("Verify {string} and select {string}")
	public void verify_and_select(String BoardTitle, String NumBoard) {
		assertEquals(Boards.getPageTitle(), BoardTitle, "Title not matched");
		Boards.selectRadioButton(NumBoard);
		Boards.clickSubmenu();
	}

	@Then("User verifies {string} and selects the {string} label")
	public void user_verifies_and_selects_the_label(String PowerCB, String BoardNum) {
		assertEquals(Boards.getPageTitle(), PowerCB, "Title not matched");
		Boards.selectLabels(BoardNum);
	}

	@Then("User selects the {string} label and Verify the {string} {string} {string} radio button")
	public void user_selects_the_label_and_verify_the_radio_button(String Label1, String Button1, String Button2,
			String Button3) {
		Boards.selectLabels(Label1);
		Boards.selectRadioButton(Button1);
		Boards.selectRadioButton(Button2);
		Boards.selectRadioButton(Button3);
		Boards.clickBackButton();
	}

	@Then("User selects the {string} label and Verify the {string} {string} radio button")
	public void user_selects_the_label_and_verify_the_radio_button(String Label2, String Button1, String Button2) {
		Boards.selectLabels(Label2);
		Boards.selectRadioButton(Button1);
		Boards.selectRadioButton(Button2);
		Boards.clickBackButton();
	}

	@Then("User selects the {string} label verifies the {string} and {string} radio buttons and navigates to {string}")
	public void user_selects_the_label_verifies_the_and_radio_buttons_and_navigates_to(String Comm1,
			String RadioButton1, String RadioButton2, String CommNum) {
		Boards.selectLabels(Comm1);
		Boards.selectRadioButton(RadioButton1);
		Boards.selectRadioButton(RadioButton2);
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Comm_1_Enabled);
	}

	@Then("User selects the {string} radio button and verifies the {string} {string}")
	public void user_selects_the_radio_button_and_verifies_the(String RadioButton2, String Labels1, String Labels2) {
		Boards.selectRadioButton(RadioButton2);
		Boards.clickSubmenu();
		Boards.selectLabels(Labels1);
		Boards.verifyPageFieldLables(TestData.EXPECTED_EXV1);
		Boards.clickBackButton();
		Boards.clickConfirmPopupElement();
		Boards.selectLabels(Labels2);
		assertEquals(Boards.getPageTitle(), "EXV 2", "EXV 2 Title not matched");
		Boards.verifyPageFieldLables(TestData.EXPECTED_EXV2);
	}

	@Then("User goes to EXV2 and verifies the {string} and {string} radio buttons under the {string} and {string}")
	public void user_goes_to_exv2_and_verifies_the_and_radio_buttons_under_the_and(String Pressure, String Temperature,
			String RadioButton2, String RadioButton3) {
		Boards.selectRadioButton(RadioButton2);
		Boards.clickSubmenu();
		Boards.selectRadioButton(Pressure);
		// Boards.selectRadioButton(Temperature);
		Boards.clickBackButton();
		Boards.selectRadioButton(RadioButton3);
		Boards.clickSubmenu();
		Boards.selectRadioButton(Pressure);
		Boards.clickBackButton();
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User selects the {string} radio button and verifies the {string} and {string}")
	public void user_selects_the_radio_button_and_verifies_the_and(String RadioButton3, String RadioButton1,
			String RadioButton2) {
		Boards.selectRadioButton(RadioButton3);
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Disabled_Enabled);
		Boards.selectRadioButton(RadioButton1);
		Boards.selectRadioButton(RadioButton2);
		Boards.clickSubmenu();
	}

	@When("User verifies {string} and back to label Page")
	public void user_verifies_and_back_to_label_page(String RadioButton4) {
		Boards.selectRadioButton(RadioButton4);
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@When("User selects the Air Handler Board checkbox")
	public void user_selects_the_air_handler_board_checkbox() {
		Boards.clickAirHandlerBoard();
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Air_Handler_Board);
	}

	@Then("User navigates to the {string} section under {string} label and verifies the {string} {string} {string}")
	public void user_navigates_to_the_section_under_label_and_verifies_the(String Port, String A2LPorts, String NotUsed,
			String Cabinet, String Airstream) {
		Boards.selectLabels(A2LPorts);
		Boards.selectLabels(Port);
		Boards.selectRadioButton(NotUsed);
		Boards.selectRadioButton(Cabinet);
		Boards.selectRadioButton(Airstream);
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User navigates to {string} and selects {string} label to verify the radio buttons")
	public void user_navigates_to_and_selects_label_to_verify_the_radio_buttons(String VFDPorts, String Port) {
		Boards.selectLabels(VFDPorts);
		Boards.selectLabels(Port);
		Boards.verifyPageFieldLables(TestData.EXPECTED_VFD_Port_Num);
	}

	@Then("User navigates {string} and selects the {string} label")
	public void user_navigates_and_selects_the_label(String Fans, String Type) {
		Boards.clickNotUsed();
		Boards.selectRadioButton(Fans);
		Boards.clickSubmenu();
		Boards.selectLabels(Type);
	}

	@Then("User verifies Fan Type and navigates to {string} under {string}")
	public void user_verifies_fan_type_and_navigates_to_under(String MotorType, String RB) {
		Boards.clickNone();
		Boards.selectRadioButton(RB);
		Boards.clickSubmenu();
		Boards.selectLabels(MotorType);
	}

	@Then("User selects {string} and verifies the rating labels")
	public void user_selects_and_verifies_the_rating_labels(String MotorTypeRB) {
		Boards.selectRadioButton(MotorTypeRB);
		Boards.clickSubmenu();
		Boards.EnterTemperatureForAllTiles();
		Boards.clickBackButton();
	}

	@Then("User selects the {string} label and verifies the radio buttons")
	public void user_selects_the_label_and_verifies_the_radio_buttons(String Voltage) {
		Boards.clickBackButton();
		Boards.selectLabels(Voltage);
		Boards.clickNone();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Voltage);
		Boards.clickBackButton();
	}

	@Then("User selects the {string} label and Verify the {string} {string} radio buttons")
	public void user_selects_the_label_and_verify_the_radio_buttons(String LeadLag, String Default, String Lag) {
		Boards.selectLabels(LeadLag);
		Boards.selectRadioButton(Default);
		Boards.selectRadioButton(Lag);
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User selects {string} and verifies the Min and Max Voltage labels")
	public void user_selects_and_verifies_the_min_and_max_voltage_labels(String NumV3) {
		Boards.selectRadioButton(NumV3);
		Boards.clickSubmenu();
		Boards.validateForTwoTiles(TestData.EXPECTED_Supply_0_10V, 95, 8);
		Boards.clickBackButton();
		// Boards.clickConfirmPopupElement();
		Boards.clickBackButton();
	}

	@Then("User selects the {string} label and verifies the Damper Port")
	public void user_selects_the_label_and_verifies_the_damper_port(String DamperPort) {
		Boards.selectLabels(DamperPort);
		assertEquals(Boards.getPageTitle(), "Damper Port", "Damper Port Title not matched");
		Boards.verifyPageFieldLables(TestData.EXPECTED_Damper_Port);
	}

	@Then("User selects the {string} and Verify the {string} {string} radio button")
	public void user_selects_the_and_verify_the_radio_button(String ReturnAir, String Disabled, String Enabled) {
		Boards.selectRadioButton(ReturnAir);
		Boards.clickSubmenu();
		Boards.selectRadioButton(Disabled);
		Boards.selectRadioButton(Enabled);
		Boards.clickBackButton();
	}

	@Then("User selects the {string} under {string} Verify {string} {string} radio button")
	public void user_selects_the_under_verify_radio_button(String label2, String label1, String Disabled,
			String Enabled) {
		Boards.clickBackButton();
		Boards.selectLabels(label1);
		Boards.selectLabels(label2);
		Boards.selectRadioButton(Disabled);
		Boards.selectRadioButton(Enabled);
		Boards.clickBackButton();
	}

	@Then("User selects {string} and verifies the radio buttons")
	public void user_selects_and_verifies_the_radio_buttons(String Thermistor) {
		Boards.selectLabels(Thermistor);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Thermistor_Num);
		Boards.clickBackButton();
	}

	@Then("User selects {string} under {string} and verifies the analog output")
	public void user_selects_under_and_verifies_the_analog_output(String AONum, String AnalogOutputs) {
		Boards.clickBackButton();
		Boards.selectLabels(AnalogOutputs);
		Boards.selectLabels(AONum);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Analog_Output_Num);
	}

	@Then("User selects {string} and verifies {string}")
	public void user_selects_and_verifies(String label7, String labelNum) {
		Boards.selectLabels(label7);
		assertEquals(Boards.getPageTitle(), "Binary Inputs", "Binary Inputs lable not matched");
		Boards.selectLabels(labelNum);
		Boards.clickNotUsed();
		Boards.clickBACnetPassthrough();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Binary_Input_Num);
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User selects {string} and verifies {string} label")
	public void user_selects_and_verifies_label(String label8, String labelNum) {
		Boards.selectLabels(label8);
		assertEquals(Boards.getPageTitle(), "Mouts", "Mouts lable not matched");
		Boards.selectLabels(labelNum);
		Boards.clickNotUsed();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Mout_Num);
		Boards.clickNextPage();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Mout_NextPage);
		Boards.clickPreviousPage();
	}

	@Then("User selects {string} and verifies {string} radio buttons")
	public void user_selects_and_verifies_radio_buttons(String FanEnable, String RB) {
		Boards.selectRadioButton(FanEnable);
		Boards.clickSubmenu();
		Boards.selectRadioButton(RB);
		Boards.clickBackButton();
	}

	@When("User selects the Cooling Board checkbox")
	public void user_selects_the_cooling_board_checkbox() {
		Boards.clickCoolingBoard();
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Cooling_Board);
	}

	@Then("User selects the {string} and verifies {string} under {string}")
	public void user_selects_the_and_verifies_under(String Refrigeration, String CompressorType,
			String SingleCompressor) {
		Boards.selectLabels(Refrigeration);
		Boards.selectRadioButton(SingleCompressor);
		Boards.clickSubmenu();
		assertEquals(Boards.getPageTitle(), CompressorType, "Compressor lable not matched");
		Boards.verifyPageFieldLables(TestData.EXPECTED_Compressor_1_Type);
	}

	@Then("User selects {string} and verifies {string} under {string}")
	public void user_selects_and_verifies_under(String Digital, String CompressorModel, String Copeland) {
		Boards.selectRadioButton(Digital);
		Boards.clickSubmenu();
		Boards.selectRadioButton(Copeland);
		Boards.clickSubmenu();
		assertEquals(Boards.getPageTitle(), CompressorModel, "Compressor lable not matched");
	}

	@Then("User selects {string} and verifies {string} and {string}")
	public void user_selects_and_verifies_and(String YAW0471E, String Tonnage, String Voltage) {
		Boards.selectRadioButton(YAW0471E);
		Boards.clickSubmenu();
		assertEquals(Boards.getPageTitle(), "Compressor *model*", "Compressor *model* Title not matched");
		Boards.selectLabels(Tonnage);
		Boards.validateOneTiles(TestData.EXPECTED_Tonnage, 95, 95);
		// Boards.clickConfirmPopupElement();
		Boards.selectLabels(Voltage);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Voltage_VAC);
		Boards.clickBackButton();
		Boards.clickConfirmPopupElement();
		Boards.clickBackButton();
	}

	@Then("User selects {string} and verifies the {string}")
	public void user_selects_and_verifies_the(String NumV, String Voltages) {
		Boards.clickBackButton();
		Boards.clickNumV();
		Boards.clickCheckboxSubmenu();
		assertEquals(Boards.getPageTitle(), Voltages, "Voltages Title not matched");
		assertEquals(Boards.getTemperatureLableText(), "Min Voltage", "Min Voltage lable not matched");
		Boards.validateForTwoTiles(TestData.EXPECTED_Supply_0_10V, 95, 65);
		Boards.clickBackButton();
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User clicks {string} and select {string}")
	public void user_clicks_and_select(String Tandem, String Compressor) {
		Boards.selectRadioButton(Tandem);
		Boards.clickSubmenu();
		Boards.selectLabels(Compressor);
	}

	@Then("User clicks {string} and select {string} radio buttons")
	public void user_clicks_and_select_radio_buttons(String Tandem, String Compressor2) {
		Boards.clickBackButton();
		Boards.selectRadioButton(Tandem);
		Boards.clickSubmenu();
		Boards.selectLabels(Compressor2);
	}

	@Then("User selects {string} label and verifies the {string} and {string}")
	public void user_selects_label_and_verifies_the_and(String Mouts, String Mouts5, String Mouts6) {
		Boards.selectLabels(Mouts);
		Boards.selectLabels(Mouts5);
		Boards.clickNotUsed();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Mout);
		Boards.clickBackButton();
		Boards.selectLabels(Mouts6);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Mout);
		Boards.clickNotUsed();
		Boards.clickBackButton();
		Boards.clickBackButton();
	}

	@Then("User selects {string} label and verifies the {string}")
	public void user_selects_label_and_verifies_the(String Reheat, String ReheatEnable) {
		Boards.selectLabels(Reheat);
		assertEquals(Boards.getPageTitle(), "Reheat Enable", "Reheat Enable Title not matched");
		Boards.clickEnable();
		Boards.clickSubmenu();
		Boards.verifyPageFieldLables(TestData.EXPECTED_Reheat_Valve_Step_Configuration);
	}

	@When("User selects the Heating Board checkbox")
	public void user_selects_the_heating_board_checkbox() {
		Boards.clickHeatingBoard();
		Boards.clickSubmenu();
	}

	@Then("User selects the {string} under {string} Verify {string} {string} {string} {string} radio button")
	public void user_selects_the_under_verify_radio_button(String Mout, String Mouts, String SRC, String Heat,
			String Low, String BACnet) {
		Boards.selectLabels(Mouts);
		Boards.selectLabels(Mout);
		Boards.selectRadioButton(SRC);
		Boards.selectRadioButton(Heat);
		Boards.selectRadioButton(Low);
		Boards.selectRadioButton(BACnet);
		Boards.clickBackButton();
	}

	@Then("User back to {string} selects {string} and navigates to {string}")
	public void user_back_to_selects_and_navigates_to(String path, String boards, String board) {
		Boards.selectNavigationPath(path);
		Boards.selectRadioButton(boards);
		Boards.clickSubmenu();
		Boards.selectLabels(board);
	}

	@When("User selects the {string} checkbox")
	public void user_selects_the_checkbox(String Board) {
		Boards.selectRadioButton(Board);
		Boards.clickSubmenu();
	}

	@Then("User selects {string} under {string} in {string} and verifies {string} and {string} radio buttons")
	public void user_selects_under_in_and_verifies_and_radio_buttons(String Pass, String Bypass, String Damp,
			String Disabled, String Enabled) {
		Boards.clickBackButton();
		Boards.selectLabels(Damp);
		Boards.selectLabels(Bypass);
		Boards.selectRadioButton(Pass);
		Boards.clickSubmenu();
		Boards.selectRadioButton(Disabled);
		Boards.selectRadioButton(Enabled);
		Boards.clickBackButton();
		Boards.clickExhaustBypass();
		Boards.clickSupplyExhaust();
		Boards.clickBackButton();
	}

	@Then("User selects {string} navigates to {string} selects {string} navigates to {string} and selects {string}")
	public void user_selects_navigates_to_selects_navigates_to_and_selects(String VFD, String Enabled, String Type,
			String Communicating, String MotorType) {
		// Boards.clickBackButton();
		Boards.selectLabels(VFD);
		Boards.ClickDisabled();
		Boards.selectRadioButton(Enabled);
		Boards.clickSubmenu();
		Boards.selectLabels(Type);
		Boards.clickNone();
		Boards.selectRadioButton(Communicating);
		Boards.clickSubmenu();
		Boards.selectLabels(MotorType);
	}

	@Then("User selects the {string} under {string} and Verify the radio buttons")
	public void user_selects_the_under_and_verify_the_radio_buttons(String DamperNum, String Dampers) {
		Boards.selectLabels(Dampers);
		Boards.selectLabels(DamperNum);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Damper_Type);
	}

	@Then("User selects the {string} under {string} and Verify radio button")
	public void user_selects_the_under_and_verify_radio_button(String BinaryNum, String Binary) {
		Boards.clickBackButton();
		Boards.clickBackButton();
		Boards.selectLabels(Binary);
		Boards.selectLabels(BinaryNum);
		Boards.verifyPageFieldLables(TestData.EXPECTED_Binary_Input);
		Boards.clickBackButton();
	}

}