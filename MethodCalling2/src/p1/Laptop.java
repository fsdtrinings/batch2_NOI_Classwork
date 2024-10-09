package p1;

public class Laptop {

    private boolean wifi;

    Laptop(boolean wifi)
    {
        this.wifi = wifi;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
}
