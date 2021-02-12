Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "sagarvhanamane093@gmail.com" and "Viraj@3019"
#Then user clicks on login button
#Then user is on home page


#with Example keyword
Scenario Outline: Free CRM Login Test Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
     | username                    | password   |
     | sagarvhanamane093@gmail.com | Viraj@3019 |
     | naveenk                     | test@123   |
