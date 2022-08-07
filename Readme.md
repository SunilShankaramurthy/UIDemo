
## Table of Content
- [Description](#description)
- [Architecture](#architecture)
- [PreRequisite](#prerequisite)
- [Run-Command](#run-command)
- [Report](#report)

## Description
   This project contains BDD automation with TestNG-Cucumber framework written in Java selenium using Page Object Model. This is a ready to use framework 
built to achieve  parallel run and failed scenarios run. Users can add cucumber feature files and stepdefs directly.
## Architecture
    This is a Maven project developed using Java Selenium and TestNG.
- Maven take cares of dependency jars and plugins.
- TestNG Provides parallel run option.
- Selenium provides API's for WebEelements
- Cucumber provides BDD approach
  
## PreRequisite
  Java 8
  chromedriver (version should be same as the system browser)
  geekodriver(Firefox driver)( version should be same as the system browser)
  
## Run-Command
  1. To run the Test in headless mode<br/>
      mvn clean install -DBrowser=chrome -Dheadless=true -Dtestng.dtd.http=true <br/>
      
  2.  To run the test in head mode<br/>
      mvn clean install -DBrowser=chrome -Dheadless=false -Dtestng.dtd.http=true<br/>
      
      ** threadCount is used for parallel running. And we have to set this count in TestNG.xml file. As of now ThreadCount=3.
      ** As of now this code will run only on Chrome.
      
## Report
   The framework will generate 4 types of test reports with screenshot and error details of failed scenarios.<br/>
   1.  ExtentReport <br/>
      Path :project.dir/reports/ExtentReportResult.html<br/>
      <br/>
      
      **The below reports provide screenshot with error details for the failed scenarios.
      
   2. Cucumber Report : This report provide screenshot with error details for the failed scenarios<br/>
      path : project.dir/reports/cucumber-reports.html
