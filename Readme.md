# Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial

Build Restful CRUD API for a simple Note-Taking application using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

1. Java - 1.8.x or higher

2. Maven - 3.x.x or higher

3. Mysql - 5.x.x or higher

## Steps to Setup

**1. Clone the application**

Original source:
https://github.com/callicoder/spring-boot-mysql-rest-api-tutorial.git

```bash
git clone https://github.com/amoncholiaccenture/frutappbe.git
```
**2. Create Mysql database**
You should download the SQL file from the Team's folder and execute it on SQL Workbench

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ The `spring.datasource.username` and `spring.datasource.password` should be: "username"/"MyNewPassword"

**4. Build and run the app using maven**

```bash
mvn package -DskipTests 
java -jar target/easy-notes-1.0.0.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /u/usuarios
    
    POST /u/usuarios
    
    GET /u/usuario/{email}/{password} -> Returns Boolean
    
    PUT /api/notes/{noteId}
    
    DELETE /api/notes/{noteId}

You can test them using postman or any other rest client.

## Learn more

You can find the tutorial for this application on my blog -

<https://www.callicoder.com/spring-boot-rest-api-tutorial-with-mysql-jpa-hibernate/>
