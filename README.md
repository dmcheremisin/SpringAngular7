# Simple SpringBoot and Angular 7 project with MySql database integration 

Steps to run the project:
1. import to your database sql script from backend/src/main/sql/dump.sql to MySql
2. change your db connetion settings in the properties file backend/src/main/resources/application.properties
3. build root pom.xml file
4. go in a console to the folder frontend and write command "ng serve" - node server will be up on the port 4200
5. run spring boot application the way you like: from IDE, from maven(mvn springboot:run)

About the project

This project is a simple CRUD application. You can perform different actions with users. 
Each user consists of first name, last name and email.
