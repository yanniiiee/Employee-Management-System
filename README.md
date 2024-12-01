# Employee Management System

This project is a simple **Employee Management System** built using **JavaFX**. It allows users to manage a list of employees, including their types (Full-time, Part-time, or Contractor), and automatically calculates their salaries based on the provided data.

## Features

- Add new employees (Full-time, Part-time, and Contractor).
- View a list of employees in a table.
- Automatically calculate and display salaries based on the employee type:
  - **Full-time**: Fixed annual salary.
  - **Part-time**: Hourly wage multiplied by hours worked.
  - **Contractor**: Hourly rate multiplied by maximum hours worked in a month.
- Remove employees from the list.
- Simple JavaFX-based GUI for user interaction.

## Project Structure

The project consists of the following components:

1. **Abstract Class `Employee`**: The base class representing an employee.
2. **Subclasses**:
   - `FullTimeEmployee`: Represents full-time employees with a fixed salary.
   - `PartTimeEmployee`: Represents part-time employees who are paid hourly.
   - `Contractor`: Represents contractors who have a fixed hourly rate and a maximum number of hours worked.
3. **JavaFX Application**: The main JavaFX application that provides the graphical user interface (GUI) to manage employees.
4. **FXML File**: Contains the layout of the GUI (using JavaFX Scene Builder).
5. **Controller**: Manages the user interactions with the GUI and the underlying logic.

## Requirements

- **JDK 8** or later.
- **JavaFX** (ensure that your IDE is set up to use JavaFX, or install it separately if required).
- **Scene Builder** (optional for GUI design, but not required for running the application).

## Installation

1. Clone this repository to your local machine:

    ```bash
    git clone https://github.com/yourusername/employeemanagementsystem.git
    ```

2. Open the project in your favorite Java IDE (such as IntelliJ IDEA, Eclipse, or NetBeans).
3. If you're using **IntelliJ IDEA**:
   - Make sure JavaFX is configured correctly.
   - Ensure that your `pom.xml` or build.gradle file includes JavaFX dependencies (if using Maven or Gradle).
   - If not using Maven or Gradle, make sure JavaFX is added to your `classpath`.

4. Build and run the application.

## How to Use

1. **Add an Employee**:
   - Fill in the employee's **Name**.
   - Select the employee **Type** (Full-time, Part-time, Contractor).
   - Enter the **Salary/Hourly Rate** (depending on the type of employee - use only numbers!).
   - For **Part-time** and **Contractor**, enter the **Hours Worked/Max Hours**  (use only numbers!).
   - Click the **"Add Employee"** button to add the employee to the list.

2. **Remove an Employee**:
   - Select an employee from the table.
   - Click the **"Remove Employee"** button to remove the selected employee from the list.

3. The employee details (Name, Type, and calculated Salary) are displayed in the table.

## Screenshots

### Employee Management System UI

![Employee Management System](https://github.com/user-attachments/assets/b5959f48-6fb9-45e7-b34e-7f4f7680eecf)


### Example with Employees Added

![Employee List](https://github.com/user-attachments/assets/35b628c0-1b37-4775-a2ad-2863e3c30cb8)


## Example Input

- **Full-time Employee**:  
  - Name: John Doe  
  - Type: Full-time  
  - Salary: $60,000

- **Part-time Employee**:  
  - Name: Jane Smith  
  - Type: Part-time  
  - Hourly Rate: $20  
  - Hours Worked: 50

- **Contractor**:  
  - Name: Bob Johnson  
  - Type: Contractor  
  - Hourly Rate: $40  
  - Max Hours: 100

## How to Run the Program

1. **Build and run** the project in your IDE.
2. If you're running from the command line:
   - Ensure that JavaFX is correctly configured in your environment.
   - Compile the Java files and run the application with the appropriate classpath for JavaFX libraries.

```bash
javac -cp ".;path/to/javafx-sdk/lib/*" *.java
java -cp ".;path/to/javafx-sdk/lib/*" Main
