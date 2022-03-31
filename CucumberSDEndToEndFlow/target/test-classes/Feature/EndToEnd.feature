@Endtest
Feature: Feature to test End to End Flow

  Scenario: To check the if End to End Flow is working as expected for a order
  
    #Step1_Login_FrontEnd_Test
    Given user is on login page
    When user enters user name "suryakc1999@gmail.com" and password "surya@123"
    And clicks on login button
    Then user is navigated to the home page
    And user verifies if item is in cart
    
    #Step2_Select_A_Product
    When user hovers on power tools link
    And hovers on drills link and click on that
    Then user is navigated to drills page
    When user clicks on a product
    Then user is navigated to the products page
    #Step3_Add_Product_To_Cart
    When user increases the quantity of the product
    And clicks on Add to Cart button
    Then user is navigated to art page
    When user clicks on Place Order button
    Then user is navigated to Checkout page
    #Step4_Proceed_with_Checkout
    When user clicks on continue button
    And user selects the radio button of credit & debit cards/ Net Banking/ EMI
    And clicks on Place order button
    Then user is navigated to Payment gateway page
    #Step5_Continue_With_Payment
    When user scrolls down and clicks on netbanking option
    And selects the bank option
    And clicks on Pay button
    Then user is navigated to confirmation page
    When user clicks on Success button
    Then order is placed
