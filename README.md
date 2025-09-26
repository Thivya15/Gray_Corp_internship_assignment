# 🎓 Student Management System (Spring Boot + MongoDB)

A simple **Student Management REST API** built using **Spring Boot** with **MongoDB** for data storage.  
This project is designed as a backend developer internship/associate task and demonstrates REST API development, service-layer architecture, exception handling, and Docker containerization.

---

## 🚀 Features
- Manage Students (Create, Read, Update, Delete)
- Manage Courses (Create, Read, Update, Delete)
- RESTful API best practices
- Centralized Exception Handling
- Layered architecture: **Controller → Service → Repository -> Entity**
- Dockerized for easy deployment
- Ready for Postman/Swagger API documentation

---

## 🛠️ Tech Stack
- **Java 17**
- **Spring Boot 3.5.6**
- **MongoDB**
- **Lombok**
- **Docker & Docker Compose**

---

## 📂 Project Structure

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository
```bash
git clone https://github.com/Thivya15/student-management-system.git
cd student-management-system
```
### application.properties
spring.data.mongodb.uri=mongodb://127.0.0.1:27017/student_db
server.port=8080

### Build and Run The Application
mvn clean install
mvn spring-boot:run

### Run with Docker
docker build -t student-management-app .
docker-compose up -d
docker ps






