# 📅 Planner Java Application

This is a Java Spring Boot application for managing trip planning activities. The application provides functionalities to create, update, and manage trips, participants, activities, and links.

## ✨ Features

- **Trip Management**
  - Create a new trip
  - Get details of a specific trip
  - Update trip information
  - Confirm a trip

- **Participant Management**
  - Invite a participant to a trip
  - Confirm participant's invitation
  - Get a list of all participants

- **Activity Management**
  - Register a new activity for a trip
  - Get a list of all activities for a trip

- **Link Management**
  - Register a new link for a trip
  - Get a list of all links for a trip

## 🛠️ Requirements

- Java 11 or higher
- Maven

## 🚀 Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/renansouza12/planer-java.git
   cd planer-java

# 
   
### API_ENDPOINTS

```markdown
# 📋 API Endpoints
```

## Trip Endpoints

- **Create Trip**
  - `POST /trips`
  - Request body: `TripRequestDTO`
  - Response: `201 Created`

- **Get Trip Details**
  - `GET /trips/{id}`
  - Response: `200 OK`

- **Update Trip**
  - `PUT /trips/{id}`
  - Request body: `TripRequestDTO`
  - Response: `200 OK`

- **Confirm Trip**
  - `GET /trips/{id}/confirm`
  - Response: `200 OK`

## Participant Endpoints

- **Invite Participant**
  - `POST /trips/{id}/invite`
  - Request body: `ParticipantRequestDTO`
  - Response: `201 Created`

- **Confirm Participant**
  - `POST /trips/{id}/participants/{participantId}/confirm`
  - Response: `200 OK`

- **Get All Participants**
  - `GET /trips/{id}/participants`
  - Response: `200 OK`

## Activity Endpoints

- **Register Activity**
  - `POST /trips/{id}/activities`
  - Request body: `ActivityRequestDTO`
  - Response: `201 Created`

- **Get All Activities**
  - `GET /trips/{id}/activities`
  - Response: `200 OK`

## Link Endpoints

- **Register Link**
  - `POST /trips/{id}/links`
  - Request body: `LinkRequestDTO`
  - Response: `201 Created`

- **Get All Links**
  - `GET /trips/{id}/links`
  - Response: `200 OK`
 
  ![App Screenshot](https://i.ibb.co/DLR8Mw6/Captura-de-tela-2024-07-12-174139.png)
