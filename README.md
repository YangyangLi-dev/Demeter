# Food Waste Reduction Platform

## Overview

The Food Waste Reduction Platform is a comprehensive solution aimed at addressing the global issue of food waste. It connects food retailers, consumers, and charitable organizations to facilitate the efficient redistribution of surplus food.

## Features

- User Registration and Authentication (Retailers, Consumers, Charitable Organizations)
- Inventory Management for Retailers
- Surplus Food Identification and Listing
- Donation Claiming for Charitable Organizations
- Discounted Purchases for Consumers
- Surplus Food Alert System

## Technology Stack

- Backend: Java EE
- Database: MySQL 8.0
- Build Tool: Maven
- Version Control: Git
- Testing: JUnit, Cypress

## Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven 3.6 or higher
- MySQL 8.0 
- Node.js and npm (for Cypress testing)

## Setup and Installation

1. Clone the repository
2. Navigate to the project directory
3. Set up the database:
- Create a MySQL database named `fwrp`
- execute the DDL.sql under demeter/document folder
- Update the database configuration in `src/main/resources/application.properties`
4. Build the project:
  mvn clean install
5. Run the application:
  mvn spring-boot:run
6. Access the application at `http://localhost:8080`

## High Level Design Document
see: https://docs.google.com/document/d/1VAmqbzf8KjLdld_JqMUog4fVVvuHUrC3EsTj1KPETiA/edit
