@Login
Feature: Login Feature   
    @validLogin
  Scenario: Logging into SauceDemo Application
    Given navigate to sauce demo login page
    When passing valid credentials
    Then products page is displayed
    
  @invalidLogin
  Scenario Outline: Verifying invalid login options
    Given navigate to sauce demo login page
    When passing invalid credentials "<username>" and "<password>"
    Then verify error message is displayed "<message>"
	Examples:
		|username					|password					|message													 	|
		|									|									|Epic sadface: Username is required	|
		|standard_user		|									|Epic sadface: Password is required	|
		|									|secret_sauce			|Epic sadface: Username is required	|