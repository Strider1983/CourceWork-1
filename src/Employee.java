public class Employee {
    private String name;
    private int department;
    private int salary;
    private int iD;
    private static int couter = 0;

    public Employee(String name, int department, int salary) {
        checkDepartment(department);

        this.name = name;
        this.department = department;
        this.salary = salary;

        iD = ++couter;

    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getiD() {
        return iD;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    private void checkDepartment (int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Неварный номер отдела. Существуют отдклы от 1 до 5");
        }
    }

    @Override
    public String toString() {
        return "ФИО: " + name + ", Отдел №" + department + ", Зарплата - " + salary + "р., iD-" + iD;
    }
}
