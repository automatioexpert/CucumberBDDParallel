Feature: Search on Google

  Scenario Outline: Direct search on Google
    Given launch browser '<browserName>'
    When user navigates to '<url>'
    Then user enters search item '<searchKey>'
    And clicks on search button

    Examples: 
      | browserName | url                    | searchKey |
      | chrome      | https://www.google.com | india     |
      | edge        | https://www.google.com | india     |
