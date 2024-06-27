Feature: Bill Payment

  Scenario Outline: bill pay
    Given User login with "<username>" and "<password>"
    And Click on Bill Pay page link
    When Enter "<name>" and "<address>" and "<city>" and "<state>"
    And Enter "<zipcode>"and "<phoneNumber>" and "<accountNumber>"
    And Verify "<accountNumber>"
    And enter bill "<amount>"
    And Select sender "<account>"
    Then Click on send payment button
    And get payment status "<paymentStatus>"

    Examples:
      | username | password   | name | address    | city       | state | zipcode | phoneNumber   | accountNumber | accountNumber | amount | account | paymentStatus |
      | Tester   | Tester2024 | Jim  | 21 jump st | New Jersey | NY    | 13588   | +966487569123 | 13511         | 13511         | 500    |         |               |











