Feature: Bill Payment

  Scenario Outline: bill pay
    Given User login with "<username>" and "<password>"
    And Click on Bill Pay page link
    When Enter "<name>" and "<address>" and "<city>" and "<state>"
    And Enter "<zipcode>"and "<phonenumber>" and "<accountnumber>"
    And Verify "<accountnumber>"
    And enter bill "<amount>"
    And Select sender "<account>"
    Then Click on send payment button
    And get payment status
    And get payment result

    Examples:
    username|password|name|address|city|state|zipcode|phonenumber|accountnumber|accountnumber|amount|account
      |  |  |  |  |  |  |  |  |  |  |