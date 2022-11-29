package stepDefinations;

import java.util.List;
import java.util.Map;

import baseClass.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArrayPage;
import pages.DataStructureIntroPage;
import pages.GraphPage;
import pages.HomePage;
import pages.LinkedListPage;
import pages.LoginPage;
import pages.QueuePage;
import pages.StackPage;
import pages.TreePage;
import util.commonFunctions;

public class DataStructureSD extends TestBase{

	HomePage homePage = new HomePage();
	LoginPage login = new LoginPage();
	GraphPage graphPage = new GraphPage();
	commonFunctions cf = new commonFunctions();
	TreePage treePage = new TreePage();
	DataStructureIntroPage dsi = new DataStructureIntroPage();
	ArrayPage array = new ArrayPage();
	LinkedListPage  linkList = new LinkedListPage();
	StackPage stack = new StackPage();
	QueuePage queue = new QueuePage();

	@Then("user enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<Map<String,String>> credlist = dataTable.asMaps();
		String userName = credlist.get(0).get("username");
		String password = credlist.get(0).get("Password");

		homePage = login.doLogin(userName, password);

	}

	@Given("user is on home Page")
	public void user_is_on_home_page() {
		try {
			homePage.validateHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks on DataStructuresIntro get started button")
	public void user_clicks_on_data_structures_intro_get_started_button() {
		homePage.DSIGetStartBtn();
	}

	@Then("user is on DataStructureIntro page")
	public void user_is_on_data_structure_intro_page() {
		dsi.ValidateDSIPage();
	}

	@And("user clicks on Time Complexity button")
	public void user_clicks_on_time_complexity_button() {
		dsi.TimeComplexitybtn();
	}

	@Then("user is on Time complexity page")
	public void user_is_on_time_complexity_page() {
		dsi.ValidationTimeComplexity();
	}

	@And("user clicks on Practice Questions button")
	public void user_clicks_on_practice_questions_button() {
		dsi.practiceQuestions();
	}

	@Then("user is on Practice Questions page")
	public void user_is_on_practice_questions_page() {
		dsi.ValidationPracticeQtn();
	}

	@When("user clicks on Array get started button")
	public void user_clicks_on_array_get_started_button() {
		homePage.arrayGetStartBtn();
	}

	@Then("user is on Array page")
	public void user_is_on_array_page() {
		array.ValidateArrayPage();
	}

	@And("user clicks on Arrays in Python button")
	public void user_clicks_on_arrays_in_python_button() {
		array.ArrayPythonbtn();
	}

	@Then("user is on Arrays in Python page")
	public void user_is_on_arrays_in_python_page() {
		array.ValidationArrayPython();
	}

	@Given("user is on Array Topic covered page")
	public void user_is_on_Array_Topic_covered_page() {
		array.ValidateArrayPage();
	}

	@When("user clicks on Arrays using List button")
	public void user_clicks_on_arrays_using_list_button() {
		array.ArrayListbtn();
	}

	@Then("user is on Arrays using List page")
	public void user_is_on_arrays_using_list_page() {
		array.ValidationArrayList();
	}

	@When("user clicks on Basic Operations in List button")
	public void user_clicks_on_basic_operations_in_list_button() {
		array.BasicOperationListbtn();
	}

	@Then("user is on Basic Operations in List page")
	public void user_is_on_basic_operations_in_list_page() {
		array.ValidationBasicOperation();
	}

	@When("user clicks on Applications of Array button")
	public void user_clicks_on_applications_of_array_button() {
		array.ApplicationArraybtn();
	}

	@Then("user is on Applications of Array page")
	public void user_is_on_applications_of_array_page() {
		array.ValidationApplicationArray();
	}

	@And("user clicks on Search the Array button in Practice")
	public void user_clicks_on_search_the_array_button_in_practice() {
		array.searchTheArray();
	}

	@Then("user is on question one page in Practice")
	public void user_is_on_question_one_page_in_practice() {
		array.ValidationQuestionPage();
	}

	@Then("user navigates back to Practice page")
	public void user_navigates_back_to_practice_page() {
		driver.navigate().back();
	}

	@And("user clicks on Max Consecutive Ones button in Practice")
	public void user_clicks_on_max_consecutive_ones_button_in_practice() {
		array.maxConsecutiveOnes();
	}

	@Then("user is on question two page in Practice")
	public void user_is_on_question_two_page_in_practice() {
		array.ValidationQuestionPage();
	}

	@Then("user clicks on Find Numbers with Even Number of Digits button in Practice")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_button_in_practice() {
		array.findNumbersWithEvenNumberOfDigits();
	}

	@Then("user is on question three page in Practice")
	public void user_is_on_question_three_page_in_practice() {
		array.ValidationQuestionPage();
	}

	@Then("user clicks on Squares of a Sorted Array button in Practice")
	public void user_clicks_on_squares_of_a_sorted_array_button_in_practice() {
		array.squaresOfASortedArray();
	}

	@Then("user is on question four page in Practice")
	public void user_is_on_question_four_page_in_practice() {
		array.ValidationQuestionPage();
	}

	@And("user enter input and clicks on Submit button and gets output")
	public void user_enter_input_and_clicks_on_Submit_button_and_gets_output() {
		array.tryEditor();
	}

	@When("user clicks on GetStarted button for LinkedList")
	public void user_clicks_on_GetStarted_button_for_LinkedList() {
		homePage.LinkListGetStartBtn();
	}

	@Then("user should navigate to LinkedList page")
	public void user_should_navigate_to_LinkedList_page() {
		linkList.ValidateLinkListPage();
	}

	@When("user clicks on Introduction link")
	public void user_clicks_on_Introduction_link() {
		linkList.IntroductionBtn();
	}

	@Then("user should navigate to Linkedlist Subpage")
	public void user_should_navigate_to_Linkedlist_Subpage() {
		linkList.ValidationIntroduction();
	}

	@Given("user is on Linked List Topic covered page")
	public void user_is_on_Linked_List_Topic_covered_page() {
		linkList.ValidateLinkListPage();
	}

	@When("user clicks on Creating a LinkedList link")
	public void user_clicks_on_Creating_a_LinkedList_link() {
		linkList.createLinkListbtn();
	}

	@When("user clicks on Types of Linked List link")
	public void user_clicks_on_Types_of_Linked_List_link() {
		linkList.TypeOfLinkListBtn();
	}

	@When("user clicks on Implement Linked List in Python link")
	public void user_clicks_on_Implement_Linked_List_in_Python_link() {
		linkList.ImplementLinkLIst();
	}

	@When("user clicks on Traversal link")
	public void user_clicks_on_Traversal_link() {
		linkList.TraversalBtn();
	}

	@When("user clicks on Insertion link")
	public void user_clicks_on_Insertion_link() {
		linkList.InsertionBtn();
	}

	@When("user clicks on Deletion link")
	public void user_clicks_on_Deletion_link() {
		linkList.DeletionBtn();
	}

	@When("user clicks on GetStarted button of Stack")
	public void user_clicks_on_get_started_button_of_stack() {		
		homePage.stackGetStartBtn();
	}

	@Then("User is on Stack page")
	public void user_is_on_stack_page(){
		stack.ValidateStackPage();
	}

	@When("user clicks on Operations in Stack")
	public void user_clicks_on_operations_in_stack() {
		stack.OperationStackbtn();
	}

	@Then("user must be navigated to the Operations in Stack page")
	public void user_must_be_navigated_to_the_operations_in_stack_page(){
		stack.ValidateOperationsStack();
	}	

	@Given("user is on Stack Topic covered page")
	public void user_is_on_Stack_Topic_covered_page (){
		stack.ValidateStackPage();
	}

	@When("user clicks on Implementation link")
	public void user_clicks_on_implementation_link() {
		stack.Implementationbtn();
	}

	@Then("user will be navigated to the Implementation page")
	public void user_will_be_navigated_to_the_implementation_page(){
		stack.ValidateImplementation();
	}

	@When("user clicks on Applications link")
	public void user_clicks_on_applications_link() {
		stack.Applicationsbtn();
	}

	@Then("user is now on Applications page")
	public void user_is_now_on_applications_page(){
		stack.ValidateApplications();
	}

	@When("user clicks on GetStarted button of Queue")
	public void user_clicks_on_get_started_button_of_queue() {
		homePage.queueGetStartBtn();
	}

	@Then("user will be navigated to Queue page")
	public void user_will_be_navigated_to_queue_page(){
		queue.ValidateQueuePage();
	}

	@When("user clicks on Implimentation of Queue in python")
	public void user_clicks_on_implimentation_of_queue_in_python() {
		queue.ImplementationOfQueuebtn();		
	}

	@Then("user will be navigated to Implimentation of Queue in python page")
	public void user_will_be_navigated_to_implimentation_of_queue_in_python_page(){
		queue.ValidationImplementOfQueue();
	}

	@When("user will click on Implementation using collections dequeue")
	public void user_will_click_on_implementation_using_collections_dequeue(){
		queue.ImplementationCollectionbtn();
	}

	@Then("user will be navigated to Implementation using collections dequeue page")
	public void user_will_be_navigated_to_implementation_using_collections_dequeue_page(){
		queue.ValidationImplementCollection();
	}

	@When("user will click on Implementation using Array")
	public void user_will_click_on_implementation_using_array() {
		queue.ImplementationArraybtn();
	}

	@Then("user will be navigated to the Implementation Using Array page")
	public void user_will_be_navigated_to_the_implementation_using_array_page(){
		queue.ValidationImplementArray();
	}

	@When("user will click on Queue Operations")
	public void user_will_click_on_queue_operations() {
		queue.QueueOperationbtn();
	}

	@Then("user is navigated to Queue Operations page")
	public void user_is_navigated_to_queue_operations_page(){
		queue.ValidationQueueOperation();
	}
	
	 @Given("user is on Queue Topic covered page")
	 public void user_is_on_Queue_Topic_covered_page() {
		 queue.ValidateQueuePage();
	 }

	@When("user clicks on Graph Get Started button")
	public void user_clicks_on_graph_get_started_button() {
		homePage.graphGetStartBtn();
	}


	@Then("user should navigate to Graph page")
	public void user_should_navigate_to_graph_page() {
		graphPage.ValidateGraphPage();	
	}


	@And("user clikcs on Graph")
	public void user_clikcs_on_graph() {
		graphPage.GraphLink();
	}


	@Then("clicks on Try here button")
	public void clicks_on_try_here_button() {
		graphPage.TryHereBtn();
	}


	@Then("user enter input")
	public void user_enter_input() {
		graphPage.InputData();
	}


	@And("click on Run")
	public void click_on_run() {
		graphPage.RunBtn();	
	}

	@Then("it should display entered input")
	public void Then_it_should_display_entered_input() {
		graphPage.OutputText();
	}

	@Then("user go back to Topic Covered page")
	public void user_go_back_to_Topic_Covered_page() {
		cf.returnBacktwice();
	}

	@Given("user is on graph Topic covered page")
	public void user_is_on_graph_Topic_covered_page() {
		graphPage.ValidateGraphPage();	 
	}


	@When("user clikcs on Graph Representations")
	public void user_clikcs_on_Graph_Representations() {
		graphPage.GraphRepresntbtn(); 

	}


	@Then("user navigate back to Home Page")
	public void user_navigate_back_to_home_page() {
		cf.returnBackPage();

		try {
			homePage.validateHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user clicks on Tree GetStarted button")
	public void user_clicks_on_tree_get_started_button() {
		homePage.treeGetStartBtn();
	}


	@Then("user should navigate to Tree page")
	public void user_should_navigate_to_tree_page() {
		treePage.TreePageValidation();
	}


	@And("user clikcs on overview of Trees")
	public void user_clikcs_on_overview_of_trees() {
		treePage.OverviewOfTreeBtn();
	}

	@Given("user is on Tree Topic covered page")
	public void user_is_on_tree_topic_covered_page() {
		treePage.TreePageValidation();
	}


	@When("user clikcs on Terminologies")
	public void user_clikcs_on_terminologies() {
		treePage.Terminologiesbtn();
	}

	@When("user clikcs on Types of Trees")
	public void user_clikcs_on_types_of_trees() {
		treePage.TypeOfTreebtn();
	}

	@When("user clikcs on Tree Traversals")
	public void user_clikcs_on_tree_traversals() {
		treePage.TreeTraversalsbtn();
	}


	@When("user clikcs on Traversals-Illustration")
	public void user_clikcs_on_traversals_illustration() {
		treePage.TraversalsIllustrationbtn();
	}


	@When("user clikcs on Binary Trees")
	public void user_clikcs_on_binary_trees() {
		treePage.BinaryTreesbtn();
	}


	@When("user clikcs on Types of Binary Trees")
	public void user_clikcs_on_types_of_binary_trees() {
		treePage.TYpesOfBinarybtn();
	}

	@When("user clikcs on Implementation in Python")
	public void user_clikcs_on_implementation_in_python() {
		treePage.ImplementationPythonbtn();
	}


	@When("user clikcs on Binary Tree Traversals")
	public void user_clikcs_on_binary_tree_traversals() {
		treePage.BinaryTreeTraversalsbtn();
	}


	@When("user clikcs on Implementation of Binary Trees")
	public void user_clikcs_on_implementation_of_binary_trees() {
		treePage.ImplementationOfBinarybtn();
	}


	@When("user clikcs on Applications of Binary trees")
	public void user_clikcs_on_applications_of_binary_trees() {
		treePage.ApplicationsOfBinarybtn();
	}


	@When("user clikcs on Binary Search Trees")
	public void user_clikcs_on_binary_search_trees() {
		treePage.BinarySearchbtn();
	}


	@When("user clikcs on Implementation Of BST")
	public void user_clikcs_on_implementation_of_bst() {
		treePage.ImplementationOfBSTbtn();		
	}




	@And("clicks on SignOut btn")
	public void clicks_on_SignOut_btn() {
		homePage.SignOutBtn();
		driver.close();
	}

}
