  @MqttUnitsettings
Feature: MQTT Unit settings publishing

  Scenario: Test each Unit settings payload selection via MQTT
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  Then the user navigates to "App Type" 📊
      
    When user loads data from Excel sheet "Unit Settings" row 5, publishes the MQTT message, and verifies the radio button name in row 5   
    When user loads data from Excel sheet "Unit Settings" row 2, publishes the MQTT message, and verifies the radio button name in row 2
    When user loads data from Excel sheet "Unit Settings" row 3, publishes the MQTT message, and verifies the radio button name in row 3
    
    Then User clicks next page button of the selected option >  
    When user has to click the "Occupied Cooling SP" Lable     
    When User publishes random payload from Excel sheet "Unit Settings" row 11 and verifies UI Label   
    When user has to click the "Occupied Heating SP" Lable  
    When User publishes random payload from Excel sheet "Unit Settings" row 12 and verifies UI Label
    When user has to click the "Cooling Limit Offset" Lable    
    When User publishes random payload from Excel sheet "Unit Settings" row 13 and verifies UI Label 
    When user has to click the "Heating Limit Offset" Lable  
    When User publishes random payload from Excel sheet "Unit Settings" row 14 and verifies UI Label
        Then User clicks back button
    When user loads data from Excel sheet "Unit Settings" row 4, publishes the MQTT message, and verifies the radio button name in row 4        
        Then User clicks next page button of the selected option >  
    When user loads data from Excel sheet "Unit Settings" row 17, publishes the MQTT message, and verifies the radio button name in row 17
        Then User clicks next page button of the selected option >  
        When user has to click the "Unoccupied Cooling SP" Lable             
        When User publishes random payload from Excel sheet "Unit Settings" row 20 and verifies UI Label
        
        When user has to click the "Unoccupied Heating SP" Lable                
        When User publishes random payload from Excel sheet "Unit Settings" row 21 and verifies UI Label
        
        #When user has to click the "Low Tolerance" Lable                
        #When User publishes random payload from Excel sheet "Unit Settings" row 23 and verifies UI Label       
                      #
        #When user has to click the "High Tolerance" Lable                
        #When User publishes random payload from Excel sheet "Unit Settings" row 23 and verifies UI Label                      
        #
        When user has to click the "Occ Space Temp SP" Lable                
        When User publishes random payload from Excel sheet "Unit Settings" row 19 and verifies UI Label           
        Then User clicks back button
    When user loads data from Excel sheet "Unit Settings" row 18, publishes the MQTT message, and verifies the radio button name in row 18
            Then User clicks next page button of the selected option >  
            When user has to click the "Occupied Winter SP" Lable             
            When User publishes random payload from Excel sheet "Unit Settings" row 25 and verifies UI Label
    
            When user has to click the "Occupied Summer SP" Lable             
            When User publishes random payload from Excel sheet "Unit Settings" row 24 and verifies UI Label
           
            When user has to click the "Unocc Heat Winter SP" Lable             
            When User publishes random payload from Excel sheet "Unit Settings" row 26 and verifies UI Label
           
            #When user has to click the "Unocc Heat Summer SP" Lable             
            #When User publishes random payload from Excel sheet "Unit Settings" row 28 and verifies UI Label
           
            When user has to click the "Unocc Cool Winter SP" Lable             
            When User publishes random payload from Excel sheet "Unit Settings" row 27 and verifies UI Label
           
            When user has to click the "Unocc Cool Summer SP" Lable             
            When User publishes random payload from Excel sheet "Unit Settings" row 29 and verifies UI Label        
            Then User clicks back button
            Then User clicks back button
           
           
           
           
  
  
