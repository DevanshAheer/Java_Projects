package POST.api;

import org.springframework.stereotype.Component;

@Component
public class personv1 {
    private String name;

    public personv1(String name) {
        this.name = name;
    }

    public personv1()
    {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "personv1{" +
                "name='" + name + '\'' +
                '}';
    }
}
