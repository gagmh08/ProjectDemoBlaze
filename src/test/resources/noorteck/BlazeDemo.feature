Feature: Purchase Flight Functionality

  Scenario Outline: Verify the purchase functionality
    Given User navigates to webpage "https://blazedemo.com/purchase.php"
    When User enters name "<name>"
    And User enters address "<address>"
    And User enters city "<city>"
    And User enters state "<state>"
    And User enters zipCode "<zipCode>"
    And User selects cardType "<cardType>"
    And User enters credit card number "<creditcardnumber>"
    And User enters month and year "<month>" "<year>"
    And User enters name on card "<nameoncard>"
    And User clicks remember
    And User click purchase flight button
    Then User verify success message "<message>"

    Examples: 
      | name               | address          | city          | state     | zipCode | cardType         | creditcardnumber    | month | year | nameoncard    | message                            |
      | John Cena          | 123 drive st     | Miami         | Florida   |   33033 | American Express | 5555 5555 5555 5555 |    12 | 2025 | John Cena     | Thank you for your purchase today! |
      | Lionel Messi       | 456 drive st     | Barcelona     | Barcelona |   12345 | American Express | 1111 1111 1111 1111 |    10 | 2025 | Lio Messi     | Thank you for your purchase today! |
      | Cristiano Ronaldo  | 789 drive st     | Sporting      | Lisboa    |   64789 | Visa             | 4444 4444 4444 4444 |    03 | 2026 | SIUUU Ronaldo | Thank you for your purchase today! |
      | Julio De Leon      | DerechaIzquierda | Puerto Cortes | Cortes    |   22212 | Visa             | 3333 3333 3333 3335 |    04 | 2024 | El Rambo      | Thank you for your purchase today! |
      | Patricio Calamardo | Fondo De Bikini  | Miami         | Florida   |   33031 | American Express | 5555 5555 5555 6666 |    11 | 2023 | Calamardo     | Thank you for your purchase today! |
