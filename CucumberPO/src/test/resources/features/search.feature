Feature: Search on Google

  Scenario: Direct search on Google
    Given launch browser 'chrome'
    When user navigates to 'https://www.google.com'
    Then user enters search item 'India'
    And clicks on search button
    

    