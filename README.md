# Simple SpringBoot and Angular 7 project with MySql database integration 

By default application port is 8082, so it is running on the address http://localhost:8082.

There are 2 branches in the project:
- Tomcat branch is made for deployment to the separate tomcat instance.
- Master branch is made for rapid development of the Spring Boot application. 

There are two options for master branch:
- First option - you can just run spring boot jar file. Then you will have to rebuild your angular frontend module to see any changes 
and pack all the changes to the spring boot jar.
- Second option - rapid development. You can run both Spring Boot embeded tomcat and Node server. This way is better for development 
because every time you change something in agular frontend module - node server will automatically update changes immediately. 

## Common steps to run the project:
1. import to your database sql script from backend/src/main/sql/dump.sql to MySql
2. change your db connetion settings in the properties file backend/src/main/resources/application.properties
3. build root pom.xml file

## Tomcat branch
4. deploy war file from backend module to the separate tomcat instance folder deploy

## Master branch

### First option - run project on the embeded tomcat of Spring Boot
4. Simply run spring boot application the way you like: from IDE or from maven

### Second option - run project on separate servers: embeded tomcat of Spring Boot and Node.
4. go in a console to the folder frontend and write command "npm start" - node server will be up on the port 4200
5. run spring boot application the way you like: from IDE, from maven

## About the project

This project is a simple CRUD application. You can perform different actions with users. 
Each user consists of first name, last name and email.
