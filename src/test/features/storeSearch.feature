Feature: Store Locator

  As a user
  I should search and locate the stores nearby

  @store
  Scenario: Validate the store search with valid data

    Given I'm on Home Page "http://www.next.co.uk"
    When I click store locator link
    And I enter postcode "M33 3BT" as searchTerm
    And I click find stores button
    Then I should see map of stores


