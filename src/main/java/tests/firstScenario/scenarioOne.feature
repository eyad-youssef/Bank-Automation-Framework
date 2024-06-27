Feature:  first test case

  Scenario Outline: Get Accounts Overview Before
    Given User login with "<username>" and "<password>"
    When Click on accounts overview page link
    And get total "<totalAmount>"
    And get accounts count"<count>"
    Examples:
      | username | password | totalAmount | count |
      |          |          | 3,500,000   | 2     |


  Scenario Outline: open new account
    Given User login with "<username>" and "<password>"
    And Click on open new account page link
    When choose new account type "<type>"
    And enter new account
    Then click on create new account button
    Examples:
      | username | password   | type    |
      | Tester   | Tester2024 | SAVINGS |
      | Tester   | Tester2024 | SAVINGS |
      | Tester   | Tester2024 | SAVINGS |


  Scenario Outline: Get Accounts Overview After
    Given User login with "<username>" and "<password>"
    When Click on accounts overview page link
    And get total "<totalAmount>"
    And get accounts count"<count>"
    Examples:
      | username | password | totalAmount | count |
      |          |          | 3,500,000   | 5     |


  Scenario Outline:transfer funds
    Given User login with "<username>" and "<password>"
    And Click on transfer funds  page link
    When Enter transferred "<amount>"
    And Choose sender "<senderAccount>"and receiver "<receiverAccount>"
    Then  click on apply transfer button
    And get transfer funds status "<transferFundsStatus>"
    And get transfer funds result "<transferFundsResult>"
    Examples:
      | username | password   | amount | senderAccount | receiverAccount | transferFundsStatus | transferFundsResult |
      | Tester   | Tester2024 | 3000   | 0             | 0               |                     |                     |
      | Tester   | Tester2024 | 3700000 | 0             | 1               |                     |                     |

