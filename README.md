# Mobiquity_RestApi-Testing

# Developed a simple framework which should support to develop automation test scripts for API services in Java.

Tools / libraries used :

Java
Rest Assured
JUnit
Maven

# Steps to start :
Clone / Download the project into your local
Open the Command prompt and navigat to project location
Execute the following Maven command's
mvn clean :- To clean the maven repo
mvn install :- To install the maven requirments
mvn test :- To execute the test scenarios

# To See Report
install allure from here https://docs.qameta.io/allure/#_installing_a_commandline
When the test execution finished, enter the command below inside the project in order to see Allure Results with Request-Response Attachments:

allure serve target/allure-reports/
