Bank Automation Framework 
Overview
This automation framework is designed for testing a bank website, leveraging a combination of Maven, Java, Selenium 4, dynamic and advanced locators, TestNG, Cucumber, Singleton design pattern, and Allure reporting to streamline the testing process.

Features
Maven: Dependency management and build automation.
Java: Programming language for test script development.
Selenium 4: Automation tool for web application testing.
Dynamic and Advanced Locators: Utilize dynamic locators for robust test scripts.
TestNG: Test framework for organizing and executing test cases.
Cucumber: BDD tool for writing test scenarios in a human-readable format.
Singleton Design Pattern: Ensures a single instance of WebDriver for efficient testing.
Allure Report: Generates interactive and detailed test reports.
Setup Instructions
Clone the repository to your local machine.
Ensure you have JDK, Maven, and appropriate browser drivers installed.
Update the necessary dependencies in the pom.xml file.
Configure the bank website URL and any other required settings.
Run tests using Maven commands or IDE configurations.
Usage
Writing Tests with Selenium
Create test classes under the src/test/java directory.
Utilize Selenium 4 for interacting with web elements.
Use dynamic and advanced locators for robust and flexible test scripts.
Writing Tests with Cucumber (BDD)
Define feature files with scenarios in Gherkin syntax under the src/test/tests directory.
Implement step definitions for each scenario in Java under the src/test/java directory.
Run Cucumber tests to execute scenarios in a BDD format.
Screenshots Taking Capability
Screenshots are automatically captured during test execution for enhanced reporting and debugging.
Reporting Testing Results with Allure Report
Allure Report provides detailed and interactive test reports with rich visualization.
Demonstration: Shifting between Selenium and Cucumber Tests
To switch between writing tests using only Selenium:
Write test scripts using Selenium 4 in Java classes.
Execute tests using TestNG.
To shift to writing tests using Cucumber as BDD:
Create feature files with scenarios in Gherkin syntax.
Implement step definitions in Java to execute scenarios using Cucumber. 
In both cases be aware of changing annotaions for each TestNG and Cucumber in HooksHandler class 
Test Execution
Run tests using Maven:
Copy
mvn clean test
Generate Allure report:
Copy
mvn allure:serve
 or you can you use the 2 commands to overwrite the past result and get the newest one using 
 allure generate --clean 
 allure open 
Contributors
Please feel free to contact me for any modifaction or enhancemnt needed 
License
This project is licensed under the MIT License.
