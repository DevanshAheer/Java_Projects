package POST.api;

import org.springframework.stereotype.Component;

@Component
public class personv2 {
    private namingPerson name;

    public personv2(namingPerson name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "personv2{" +
                "name='" + name + '\'' +
                '}';
    }

    public namingPerson getName() {
        return name;
    }
}
