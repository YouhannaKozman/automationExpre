# AutomationExpress

## Overview
AutomationExpress is a Java-based automation framework that integrates tools like Selenium, TestNG, and Cucumber for robust testing workflows. It is designed to simplify automated testing of web applications.

## Project Configuration

### Maven Configuration
The `pom.xml` file defines the dependencies required for the project:

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>automationExpress</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>23</maven.compiler.source>
        <maven.compiler.target>23</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!-- Selenium -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.27.0</version>
        </dependency>

        <!-- TestNG -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.2</version>
            <scope>test</scope>
        </dependency>

        <!-- Cucumber -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>7.20.1</version>
        </dependency>

        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.20.1</version>
        </dependency>

        <!-- Extent Reports -->
        <dependency>
            <groupId>tech.grasshopper</groupId>
            <artifactId>extentreports-cucumber7-adapter</artifactId>
            <version>1.14.0</version>
        </dependency>
    </dependencies>
</project>
```

### Features
The framework is designed to handle scenarios defined in Gherkin syntax. Below is an example feature file:

#### Feature: User Login and Order Placement
```gherkin
Feature: User can login and place an order

  @smok
  Scenario: Valid Login and Order Placement
    Given homepage appear user click on Signup Login
    When user enter Email address and password
    And user click on login button
    Given user click on products buttons
    When user search on item and click search button
    And user add the item to cart
    Then user click on view cart button
    Given user can click on proceed to checkout
    When user can place order
    And user fill his card info
    Then user can click confirm order
```

## Getting Started

### Prerequisites
- JDK 23 or later
- Maven 3.8.6 or later

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/org-example/automationExpress.git
   ```
2. Navigate to the project directory:
   ```bash
   cd automationExpress
   ```
3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

### Running Tests
Use the following Maven command to execute tests:
```bash
mvn test
```

## Reporting
This project uses Extent Reports for detailed reporting. Reports are generated after each test run and can be accessed in the `/target` directory.

## Contribution
Contributions are welcome! Please fork the repository and submit a pull request for review.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

---
Happy Testing!
