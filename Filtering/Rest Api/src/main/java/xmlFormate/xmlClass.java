package xmlFormate;

import org.springframework.stereotype.Component;

@Component
public class xmlClass {
    public int id;
    public String address;
    public String name;


    public xmlClass(int id, String address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    @Override
    public String toString() {
        return "xmlController{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
