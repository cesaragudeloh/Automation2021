#language:en
#Author:cesar.agudelo.h@gmail.com

Feature: Make a purchase online


  @BuyProduct
  Scenario: Purchase a product online
    When Cesar make a purchase online
    Then the order is created correctly