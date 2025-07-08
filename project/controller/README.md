# Product Catalog Project 🛍️

A **Spring Boot REST API** project demonstrating **CRUD operations, search, filtering, DTOs, and basic Spring Security** using a Product Catalog system.

---

## 🚀 Features

✅ Add, update, delete, and retrieve products  
✅ Search products by name  
✅ Category-based filtering  
✅ DTO implementation for clean API responses  
✅ Basic Spring Security for endpoints  
✅ Structured layered architecture (Controller, Service, Repository)

---

## 🛠️ Technologies Used

- **Java 21**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Security**
- **MySQL** (or H2 for testing)
- **Maven**
- **Postman** for API testing

---

## 📌 Endpoints

| Method | Endpoint                  | Description              |
|--------|---------------------------|--------------------------|
| POST   | `/products`               | Create a new product     |
| GET    | `/products`               | Get all products         |
| GET    | `/products/{id}`          | Get product by ID        |
| PUT    | `/products/{id}`          | Update product by ID     |
| DELETE | `/products/{id}`          | Delete product by ID     |
| GET    | `/products/search?name=`  | Search products by name |
| GET    | `/products/category/{id}` | Get products by category |

---

## 🖥️ How to Run Locally

1️⃣ Clone the repository:
```bash
git clone https://github.com/manichandra31/Product-Catalog-Project.git
