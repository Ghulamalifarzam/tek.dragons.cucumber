Feature: Login

Background: Verify Retail Page Logo
	Given User is on retail website home page
	Then User verify retail website title

@register
Scenario Outline: Verify User can create account on tek retail website
		And I click on sign in button
		And I click on create new account button
		And I enter '<name>' and '<email>' and '<password>' and '<confirmPass>'
		And I click on signup button
		And I should see my profile page
		
Examples: 
|name|email|password|confirmPass|
|Queens4|queens1100@gmail.com|Dragons@55|Dragons@55|
|Queens5|queens2200@gmail.com|Dragons@55|Dragons@55|
|Queens6|queens3300@gmail.com|Dragons@55|Dragons@55|


