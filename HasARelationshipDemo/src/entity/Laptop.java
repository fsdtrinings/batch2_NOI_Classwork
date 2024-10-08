package entity;

public class Laptop {

    private String brand;
    private String sNO;

    public Laptop() {
    }

    public Laptop(String brand, String sNO) {
        this.brand = brand;
        this.sNO = sNO;
    }

    public String getsNO() {
        return sNO;
    }

    public void setsNO(String sNO) {
        this.sNO = sNO;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", sNO='" + sNO + '\'' +
                '}';
    }
}
