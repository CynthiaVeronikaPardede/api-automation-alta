Feature: User
  As an admin
  I want to see list at user
  So that I can create new user

  Scenario: Get - As admin I have be able to get detail user
    Given I set Get api endpoints
    When I send Get HTTP request
    Then I received valid HTTP response code 200
    And I receive valid data for detail user

