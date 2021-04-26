#Author: Manoj Kuruppath Rajan

@Regression
Feature: Feature for GetPost Requests and Response
  Verify Post and GET operations using REST-assured methods

  @Regression
  Scenario: Verify the Post Operation for Make Posts in jsonplaceholder
    Given I perform post operation for "/posts"
    
  @Regression
  Scenario: Verify the Post Operation for Comments on Posts in jsonplaceholder
    Given I perform post operation for "/posts" in Comments on Posts
    
  #@Regression
  #Scenario: Verify the Post Operation for List of users in jsonplaceholder
    #Given I perform post operation for "/posts" in list of users

    