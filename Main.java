public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee ("Nitish" , 30000, 5000, 1678652800);
        employee.displayTotalSalary();
        employee.displayEmployeeRole();
        Engineer engineer = new Engineer("Nitish",30000, 5000, 1678652800,1500);
        engineer.displayTotalSalary();
        engineer.displayEmployeeRole();
    }
}