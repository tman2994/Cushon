
Read Me:

please find code in Master branch -> Cushon/src/test/java/

Explanation of code has been commented

The purpose of this code project is to automate the bespoken application for a website and mobile application.
The programming language I’ll be using will be Java a high-level programming language and the library/package tools I’ll be using will be TestNG
a testing maintenance API tool, selenium a web driver API automation tool, and Appium a mobile API automation tool, Appium Inspector API to 
get information on application ids, xpath ect. Android Studio IDE to use the emulator as the connection for Appium to view Appium actions.
SQL server Management Studio to create the mock database for back-end features. 
Maven API for dependency control, Microsoft JDBC API for SQL database manipulation.

The framework will be based on the Page object model, this is to keep with the DRY (Do-not Repeat Yourself) principle.
For code maintenance and team collaboration I’ll be using GitHub. And test scripting I’ll be using Jenkins API.

The projects workspace will be connected to GitHub for version control.
All the connections to the necessary APIs will be for  web drivers(chrome, safari, and Microsoft Edge);
and the connections for popular mobile OS(android and IOS).

The framework folders to store scripts are as the following. A folder will be called utility
where webdriver connections will be stored and custom Logger. A folder called pageActions to store selenium scripts
and another folder called mobileActions to store Appium scripts. A folder called Main that will execute the Main functions for the project.
A folder called Backend where all SQL scripting will happen. A folder will be called results that will store
all images or other testing result files. 

Prerequisites:
npm install npm@latest -g

npm install -g appium@next

appium driver install uiautomator2

appium driver install xcuitest
