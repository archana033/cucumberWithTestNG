Feature: login to WebApp

  Background:
  Given I am on the app's login page
  Scenario Template: Login with invalid creds
    When I enter the "<username>" and "<password>"
    Examples:
    |username|password|
    |        |        |