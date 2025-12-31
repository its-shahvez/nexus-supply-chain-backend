# 📦 Nexus Supply Chain Management System

> **Project Status:** MVP Developed during Notice Period for architectural demonstration.

## 📖 Overview
**Nexus SCM** is a robust backend solution designed to handle complex B2B inventory tracking and order fulfillment logic. 
While working on legacy inventory systems at **JPR Technosoft**, I identified several bottlenecks in data relationship handling. During my transition period, I architected this solution from scratch using **Clean Architecture principles** to demonstrate a more scalable approach to handling Supplier-Product relationships.

## 🚀 Key Features (Architectural Highlights)
* **Relationship Mapping:** Optimized `One-to-Many` (Supplier-Product) entity mapping using JPA to prevent N+1 query issues.
* **Data Integrity:** Implemented ACID-compliant transactional boundaries for inventory updates.
* **Scalable API Design:** RESTful endpoints compliant with Level 2 Richardson Maturity Model.
* **Separation of Concerns:** Strict layer separation (Controller -> Service -> Repository) to enhance testability.

## 🛠️ Tech Stack
* **Core:** Java 17, Spring Boot 3.x
* **Data:** Spring Data JPA, MySQL 8.0
* **Tools:** Lombok, Maven
* **Validation:** Hibernate Validator

## 🔌 API Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/api/v1/inventory/suppliers` | Onboard a new Supplier vendor |
| `GET` | `/api/v1/inventory/suppliers` | Fetch all active suppliers |
| `POST` | `/api/v1/inventory/products/{supplierId}` | Add product to inventory under specific supplier |
| `GET` | `/api/v1/inventory/products` | Retrieve global inventory status |

## ⚙️ Setup & Installation
1.  **Clone the Repo:**
    ```bash
    git clone [https://github.com/its-shahvez/nexus-supply-chain-backend.git](https://github.com/its-shahvez/nexus-supply-chain-backend.git)
    ```
2.  **Configure Database:**
    * Update `src/main/resources/application.properties` with your MySQL credentials.
    * Ensure database `nexus_inventory` exists.
3.  **Run Application:**
    ```bash
    mvn spring-boot:run
    ```

---
*Developed by Mohd Shahvez as a demonstration of Enterprise Backend capabilities.*
