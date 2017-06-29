# SpringIntegrationDemo

## Test task scenario Detail:
There will be a series of files placed into the directory (C:/SITA_TEST_TASK/IN) with a number on each line.
The application to automatically process these files by polling that folder for new files every 5 seconds and Perform following Action:

- If a new file is found, then the application should sum all the numbers in the file and create a new file containing the resulting value in the directory (C:\SITA_TEST_TASK\OUT).

- The output file should have the same name as the input file with .OUTPUT appended to the end of the filename.

- When the input file is successfully processed it should be moved to the following directory (C:\SITA_TEST_TASK\PROCESSED) with .PROCESSED appended to the end of the file name.

- If an error occurs while processing the input file then the input file should be moved into the following directory (C:\SITA_TEST_TASK\ERROR) with .ERROR appended to the end.


## Project Dependencies
* Spring Parent POM used: org.springframework.boot spring-boot-starter-parent [1.5.4.RELEASE]
* spring integration framework org.springframework.boot spring-boot-starter-integration
* org.springframework.boot spring-boot-starter-thymeleaf
* org.springframework.integration spring-integration-file
* junit 4.12


## Maven repository to download dependencies
https://repo.maven.apache.org/maven2/


## Build the application
1. From the command prompt run: mvn clean install

## Note
1. It is assumed that the input files will be placed under C:\SITA_TEST_TASK\IN, however we can configure this value in application.properties which is available at src/main/resources

## Testing the application.
1. Before running the application, place the input files under C:\SITA_TEST_TASK\IN.
2. To run the application deploy the war file SpringIntegrationDemo-0.0.1-SNAPSHOT.war to Tomcat server.
3. Verify the results in C:\SITA_TEST_TASK\OUT, C:\SITA_TEST_TASK\PROCESSED and C:\SITA_TEST_TASK\ERROR.
