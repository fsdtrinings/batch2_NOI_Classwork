package p1;

public class Employee {

    private int id;
    private String name;
    private Laptop laptop;

    public Employee() {
    }

    public Employee(int id, String name, Laptop laptop) {
        this.id = id;
        this.name = name;
        this.laptop = laptop;
    }

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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
                ", laptop=" + laptop +
                '}';
    }
}
