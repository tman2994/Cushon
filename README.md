# Cushon
Interview Task
Read Me:

This is purpose of explain framework decision made for interview purpose, explanation of code has been carefully commented

The purpose of this code is to automate the bespoken application for a website and mobile application.
The programming language I’ll be using will be Java a high-level programming language and the library tools I’ll be using will be TestNG
a testing maintenance tool, selenium a web driver API automation tool, and Appium a mobile API automation tool,
Maven API for dependency control, Microsoft JDBC API for SQL database manipulation.


The framework will be based on the Page object model, this is to keep with the DRY (Do-not Repeat Yourself) principle.
For code maintenance and team collaboration I’ll be using GitHub. And test scripting I’ll be using Jenkins API.


First, I will connect my new project workspace to GitHub for version control.
I’ll then connect to the necessary APIs, I’ll create the connection for popular web drivers, chrome, safari, and Microsoft Edge;
and the connections for popular mobile OS android and IOS.


Next, I will create the framework folders to store my future scripts. The folders will be called utility,
where webdriver connections will be stored. Then I will create a folder called pageActions to store my selenium scripts
and another folder called mobileActions to store my Appium scripts. And another folder called Main where I’ll execute the page
module functions that I created.
A folder called Backend where ill execute all SQL server code and finally a folder will be called results that will store
an image outcome of every test.

Prerequisites:
npm install npm@latest -g

npm install -g appium@next
appium driver install uiautomator2
appium driver install xcuitest
