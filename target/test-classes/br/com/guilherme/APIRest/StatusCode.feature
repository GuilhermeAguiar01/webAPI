Feature: 2: Status Code
  //Guilherme Aguiar
  
  @APIRest
  Scenario: 2: Status Code
    Given base URI "https://reqres.in/api/users"
    And param "page" = "2"
 		Then verifico o status code "200"

 		