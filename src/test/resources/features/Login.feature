@B
Feature: Test login Page with dropdown on home page

  Background: user is on landing page
    Given user is on landing page
    When user clicks on get Started button
    Then user should be navigated to home page

  Scenario: check dropdown
    Given user should be navigated to home page
    Then The user should see 6 panels with different structures
    When user clicks DataStructures dropdown
    Then user should see 6 different data structures in dropdown
    And user select one data structure from dropdown
    Then error message should be displayed

  Scenario Outline: check Login
    Given user should be navigated to home page
    When user clicks on sign In link
    Then user should be landed on login page
    And user enters <username> and <Password>
    And click on login
    Then if login is sucessful user should be redirected to homepage or error message should display

    Examples: 
      | username | Password |
      | gfteuryt | ddfsasda |
      | xyz1234  | kk12kk12 |
