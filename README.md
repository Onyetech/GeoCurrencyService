# GeoCurrencyService

# Description:
KlashaGeoCurrencyService is a Spring Boot-based RESTful API designed to fulfill the technical evaluation criteria for the Backend Engineer role at Klasha. The application serves as a centralized backend service that interacts with public APIs to fetch and process geographic and financial data for multiple countries. It offers a range of endpoints for clients to request specific data related to countries, their cities, states, and currencies.

# Target Users:
Technical evaluators for the Backend Engineer role at Klasha
Developers seeking to integrate country-specific data into their applications
Any user interested in geographic and financial information

# Core Functionalities:
Most Populated Cities: Fetch and return a list of 'N' most populated cities from Italy, New Zealand, and Ghana, sorted in descending order based on population.

Country Information: Provide comprehensive information about a given country, including its population, capital city, location, currency, and ISO codes.

States and Cities: Retrieve a full list of all states in a specified country and all the cities in each state.

Currency Conversion: Convert a given monetary amount from a specified country's currency to a target currency, using provided exchange rates.

# Key Features:
RESTful API Design: Adheres to REST best practices for easy integration with client applications.
Data Caching: Implements caching mechanisms to improve response times for frequently requested data.
Exception Handling: Robust error handling to provide meaningful error messages.
Automated Tests: Includes a suite of automated tests to validate core functionalities.
Documentation: Comprehensive API documentation for ease of use.
Design Patterns: Makes use of Singleton, Strategy, and Factory design patterns for clean, maintainable, and extendable code.
Technologies Used:
Java
Spring Boot
Maven
Public APIs for country and city data
