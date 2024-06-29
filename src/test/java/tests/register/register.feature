Feature:  Register new user

  Scenario Outline: register
    Given User login with "<username>" and "<password>"
    And click on register button
    When enter his firstname "<firstName>" and lastname "<lastName>"
    And enter his address "<address>" and city "<city>" and state "<state>"
    And enter his zipcode "<zipCode>" and phone number "<phoneNumber>" and SSN "<SSN>"
    And enter his new username "<newUserName>" and password "<newPassword>"
    Then click on register button

    Examples:
      | username | password | firstName | lastName | address    | city | state | zipCode | phoneNumber | SSN            | newUserName | newPassword |
      | username | password | Jim       | Jim      | 21 Jump ST | NY   | NYw   | 55899   | +7888967452 | 25510075635887 | Tester      | Tester2024  |