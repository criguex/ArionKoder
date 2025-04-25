# **TECHNICAL TEST FOR ARIONKODER**

## Introduction 📖
Automation developed to fulfill the technical challenge for ArionKoder.  
This automation is designed to validate the login flow of a web application.

The project is located inside the `sele_guer` directory.

## Prerequisites 📋
- Java 17 and JDK.
- IntelliJ IDEA or Eclipse IDE.
- Maven.
- Cucumber.

## Installation 🛠️🔩
1. Clone the repository or extract the project folder.
2. Import the project into IntelliJ IDEA or Eclipse.
3. Set up the Java JDK and the required environment variables.
4. Configure Maven for dependency management.
5. Install the Cucumber for Java plugin in your IDE.

## Project Execution 🚧⚒️
1. Navigate to the package `sele_guer/src/test/java/runners`.
2. Run the tests using the Runner classes to execute the scenarios defined in the `.feature` files.

## Supported Browsers 🌐
This automation currently supports the following browsers:
- Google Chrome version 123 or higher.

## General Implementation Details 💻
Test scenarios are defined in `.feature` files using Gherkin language.  
These scenarios are linked to methods in the StepDefinitions classes using `@Given`, `@When`, and `@Then` annotations.  
The StepDefinitions classes interact with page classes (`pages`) to perform actions and validations on the user interface.

```bash
📦ArionKoder
┗ 📂sele_guer
   ┣ 📂src
   ┃ ┣ 📂main
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](sele_guer)
   ┃ ┃ ┃   ┣ 📂drivers            # WebDriver configuration and setup (e.g., ChromeDriver)
   ┃ ┃ ┃   ┣ 📂hooks              # Cucumber hooks (e.g., Before/After actions)
   ┃ ┃ ┃   ┣ 📂locators           # Centralized element locators used in pages
   ┃ ┃ ┃   ┣ 📂pages              # Page Object Model classes for each screen/page
   ┃ ┃ ┃   ┣ 📂test_data          # Static data used for test execution
   ┃ ┃ ┃   ┗ 📂utils              # Utility/helper classes for general reusable methods
   ┃ ┃ ┗ 📂resources              # Resources (if needed for runtime configs, e.g., properties)
   ┃ ┣ 📂test
   ┃ ┃ ┣ 📂java
   ┃ ┃ ┃ ┗ 📦[package](sele_guer)
   ┃ ┃ ┃   ┣ 📂runners            # Test runner classes to trigger feature execution
   ┃ ┃ ┃   ┗ 📂stepdefinitions    # Step definitions matching .feature steps with Java code
   ┃ ┃ ┗ 📂resources
   ┃ ┃   ┗ 📂Features            # .feature files defining scenarios in Gherkin syntax
   ┃ ┃       ┣ 📜FlowShoppingCart.feature # Test for shopping cart workflow
   ┃ ┃       ┣ 📜Login.feature             # Login functionality test scenarios
   ┃ ┃       ┗ 📜Register.feature          # Register functionality test scenarios
   ┣ 📂target                     # Maven build output (compiled classes, reports, etc.)
   ┣ 📜.gitignore                # Git ignored files configuration
   ┣ 📜pom.xml                  # Maven project descriptor (dependencies and plugins)
   ┗ 📜README.md                # Project documentation

```

## Manual escenarios 🛠️💻
Scenarios created for manual testing on the ShopSmart website.   
 [MANUAL TEST CASES](https://docs.google.com/spreadsheets/d/1nYUdLsUCL9tgzyinOmcp3_ymjVuv-l22/edit?usp=sharing&ouid=108580779617386278152&rtpof=true&sd=true)
## Recommendations 🛠️
Project Structure: Keep a clear and modular package structure. Ensure each package has a specific responsibility:

pages: To map UI elements.

stepdefinitions: To define scenario steps.

hooks: For setup or teardown configuration.

test_data: To store reusable test data.

utils: For shared/common functionalities.

Class and Method Naming: Use descriptive and consistent names to improve code readability.

Dependency Management: Keep your pom.xml up to date with the latest versions of used dependencies.

Browser Compatibility: Ensure your tests are compatible with the latest versions of supported browsers.

Documentation: Keep the README.md file updated with clear instructions for installation, setup, and execution.

Version Control: Use branches for new features or fixes and always perform code reviews before merging.

## Author ✒️👨🏻‍💻
## ©️ Cristian Guerra Gómez – Project Creator – criguex@gmail.com




