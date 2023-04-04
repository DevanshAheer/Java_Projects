package POST.api;

import org.springframework.stereotype.Component;

@Component
public class namingPerson {
    public String firstName;
    public String secondName;

    public namingPerson(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    @Override
    public String toString() {
        return "namingPerson{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
