class Employee {
    public String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;

    }

    public void displaymethod() {
        System.out.println("Employee details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salaray: " + salary);
    }

    public static void main(String[] args) {
        Employee em = new Employee("Aditi", 81, 50000);
        em.displaymethod();
    }
}