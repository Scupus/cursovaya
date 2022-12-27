public class EmployeesBook {
    private static Employee[] employees = new Employee[10];{
        employees[0] = new Employee("Пушкин Александр Сергеевич", 3, 500);
        employees[1] = new Employee("Гоголь Николай Васильевич", 2, 400);
        employees[2] = new Employee("Лермонтов Михаил Юрьевич", 1, 300);
        employees[3] = new Employee("Достаевский Фёдор Михайлович", 5, 100);
        employees[4] = new Employee("Чехов Антон Павлович", 4, 200);
        employees[5] = new Employee("Толстой Лев Николаевич", 3, 300);
        employees[6] = new Employee("Булгаков Михаил Афанасьевич", 1, 400);
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
        System.out.println("Общая ЗП по всем отделам: " + sumSalary());
    }
    public double getSumSalary() {
        sumSalary();
        return sumSalary();
    }
    public double averageSalary() {
        double averageSalary = sumSalary() / Employee.getCount();
        return averageSalary;
    }
    public void printAverageSalary() {
        System.out.println("Средняя ЗП в организации: " + averageSalary());
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
        for (int i = getFirstNotNullSalaryIndex() +1; i < employees.length ; i++) {
            if(employees[i] != null && employees[i].getSalary() > maxSalaryVacancy.getSalary()) {
                maxSalaryVacancy = employees[i];
            }
        }
        return maxSalaryVacancy;
    }

}
