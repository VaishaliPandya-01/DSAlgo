@A
Feature: Test Registration Page

  Scenario Outline: check registration functionality
    Given user is on landing page
    When user clicks on get Started button
    Then user should be navigated to home page
    And user clicks on registration link
    Then user should be landed on registration page
    And user  enters  <username> <password> and <passwordConfm>
    And click on register button
    Then if registration is sucessful user should be redirected to homepage or error message should be display

    Examples: 
      | username | password  | passwordConfm |
      | hjk6789  | erteerter | kk12kk12      |
      | tl7ukl5  | kk12kk12  | kk12kk12      |
