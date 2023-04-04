package Rest.api;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class user {
    private Integer id;

    @Size(min=5, message = "string name could not be more than 5")
    private String name;
    @Past(message = "past is on address....")
    private String address;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public user(Integer id, String name, String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public user() {  // this is because spring creates own beans of Integer...
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
