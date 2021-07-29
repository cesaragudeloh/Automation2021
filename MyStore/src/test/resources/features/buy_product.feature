#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: Make a purchase online



  @BuyProduct
  Scenario: Purchase a product online
    Given the user enters the store with username standard_user and password secret_sauce
    When he make a purchase online
    Then the order is created correctly