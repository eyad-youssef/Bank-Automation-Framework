Feature Transfer Funds

  Scenario Outline:transfer funds
    Given User login with "<username>" and "<password>"
    And Click on transfer funds  page link
    When Enter transferred "<amount>"
    And Choose sender "<senderAccount>"and receiver "<receiverAccount>"
    Then  click on apply transfer button
    And get transfer funds status "<transferFundsStatus>"
    And get transfer funds result "<resultExpectedMessage>"
    Examples:
      | username | password | amount | senderAccount | receiverAccount | transferFundsStatus | resultExpectedMessage |
      | username | password | 3000   | 0             | 0               |                     |                       |