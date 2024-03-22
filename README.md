<p align="center">
<img src="https://cdn-icons-png.flaticon.com/512/6295/6295417.png" width="100" />
</p>
<p align="center">
<h1 align="center">EDEN-GARDEN</h1>
</p>

<p align="center">
<img src="https://img.shields.io/github/license/Ancreem/Eden-Garden?style=flat&color=0080ff" alt="license">
<img src="https://img.shields.io/github/last-commit/Ancreem/Eden-Garden?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/Ancreem/Eden-Garden?style=flat&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/Ancreem/Eden-Garden?style=flat&color=0080ff" alt="repo-language-count">
<p>
<p align="center">
    <em>Developed with the software and tools below.</em>
</p>
<p align="center">
<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat&logo=Spring&logoColor=white" alt="Spring">
<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=flat&logo=openjdk&logoColor=white" alt="java">
<img src="https://img.shields.io/badge/MySQL-4479A1.svg?style=flat&logo=mysql&logoColor=white" alt="MySQL">
<img src="https://img.shields.io/badge/Hibernate-59666C.svg?style=flat&logo=hibernate&logoColor=white" alt="Hibernate">
<img src="https://img.shields.io/badge/HTML-239120.svg?style=flat&logo=html5&logoColor=white" alt="HTML">
<img src="https://img.shields.io/badge/CSS-1572B6.svg?style=flat&logo=css3&logoColor=white" alt="CSS">
<img src="https://img.shields.io/badge/Spring_Web-6DB33F.svg?style=flat&logo=spring&logoColor=white" alt="Spring Web">
<img src="https://img.shields.io/badge/Spring_Boot-6DB33F.svg?style=flat&logo=springboot&logoColor=white" alt="Spring Boot">
<img src="https://img.shields.io/badge/Spring_Security-6DB33F.svg?style=flat&logo=springsecurity&logoColor=white" alt="Spring Security">
<img src="https://img.shields.io/badge/Spring_Data_JPA-6DB33F.svg?style=flat&logo=springdata&logoColor=white" alt="Spring Data JPA">
<img src="https://img.shields.io/badge/Canva-00C4CC.svg?style=flat&logo=canva&logoColor=white" alt="Canva">
<img src="https://img.shields.io/badge/Swagger-85EA2D.svg?style=flat&logo=swagger&logoColor=black" alt="Swagger">
<img src="https://img.shields.io/badge/JavaScript-F7DF1E.svg?style=flat&logo=javascript&logoColor=black" alt="JavaScript">
<img src="https://img.shields.io/badge/Figma-F24E1E.svg?style=flat&logo=figma&logoColor=white" alt="Figma">
</p>
<hr>

---


##  Quick Links

> - [ Introduction](#-introduction)
> - [ Features](#-features)
> - [ Repository Structure](#-repository-structure)
> - [ Modules](#-modules)
> - [ Getting Started](#-getting-started)
>   - [ Installation](#-installation)
>   - [ Running Eden-Garden](#-running-Eden-Garden)
>   - [ Tests](#-tests)
> - [ Project Roadmap](#-project-roadmap)
> - [ Contributing](#-contributing)
> - [ License](#-license)
> - [ Acknowledgments](#-acknowledgments)

---


# Introduction

This project seeks to create software designed to assist operations within a gardening company. It will cover multiple aspects, including office management, employee information, client interactions, order processing, product management, and payment tracking. The development will utilize Java programming language, the Spring Boot framework, and either MySQL or PostgreSQL databases. The focus is on building a web application with both backend and frontend components while adhering to best development practices.

# Usage

> [!NOTE]
> To use and run the project in a better way we really recommend you have installed an IDE as IntelliJ.
> You also need to have Git in order to clone the repository.

-   First, clone the repository on your local machine.

    ```bash
    https://github.com/Ancreem/Jardin-Del-Eden.git
    ```

- You can also clone the repository by choosing the "Download ZIP" option.

  ![Diseño sin título](https://github.com/Ancreem/Jardin-Del-Eden/assets/139159920/b7b52092-da3c-4b35-98b1-39c6205d1ac2)


-   Open the project in your IDE.

2. Change to the project directory:

```sh
cd Eden-Garden
```

3. Install the dependencies:

```sh
mvn clean install
```

###  Running Eden-Garden

Use the following command to run Eden-Garden:

```sh
java -jar target/myapp.jar
```

###  Tests

To execute tests, run:

```sh
mvn test
```

---

> [!IMPORTANT]
> Before running the project you must have created the database, run the following code [fenixgardenDB](./fenixgarden/src/main/resources/DB.sql) in your MySQL DBMS.

-   Change the [application.properties](./fenixgarden/src/main/resources/application.propertie) in case you have modified your MySQL properties like host, port, username or even the password.

     ![Diseño sin título (1)](https://github.com/Ancreem/Eden-Garden/assets/139159920/9bed04b7-2b63-488f-99d6-d28974a2dabb)

    ![Añadir un poco de texto](https://github.com/Ancreem/Eden-Garden/assets/139159920/9dd076e7-ebb5-4c35-ac08-26d849c7df86)



-   Now run the project, if everything is alright you won't see any error in output console.

> [!TIP]
> Enjoy our software.

--- 

#  Project Roadmap

- [X] `► Folder Hierarchy Creation`: Establishing a hierarchical structure to organize folders.
- [X] `► Table Relationships Creation`: Creating relationships between tables within the database.
- [X] `► Swagger Implementation`: Integrating Swagger for API documentation and testing purposes.
- [X] `► Services Implementation`: Developing backend services to manage business logic.
- [X] `► Exception Handling`: Implementing mechanisms to handle errors and exceptions gracefully.
- [X] `► Security Implementation`: Integrating security measures to safeguard against unauthorized access and attacks.
- [X] `► CORS Configuration`: Configuring Cross-Origin Resource Sharing to allow interactions between client-side and server-side components.
- [X] `► Documentation`: Creating comprehensive documentation for the project, including code, APIs, and processes.
- [X] `► Frontend Development`: Building user interface components using HTML, CSS, and JavaScript.
- [X] `► Frontend-Backend Integration`: Integrating frontend components with backend services for seamless communication.
- [X] `► Repository Creation`: Setting up a repository for version control and collaboration purposes.
- [X] `► CRUD Implementation`: Implementing Create, Read, Update, and Delete operations for data management.
- [X] `► Entity Creation`: Defining and creating entities or models representing business objects in the application.
- [X] `► Queries Implementation`: Writing and implementing database queries and associated endpoints for data manipulation.
- [X] `► Queries Commenting`: Adding comments to queries for improved code readability and maintenance.
- [X] `► Frontend Queries Implementation`: Implementing frontend functionality to consume and display data retrieved from backend queries.
- [X] `► 29 Queries Consumption and Frontend Implementation`: Specifically consuming and implementing 29 queries in the frontend application.
- [X] `► Class Diagram`: Creating a diagram illustrating the class structure and relationships within the system.
- [X] `► Slides Preparation`: Creating presentation slides for documentation or presentation purposes.
- [X] `► CSS and HTML`: Developing styling and layout using CSS and HTML for the frontend application.
- [ ] ...

## Schedule

![image](https://github.com/Ancreem/Eden-Garden/assets/139159920/ba59791c-2155-4e00-9281-c7d8e04bb239)

---

# Backend

The backend of this project developed in Spring Boot acts as the central engine that handles business logic and data management. Responsible for processing client requests, it interacts with the database to store, retrieve, and manipulate necessary information. Additionally, it provides RESTful services for the frontend to consume and present data efficiently. In summary, the backend serves as the functional core of the system, ensuring a secure and effective flow of data between the client and the database. **Here is the implementation:**



## Class Diagram

> [!NOTE]
> To download or open the class diagram you must have [StarUML](https://staruml.io/) or another UML in order to open it, if you already have one just open the file ubicated in backend resources [here](./fenixgarden/src/main/resources/fenixgarden.mdj).

![](./frontend/resources/doc/classDiagram.jpg)

---

##  Repository Structure

```sh
└── Eden-Garden/
    ├── front-end
    │   ├── app.js
    │   ├── css
    │   │   ├── aut.css
    │   │   └── style.css
    │   ├── index.html
    │   ├── js
    │   │   ├── auth_login.js
    │   │   ├── auth_sign_in.js
    │   │   ├── customer.js
    │   │   ├── employee.js
    │   │   ├── gamaProduct.js
    │   │   ├── office.js
    │   │   ├── order.js
    │   │   ├── orderDetail.js
    │   │   ├── payment.js
    │   │   └── product.js
    │   ├── login.html
    │   ├── main.js
    │   ├── resources
    │   │   ├── Logo.png
    │   │   ├── customer.png
    │   │   ├── employee.png
    │   │   ├── gamaProduct.png
    │   │   ├── office.png
    │   │   ├── order.png
    │   │   ├── orderDetail.png
    │   │   ├── payment.png
    │   │   └── product.png
    │   └── sign-in.html
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── resources
    │   ├── BD.sql
    │   └── INSERTS.sql
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── jadineria
    │   │   │       └── jardineraDelEden
    │   │   └── resources
    │   │       └── application.properties
    │   └── test
    │       └── java
    │           └── jadineria
    │               └── jardineraDelEden
    └── target
        ├── classes
        │   ├── application.properties
        │   └── jadineria
        │       └── jardineraDelEden
        │           ├── JardineraDelEdenApplication.class
        │           ├── domain
        │           ├── persistence
        │           └── web
        └── test-classes
            └── jadineria
                └── jardineraDelEden
                    └── JardineraDelEdenApplicationTests.class
```

---


##  Modules

<details closed><summary>.</summary>

| File                                                                    | Summary                              |
| ---                                                                     | ---                                  |
| [mvnw.cmd](https://github.com/Ancreem/Eden-Garden/blob/master/mvnw.cmd) | This is a batch script used to start the Apache Maven Wrapper, version 3.2.0. It includes licensing information and instructions for setting environment variables like `JAVA_HOME` and `MAVEN_OPTS`. The script checks for the existence of `JAVA_HOME` and the Maven wrapper JAR file, downloading it if necessary. It also validates the SHA-256 sum of the Maven wrapper JAR file for security. Finally, it sets up the classpath and launches Maven with the provided command-line arguments. |
| [pom.xml](https://github.com/Ancreem/Eden-Garden/blob/master/pom.xml)   | This is a Maven POM (Project Object Model) file used for configuring a Java project. It defines project metadata such as group ID, artifact ID, and version. Dependencies are specified within the `<dependencies>` section, including Spring Boot starters for data access, web, and security, as well as MySQL JDBC and SpringDoc for API documentation. The `<build>` section configures plugins, such as the Spring Boot Maven plugin, which packages the application as an executable JAR. Additionally, the file excludes the Lombok library from the Spring Boot Maven plugin configuration. |
| [mvnw](https://github.com/Ancreem/Eden-Garden/blob/master/mvnw)         | The provided script is an Apache Maven Wrapper startup script. It handles the execution of Maven commands, setting up environment variables like `JAVA_HOME`, and optionally downloading the Maven wrapper JAR if not found locally. It includes OS-specific logic, detects Java executables, and provides checksum validation for downloaded files. This script ensures consistent Maven builds across different environments and projects.  |

</details>

<details closed><summary>resources</summary>

| File                                                                                    | Summary                                           |
| ---                                                                                     | ---                                               |
| [BD.sql](https://github.com/Ancreem/Eden-Garden/blob/master/resources/BD.sql)           | This SQL script creates tables for a database named "jardineria" with various entities such as office, employee, product range, customer, order, product, order detail, and payment. It establishes relationships between these entities using foreign keys. The script sets up primary keys, data types, and constraints for each table.     |
| [INSERTS.sql](https://github.com/Ancreem/Eden-Garden/blob/master/resources/INSERTS.sql) | Este proceso de inserción de datos es esencial para probar y demostrar la funcionalidad del esquema de la base de datos. Cada instrucción INSERT especifica valores para las respectivas columnas de las tablas, creando registros de muestra que se pueden consultar y manipular. |

# Database

This SQL script creates a database schema named "jardineria" with several tables:

1. `oficina`: Stores information about offices including office code, city, country, region, postal code, phone number, and address lines.
   
2. `empleado`: Contains details about employees such as employee code, name, last name, extension, email, office code, manager code, and position.
   
3. `gama_producto`: Holds data related to product lines including line name, text description, HTML description, and image.
   
4. `cliente`: Stores customer information like customer code, name, contact name, contact last name, phone number, fax number, address lines, city, region, country, postal code, sales representative code, and credit limit.
   
5. `pedido`: Records details of orders such as order code, order date, expected delivery date, delivery date, order status, comments, and customer code.
   
6. `producto`: Contains information about products including product code, name, product line, dimensions, supplier, description, stock quantity, selling price, and supplier price.
   
7. `detalle_pedido`: Stores information about order details like order code, product code, quantity, unit price, and line number.
   
8. `pago`: Keeps track of payments made by customers, including customer code, payment method, transaction ID, payment date, and total amount.

These tables are interconnected using foreign key constraints to maintain data integrity and ensure consistency across the database.
# Model BD

![image](https://github.com/Ancreem/Eden-Garden/assets/139159920/7f32e1bf-6fa2-4133-8c0f-df4fb24043d7)

---

</details>

<details closed><summary>front-end</summary>

| File                                                                                      | Summary                                            |
| ---                                                                                       | ---                                                |
| [login.html](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/login.html)     | This is an HTML file for a login page. It includes a form for users to input their username and password, along with links to sign in and sign up pages. The form has fields for username and password, and a submit button for logging in. Additionally, there is a background animation created using CSS. Finally, there is a JavaScript file included for handling the login functionality.  |
| [sign-in.html](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/sign-in.html) | This is an HTML file for a sign-in page. It includes a form for users to input their username and password, along with links to sign in and sign up pages. The form has fields for username and password, and a submit button for signing in. Additionally, there is a background animation created using CSS. Finally, there is a JavaScript file included for handling the sign-in functionality. |
| [index.html](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/index.html)     | It seems like you've provided an HTML document with some JavaScript functionality embedded within it. The document includes a sidebar with various options like "Customer," "Employee," "Product," etc., and a main content area. When you click on these options, JavaScript functions are likely triggered to fetch and display relevant data dynamically.  |
| [main.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/main.js)           | This code snippet handles various functionalities in a web application:, manages sidebar dropdowns, including collapse and expand functionality. Controls the visibility of the profile dropdown when the profile image is clicked. Handles menu link visibility when corresponding icons are clicked. Closes dropdowns when clicking outside of them. Sets the value of progress bars based on data values. Provides token management functions to remove JWT tokens from storage and redirect users to a login page.  |
| [app.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/app.js)             | The JavaScript code imports modules related to customers, employees, products, offices, order details, orders, and payments. It then sets up event listeners to perform specific queries when elements with specific IDs in the HTML are clicked. Each section of the code is dedicated to actions related to different entities such as customers, employees, offices, order details, orders, and payments. |

</details>

<details closed><summary>front-end.css</summary>

| File                                                                                    | Summary                                             |
| ---                                                                                     | ---                                                 |
| [style.css](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/css/style.css) | The CSS code provided establishes styles for a web application interface. It covers various aspects such as fonts, general layout, animated background with gradient circles, sidebar menu design including dropdowns and separators, navigation bar with search functionality and profile dropdown, and main content area styling including titles, informational cards, data charts, chat boxes, and forms. Responsive design adjustments for smaller screens are also incorporated.|
| [aut.css](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/css/aut.css)     | The CSS code defines the styling for a login page interface. It includes a background with animated gradient circles, a login container with a background image, a form for input fields, navigation links with hover effects, input fields with hover and focus effects, a submit button with hover effect, and a forgot password link. The design features a dark theme with white text for contrast and emphasis. The layout is responsive and adjusts to different screen sizes. |

</details>

<details closed><summary>front-end.js</summary>

| File                                                                                               | Summary                                                  |
| ---                                                                                                | ---                                                      |
| [auth_sign_in.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/auth_sign_in.js) | The provided JavaScript code contains event listeners for redirecting to a login page and registering a user. When the element with the id "login-btn" is clicked, the page is redirected to "login.html". Additionally, when the element with the id "btnRegister" is clicked, the script prevents the default form submission behavior, retrieves the username and password inputs, constructs a JSON object with the user data, and sends a POST request to a specified endpoint using the Fetch API. Upon successful registration, a success message is logged to the console, an alert is displayed to the user, and the page is redirected to "login.html". If an error occurs during registration, the error is logged to the console. |
| [product.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/product.js)           | These JavaScript functions serve to retrieve product-related data from a backend server and dynamically update a webpage's content accordingly. The functions include fetching ornamental products in stock, products that have never appeared in any order, and maximum and minimum sale prices of products. Each function sends HTTP requests to specified endpoints, processes the received data, and dynamically generates HTML to display relevant product information on the webpage. They employ the Fetch API for handling HTTP requests and manipulate the Document Object Model (DOM) to update the webpage's content. |
| [gamaProduct.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/gamaProduct.js)   | This js has no content, but it will be taken into account for future reference  |
| [orderDetail.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/orderDetail.js)   | These JavaScript functions perform various data retrieval operations from a backend server and dynamically update HTML content based on the fetched data. They include functionalities like counting distinct products by order, summing up quantities by order, finding the top 20 sold products, calculating invoice totals, calculating product invoice totals, filtering product invoice totals by codes starting with "OR," and listing total sales by product. Each function sends HTTP requests to specified endpoints, processes the received JSON data, and dynamically generates HTML content to display relevant information on the webpage. These functions manipulate the Document Object Model (DOM) to update the webpage's content with the fetched data, providing insights into product sales and invoicing details. |
| [employee.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/employee.js)         | These JavaScript functions perform various data retrieval operations related to employee information from a backend server and dynamically update HTML content based on the fetched data. They include functionalities such as fetching employees by boss ID, retrieving the boss of the company, finding employees who are not sales representatives, obtaining employee and boss names, listing employees with their bosses and grandbosses, fetching employees not associated with any office, retrieving employees who do not have an associated client, obtaining employees without an office and clients, finding employees without customers and their bosses, counting the total number of employees in the company, and counting the number of customers served by each sales representative. Each function sends HTTP requests to specified endpoints, processes the received JSON data, and dynamically generates HTML content to display relevant information on the webpage. These functions manipulate the Document Object Model (DOM) to update the webpage's content with the fetched data, providing insights into employee relations and customer service statistics.     |
| [auth_login.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/auth_login.js)     | The JavaScript code features two event listeners: one redirects users to a "sign-in.html" page upon clicking a button, while the other handles form submission, sending a POST request with username and password to a login endpoint. If successful, it stores a JWT token in sessionStorage and redirects to "index.html"; otherwise, it alerts the user of incorrect credentials and logs an error, clearing the input fields.   |
| [payment.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/payment.js)           | The provided JavaScript code contains several functions that utilize the Fetch API to make HTTP requests to various endpoints. These functions handle different tasks related to payment data, such as retrieving customer codes with payments in 2008, listing PayPal payments in 2008 ordered by total amount, finding distinct payment methods, calculating the average payment total for the year 2009, and obtaining the total payments by year. Each function updates the DOM with the fetched data, presenting it in a structured format within designated HTML elements. |
| [office.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/office.js)             | The provided JavaScript code consists of several functions designed to interact with an API endpoint related to office data. These functions perform various tasks such as fetching office codes and cities, retrieving city and phone information for offices in Spain, finding customers with payments and their corresponding sales representatives along with the city of the representative's office, listing office addresses in Fuenlabrada, and identifying offices without employees who have clients with Gama Frutales products. Each function utilizes the Fetch API to make HTTP requests to the respective endpoints and updates the DOM with the fetched data, presenting it in a structured format within designated HTML elements. |
| [order.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/order.js)               | The provided JavaScript code defines several functions utilizing the Fetch API to retrieve order-related data from specific endpoints. These functions handle tasks such as fetching distinct order statuses, retrieving details of delayed orders, finding orders with late deliveries, obtaining rejected orders in 2009, listing orders delivered in January, and counting orders by status. Each function updates the DOM to display the fetched data in structured HTML elements.  |
| [customer.js](https://github.com/Ancreem/Eden-Garden/blob/master/front-end/js/customer.js)         | HTTP error 401 for prompt `front-end/js/customer.js`     |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden</summary>

| File                                                                                                                                                             | Summary                                                                                               |
| ---                                                                                                                                                              | ---                                                                                                   |
| [JardineraDelEdenApplication.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/JardineraDelEdenApplication.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/JardineraDelEdenApplication.java` |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.persistence</summary>

| File                                                                                                                                         | Summary                                                                                           |
| ---                                                                                                                                          | ---                                                                                               |
| [Customer.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Customer.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Customer.java`    |
| [Payment.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Payment.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Payment.java`     |
| [Product.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Product.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Product.java`     |
| [Employee.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Employee.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Employee.java`    |
| [Order.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Order.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Order.java`       |
| [Office.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Office.java)           | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Office.java`      |
| [GamaProduct.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/GamaProduct.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/GamaProduct.java` |
| [User.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/User.java)               | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/User.java`        |
| [Admin.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/Admin.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/Admin.java`       |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.persistence.orderdetail</summary>

| File                                                                                                                                                         | Summary                                                                                                         |
| ---                                                                                                                                                          | ---                                                                                                             |
| [OrderDetailId.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/orderdetail/OrderDetailId.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/orderdetail/OrderDetailId.java` |
| [OrderDetail.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/orderdetail/OrderDetail.java)     | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/orderdetail/OrderDetail.java`   |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.persistence.dtos</summary>

| File                                                                                                                                                    | Summary                                                                                                   |
| ---                                                                                                                                                     | ---                                                                                                       |
| [PaymentDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/PaymentDTO.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/PaymentDTO.java`     |
| [ProductDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/ProductDTO.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/ProductDTO.java`     |
| [OrderDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/OrderDTO.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/OrderDTO.java`       |
| [CustomerDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/CustomerDTO.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/CustomerDTO.java`    |
| [EmployeeDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/EmployeeDTO.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/EmployeeDTO.java`    |
| [GamaProductDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/GamaProductDTO.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/GamaProductDTO.java` |
| [OfficeDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/OfficeDTO.java)           | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/OfficeDTO.java`      |
| [OrderDetailDTO.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/persistence/dtos/OrderDetailDTO.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/persistence/dtos/OrderDetailDTO.java` |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.domain.repository</summary>

| File                                                                                                                                                                   | Summary                                                                                                           |
| ---                                                                                                                                                                    | ---                                                                                                               |
| [OfficeRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/OfficeRepository.java)           | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/OfficeRepository.java`      |
| [AdminRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/AdminRepository.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/AdminRepository.java`       |
| [OrderDetailRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/OrderDetailRepository.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/OrderDetailRepository.java` |
| [ProductRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/ProductRepository.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/ProductRepository.java`     |
| [CustomerRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/CustomerRepository.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/CustomerRepository.java`    |
| [EmployeeRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/EmployeeRepository.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/EmployeeRepository.java`    |
| [PaymentRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/PaymentRepository.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/PaymentRepository.java`     |
| [GamaProductRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/GamaProductRepository.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/GamaProductRepository.java` |
| [OrderRepository.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/repository/OrderRepository.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/repository/OrderRepository.java`       |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.domain.service</summary>

| File                                                                                                                                                                  | Summary                                                                                                         |
| ---                                                                                                                                                                   | ---                                                                                                             |
| [EmployeeServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/EmployeeServiceImpl.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/EmployeeServiceImpl.java`    |
| [ServiceInterface.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/ServiceInterface.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/ServiceInterface.java`       |
| [OfficeServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/OfficeServiceImpl.java)           | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/OfficeServiceImpl.java`      |
| [PaymentServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/PaymentServiceImpl.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/PaymentServiceImpl.java`     |
| [AdminInterface.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/AdminInterface.java)                 | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/AdminInterface.java`         |
| [CustomerServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/CustomerServiceImpl.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/CustomerServiceImpl.java`    |
| [GamaProductServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/GamaProductServiceImpl.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/GamaProductServiceImpl.java` |
| [OrderDetailServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/OrderDetailServiceImpl.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/OrderDetailServiceImpl.java` |
| [ProductServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/ProductServiceImpl.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/ProductServiceImpl.java`     |
| [OrderServiceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/OrderServiceImpl.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/OrderServiceImpl.java`       |
| [AdminInterfaceImpl.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/service/AdminInterfaceImpl.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/service/AdminInterfaceImpl.java`     |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.domain.security</summary>

| File                                                                                                                                                                       | Summary                                                                                                            |
| ---                                                                                                                                                                        | ---                                                                                                                |
| [Constans.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/security/Constans.java)                                 | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/security/Constans.java`                 |
| [JWTAuthorizationFilter.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/security/JWTAuthorizationFilter.java)     | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/security/JWTAuthorizationFilter.java`   |
| [WebSecurityConfig.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/security/WebSecurityConfig.java)               | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/security/WebSecurityConfig.java`        |
| [JWTAuthtenticationConfig.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/security/JWTAuthtenticationConfig.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/security/JWTAuthtenticationConfig.java` |
| [CorsConfig.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/security/CorsConfig.java)                             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/security/CorsConfig.java`               |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.domain.exception</summary>

| File                                                                                                                                                                        | Summary                                                                                                             |
| ---                                                                                                                                                                         | ---                                                                                                                 |
| [AdminIdNotFoundException.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/exception/AdminIdNotFoundException.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/exception/AdminIdNotFoundException.java` |
| [AdminNotFoundException.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/exception/AdminNotFoundException.java)     | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/exception/AdminNotFoundException.java`   |
| [GlobalExceptionHandler.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/exception/GlobalExceptionHandler.java)     | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/exception/GlobalExceptionHandler.java`   |
| [ErrorResponses.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/domain/exception/ErrorResponses.java)                     | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/domain/exception/ErrorResponses.java`           |

</details>

<details closed><summary>src.main.java.jadineria.jardineraDelEden.web.controller</summary>

| File                                                                                                                                                                | Summary                                                                                                        |
| ---                                                                                                                                                                 | ---                                                                                                            |
| [GamaProductController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/GamaProductController.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/GamaProductController.java` |
| [OrderDetailController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/OrderDetailController.java) | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/OrderDetailController.java` |
| [EmployeeController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/EmployeeController.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/EmployeeController.java`    |
| [LoginController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/LoginController.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/LoginController.java`       |
| [AdminController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/AdminController.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/AdminController.java`       |
| [OfficeController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/OfficeController.java)           | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/OfficeController.java`      |
| [CustomerController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/CustomerController.java)       | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/CustomerController.java`    |
| [PaymentController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/PaymentController.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/PaymentController.java`     |
| [OrderController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/OrderController.java)             | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/OrderController.java`       |
| [ProductController.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/main/java/jadineria/jardineraDelEden/web/controller/ProductController.java)         | HTTP error 401 for prompt `src/main/java/jadineria/jardineraDelEden/web/controller/ProductController.java`     |

</details>

<details closed><summary>src.test.java.jadineria.jardineraDelEden</summary>

| File                                                                                                                                                                       | Summary                                                                                                    |
| ---                                                                                                                                                                        | ---                                                                                                        |
| [JardineraDelEdenApplicationTests.java](https://github.com/Ancreem/Eden-Garden/blob/master/src/test/java/jadineria/jardineraDelEden/JardineraDelEdenApplicationTests.java) | HTTP error 401 for prompt `src/test/java/jadineria/jardineraDelEden/JardineraDelEdenApplicationTests.java` |

</details>

---

# Endpoints

<details closed><summary>/register/{id}</summary>

# Endpoint: GET /register/{id}

## Parameters
| Name | Description            |
|------|------------------------|
| id   | Description of the id parameter. |

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `{ "id": 0, "username": "string", "password": "string", "token": "string" }` |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: PUT /register/{id}

## Parameters
| Name | Description            |
|------|------------------------|
| id   | Description of the id parameter. |

## Request Body
```json
{
  "id": 0,
  "username": "string",
  "password": "string",
  "token": "string"
}
```

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `{ "id": 0, "username": "string", "password": "string", "token": "string" }` |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: DELETE /register/{id}

## Parameters
| Name | Description            |
|------|------------------------|
| id   | Description of the id parameter. |

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     |                     |
| 500  | Internal Server Error  |                     |

# Endpoint: GET /register

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[ { "id": 0, "username": "string", "password": "string", "token": "string" } ]` |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: POST /register

## Parameters
No parameters

## Request body
- Content Type: application/json

```json
{
  "id": 0,
  "username": "string",
  "password": "string",
  "token": "string"
}
```

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `{ "id": 0, "username": "string", "password": "string", "token": "string" }` |
| 500  | Internal Server Error  | `{}`               |



</details>

<details closed><summary>/login</summary>

# Endpoint: POST /login

## Parameters
- **username** *(query)*: string
- **password** *(query)*: string

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `"string"`         |
| 500  | Internal Server Error  | `{}`               |

</details>

<details closed><summary>/product</summary>

# Endpoint: GET /product

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[{"productCode": "string", "name": "string", "gamaProduct": "string", "dimensions": "string", "supplier": "string", "description": "string", "amountInStock": 0, "salePrice": 0, "supplierPrice": 0}]` |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: GET /product/products-are-not-in-any-order

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[{"productCode": "string", "name": "string", "gamaProduct": "string", "dimensions": "string", "supplier": "string", "description": "string", "amountInStock": 0, "salePrice": 0, "supplierPrice": 0}]` |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: GET /product/products-are-not-in-any-order-n-d-i

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[{}]`             |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: GET /product/get-ornamental-products-in-stock

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[{}]`             |
| 500  | Internal Server Error  | `{}`               |

# Endpoint: GET /product/find-max-and-min-price

## Parameters
No parameters

## Responses
| Code | Description            | Example            |
|------|------------------------|--------------------|
| 200  | OK                     | `[{}]`             |
| 500  | Internal Server Error  | `{}`               |


</details>




