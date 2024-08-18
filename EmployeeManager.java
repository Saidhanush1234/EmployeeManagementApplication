import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
    private List<Employee> employees;
    private Scanner scanner;

    public EmployeeManager() {
        employees = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addEmployee() {
        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();

        System.out.println("Enter Salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Department:");
        String department = scanner.nextLine();

        System.out.println("Enter Age:");
        int age = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(empId, empName, salary, department, age);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void viewEmployee() {
        System.out.println("Enter Employee ID to view:");
        int empId = scanner.nextInt();
        scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void updateEmployee() {
        System.out.println("Enter Employee ID to update:");
        int empId = scanner.nextInt();
        scanner.nextLine();

        for (Employee employee : employees) {
            if (employee.getEmpId() == empId) {
                System.out.println("Enter new Employee Name:");
                String empName = scanner.nextLine();
                employee.setEmpName(empName);

                System.out.println("Enter new Salary:");
                double salary = scanner.nextDouble();
                scanner.nextLine();
                employee.setSalary(salary);

                System.out.println("Enter new Department:");
                String department = scanner.nextLine();
                employee.setDepartment(department);

                System.out.println("Enter new Age:");
                int age = scanner.nextInt();
                scanner.nextLine();
                employee.setAge(age);

                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void deleteEmployee() {
        System.out.println("Enter Employee ID to delete:");
        int empId = scanner.nextInt();
        scanner.nextLine();

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                iterator.remove();
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public void viewAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
                System.out.println("-----------------------------");
            }
        }
    }
}
