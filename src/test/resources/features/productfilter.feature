Feature: Product Filter

  @FilterTest
  Scenario: User applies product filters
    Given User is logged in on the inventory page
    When User selects filter "Price (low to high)"
    Then Products should be displayed in ascending price order