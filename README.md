# 🩸 Blood Bank Management System

A cloud-enabled **Blood Bank Management System** developed using **Spring Boot** and deployed on **Microsoft Azure** using **Docker** and **Azure DevOps**. This project demonstrates an end-to-end DevOps workflow, from source code management to cloud deployment.

---

## 🚀 Features

- Donor Management
- Blood Inventory Management
- Blood Request Management
- User-Friendly Web Interface
- Spring Boot MVC Architecture
- Cloud Deployment on Microsoft Azure

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- Docker
- Git & GitHub
- Azure DevOps
- Azure Container Registry (ACR)
- Azure Container Instances (ACI)
- H2 Database (Demo Deployment)

---

## 📂 Project Structure

```
BloodBankManagementSystem
│── src/
│── Dockerfile
│── pom.xml
│── azure-pipelines.yml
│── README.md
```

---

## ⚙️ Build the Project

```bash
mvn clean package
```

---

## 🐳 Docker Commands

Build Docker Image

```bash
docker build -t bloodbank-app .
```

Run Docker Container

```bash
docker run -p 8088:8088 bloodbank-app
```

---

## ☁️ Azure Deployment Workflow

```
GitHub
   │
   ▼
Azure DevOps Pipeline
   │
   ▼
Maven Build
   │
   ▼
Docker Image
   │
   ▼
Azure Container Registry (ACR)
   │
   ▼
Azure Container Instance (ACI)
```

---

## 🎯 Learning Outcomes

- Spring Boot Application Development
- Docker Containerization
- Azure DevOps CI Pipeline
- Azure Container Registry (ACR)
- Azure Container Instances (ACI)
- Git & GitHub Version Control
- Cloud Deployment
- DevOps Best Practices

---

## 👩‍💻 Author

**Asha M**

GitHub: https://github.com/Asha1986-ui

LinkedIn: https://www.linkedin.com/in/asha-m-96821836b

---

## 📌 Future Enhancements

- Deploy using Azure Kubernetes Service (AKS)
- Configure Continuous Deployment (CD)
- Integrate Azure Database for MySQL
- Add User Authentication & Authorization
- Enable Azure Monitor for Application Monitoring

---

## 📄 License

This project is developed for educational and learning purposes.
