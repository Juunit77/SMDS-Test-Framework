Feature: Test Login

  @Smoke @Regression
  @TestCaseKey=SRS-T3
  Scenario: Verify Successful Login

    Given User is on Login Page
    When User clicks Login Button
    And User selects a <Role>
    Then User is navigated to the Unit Summary Page