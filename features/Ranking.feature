Feature: Ranking test

  @ranking
  Scenario Outline: Test correctly position in top ranking
    Given user is in filmaffinity
    When user click on top button
    Then verify position <posicion>, name <nombre>, director <director>, point <nota>

    Examples: 

			| posicion	| nombre 								| director 							| nota	| 
     	| 1 				|	El padrino 						|	Francis Ford Coppola	| 9.0 	|
			| 2					| El padrino. Parte II	|	Francis Ford Coppola	|	8.9 	|
			| 4					| Breaking Bad 					| Vince Gilligan 				|	8.8 	|
      | 25				| Senderos de gloria		| Stanley Kubrick				| 8.5		|