Feature: Free CRM Create Deals 

Scenario: Free CRM Create New Deals Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| sagarvhanamane093@gmail.com | Viraj@3019 |
Then user clicks on login button
Then user is on home page
Then click on deals link
Then user enters new deals details
| test deals | 1000 |
Then close the browser