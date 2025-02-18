	Feature: Negative Test Cases for Ecommerce Application

  Scenario: Verify the login for Invalid credentials
    Given user is on home page
    When user clicks on signin button
    When user enters username "example@gmail.com"
    When user enters password "Example"
    When user clicks on login button
    Then user gets the error message
    
    Scenario: Adding items which are out of stock
    Given user is on home page
    When user clicks on signin button
    When user enters username "mechanicalbranch2018@gmail.com"
    When user enters password "Manikanth#4289"
    When user clicks on login button
    Then user gets the title as "Home Page"
    When user clicks on Fusion Backpack
    When user clicks on add to cart
    Then user get outofstock message
   
    