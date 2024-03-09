# Library-Management-System-Core-Java-Project
This console-based Library Management System (LMS) project is implemented in Core Java, providing essential functionalities for managing a library's book inventory. The system follows the widely adopted Model-View-Controller (MVC) architectural pattern to enhance maintainability, scalability, and code organization.  The system includes features for adding, removing, updating, and fetching books, offering a practical solution for librarians to streamline their daily tasks.
# MVC Architecture
Model
The com.jsp.lms.model package contains classes defining the data model for the library.
The Library class represents the core data structure, encapsulating details such as library name, address, and pin code.
The Book class defines the structure for individual books, including attributes like name, author, and price.
View
The com.jsp.lms.view package houses the user interface layer.
The View class handles user input and output, providing an interactive console-based interface.
User interactions trigger actions within the Controller to maintain a clear separation of concerns.
Controller
The com.jsp.lms.controller package contains the controller logic responsible for handling user input, processing requests, and managing the library's book inventory.
The Controller class serves as the intermediary between the View and Model, orchestrating the flow of data and operations.
