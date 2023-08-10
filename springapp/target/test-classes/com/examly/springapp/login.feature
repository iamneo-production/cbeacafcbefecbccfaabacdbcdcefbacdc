Feature: User Login

  Scenario: Login with valid credentials
    Given the user is on the Home page
    When the user navigates to the Login page
    And the user enters username and password
    Then the successful login message is displayed
