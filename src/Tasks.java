public class Tasks {
    public static void printEmployees(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (Employee employee :
                employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public static Employee findMinSalary(Employee[] employees) {
        int minSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[minSalary].getSalary()) {
                minSalary = i;
            }
        }

        return employees[minSalary];
    }

    public static Employee findMaxSalary(Employee[] employees) {
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[maxSalary].getSalary()) {
                maxSalary = i;
            }
        }
        return employees[maxSalary];
    }
    public static double calculateEverSalary(Employee[] employees) {
        return (double) calculateTotalSalary(employees) / employees.length;
    }
    public static void printNames (Employee[] employees) {
        System.out.println("ФИО всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getName());
            
        }
    }
}
