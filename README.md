# Employee CRUD Application - Spring Boot

This project is a **Spring Boot REST API** that performs **CRUD (Create, Read, Update, Delete)** operations on Employee data.  
It is tested using **Postman** for API requests.

---

## 🚀 Features
- Add a new employee  
- Get all employees  
- Get employee by ID  
- Update employee details  
- Delete employee  

---

## 🛠️ Tech Stack
- **Java 17+**  
- **Spring Boot** (Web, JPA, Hibernate)  
- **MySQL** (Database)  
- **Maven** (Build tool)  
- **Postman** (API testing)

---
## ⚙️ Setup & Installation

### 1. Clone the repository

👉 git clone https://github.com/Krishna9741/springboot-employee-crud.git

2. Configure Database

Update the application.properties file with your MySQL details:

spring.datasource.url=jdbc:mysql://localhost:3306/schemaName
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3. Run the application
mvn spring-boot:run

* Project Structure
src/
 └── main/
     ├── java/com/example/employee
     │   ├── controller/   # REST Controllers
     │   ├── model/        # Entity classes
     │   ├── repository/   # JPA Repositories
     │   └── service/      # Service layer
     └── resources/
         ├── application.properties
