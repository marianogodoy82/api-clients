# Client-Rest API

> A  project with SpringBoot

### Structure

```
.
├── README.md
├── src
│   ├── main
│   │    └── java
│   │        └── com.challenge.apiclients
│   │            ├── config
│   │            ├── controller
│   │            ├── service
│   │            ├── model
│   │            ├── entity
│   │            ├── helper
│   │            └── ApiClientsApplication.java
│   └── resources
│        └── application.yaml
├── app.js
├── server.js
├── pom.xml
└── .gitignore

```

## How To Run

1. Run  mvn clean package
2. Run  java -jar target/api-clients-final.jar
                                           
## How To See The UI of API
http://localhost:8080/swagger-ui.html#/client-controller

## To Check BD
http://localhost:8080/h2-console

## Endpoints

1. POST   /v1/createcliente      create cliente 
2. GET    /v1/kpideclientes      fetch summary statistics of age's client
3. GET    /v1/listclientes       fetch list of all clients

## Observaciones
1. Para calcular el Desvio Estandard opte por una 
solución que recorra una sola vez la colección de Clientes
para resolver tanto el cálculo de la Desviación Estandard como la de la Media/Promedio
2. Para la persistencia opte por una BD embebida (H2) ya que el foco entendí que no estaba 
en la integración con distintos tipos de BD (Relacional o No Relacional)