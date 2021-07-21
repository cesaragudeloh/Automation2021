#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: Authentication failed


  @DataIncorrect
  Scenario: Login with wrong credentials
    Given go to the My Store homepage
    When login with invalid credentials
    Then the system does not allow entry