Feature: Free CRM Create Contacts 

Scenario Outline: Free CRM Create New Contacts Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user move to new contact
Then user on contact details "<firstname>" and "<lastname>"
Then close the browser

Examples:
       | username                    | password    | firstname | lastname |
       | sagarvhanamane093@gmail.com | Viraj@3019  |sagar      | patil    |