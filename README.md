# Task 2 – Spring Boot REST API (Students)

## Description

This project is a simple Spring Boot REST application created as part of Task 2.  
It demonstrates basic usage of Spring Boot, Spring Data JPA, and RESTful APIs.

The application allows managing students using HTTP requests.

---

## Features

- Create a student
- Retrieve list of students
- JSON-based REST API
- Persistence using Spring Data JPA

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Maven
- Swagger / OpenAPI

---
### Create student

POST /students

Request body (JSON):
```json
  {
    "firstName": "Jahongir",
    "lastName": "Sadulla",
    "email": "jsadull2@stu.vistula.edu.pl"
  }
```

<img width="2529" height="1418" alt="image" src="https://github.com/user-attachments/assets/628ee9f4-9720-4fa5-8426-0d55d0533269" />


### Get Students

GET /student

Response example:
```json
[
  {
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
  }
]
```
<img width="2559" height="1434" alt="image" src="https://github.com/user-attachments/assets/77accb81-5e82-4a5e-8f4c-3313de1649a6" />

## Swagger UI
The API documentation is available via Swagger UI:
http://localhost:8080/swagger-ui.html

---

### How to Run:
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run the Task2Application class
4. Access the API using Swagger UI

