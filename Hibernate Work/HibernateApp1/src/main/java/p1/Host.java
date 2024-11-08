package p1;

import javax.persistence.*;

@Entity
@Table(name = "HOST")
public class Host {
    @Id 
    @Column(name = "id")
    private int id;

    @Column(name = "hostname")
    private String hostname;

    @Column(name = "platform")
    private String platform;

    public Host() {}

    public Host(String hostname, String platform) {
        this.hostname = hostname;
        this.platform = platform;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}