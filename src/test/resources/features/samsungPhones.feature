@regression
Feature: List Samsung phones with specific specifications

  @author_NP @sanity @smoke @regression
  Scenario: List all Samsung phones with 20 MP and above camera, model year 2023, and price range between £50-£100
    Given I am on the Amazon home page
    When I navigate to Electronics & Computers
    And I go to Phones & Accessories
    And I go to Mobile Phones
    And I filter by Samsung brand
    And I filter by 20 MP and above camera resolution
    And I filter by model year 2023
    And I filter by price range £50 - £100
    Then I should see a list of Samsung phones that match the criteria