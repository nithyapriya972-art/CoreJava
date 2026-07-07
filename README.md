# Customer Management System

A simple Spring Boot CRUD application developed using **Java**, **Spring Boot**, **Spring Data JPA**, **PostgreSQL**, **Maven**, and **Postman**. This project demonstrates how to perform Create, Read, Update, and Delete (CRUD) operations using REST APIs.

---

## Features

- Create a new customer
- View all customers
- Update customer details
- Delete a customer by ID
- PostgreSQL database integration
- RESTful API implementation

---

## Technologies Used

- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Postman
- Eclipse Spring Tools Suite (STS)

---

## Project Structure

```
CustomerManagement
│
├── controller
│     CustomerController.java
│
├── entity
│     Customer.java
│
├── repository
│     CustomerRepo.java
│
├── service
│     CustomerService.java
│
└── CustomerManagementApplication.java
```

---

## Customer Entity

```java
class Customer {
    private int id;
    private String name;
    private long phonenumber;
    private String designation;
}
```

---

## REST API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/savecustomer` | Create a new customer |
| GET | `/getcustomer` | Retrieve all customers |
| PUT | `/updatecustomer/{id}` | Update customer details |
| DELETE | `/deletecustomer/{id}` | Delete customer by ID |

---

## Database Configuration

- Database: PostgreSQL
- ORM: Spring Data JPA (Hibernate)

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/customermanagement
spring.datasource.username=postgres
spring.datasource.password=your_password
```

---

## Tools Used

- Spring Tools Suite (STS)
- PostgreSQL
- pgAdmin
- Postman
- Git & GitHub

---

## Learning Outcomes

- Developed a RESTful CRUD application using Spring Boot.
- Connected Spring Boot with PostgreSQL using Spring Data JPA.
- Implemented layered architecture (Controller, Service, Repository, Entity).
- Tested REST APIs using Postman.
- Performed database operations without writing SQL queries using `CrudRepository`.

---

## Author

**Nithya Priya R**
