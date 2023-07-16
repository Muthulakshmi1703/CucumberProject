Feature: Sample feature file DataTable

  Scenario: Adactin Login by using as List
    Given Open browser and launch adactin URL
    When User enters the username as List
      | Nivedha |
      | Preethi |
    And User enters the password as List
      | nivi123    |
      | preethi123 |
    And Click on login button
    Then Validate user logged successfully.

  Scenario: Adactin Login by using as Lists
    Given Open browser and launch adactin URL
    When User enters the username as Lists
      | Dinesh   | Kipson |
      | Saravana | Suresh |
    And User enters the password as Lists
      | dinesh123   | kipson123 |
      | saravana123 | suresh123 |
    And Click on login button
    Then Validate user logged successfully.

  Scenario: Adactin Login by using as Map
    Given Open browser and launch adactin URL
    When User enters the username as Map
      | Username | Kipson |
    And User enters the password as Map
      | Password | kipson123 |
    And Click on login button
    Then Validate user logged successfully.

  Scenario: Adactin Login by using as Maps
    Given Open browser and launch adactin URL
    When User enters the username password and email as Maps
      | Username  | Password    | Email                 | 
      | Saravanan | saravana123 | saravana123@gmail.com | 
      | Preethi   | preethi123  | preethi123@gmail.com  | 
      | Nivedha   | nivi123     | nivi123@gmail.com     | 
    And Click on login button
    Then Validate user logged successfully.
