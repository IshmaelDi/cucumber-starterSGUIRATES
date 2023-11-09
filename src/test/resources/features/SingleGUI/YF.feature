Feature: Individual cover for All AGes
  Scenario Outline: Cover amount for All Ages
    Given user log in SGUI or shamba  website '<username>', '<password>'
    Then Individual COver
    Then DOB
    Then Cover Amount
    Then Conclude sale
    Examples:
      | username | password |
    |Spadayachy@clientel.coza |Marvel_2023|