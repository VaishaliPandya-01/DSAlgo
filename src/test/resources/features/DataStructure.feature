@C
Feature: Check Data Structures

  Background: 
    Given user is on landing page
    When user clicks on get Started button
    Then user should be navigated to home page
    And user clicks on sign In link
    Then user enters credentials
      | username | Password |
      | xyz1234  | kk12kk12 |

  Scenario: check data structues
    # test data structures introduction
    Given user is on home Page
    When user clicks on DataStructuresIntro get started button
    Then user is on DataStructureIntro page
    And user clicks on Time Complexity button
    Then user is on Time complexity page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    #####################
    ######Time Complexity
    Given user is on home Page
    When user clicks on DataStructuresIntro get started button
    Then user is on DataStructureIntro page
    And user clicks on Time Complexity button
    Then user is on Time complexity page
    And user clicks on Practice Questions button
    Then user is on Practice Questions page
    Then user navigate back to Home Page
    ##################
    # test array
    Given user is on home Page
    When user clicks on Array get started button
    Then user is on Array page
    And user clicks on Arrays in Python button
    Then user is on Arrays in Python page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    #################################
    ######Arrays using List
    Given user is on Array Topic covered page
    When user clicks on Arrays using List button
    Then user is on Arrays using List page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ######################################
    #########Basic Operations in List
    Given user is on Array Topic covered page
    When user clicks on Basic Operations in List button
    Then user is on Basic Operations in List page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ##########################
    ########Applications of Array
    Given user is on Array Topic covered page
    When user clicks on Applications of Array button
    Then user is on Applications of Array page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    ###############################
    ############Practice Questions
    Given user is on home Page
    When user clicks on Array get started button
    Then user is on Array page
    And user clicks on Applications of Array button
    Then user is on Applications of Array page
    And user clicks on Practice Questions button
    Then user is on Practice Questions page
    And user clicks on Search the Array button in Practice
    Then user is on question one page in Practice
    And user enter input and clicks on Submit button and gets output
    Then user navigates back to Practice page
    And user clicks on Max Consecutive Ones button in Practice
    Then user is on question two page in Practice
    And user enter input and clicks on Submit button and gets output
    Then user navigates back to Practice page
    And user clicks on Find Numbers with Even Number of Digits button in Practice
    Then user is on question three page in Practice
    And user enter input and clicks on Submit button and gets output
    Then user navigates back to Practice page
    And user clicks on Squares of a Sorted Array button in Practice
    Then user is on question four page in Practice
    And user enter input and clicks on Submit button and gets output
    Then user navigates back to Practice page
    Then user navigate back to Home Page
    ################################
    #Scenario of LinkedList Module
    Given user is on home Page
    When user clicks on GetStarted button for LinkedList
    Then user should navigate to LinkedList page
    When user clicks on Introduction link
    Then user should navigate to Linkedlist Subpage
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ##############Creating a LinkedList
    Given user is on Linked List Topic covered page
    When user clicks on Creating a LinkedList link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ################Types of Linked List
    Given user is on Linked List Topic covered page
    When user clicks on Types of Linked List link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ##############Implement Linked List in Python
    Given user is on Linked List Topic covered page
    When user clicks on Implement Linked List in Python link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ####################Traversal
    Given user is on Linked List Topic covered page
    When user clicks on Traversal link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ######################Insertion
    Given user is on Linked List Topic covered page
    When user clicks on Insertion link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #####################Deletion
    Given user is on Linked List Topic covered page
    When user clicks on Deletion link
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    ################################
    #Scenarios of Stack
    Given user is on home Page
    When user clicks on GetStarted button of Stack
    Then User is on Stack page
    When user clicks on Operations in Stack
    Then user must be navigated to the Operations in Stack page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ###################Implementation link
    Given user is on Stack Topic covered page
    When user clicks on Implementation link
    Then user will be navigated to the Implementation page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ###################Applications link
    Given user is on Stack Topic covered page
    When user clicks on Applications link
    Then user is now on Applications page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    ################################
    #Scenarios of Queue
    Given user is on home Page
    When user clicks on GetStarted button of Queue
    Then user will be navigated to Queue page
    When user clicks on Implimentation of Queue in python
    Then user will be navigated to Implimentation of Queue in python page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #########Implementation using collections
    Given user is on Queue Topic covered page
    When user will click on Implementation using collections dequeue
    Then user will be navigated to Implementation using collections dequeue page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ###########Implementation using Array
    Given user is on Queue Topic covered page
    When user will click on Implementation using Array
    Then user will be navigated to the Implementation Using Array page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    ##############Queue Operations
    Given user is on Queue Topic covered page
    When user will click on Queue Operations
    Then user is navigated to Queue Operations page
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    ################################
    #Scenarios of Graph
    Given user is on home Page
    When user clicks on Graph Get Started button
    Then user should navigate to Graph page
    And user clikcs on Graph
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Graph Representations
    Given user is on graph Topic covered page
    When user clikcs on Graph Representations
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    ################################
    #Scenarios of Tree
    Given user is on home Page
    Then user clicks on Tree GetStarted button
    Then user should navigate to Tree page
    And user clikcs on overview of Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Terminologies
    Given user is on Tree Topic covered page
    When user clikcs on Terminologies
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Types of Trees
    Given user is on Tree Topic covered page
    When user clikcs on Types of Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Tree Traversals
    Given user is on Tree Topic covered page
    When user clikcs on Tree Traversals
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Traversals-Illustration
    Given user is on Tree Topic covered page
    When user clikcs on Traversals-Illustration
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Binary Trees
    Given user is on Tree Topic covered page
    When user clikcs on Binary Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of  Types of Binary Trees
    Given user is on Tree Topic covered page
    When user clikcs on Types of Binary Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Implementation in Python
    Given user is on Tree Topic covered page
    When user clikcs on Implementation in Python
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Binary Tree Traversals
    Given user is on Tree Topic covered page
    When user clikcs on Binary Tree Traversals
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Implementation of Binary Trees
    Given user is on Tree Topic covered page
    When user clikcs on Implementation of Binary Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Applications of Binary trees
    Given user is on Tree Topic covered page
    When user clikcs on Applications of Binary trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Binary Search Trees
    Given user is on Tree Topic covered page
    When user clikcs on Binary Search Trees
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user go back to Topic Covered page
    ################################
    #Scenarios of Implementation Of BST
    Given user is on Tree Topic covered page
    When user clikcs on Implementation Of BST
    Then clicks on Try here button
    Then user enter input
    And click on Run
    Then it should display entered input
    Then user navigate back to Home Page
    And clicks on SignOut btn
