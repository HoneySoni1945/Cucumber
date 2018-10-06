Feature: Login Test
This Feature talk about the positive and negative Scenarios
#jlbjksbvld
Scenario: Successful login scenario
Given I am able to access magento web page
When I update the username as "natarjan.ramanathnan93@gmail.com"
And I Update then password as "Welcome123"
And I click on login button
Then I should find the magento id as "ID: MAG003417822"

Scenario Outline: UnSuccessful login scenario
Given I am able to access magento web page
When I update the username as "natarjan.ramanathnan93@gmail.com"
And I Update then password as "Welcome"
And I click on login button
Then I should see the error message as "Invalid login or passwoed"
Examples:
|user|pwd|
|honey@gmail.com|Passd|
|honey.123@gmail.com|passd|