# UserAccountManagementJava

This Java project implements a simple system for managing cell phone users. It demonstrates object-oriented programming principles, including inheritance and polymorphism, by defining a base class for all users and subclasses for different account types (Contract and Prepaid).

## Project Structure

The project consists of the following Java files:

*   `CellUser.java`: The superclass for all cell phone users.
*   `ContractUser.java`: A subclass extending `CellUser` for contract-based users.
*   `PrepaidUser.java`: A subclass extending `CellUser` for prepaid users.
*   `Driver.java`: A test program to demonstrate the functionality of the classes.

## Features

*   Stores common details for all cell phone users (name, address, service provider, cell number).
*   Stores specific details for Prepaid users (data balance, minutes balance, amount balance).
*   Stores specific details for Contract users (contract start date, contract description, phone description, free minutes left, free SMSs left).
*   Includes `toString()` methods in each class for basic string representation.
*   Includes an abstract `showAccount()` method in the `CellUser` class, implemented by subclasses to provide formatted account details.
*   A driver program to create and manage an array of `CellUser` objects.

## How to Compile and Run

1.  Save the Java files (`CellUser.java`, `ContractUser.java`, `PrepaidUser.java`, `Driver.java`) in the same directory.
2.  Compile the Java files using a Java Development Kit (JDK). You can use the provided `run.bat` file on Windows or the following commands in a terminal:

    ```bash
    javac CellUser.java
    javac ContractUser.java
    javac PrepaidUser.java
    javac Driver.java
    ```

3.  Run the `Driver` program:

    ```bash
    java Driver
    ```

## `run.bat` (for Windows)

```batch
javac CellUser.java
javac ContractUser.java
javac PrepaidUSer.java
javac Driver.java
java Driver
