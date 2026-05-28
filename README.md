# Spring Boot Microservices Quiz System

A backend-based Quiz Application built using Spring Boot Microservices Architecture.

This project demonstrates how multiple microservices communicate with each other using Spring Cloud OpenFeign, Netflix Eureka Service Registry, and API Gateway.

---

## 🚀 Features

- Create and manage quiz questions
- Generate quizzes dynamically
- Inter-service communication using OpenFeign
- Service Discovery using Eureka Server
- API Gateway for centralized routing
- Load balancing between services
- RESTful APIs
- MySQL database integration
- Scalable microservices architecture

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Microservices & Cloud
- Spring Cloud OpenFeign
- Netflix Eureka Server
- Spring Cloud Gateway
- Load Balancer

### Database
- MySQL

### Tools
- Maven
- Postman
- Git & GitHub

---

## 📂 Microservices Structure

### 1. Question Service
Handles:
- Add questions
- Fetch questions
- Store question data

### 2. Quiz Service
Handles:
- Create quiz
- Fetch quiz questions
- Calculate score
- Communicates with Question Service using OpenFeign

### 3. Service Registry (Eureka Server)
Handles:
- Service discovery
- Service registration

### 4. API Gateway
Handles:
- Centralized routing
- Single entry point for all APIs
- Load balancing

---

## 🔄 Microservices Communication Flow

Client → API Gateway → Quiz Service → Question Service

- API Gateway routes requests
- Eureka Server manages service discovery
- OpenFeign enables communication between services

---

## ⚙️ Setup & Run

### Clone Repository

```bash
git clone https://github.com/Divyanshu-Chaudhary/springboot-microservices-quiz-system.git
```

### Run Services in Order

1. Start Eureka Server
2. Start Question Service
3. Start Quiz Service
4. Start API Gateway

---

## 📌 API Endpoints

### Question Service

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /question  | Add Question |
| GET | /question   | Get All Questions |

### Quiz Service

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /quiz      | Create Quiz |
| GET | /quiz/{id}  | Get Quiz    |

---

## 🧠 Concepts Implemented

- Microservices Architecture
- Service Discovery
- API Gateway Pattern
- Client-side Load Balancing
- REST APIs
- Inter-service Communication
- Distributed System Basics

---


## 👨‍💻 Author

Divyanshu

GitHub:
https://github.com/Divyanshu-Chaudhary
