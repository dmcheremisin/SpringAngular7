# Simple SpringBoot and Angular 7 project with MySql database integration 

There are 2 branches in the project:
- Master branch is made for rapid development of the Spring Boot application. You should make up and running both Spring Boot embeded tomcat and Node server.
- Tomcat branch is made for deployment to the separate tomcat instance.

## Common steps to run the project:
1. import to your database sql script from backend/src/main/sql/dump.sql to MySql
2. change your db connetion settings in the properties file backend/src/main/resources/application.properties
3. build root pom.xml file

## Specific steps for master branch
4. go in a console to the folder frontend and write command "ng serve" - node server will be up on the port 4200
5. run spring boot application the way you like: from IDE, from maven(mvn springboot:run)

## Specific steps for tomcat branch
4. deploy war file from backend module to the separate tomcat instance

## About the project

This project is a simple CRUD application. You can perform different actions with users. 
Each user consists of first name, last name and email.
