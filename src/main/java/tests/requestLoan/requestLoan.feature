Feature: Request Loan

  Scenario Outline: loan request
    Given User login with "<username>" and "<password>"
    And Click on request loan page link
    When  enter loan "<amount>"
    And  enter down payment"<downPaymentAmount>"
    And select the sender account
    Then click on apply button
    And get  loan request status"<loanRequestStatus>"
    And get  loan request result "<loanRequestResult>"
    Examples:
      | username | password | amount | downPaymentAmount | loanRequestStatus | loanRequestResult |
      |          |          | 1000   | 7000              |                   |                   |