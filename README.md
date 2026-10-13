Vtiger CRM Automation Testing Framework

 1. Project Overview

This project is a web application test automation framework developed using **Java, Selenium WebDriver, TestNG and the Page Object Model (POM)

The framework is designed to automate test scenarios for the Vtiger CRM application. It uses reusable utility classes, page classes, test scripts, external test data files, and TestNG XML suites to organize and execute automated tests.

The project demonstrates the implementation of a structured Selenium automation framework for practising web application testing.

 2. Technologies Used

| Technology | Purpose |
| Java | Programming language for writing automation scripts |
| Selenium WebDriver | Automates browser interactions |
| TestNG | Test execution, grouping, and suite management |
| Maven | Dependency management and project build configuration |
| Page Object Model (POM) | Separates page-related actions and locators from test scripts |
| Apache POI (if configured) | Reads test data from Excel files |
| Properties files | Stores application configuration and test data |
| Extent Reports (if configured) | Generates execution reports |
| Eclipse IDE | Development environment |
| ChromeDriver or another configured driver | Enables Selenium to control the browser |

3. Application Under Test

Application:Vtiger CRM

The automation framework interacts with the Vtiger CRM web application to test configured application workflows, such as login, navigation, contacts, and leads.

 Vtiger CRM is a separate application. Cloning this GitHub repository does not install or start the CRM application. You must have access to a compatible Vtiger CRM instance before executing the tests.

Use a test instance and valid test credentials. The application URL, login process, locators, and test data must match the Vtiger CRM version being used.

4. Project Features

- Browser automation using Selenium WebDriver.
- Page Object Model (POM) implementation.
- Reusable utility classes for common automation operations.
- TestNG-based test execution.
- Excel-based test data management.
- Properties-file-based configuration.
- Test scripts organized into separate Java classes.
- TestNG XML configuration for batch execution.
- Parallel execution configuration.
- Smoke testing and regression testing suite organization.
- Listener support for test execution events.
- Extent report and screenshot support, where configured.

5. Project Structure

The following structure is based on the Eclipse project shown in this repository.


com.edu.methods/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── genericUtility/
│   │   │   │   ├── BaseClass.java
│   │   │   │   ├── ExcelUtility.java
│   │   │   │   ├── IPathUtility.java
│   │   │   │   ├── JavaUtility.java
│   │   │   │   ├── Listeners.java
│   │   │   │   ├── ListenersImplementation.java
│   │   │   │   ├── PropertiesUtility.java
│   │   │   │   └── SeleniumUtility.java
│   │   │   │
│   │   │   └── objectRepo/
│   │   │       ├── LoginPage.java
│   │   │       ├── HomePage.java
│   │   │       ├── ContactsPage.java
│   │   │       ├── CreateNewContactsPage.java
│   │   │       ├── LeadsPage.java
│   │   │       └── CreatingNewLeadPage.java
│   │   │
│   │   └── resources/
│   │
│   └── test/
│       ├── java/
│       │   ├── practice/
│       │   ├── practice2/
│       │   ├── section1/
│       │   ├── Section2/
│       │   └── testCaseRepo/
│       │       ├── TC_001.java
│       │       ├── TC_002.java
│       │       ├── TC_003.java
│       │       ├── TC_004.java
│       │       ├── TC_005.java
│       │       └── TC_006.java
│       │
│       └── resources/
│           └── TestData/
│               ├── VTiger_TestData.properties
│               └── VTiger_TestData.xlsx
│
├── Extent_Reports/
├── Screenshot/
├── target/
├── test-output/
├── pom.xml
├── testing_BatchExecution.xml
├── testing_ParallelExecution.xml
├── testing_Regression_GroupExecution.xml
└── testing_Smoke_GroupExecution.xml

6. Explanation of Important Components

### genericUtility

This package contains reusable classes that help reduce code duplication.

- **BaseClass.java:** Common test setup and teardown functionality, if implemented.
- **ExcelUtility.java:** Utility methods for reading or writing Excel test data, if implemented.
- **IPathUtility.java:** Centralized paths or configuration constants, as defined in the code.
- **JavaUtility.java:** Common Java helper methods.
- **Listeners.java:** Listener interface or listener-related definitions, as implemented.
- **ListenersImplementation.java:** Listener implementation for test execution events.
- **PropertiesUtility.java:** Methods for loading and accessing properties-file values.
- **SeleniumUtility.java:** Reusable Selenium operations, such as waits or common browser interactions, as implemented.

### objectRepo

This package contains page classes following the Page Object Model design pattern.

- **LoginPage.java:** Login-page elements and operations.
- **HomePage.java:** Home-page elements and operations.
- **ContactsPage.java:** Contacts-page elements and operations.
- **CreateNewContactsPage.java:** Operations for creating contacts.
- **LeadsPage.java:** Leads-page elements and operations.
- **CreatingNewLeadPage.java:** Operations for creating leads.

Page classes help keep page-specific locators and actions separate from the test scripts.

### testCaseRepo

This package contains the automation test classes:

- `TC_001.java`
- `TC_002.java`
- `TC_003.java`
- `TC_004.java`
- `TC_005.java`
- `TC_006.java`

Each class contains the test scenarios implemented in its source code. Refer to the individual classes to identify their exact test steps, preconditions, and assertions.

### TestData

The `src/test/resources/TestData/` directory contains:

- **VTiger_TestData.properties:** Stores configuration or test data values used by the framework.
- **VTiger_TestData.xlsx:** Stores spreadsheet-based test data, where referenced by the automation code.

### TestNG XML Files

The project includes the following suite configuration files:

- `testing_BatchExecution.xml`
- `testing_ParallelExecution.xml`
- `testing_Regression_GroupExecution.xml`
- `testing_Smoke_GroupExecution.xml`

These files define which test classes or methods execute in each suite. The actual test selection depends on their XML configuration.

## 7. Prerequisites

Install or configure the following before running the project:

1. **Java JDK:** Install a JDK compatible with the project's Java compiler settings.
2. **Eclipse IDE:** Use Eclipse with Java and Maven project support.
3. **Git:** Required to clone the repository.
4. **Maven:** Required to resolve dependencies and build the project. Eclipse may provide Maven integration.
5. **Web browser:** Install a supported browser, such as Google Chrome.
6. **Vtiger CRM access:** Have a working Vtiger CRM instance and valid test account.
7. **Browser driver compatibility:** Ensure the Selenium and browser-driver setup is compatible with the installed browser.


## 8. Clone the GitHub Repository

Open Command Prompt, PowerShell, or a terminal and run:


git clone YOUR_GITHUB_REPOSITORY_URL

Replace `YOUR_GITHUB_REPOSITORY_URL` with the HTTPS or SSH URL of this repository.

Navigate to the downloaded project folder:

cd YOUR_PROJECT_FOLDER


Confirm that `pom.xml` exists in the project root.

## 9. Import the Project into Eclipse IDE

1. Open Eclipse IDE.
2. Select **File → Import**.
3. Expand **Maven**.
4. Select **Existing Maven Projects**.
5. Click **Next**.
6. Browse to the cloned project directory.
7. Select the directory containing `pom.xml`.
8. Ensure the project is selected.
9. Click **Finish**.
10. Wait for Eclipse to finish importing the project and resolving dependencies.

If the project is not configured as a Maven project, verify the repository contents and import method before proceeding.

## 10. Configure Java and Maven

### Configure the JDK

1. In Eclipse, open **Window → Preferences → Java → Installed JREs**.
2. Confirm that a compatible JDK is configured.
3. Open the project properties.
4. Check **Java Build Path** and **Java Compiler**.
5. Ensure the configured Java version matches the project's `pom.xml`.

### Resolve Maven Dependencies

1. Right-click the project.
2. Select **Maven → Update Project**.
3. Select the project.
4. Enable **Force Update of Snapshots/Releases** if required to refresh dependencies.
5. Click **OK**.
6. Wait for dependency resolution to finish.

If dependencies fail to resolve, check your internet connection, Maven configuration, and dependency versions in `pom.xml`.

## 11. Configure the Vtiger CRM Application

Before executing any tests, make sure the automation framework points to the correct application.

1. Open `VTiger_TestData.properties`.
2. Identify the property used for the application URL.
3. Update it with the URL of your accessible Vtiger CRM instance.
4. Update the required username and password using the property names expected by the code.
5. Open `VTiger_TestData.xlsx` and review the test data used by the scripts.
6. Confirm that the test data matches the application and the expected workflow.

The actual property keys and Excel column names depend on the implementation in this repository. Do not create new property names without checking how the Java classes read them.



## 12. Browser and WebDriver Configuration

Check `SeleniumUtility.java`, `BaseClass.java`, and `pom.xml` to determine how the browser is initialized.

Depending on the implementation, the project may use Selenium Manager, a configured browser driver, or an explicit driver path.

Before running the tests:

- Confirm that the browser is installed.
- Confirm that the Selenium version supports your browser.
- Check any hard-coded driver paths.
- Verify that browser initialization and teardown are configured correctly.
- Ensure the application is reachable from your machine.

Do not add a new driver setup unless the existing framework requires it.

## 13. Run Individual Test Cases

To run a single automation test:

1. In Eclipse, expand `src/test/java`.
2. Expand `testCaseRepo`.
3. Open the required Java test class, for example `TC_001.java`.
4. Right-click the class in Project Explorer.
5. Select **Run As → TestNG Test**.
6. Wait for the browser automation to finish.
7. Review the TestNG execution results.

Repeat these steps for other test classes as required.

The exact scenario executed by each class depends on its implementation.

## 14. Run the TestNG XML Suites

You can execute the test suites using the XML files provided in the project.

### Batch Execution

1. Right-click `testing_BatchExecution.xml`.
2. Select **Run As → TestNG Suite**.

### Parallel Execution

1. Right-click `testing_ParallelExecution.xml`.
2. Select **Run As → TestNG Suite**.

Parallel execution may open multiple browser sessions or execute tests concurrently, depending on the XML configuration and framework implementation. Ensure that the tests do not interfere with shared accounts or test data.

### Regression Execution

1. Right-click `testing_Regression_GroupExecution.xml`.
2. Select **Run As → TestNG Suite**.

### Smoke Execution

1. Right-click `testing_Smoke_GroupExecution.xml`.
2. Select **Run As → TestNG Suite**.

If Eclipse does not show **TestNG Suite**, confirm that TestNG is available in the project and that the XML file is a valid TestNG suite.

## 15. Run Tests Using Maven (Optional)

Maven command-line execution depends on the plugins and configuration in `pom.xml`.

To compile and test the project using its configured Maven lifecycle, run:

```bash
mvn clean test
```

This command does not necessarily execute every XML suite. It runs the tests selected by the Maven configuration and any configured test provider.

To run a particular TestNG XML suite through Maven, the project must be configured to pass that suite to the TestNG Maven plugin or the relevant test provider. Check `pom.xml` before using a suite-specific command.

## 16. Test Execution Results and Reports

After executing the tests, review the following locations:

- **Eclipse TestNG Results:** Shows passed, failed, and skipped tests.
- **test-output/:** May contain TestNG-generated result files.
- **Extent_Reports/:** Intended for Extent Reports output, if configured.
- **Screenshot/:** Intended for screenshots captured during test execution, if configured.

Report and screenshot files are generated only when the corresponding functionality is implemented and executed successfully.

If a test fails, review the exception, stack trace, browser state, application URL, test data, and locator definitions to identify the cause.

## 17. Common Issues and Troubleshooting

### Issue 1: Maven Dependencies Are Missing

**Possible solution:**

- Right-click the project.
- Select **Maven → Update Project**.
- Verify dependency versions in `pom.xml`.
- Check your internet connection and Maven configuration.

### Issue 2: Java Compilation Errors

**Possible solution:**

- Verify the JDK and Java compiler versions.
- Check whether the project uses Java 8 or another configured version.
- Resolve missing imports and dependency errors.
- Review the Eclipse Problems tab.

### Issue 3: Browser Does Not Launch

**Possible solution:**

- Check the browser installation.
- Verify Selenium and browser compatibility.
- Review driver initialization in the framework.
- Check whether the browser driver path is configured correctly.

### Issue 4: Login Fails

**Possible solution:**

- Verify the application URL.
- Confirm that the Vtiger CRM instance is accessible.
- Check the test account credentials.
- Review the login page locators and application version.

### Issue 5: Element Not Found

**Possible solution:**

- Check whether the application page has loaded.
- Verify the locator in the relevant page class.
- Check whether the element is inside a frame or another browser context.
- Review wait conditions and dynamic page behavior.

### Issue 6: Excel or Properties File Cannot Be Read

**Possible solution:**

- Confirm that the files exist in `src/test/resources/TestData/`.
- Check the paths used by the utility classes.
- Verify Excel column names, sheet names, and property keys.
- Confirm that the required file-reading dependencies are configured.

### Issue 7: Parallel Tests Fail

**Possible solution:**

- Review the parallel settings in the TestNG XML file.
- Check whether each test uses an independent browser instance.
- Avoid conflicting updates to the same CRM records.
- Review shared test data and account limitations.

## 18. Learning Outcomes

This project provides practical exposure to:

- Java-based web automation testing.
- Selenium WebDriver browser interactions.
- Page Object Model implementation.
- TestNG test execution and suite management.
- Reusable automation utilities.
- Excel and properties-file-based test data handling.
- Batch, parallel, smoke, and regression suite organization.
- Debugging test failures and reviewing execution results.

## 19. Limitations and Notes

- The Vtiger CRM application must be available separately.
- Test execution depends on valid application access, compatible browser configuration, and correct test data.
- Actual test coverage depends on the scenarios implemented in the Java test classes.
- Parallel execution depends on the TestNG XML configuration and the framework's thread-safety.
- Reporting and screenshot generation depend on the relevant code being configured correctly.


