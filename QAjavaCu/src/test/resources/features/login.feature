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
@smoke
Feature: Title of your feature
  I want to use this template for my feature file

  @SmokeTest
  Scenario Outline: validating the login page with valid credentials
    Given user need to access the login page
    When user enters <userId> and <password>
    And user need to click on login button
    Then login page need to navigate to homepage
    @regression
  Scenario: validating the login page with valid credentials
    Given user need to access the login page
    When user enters <userId> and <password>
    And user need to click on login button
    Then login page need to navigate to homepage

    Examples:
    |userId|password|
    |dimple |  12345|
    |lulu |  5678|
    |ele | 8778|    
