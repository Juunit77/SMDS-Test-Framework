Feature: Test Logout

  @Smoke @Regression
  @TestCaseKey=SRS-T5
  Scenario: Verify Successful Logout

    Given User is on the Unit Summary Page
    When User clicks Logout Button
    And User confirms they want to logout
    Then User is navigated to the Splash Page