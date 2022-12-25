public class EmployeesBook {
    private static Employee[] employees = new Employee[10];{
        employees[0] = new Employee("Пушкин Александр Сергеевич", 3, 54200);
        employees[1] = new Employee("Гоголь Николайй Васильевич", 2, 47380);
        employees[2] = new Employee("Лермонтов Михаил Юрьевич", 1, 81367);
        employees[3] = new Employee("Достаевский Фёдор Михайлович", 5, 54320);
        employees[4] = new Employee("Чехов Антон Павлович", 4, 160740);
        employees[5] = new Employee("Толстой Лев Николаевич", 3, 95120);
        employees[6] = new Employee("Булгаков Михаил Афанасьевич", 1, 140380);
    }

    public void printEmployeeList() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double sumSalary() {
        double sum = 0d;
          for(Employee employee : employees){
            if (employee != null){
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public void printSumSalary() {
        System.out.println(sumSalary());
    }
    public double averageSalary() {
        int personalQuantity = 0;
        double averageSalary = 0d;
        for (int i = 0; i < employees.length; i++) {
            personalQuantity = i + 1;
        }
        return averageSalary = sumSalary() / personalQuantity;
    }

    public void printAverageSalary() {
        System.out.println(averageSalary());
    }

        public int getFirstNotNullSalaryIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
        }
        throw new RuntimeException("Нет работников!!!");
    }

    public Employee getMinSalaryVacancy() {
        Employee minSalaryVacancy = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() +1; i < employees.length ; i++) {
            if(employees[i] != null && employees[i].getSalary() < minSalaryVacancy.getSalary()) {
                minSalaryVacancy = employees[i];
            }
        }
        return minSalaryVacancy;
    }
    public Employee getMaxSalaryVacancy() {
        Employee maxSalaryVacancy = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() +1; i > employees.length ; i++) {
            if(employees[i] != null && employees[i].getSalary() < maxSalaryVacancy.getSalary()) {
                maxSalaryVacancy = employees[i];
            }
        }
        return maxSalaryVacancy;
    }
}
