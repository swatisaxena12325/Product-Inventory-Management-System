# Spring Boot CRUD Inventory Management System with MySQL

A RESTful API built with Spring Boot for managing product inventory, demonstrating complete CRUD (Create, Read, Update, Delete) operations with MySQL database integration.

## 📋 Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Project Structure](#project-structure)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- Create, Read, Update, and Delete products
- RESTful API endpoints
- MySQL database integration
- Layered architecture (Controller, Service, Repository, Entity)
- JPA/Hibernate ORM
- Automatic table creation and updates
- Clean and maintainable code structure

## 🛠 Technologies Used

- **Backend Framework:** Spring Boot
- **Language:** Java 17+
- **Database:** MySQL
- **ORM:** Spring Data JPA, Hibernate
- **Build Tool:** Maven
- **IDE:** VS Code with Spring Boot Extension Pack
- **Additional Libraries:** Lombok, Jakarta Persistence

## 📦 Prerequisites

Before running this application, make sure you have the following installed:

- Java Development Kit (JDK) 17 or higher
- MySQL Server (8.0 or higher recommended)
- Maven 3.6+
- VS Code with Spring Boot Extension Pack (or any Java IDE)

## 🚀 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/springboot-crud-mysql.git
   cd springboot-crud-mysql
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

## 🗄 Database Configuration

1. **Create MySQL Database**
   ```sql
   CREATE DATABASE springboot_crud;
   ```

2. **Configure Database Connection**
   
   Update `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/springboot_crud
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   ```

   Replace `your_password` with your MySQL root password.

## ▶️ Running the Application

1. **Using Maven**
   ```bash
   mvn spring-boot:run
   ```

2. **Using Java**
   ```bash
   mvn clean package
   java -jar target/demo-0.0.1-SNAPSHOT.jar
   ```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/products` | Create a new product |
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| PUT | `/api/products` | Update an existing product |
| DELETE | `/api/products/{id}` | Delete product by ID |

## 📁 Project Structure

```
springboot-crud-mysql/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── model/
│   │   │               │   └── Product.java          # Entity Layer
│   │   │               ├── repository/
│   │   │               │   └── ProductRepository.java # Repository Layer
│   │   │               ├── service/
│   │   │               │   └── ProductService.java    # Service Layer
│   │   │               ├── controller/
│   │   │               │   └── ProductController.java # Controller Layer
│   │   │               └── DemoApplication.java       # Main Class
│   │   └── resources/
│   │       └── application.properties                 # Configuration
│   └── test/
├── pom.xml
└── README.md
```

### Layer Description

- **Entity Layer (`model`)**: JPA entities mapped to database tables
- **Repository Layer (`repository`)**: Data access interfaces extending JpaRepository
- **Service Layer (`service`)**: Business logic implementation
- **Controller Layer (`controller`)**: REST API endpoints

## 💡 Usage Examples

### Create Product
```bash
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Laptop",
    "price": 999.99,
    "quantity": 10
  }'
```

### Get All Products
```bash
curl -X GET http://localhost:8080/api/products
```

### Get Product by ID
```bash
curl -X GET http://localhost:8080/api/products/1
```

### Update Product
```bash
curl -X PUT http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{
    "id": 1,
    "name": "Laptop Pro",
    "price": 1299.99,
    "quantity": 15
  }'
```

### Delete Product
```bash
curl -X DELETE http://localhost:8080/api/products/1
```

## 🧪 Testing with Postman

1. Import the API endpoints into Postman
2. Set the base URL to `http://localhost:8080`
3. Test each CRUD operation using the endpoints listed above

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👤 Author

**Swati Saxena**
- LinkedIn: [linkedin.com/in/swati-saxenab2363322b](https://linkedin.com/in/swati-saxenab2363322b)
- GitHub: [@swati-saxena](https://github.com/swati-saxena12325)

## 🙏 Acknowledgments

- Spring Boot Documentation
- Spring Data JPA Guide
- MySQL Documentation

---

⭐ If you found this project helpful, please give it a star!
