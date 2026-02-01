# Blog Application

A full-stack blog application built with Spring Boot (Backend) and React (Frontend).

## Prerequisites

- JDK 17 or higher
- Node.js & npm
- Docker Desktop

## Getting Started

### 1. Database Setup

The project uses PostgreSQL. You can start the database using Docker Compose:

```powershell
docker-compose up -d
```

This will start:
- **PostgreSQL**: `localhost:5432`
- **Adminer** (DB Management): `localhost:8888`

### 2. Backend Setup

Navigate to the root directory and run the Spring Boot application:

```powershell
./mvnw spring-boot:run
```

The backend will be available at `http://localhost:8080`.

### 3. Frontend Setup

Navigate to the `Blog-frontend` directory, install dependencies, and start the development server:

```powershell
cd Blog-frontend
npm install
npm run dev
```

The frontend will be available at `http://localhost:5173`.

## Default Credentials

If the application requires login, check the database or the `UserServiceImpl.java` for any seeded users.

## Project Structure

- `src/main/java`: Backend source code (Spring Boot).
- `Blog-frontend`: Frontend source code (React + Vite).
- `docker-compose.yml`: Docker configuration for the database.
