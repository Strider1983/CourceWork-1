public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа №1");
        System.out.println("__________________");
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Ермилов Владимир Михайлович", 1, 50_000);
        employees[1] = new Employee("Филатова Вероника Михайловна", 3, 75_000);
        employees[2] = new Employee("Кононова Майя Максимовна", 5, 64_000);
        employees[3] = new Employee("Беликова Лилия Святославовна", 4, 81_000);
        employees[4] = new Employee("Юдина Софья Романовна", 2, 46_000);
        employees[5] = new Employee("Федоров Павел Семёнович", 5, 130_000);
        employees[6] = new Employee("Трофимов Мирослав Артёмович", 1, 280_000);
        employees[7] = new Employee("Хромов Роман Артёмович", 3, 175_000);
        employees[8] = new Employee("Горюнова Екатерина Тимуровна", 4, 96_000);
        employees[9] = new Employee("Русаков Лев Никитич", 2, 38_000);

        Tasks.printEmployees(employees);
        System.out.println("__________________");

        int salarySum = Tasks.calculateTotalSalary(employees);
        System.out.println("Сумма всех зарплат = " + salarySum + " рублей");
    }
}