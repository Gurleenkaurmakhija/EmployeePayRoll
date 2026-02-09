# Employee Payroll Spring Application

## Overview
This is a Spring Boot REST application developed to manage Employee Payroll data.  
The application exposes REST APIs to perform CRUD operations and is tested using CURL commands.

---

## Features Implemented
- Implemented **DTO** for request data transfer
- Introduced **Service Layer** to handle business logic
- Integrated **MySQL database** using Spring Data JPA
- Added **Validation** for Create and Update REST calls
- Implemented **Global Exception Handling** using `@ControllerAdvice`
- Used **ResponseEntity** to return structured JSON responses
- Supported full **CRUD operations**

---

## Tech Stack
- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven

---

## Project Structure
```text
com.gevernova.employeepayroll
├── controller
│   └── EmployeePayrollController.java
├── dto
│   └── EmployeePayrollDTO.java
├── exception
│   ├── EmployeeNotFoundException.java
│   └── GlobalExceptionHandler.java
├── model
│   └── EmployeePayroll.java
├── repository
│   └── EmployeePayrollRepository.java
├── service
│   ├── EmployeePayrollService.java
│   └── EmployeePayrollServiceImpl.java
└── EmployeePayrollApplication.java

```
----

## How to Run
1. Configure MySQL credentials in `application.properties`
2. Ensure MySQL server is running
3. Run the Spring Boot application
4. Test APIs using CURL or frontend UI

---

## Architecture Overview
- **Controller**: Handles REST requests
- **DTO**: Transfers request data
- **Model**: Represents database entity
- **Service**: Contains business logic
- **Repository**: Handles database operations
- **Exception**: Centralized error handling
