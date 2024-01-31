# Customer Management API Documentation

This document outlines the endpoints and functionalities provided by the Customer Management API.

## Endpoints
## Authentication Endpoint

### Authenticate User

- **HTTP Method:** POST
- **Endpoint:** /authenticate
- **Description:** Authenticates a user and generates a JWT token for further authorization.
- **Request Body:** JSON object containing user credentials (username and password).
  ```json
  {
    "username": "example_user",
    "password": "example_password"
  }
  - **Already created user:** User I have created already to get JWT Authentication tocken
  ```using that any user can access the endpoints  of the application
  {
    "username": "user1",
    "password": "12345"
  }


### Create Customer

- **HTTP Method:** POST
- **Endpoint:** /customer
- **Description:** Creates a new customer.
- **Request Body:** JSON object representing the customer details.
- **Response:** String indicating the result of the operation.

### Get All Customers

- **HTTP Method:** GET
- **Endpoint:** /customer
- **Description:** Retrieves a list of all customers.
- **Response:** JSON array containing customer objects.

### Update Customer

- **HTTP Method:** PUT
- **Endpoint:** /update/customer
- **Description:** Updates an existing customer.
- **Request Body:** JSON object representing the updated customer details.
- **Response:** String indicating the result of the operation.

### Get Customer by ID

- **HTTP Method:** GET
- **Endpoint:** /customer/id/{id}
- **Description:** Retrieves a single customer based on the provided ID.
- **Path Variable:** ID of the customer to retrieve.
- **Response:** JSON object representing the customer.

### Delete Customer by ID

- **HTTP Method:** DELETE
- **Endpoint:** /customer/id/{id}
- **Description:** Deletes a customer based on the provided ID.
- **Path Variable:** ID of the customer to delete.
- **Response:** String indicating the result of the operation.

## Usage

1. **Create Customer:**
   - Send a POST request to `/customer` with a JSON body containing customer details.

2. **Get All Customers:**
   - Send a GET request to `/customer` to retrieve a list of all customers.

3. **Update Customer:**
   - Send a PUT request to `/update/customer` with a JSON body containing updated customer details.

4. **Get Customer by ID:**
   - Send a GET request to `/customer/id/{id}` to retrieve a specific customer by ID.

5. **Delete Customer by ID:**
   - Send a DELETE request to `/customer/id/{id}` to delete a specific customer by ID.

## Requirements

- Java Development Kit (JDK)
- Maven

## Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Run `mvn spring-boot:run` to start the application.
4. The application will be accessible at `http://localhost:8080`.

Feel free to explore and utilize the provided endpoints as needed.
