@Konica
Feature: Assignment for the Konica QA Technical Interview

@Konica1
Scenario Outline: Gmail Scenario with username and password
  Given user prefers to launch chrome browser
  And "<URL>" URL is launched in the chrome browser
  And I enter the "<username>" and "<password>"
  And I validate the profile icon in HomePage
  And I Close the browser

Examples:
  |URL                    |username                   | password    |
  |https://www.gmail.com  |testerkonica@gmail.com     | Welcome@123 |


  @Konica2
  Scenario Outline: Ebay Scenario with Electric Guitar Price
    Given user prefers to launch chrome browser
    And "<URL>" URL is launched in the chrome browser
    And I search for the "<keyword>"
    And I open the first result from the search
    Then I print the price of the first result
    And I Close the browser


    Examples:
     | URL                |keyword              |
     |https://www.ebay.com| electric guitar     |
