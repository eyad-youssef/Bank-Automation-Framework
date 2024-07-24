# Bank Automation Framework

## Overview
This automation framework is designed for testing a bank website, leveraging a combination of Maven, Java, Selenium 4, dynamic and advanced locators, TestNG, Cucumber, Singleton design pattern, and Allure reporting to streamline the testing process.

## Features
- **Maven:** Dependency management and build automation.
- **Java:** Programming language for test script development.
- **Selenium 4:** Automation tool for web application testing.
- **Dynamic and Advanced Locators:** Utilize dynamic locators for robust test scripts.
- **TestNG:** Test framework for organizing and executing test cases.
- **Cucumber:** BDD tool for writing test scenarios in a human-readable format.
- **Singleton Design Pattern:** Ensures a single instance of WebDriver for efficient testing.
- **Allure Report:** Generates interactive and detailed test reports.

## Setup Instructions
1. Clone the repository to your local machine.
2. Ensure you have JDK, Maven, and appropriate browser drivers installed.
3. Update the necessary dependencies in the `pom.xml` file.
4. Configure the bank website URL and any other required settings.
5. Run tests using Maven commands or IDE configurations.

## Usage
### Writing Tests with Selenium
1. Create test classes under the `src/test/java` directory.
2. Utilize Selenium 4 for interacting with web elements.
3. Use dynamic and advanced locators for robust and flexible test scripts.

### Writing Tests with Cucumber (BDD)
1. Define feature files with scenarios in Gherkin syntax under the `src/test/tests` directory.
2. Implement step definitions for each scenario in Java under the `src/test/java` directory.
3. Run Cucumber tests to execute scenarios in a BDD format.

## Screenshots Taking Capability
- Screenshots are automatically captured during test execution for enhanced reporting and debugging.

## Reporting Testing Results with Allure Report
- Allure Report provides detailed and interactive test reports with rich visualization.

## Demonstration: Shifting between Selenium and Cucumber Tests
1. To switch between writing tests using only Selenium:
   - Write test scripts using Selenium 4 in Java classes.
   - Execute tests using TestNG.

2. To shift to writing tests using Cucumber as BDD:
   - Create feature files with scenarios in Gherkin syntax.
   - Implement step definitions in Java to execute scenarios using Cucumber.
   - Be aware of changing annotations for each TestNG and Cucumber in HooksHandler class.

## Test Execution
1. Run tests using Maven: mvn clean test

2. Generate Allure report: allure generate --clean // alure open 

## Contributors
Please feel free to contact me for any modification or enhancement needed.

## License
This project is licensed under the MIT License.
