package Rest.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
@ComponentScan(basePackages = "Rest.api")
public class UserDAO {

    private static List<user> Users = new ArrayList<user>();

    public static Integer idCount =0;
    static{

        Users.add(new user(++idCount, "devansh", "kota"));
        Users.add(new user(++idCount, "krishan", "Vrindvan"));
        Users.add(new user(++idCount, "Ram","Ayodhya"));
        Users.add(new user(++idCount, "Sita", "Janakpuri"));
        Users.add(new user(++idCount, "Sugriv", "Panchvatika"));

    }

    public List<user> findAl()
    {
        return Users;
    }

    public List<user> findInternationalized()
    {
        return Users;
    }

    public user findOne(int id)
    {
        Predicate<? super user> predicate = e -> e.getId()==(id);
        return Users.stream().filter(predicate).findFirst().orElseThrow(null);
    }

    public user save(user us)
    {
        us.setId(++idCount);
        Users.add(us);
        return us;
    }

    public void deleteById(int id)
    {
        Predicate<? super user> predicate = e -> e.getId()==(id);
        Users.removeIf(predicate);
    }

    public void updateById(user ur, int id)
    {
        Users = Users.stream().map(b->{
                if(b.getId() == id) {
                    b.setName(ur.getName());
                    b.setAddress(ur.getAddress());
                }
                return b;
        }).collect(Collectors.toList());
    }

}
