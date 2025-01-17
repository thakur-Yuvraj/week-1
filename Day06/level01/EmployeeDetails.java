import java.util.Scanner;

class Employee {
    String empName;
    int empId;
    int empSalary;

    //Constructor to initialize the attributes
    Employee(String empName, int empId, int empSalary) {
        this.empName = empName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    // Method to Show the details of Employee
    void display() {
        System.out.println("Employee name is "+empName);
        System.out.println("Employee Id is "+empId);
        System.out.println("Employee Salary is "+empSalary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter Employee details
        System.out.println("Enter Employee Name: ");
        String empName = input.nextLine();

        System.out.println("Enter Employee Id: ");
        int empId = input.nextInt();

        System.out.println("Enter Employee Salary: ");
        int empSalary = input.nextInt();

        //Creating an object of Employee class
        Employee obj = new Employee(empName, empId,empSalary);

        //Getting the output
        obj.display();
    }
}