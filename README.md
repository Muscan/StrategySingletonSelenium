# Project README

## Introduction
This Git repository contains a project that includes a set of automated tests for a web application. The tests are written in Java using the JUnit testing framework and Selenium WebDriver for web automation.

## Project Status
**Important Note:** The project is considered obsolete due to the fact that the target webpage no longer exists. As a result, the tests provided in this repository may no longer be applicable or relevant. This README serves as an archival document.

## Project Structure
The project consists of the following main components:

- **Tests.java**: This class contains the test cases implemented using JUnit and Selenium WebDriver.

- **DriverSingleton.java**: This class is used for managing the WebDriver instance to interact with the web application.

- **HomePage.java**: This page object class represents the home page of the web application and provides methods to interact with it.

- **SignInPage.java**: This page object class represents the sign-in page and provides methods to perform authentication actions.

- **CheckoutPage.java**: This page object class represents the checkout process page and provides methods to navigate and interact with the shopping cart and checkout process.

- **Constants.java**: This file contains constant values such as URLs, email addresses, passwords, and other properties used in the tests.

- **FrameworkProperties.java**: This file is used to manage framework properties and configurations.

## How to Use
To run the tests, you will need to set up the necessary dependencies, including Java, JUnit, and Selenium WebDriver. Make sure to update the properties and constants in the `Constants.java` and `FrameworkProperties.java` files with the appropriate values for your testing environment.

After the setup is complete, you can execute the tests using a testing framework or IDE that supports JUnit.

## Obsolete Status
As mentioned earlier, the project's tests were designed to interact with a specific web application. However, since the path to the webpage no longer exists, attempting to run these tests on the original web application will likely result in errors.

Please keep in mind that the project serves as an example of how to create automated tests using Java, JUnit, and Selenium WebDriver and is not intended for practical use on a live application.

If you have any questions or need further assistance, please feel free to reach out to the project maintainers.

## Disclaimer
This project and its contents are provided as-is, without any warranty or guarantee of functionality. The maintainers of this project do not take responsibility for its use or any potential issues that may arise from running the tests on a different web application.

Thank you for your interest in this project.