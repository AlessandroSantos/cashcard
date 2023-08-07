# Spring Boot

## MODULE 1

### Creating RESTful Endpoints

- Spring and Spring Boot

- Spring Initializr

- API Contracts & JSON

- Testing First

- Implementing GET

  - REST

    - Representation State Transfer
    - Data Objects are called Resource Representations
    - Manage the state of these Resources.
    - HTTP:
      - Request
        - Method (also called Verb)
        - URI (also called Endpoint)
        - Body
      - Response
        - Status Code
        - Body
    - CRUD x HTTP:

      - CREATE - POST
      - READ - GET
      - UPDATE - PUT
      - DELETE - DELETE

      <table><thead><tr><th>Operation</th><th>API Endpoint</th><th>HTTP Method</th><th>Response Status</th></tr></thead><tbody><tr><td>Create</td><td><code>/cashcards</code></td><td><code>POST</code></td><td>201 (CREATED)</td></tr><tr><td>Read</td><td><code>/cashcards/{id}</code></td><td><code>GET</code></td><td>200 (OK)</td></tr><tr><td>Update</td><td><code>/cashcards/{id}</code></td><td><code>PUT</code></td><td>204 (NO DATA)</td></tr><tr><td>Delete</td><td><code>/cashcards/{id}</code></td><td><code>DELETE</code></td><td>204 (NO DATA)</td></tr></tbody></table>

  - REST Spring Boot
    - Spring Annotations
    - Component Scan
    - Spring Web Controllers
      - @RestController
      - @GetMapping
      - @PostMapping
      - @PutMapping
      - @DeleteMapping
