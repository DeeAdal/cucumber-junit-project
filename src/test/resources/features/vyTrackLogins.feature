Feature: Login to VyTrack page as different user

@Dee
  Scenario Outline: User will login to homepage
    Given Link to VyTrack page
    When user enters  "<userName>"
    And user enters UserUser123
    And user clicks login btn
    Then user sees page title as Dashboard

    Examples:
      | userName |
      | user160         |
      | user161         |
      | user162         |
      | user163         |
      | user164         |
      | user165         |
      | salesmanager133 |
      | salesmanager134 |
      | salesmanager135 |
      | salesmanager136 |
      | storemanager83  |
      | storemanager84  |
      | storemanager85  |
      | storemanager86  |
