Feature: Login Page for Adactin Site

  Scenario: Login with Valid Credentials
    Given Launch the browser with Adactin URL
    When Enter Username
    And Enter Password
    And Click on Login button
    Then Validate User logged in or not

  Scenario: Login with Invalid Credentials
    Given Launch the browser
    And Pass the Adactin URL
    When Enter Username as "Muthulakshmi"
    And Enter Password as "Test@123"

  Scenario Outline: Login with Scenarior outline
    Given Launch the browser
    And Pass the Adactin URL
    When Enter Username data as "<username>"
    And Enter Password data as "<password>"

    Examples: 
      | username | password   |
      | Dinesh   | dinesh123  |
      | kipson   | kipson123  |
      | Preethi  | preethi123 |
