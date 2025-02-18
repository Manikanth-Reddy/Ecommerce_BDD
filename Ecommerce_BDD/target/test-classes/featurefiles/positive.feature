Feature: Ecommerce Login and Adding to cart

  Scenario: Verify the login for valid credentials
    Given user is on home page
    When user clicks on signin button
    When user enters username "mechanicalbranch2018@gmail.com"
    When user enters password "Manikanth#4289"
    When user clicks on login button
    Then user gets the title as "Home Page"

  Scenario: Verify forgot passoword with valid email
    Given user is on home page
    When user clicks on signin button
    When user clicks on forgot password
    Then user navigates to the new page named "Forgot Your Password?"
    When user enters registred email "example@gmail.com"
    When user clicks on Reset My Passoword
    Then user get sucess message

  Scenario: Adding Items to the Cart
    Given user is on home page
    When user clicks on signin button
    When user enters username "mechanicalbranch2018@gmail.com"
    When user enters password "Manikanth#4289"
    When user clicks on login button
    Then user gets the title as "Home Page"
    #When user clicks on sale
    #When user clicks on bags
    #When user clicks on driven backpack
    #When user clicks on add to cart
    #Then user gets item added message
    When user clicks on men
    When user clicks on jackets
    When user clicks on Montana Wind Jacket
    When user clicks on size "M"
    When user clicks on colour "Black"
    When user clicks on add to cart
    Then user gets item added message
@smoke
  Scenario: Checkout
    Given user is on home page
    When user clicks on signin button
    When user enters username "mechanicalbranch2018@gmail.com"
    When user enters password "Manikanth#4289"
    When user clicks on login button
    Then user gets the title as "Home Page"
    #When user clicks on sale
    #When user clicks on bags
    #When user clicks on driven backpack
    #When user clicks on add to cart
    #Then user gets item added message
    When user clicks on men
    When user clicks on jackets
    When user clicks on Montana Wind Jacket
    When user clicks on size "M"
    When user clicks on colour "Black"
    When user clicks on add to cart
    Then user gets item added message
    When user clicks on cart icon
    When user clicks on checkOut
    Then user gets the title as "Checkout"
    When user clicks on add address
    When user enters fisrtName "Manikanth"
    When user enters lastName "Reddy"
    When user enters street "PanchayatRaj Office Road"
    When user enters city "Kadiri"
    When user chooses country "India"
    When user chooses state "Andhra Pradesh"
    When user enters pincode "515591"
    When user enters phoneNumber "1234567890"
    When user clicks on ship here button
    When user clicks on next button
    When user cliks on place order
    Then user gets the title as "Success Page"
