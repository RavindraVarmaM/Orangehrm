Feature:Orange HRM


Scenario: User successfully access 
Given User is logins to OrangeHRM application
When User clicks on login
Then User viewas homepage
  
  Scenario: pim functionalities
  Given User is logins to OrangeHRM application
  When User click on pim module
  Then user view report option
  
  Scenario: User should able to operate admin module
  Given User is logins to OrangeHRM application
  When user opens admin option
  Then user able to use userrole
  
  Scenario: ESS supervisor should able view his subordinates details
  Given User is logins to OrangeHRM application
  When  ESS supervior clicks ess
  Then USer view on ESS details
