This project involves creating a Spring MVC application that handles HTTP requests and responses, managed via a Tomcat server. 
It demonstrates the use of the spring-webmvc dependency to build a web application with controllers, models, and views.

## Key Features:
- Controllers with methods mapped to different URLs and HTTP methods, replacing traditional servlets
- Service method to return a specified number of cars from the list
- Thymeleaf template to generate a table displaying car data
- Dynamic response to HTTP requests: /cars displays the entire list of cars/cars?count=2 displays a list of 2 cars/cars?count=3 displays a list of 3 cars
- When count is greater than or equal to 5, the entire list is displayed
