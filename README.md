# Expense Tracker REST API

A REST API built with Spring Boot and MySQL to track personal expenses by category.

## Tech Stack
- Java 17
- Spring Boot 4.0.7
- Spring Data JPA + Hibernate
- MySQL
- Maven
- Tested with Postman

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/expenses | Get all expenses |
| POST | /api/expenses | Add a new expense |
| DELETE | /api/expenses/{id} | Delete an expense |
| GET | /api/expenses/total/{category} | Get total spending by category |

## How to Run
1. Clone the repo
2. Create a MySQL database called `expensedb`
3. Update `application.properties` with your MySQL password
4. Run `mvn spring-boot:run`
5. API runs on http://localhost:8080

## Sample Request
POST /api/expenses
```json
{
    "amount": 500,
    "category": "food",
    "description": "lunch",
    "date": "2026-07-08"
}
```
