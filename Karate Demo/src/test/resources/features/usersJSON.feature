@regression
Feature: get User

  Background:
    * url 'https://jsonplaceholder.typicode.com'
    * def users = read('classpath:data/users.json')


  Scenario: Get a User Positive
    Given path 'users', 1
    When method get
    Then status 200
    And match response.name == users.valid.name
    And match response.username == users.valid.username

  Scenario: get a user negative
    Given path 'users', 1
    When method get
    Then status 200
    And match response.name == users.invalid.name
    And match response.username != users.invalid.username