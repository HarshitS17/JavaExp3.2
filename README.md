# Hibernate Student CRUD Application

A simple Java application using **Hibernate ORM**, **MySQL**, and **Jakarta Persistence** to perform CRUD operations on a `student` table.

This project demonstrates:

- ✅ Hibernate configuration with XML  
- ✅ Entity mapping (Student class)  
- ✅ Creating, Reading, Updating, and Deleting records  
- ✅ Using SessionFactory + Sessions  
- ✅ MySQL database integration  

---

## 📌 1. Project Structure

src/
└── main/
├── java/
│ └── example/b/
│ ├── Student.java
│ ├── HibernateUtil.java
│ └── StudentCRUD.java
└── resources/
└── hibernate.cfg.xml


---

## 📌 2. Database Setup (MySQL)

Run this SQL:

```sql
CREATE DATABASE school;
USE school;

CREATE TABLE student (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  email VARCHAR(100),
  age INT
);
