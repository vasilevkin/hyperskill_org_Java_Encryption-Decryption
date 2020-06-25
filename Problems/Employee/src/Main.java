class Employee {

    public Employee() {
        this.name = "unknown";
        this.address = "unknown";
        this.salary = 0;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.address = "unknown";
    }

    public Employee(String name, int salary, String address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    String name;
    int salary;
    String address;
}
