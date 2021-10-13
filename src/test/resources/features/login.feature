@login
Feature: As a zero app security user I want to verify the functionality of the website so that
  it behaves as expected.

  @validLogin
  Scenario: As a user I want to login to the zero app security website
    Given I select sign-in from the homepage
    When I enter valid user credentials
    Then I will be on the accounts page

  @InvalidLogin
  Scenario Outline: As a user I want to enter invalid credentials so that I can see the login error
    Given I go directly to the login page
    When I enter the username "<Username>" and password "<Password>"
    Then the login error message will show

    Examples:
      | Username      | Password      |
      | wrongusername | password      |
      | username      | wrongpassword |
      |               |               |
      | username      |               |
      |               | password      |