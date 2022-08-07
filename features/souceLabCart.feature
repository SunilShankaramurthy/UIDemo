Feature: SuoceLab cart validation features.

  Background:
   Given User is SouceLab login Page
    When User login using valid credentials from config file
    Then User will be navigated to Product page

  Scenario: Select the Maximum price Item from cart
    Given User is in Products page
    When User add random items cart
    Then User should able to see those items in cart and select the maximum price item
