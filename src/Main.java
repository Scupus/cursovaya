public class Main {
    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();
        employeesBook.printSumSalary();
        employeesBook.printEmployeeList();
        System.out.println("Работник с минимальной ЗП: " + employeesBook.getMinSalaryVacancy());
        System.out.println("Работник с максимальной ЗП: " + employeesBook.getMaxSalaryVacancy());
        employeesBook.printAverageSalary();
    }
}