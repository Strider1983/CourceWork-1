public class Tasks {
    public static void printEmployees(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (Employee employee:
             employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary (Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
        }
    }
