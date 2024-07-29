public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        // Adding employees
        system.addEmployee(new Employee(1, "Alice", "Manager", 75000));
        system.addEmployee(new Employee(2, "Bob", "Developer", 50000));
        system.addEmployee(new Employee(3, "Charlie", "Designer", 45000));

        // Traverse employees
        System.out.println("Employees:");
        system.traverseEmployees();

        // Search for an employee
        System.out.println("Searching for employee with ID 2:");
        Employee employee = system.searchEmployee(2);
        System.out.println(employee != null ? employee : "Employee not found");

        // Delete an employee
        System.out.println("Deleting employee with ID 2:");
        system.deleteEmployee(2);
        system.traverseEmployees();
    }
}
