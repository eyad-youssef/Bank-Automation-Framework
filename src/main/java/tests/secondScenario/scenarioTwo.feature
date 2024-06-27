Feature: second scenario

  Scenario Outline: loan request
    Given User login with "<username>" and "<password>"
    And Click on request loan page link
    When  enter loan "<amount>"
    And  enter down payment"<downPaymentAmount>"
    And select the sender account
    Then click on apply button
    And get  loan request status"<loanRequestExpectedStatus>"
    And get  loan request result "<loanRequestExpectedResult>"
    Examples:
      | username | password | amount | downPaymentAmount | loanRequestExpectedStatus | loanRequestExpectedResult |
      |          |          | 1000   | 7000              |                           |                           |
      |          |          | 7000   | 1000              |                           |                           |
