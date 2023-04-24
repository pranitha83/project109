@tag
Feature: Home

  @tag1
  Scenario: Launch url and navigate to home page
    Given User launch chrome browser and open portal url"https://dsportalapp.herokuapp.com"
    When User click on Get Started button user navigate to homepage
    When User click on data structure dropdown and select from the list
    Then It shows error message You are not logged in
    
    @tag2
  Scenario: check the modules on home page
    Given User is on home page
    When User click on one of the module
    Then It shows error message You are not logged in
