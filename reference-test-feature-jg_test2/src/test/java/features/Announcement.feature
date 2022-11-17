Feature: Announcements

@Functional
    @TestCaseKey=SRS-T1
  Scenario: Creating an Announcement

    Given The User has accessed CIRRAS and is on the Unit Summary Page
    When The User clicks Make An Announcement
    Then The Announcements UI is presented to the User

    When The User clicks the Announcement Type Dropdown
    Then The Following <Options> should be available to the user

    When The User selects an Announcement Type
    Then The User should be able to enter text in the Announcement Text box
    And The Announcement Type retains

    When The User clicks the Submit button
    Then The Announcement should be visible on the Announcements Board

#    Examples:
#      | Options           |
#      | FPC               |
#      | CIRRAS Policy     |
#      | Leadership Change |