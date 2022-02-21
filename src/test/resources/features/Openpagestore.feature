Feature: Open Google
  Open page
  @Smoke
  Scenario: Open store page
    Given user opens google page
    When user click store
    Then user can see expected title