#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: Authentication failed


  @DataIncorrect
  Scenario Outline: Login with wrong credentials
    Given go to the My Store homepage
    When login with invalid credentials
      | emailAddress   | password   |
      | <emailAddress> | <password> |
    Then the system does not allow entry
      | messageError   |
      | <messageError> |
    Examples:
      | emailAddress     | password    | messageError              |
      |                  |             | An email address required |
      | email            | password123 | Invalid email address     |
      | prueba@gmail.com |             | Password is required      |
      | prueba@gmail.com | password123 | Authentication failed     |