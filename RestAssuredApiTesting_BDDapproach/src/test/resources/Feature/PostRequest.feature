#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: validating books API

  @tag2
  Scenario Outline: Verify we are able to add book using Addbook API
    Given Json payload to add the book "<name>""<isbn>""<aisle>""<author>"
    When user calls Addbook API with POST HTTP request
    Then The API call got success with status code 200
    And "MSG" in response body is "Successfully Added"

    Examples: 
      | name  | isbn     | aisle | author     |
      | Jivan | port1234 |   256 | Prem Kumar |
