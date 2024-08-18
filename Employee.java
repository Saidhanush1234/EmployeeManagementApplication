public class Employee {
    private int empId;
    private String empName;
    private double salary;
    private String department;
    private int age;

    public Employee(int empId, String empName, double salary, String department, int age) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empId +
                "\nName: " + empName +
                "\nSalary: " + salary +
                "\nDepartment: " + department +
                "\nAge: " + age;
    }
}
