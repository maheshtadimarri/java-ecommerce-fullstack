# ShopSphere — Java Full Stack E-commerce

Production-oriented e-commerce application built with Java 21, Spring Boot, PostgreSQL, Flyway and React.

## Highlights
- RESTful catalog and order APIs
- Validation and centralized API error handling
- PostgreSQL + Flyway schema migrations
- OpenAPI/Swagger documentation
- Actuator health and metrics
- CI for Maven verification and frontend production builds
- Docker-ready backend
- Product catalog, cart and order workflow

## Architecture
React → REST API → service layer → Spring Data JPA → PostgreSQL

## Local development
Start PostgreSQL with the supplied configuration, run the backend from `backend`, then run `npm install && npm run dev` from `frontend`.

API: `http://localhost:8081`  
Swagger: `http://localhost:8081/swagger-ui.html`

## Resume scope
Full-stack e-commerce, REST API design, relational modeling, migrations, validation, order processing, automated CI, containerization and responsive React UI.
