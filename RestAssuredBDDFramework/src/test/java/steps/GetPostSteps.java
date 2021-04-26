package steps;

import cucumber.api.java.en.Given;

public class GetPostSteps {
	
	@Given("^I perform post operation for \"([^\"]*)\"$")
	public void i_perform_post_operation_for(String arg1){
		BddMethods.PerformPOSTWithBodyParameter();
	}
	
	@Given("^I perform post operation for \"([^\"]*)\" in Comments on Posts$")
	public void i_perform_post_operation_for_in_Comments_on_Posts(String arg1){
		BddMethods.PerformPOSTWithCommentAPI();

	}
	
	@Given("^I perform post operation for \"([^\"]*)\" in list of users$")
	public void i_perform_post_operation_for_in_list_of_users(String arg1){
		BddMethods.PerformPOSTWithUsersAPI();

	}

}
