package entity;

public class Employee {

    private int id;
    private String name;
    private int salary;

    private Laptop laptop;


    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name, int salary, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.laptop = laptop;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", laptop=" + laptop +
                '}';
    }
}






















