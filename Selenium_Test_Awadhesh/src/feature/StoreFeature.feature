Feature: Store demo feature

  Background: 
    Given Initial setup

  @smoke
  Scenario: Store demo page navigation
    Given user navigates to the store
    And user navigates to sample page
    When user comments with wrong email
    And user validates for error message
    And user navigates back
    Then user comments with correct email
    And check comment is received
    And close the browser
