# Employee Management System

An application designed to manage employees and jobs within an organization. This system provides functionality to view, add, edit, and delete employee and job records stored in serialized data files (`Employees.dat` and `Jobs.dat`).

## Features

- **View Employees:**
  - Displays a table listing all employees with details such as staff number, name, surname, email, and assigned job.
  - Allows sorting employees by various criteria.
  
- **View Jobs:**
  - Shows a table listing available jobs along with their titles and associated salaries.
  - Supports viewing detailed job information.
  
- **Add and Edit:**
  - Enables adding new employees and jobs to the system.
  - Provides functionality to edit existing employee and job details.

- **Delete:**
  - Allows removing employees and jobs from the system.

## Installation

To run the Employee Management System locally, follow these steps:

1. **Clone the repository:**

   ```sh
   git clone https://github.com/your_username/employee-management-system.git
### Compile and Run

- Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
- Ensure you have Java Development Kit (JDK) version 8 or higher installed.
- Compile the source code and run the `Main.java` file or execute the JAR file if available.

### Serialized Data Files

- The application relies on two serialized data files (`Employees.dat` and `Jobs.dat`) to store employee and job data.
- Ensure these files are present in the project directory before running the application.
- If not available, run the application once to generate these files with sample data.

### Dependencies

- The application uses Java Swing library for the graphical user interface.
- No additional dependencies are required beyond JDK 8 or higher.

### Configure IDE (Optional)

- If running in an IDE, configure the project to include the serialized data files (`Employees.dat` and `Jobs.dat`) in the classpath.
- Check the project settings to ensure proper handling of input/output streams for file operations.

### Usage

- **View Employees:**
  - Launch the application.
  - Select "View Employees" to see a table listing all employees.

- **View Jobs:**
  - Navigate to the "View Jobs" section to see a list of available jobs.

- **Add or Edit Records:**
  - Use the "Add Employee" or "Add Job" button to enter new records.
  - Edit existing records by selecting the record and clicking "Edit".

- **Delete Records:**
  - Select a record and click "Delete" to remove an employee or job from the system.

### Testing

- The system has been tested for basic functionality, including adding, editing, and deleting records.
- Perform comprehensive testing to ensure all features operate correctly with various input scenarios.
- Report any issues or bugs by opening an issue on GitHub or contacting the project maintainer directly.

### Contributing

- Contributions are welcome! If you'd like to enhance the system with new features or improvements, please fork the repository and submit a pull request.

### License

- This project is licensed under the MIT License.

### Contact

- For issues or inquiries, please contact Ashley (ashleyjulianpillay@gmail.com).
