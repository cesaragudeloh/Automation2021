#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: Login with wrong credentials


  @LoginFailed
  Scenario Outline: Login with wrong credentials
    When the user enters the store
      | username   | password   |
      | <username> | <password> |
    Then the system does not allow entry and displays the message <message>

    Examples:
      | username        | password     | message                                                     |
      | locked_out_user | secret_sauce | Sorry, this user has been locked out.                       |
      | admin           | invalid_pass | Username and password do not match any user in this service |