# GovConnect Mini API Demo

This project simulates a government service integration, inspired by the PayIt platform. It demonstrates basic resident record management and payment processing using:

- ✅ Java 17
- ✅ Spring Boot
- ✅ RESTful APIs
- ✅ Spring Data JPA
- ✅ H2 in-memory database

## Features

- `GET /api/renewals`: List all residents with unpaid records
- `POST /api/payment/{id}`: Mark a resident as paid

## How to Run

```bash
./mvnw spring-boot:run
