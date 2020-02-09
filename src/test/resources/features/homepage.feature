@SA
Feature: HomePage

  Scenario: File Upload

    Given User is on home page
    When Navigates to File -> Upload
    And User uploads file
    Then File appears as uploaded

  Scenario: File download

    Given User is on home page
    When Navigates to File -> Download
    Then User downloads file