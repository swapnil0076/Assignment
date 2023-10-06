# Assignment

Brief project description goes here.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Clone the Repository](#clone-the-repository)
  - [Set Up the Database](#set-up-the-database)
  - [Configure Application Properties](#configure-application-properties)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

List any prerequisites here, such as software or tools that need to be installed before proceeding.

- Java
- Spring Boot
- MySQL

## Getting Started

Provide step-by-step instructions for setting up the project on a local development environment.

### Clone the Repository

```bash
git clone https://github.com/your-username/your-project.git
cd your-project
```

### Set Up the Database

1. Install and configure MySQL.

2. Create a MySQL database for the project.

   ```sql
   CREATE DATABASE your_database_name;
   ```

3. Update the database configuration in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
   spring.datasource.username=your_database_username
   spring.datasource.password=your_database_password
   ```

### Configure Application Properties

Review and update other application-specific properties in `src/main/resources/application.properties` as needed.

## Running the Application

Run the Spring Boot application using the following command:

```bash
./mvnw spring-boot:run
```

The application will start on the default port (usually 8080). You can access it at http://localhost:8080.

## API Endpoints

Provide details about the available API endpoints, their usage, and example requests and responses.

### Fetch and Save GitHub Data

- **Endpoint:** `/api/github`
- **Method:** POST
- **Payload:** `{ "url": "https://api.github.com/users/mralexgray/repos" }`
- **Description:** Accepts a GitHub API endpoint in the payload and fetches and saves data from the specified GitHub endpoint.

### Retrieve Saved GitHub Data

- **Endpoint:** `/api/github/{id}`
- **Method:** GET
- **Example:** `/api/github/123`
- **Description:** Retrieves saved GitHub data from the MySQL database based on the provided "id."

## Testing

Explain how to run tests and provide any additional testing-related information.

```bash
./mvnw test
```

## Documentation

Provide links to any additional documentation or resources related to the project.
