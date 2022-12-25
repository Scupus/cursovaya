import java.util.Objects;

public class Employee {
        private String name;
        private int department;
        private double salary;
        private final long id = count;
        private static long count = 1L;

        public void listOfEmployees(String name, int department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            count++;
        }
            Employee(String name, int department, double salary) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getDepartment() {
            return department;
        }

        public void setDepartment(int department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Работник № " + id + "Ф.И.О.: " + name + ", отдел № " + department
                    + ", заработная плата за месяц составила: " + String.format("%.2d", salary);
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}