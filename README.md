# SWAGLABS WEB TESTING PROJECT
    This README file provides instructions for testing saucedemo.com using Sauce Labs.
# Requirements

* Sauce Demo website URL :

   https://www.saucedemo.com

* A Chrome browser on Windows 10
* A Sauce Labs access key :
  
       Username :- standard_user

       Password :- secret_sauce


# Tech stack Requirements :

    * IntelliJ Idea IDE
    * Programming language - Java
    * Automation framework - Selenium
    * Testing framework - TestNG
    * Project management tool - Maven  


#  Design Patterns:
          
          * Page Object Model (POM)


 #  Getting Started
 
 * Set up your test environment by creating a new Java project in your preferred IDE.
 * Add the necessary dependencies to your project, including the Selenium WebDriver and Sauce Labs Plugin.
 * Create a new Java class for your test.
 * Set up the desired capabilities for your test, including the platform, version, and name.
 * Connect to Sauce Labs using your access key and the RemoteWebDriver.
 * Navigate to the saucedemo.com website using the WebDriver.
 *  Perform actions on the website as needed.
 *  Quit the WebDriver when you are finished.


#  Tests:

## Login functionality
T1: Confirm that logging in with valid credentials is successful.

T2: Confirm that logging in with invalid credentials fails.

## Home Page functionality
T1: The items should be sorted by price in ascending order (Low to High). 

T2: The item should be successfully added to the cart.

## Cart functionality
T1: Validate that the product should be present in the cart.

T2: Check that a user can add items to their cart ,proceed to checkout and complete the purchase.

# CONCLUSION

In conclusion, the following steps were taken to implement the testing for the e-commerce Sauce Labs app:
* Tested the login functionality with valid and invalid credentials.
* Tested the home page functionality by sorting items on the basis of price (low to high) and adding the item with the lowest price to the cart.
* Tested the cart functionality by validating whether the product is added to the cart or not.
* Tested the checkout functionality by ensuring that the user is prompted to log in or create a new account, providing shipping information and selecting a shipping method, entering payment details and reviewing the order summary, and confirming the purchase.

  With these tests, we can ensure that the Sauce Labs app is functioning as expected and provides a seamless user experience.

   
