Feature: Test FreeCRM smoke scenario
 
     Scenario Outline: Test Login credentials
     Given Open chrome and start application
     When I enter valid "<username>" and valid "<password>"
     Then User should be able to login successfully
     
 
     Examples:
     |username              |password   |
     |ushafromwork@gmail.com|Abcd@123456|
     

 