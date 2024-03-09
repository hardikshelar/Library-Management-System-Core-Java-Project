# Library-Management-System-Core-Java-Project
This console-based Library Management System (LMS) project is implemented in Core Java, providing essential functionalities for managing a library's book inventory. The system follows the widely adopted Model-View-Controller (MVC) architectural pattern to enhance maintainability, scalability, and code organization.  The system includes features for adding, removing, updating, and fetching books, offering a practical solution for librarians to streamline their daily tasks.   


**MVC Architecture**

**Model**

The com.jsp.lms.model package contains classes defining the data model for the library.
The Library class represents the core data structure, encapsulating details such as library name, address, and pin code.
The Book class defines the structure for individual books, including attributes like name, author, and price.

**View**

The com.jsp.lms.view package houses the user interface layer.
The View class handles user input and output, providing an interactive console-based interface.
User interactions trigger actions within the Controller to maintain a clear separation of concerns.

**Controller**

The com.jsp.lms.controller package contains the controller logic responsible for handling user input, processing requests, and managing the library's book inventory.
The Controller class serves as the intermediary between the View and Model, orchestrating the flow of data and operations.

**Features**

**Library Initialization**

The LMS starts by prompting the user to initialize the library with the following information:

Library Name
Library Address
Library Pin Code

This initialization process ensures that each library instance has unique identification details.

**Book Management**

1.Add Book:

Users can add a new book to the library.
Required details include the book name, author name, and price.

2.Remove Book:

Users can remove a book from the library by providing the book's name.

3.Update Book:

Users can update existing book details.
Options include updating the book name, author name, or price.

4.Get Book:

Users can retrieve details of a specific book by searching for it using its name.

**User Interface**

The program provides a simple and interactive console-based user interface.
Users are presented with a menu, and they can input a digit corresponding to the desired operation.

Continuous Operation

The program runs in a loop, allowing users to perform multiple operations without restarting.
Users can exit the program gracefully by choosing the "Exit" option.
