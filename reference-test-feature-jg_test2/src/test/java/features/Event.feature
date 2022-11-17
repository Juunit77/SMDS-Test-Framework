Feature: Test Events

  @Regression
    @TestCaseKey=SRS-T7
  Scenario Outline: Verify Successful Event Creation

    Given User is on Unit Summary Page
    When User navigates to the Active Force Preservation page
    And User selects a <Force Member>
    Then User is navigated to the Individual Summary Page

    When User clicks the Add Event Button
    Then User should be presented with the Event Dialog Form

    When User completes the Event Dialog Form
    Then User should have the option to Submit the Event
    And the User should be presented with Confirmation Box

    Examples:
      | Force Member    |
      | ADAMS, WALTER   |
      | ADAMS, WILLIAM  |
      | ACHENBAUGH, DAN |