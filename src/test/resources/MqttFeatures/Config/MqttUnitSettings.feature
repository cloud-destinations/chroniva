  @MqttUnitsettings
Feature: MQTT Unit settings publishing

Background:
  Given User go to Tools and sign in with "factoryadmin" and "Admin@123" and click Config
  When User go to Unit settings page in Config
  Then the user navigates to "App Type" 📊
     
@MqttUnitsettings1 
  Scenario: Verify Space Control selection in Unit Settings via MQTT payload   
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
           
            #When user has to click the "Unocc Cool Summer SP" Lable             
            #When User publishes random payload from Excel sheet "Unit Settings" row 29 and verifies UI Label        
            
            Then User navigates to the next label page 📄>
            #When user has to click the "High Tolerance" Lable             
            #When User publishes random payload from Excel sheet "Unit Settings" row 30 and verifies UI Label
            #
            #When user has to click the "Low Tolerance" Lable             
            #When User publishes random payload from Excel sheet "Unit Settings" row 31 and verifies UI Label
                        
             When user has to click the "Winter OA Enable SP" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 33 and verifies UI Label
                        
             When user has to click the "Summer OA Enable SP" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 32 and verifies UI Label
            
             When user has to click the "Szn Changeover Time" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 34 and verifies UI Label
                        
             When user has to click the "Szn Changeover Duration" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 35 and verifies UI Label                      
             Then User clicks back button
             Then User clicks back button
             
@MqttUnitsettings2 
  Scenario:  Verify VAV Control selection in Unit Settings via MQTT payload
    When user loads data from Excel sheet "Unit Settings" row 5, publishes the MQTT message, and verifies the radio button name in row 5   
            Then User clicks next page button of the selected option >  
            Then the user navigates to "Config" 📊
   When user loads data from Excel sheet "Unit Settings" row 36, publishes the MQTT message, and verifies the radio button name in row 36   
            Then User clicks next page button of the selected option >  
    
             When user has to click the "Return Air Temp" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 39 and verifies UI Label
             
             When user has to click the "Time Period" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 40 and verifies UI Label
             
             When user has to click the "Supply Air Heating" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 41 and verifies UI Label
             Then User clicks back button        
   When user loads data from Excel sheet "Unit Settings" row 37, publishes the MQTT message, and verifies the radio button name in row 37   
            Then User clicks next page button of the selected option >  
    
             When user has to click the "Return Air Temp" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 42 and verifies UI Label
             
             When user has to click the "Time Period" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 43 and verifies UI Label
             
             When user has to click the "Supply Air Heating" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 44 and verifies UI Label
             Then User clicks back button
   When user loads data from Excel sheet "Unit Settings" row 38, publishes the MQTT message, and verifies the radio button name in row 38   
           Then User clicks next page button of the selected option >  
    
             When user has to click the "Cool OAT Enable SP" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 45 and verifies UI Label
             
             When user has to click the "Heat OAT Enable SP" Lable             
             When User publishes random payload from Excel sheet "Unit Settings" row 46 and verifies UI Label
  
  
