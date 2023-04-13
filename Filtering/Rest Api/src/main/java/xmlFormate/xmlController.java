package xmlFormate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
//@ComponentScan(basePackages = "xmlFormate")
public class xmlController {

    //public controller con;
    private static List<xmlClass> xmlList = new ArrayList<>();
    static{
        xmlList.add(new xmlClass(1, "devansh", "kota"));
        xmlList.add(new xmlClass(2,"Arjun", "mahabharat"));
        xmlList.add(new xmlClass(3, "Bali","panchvatika"));
        xmlList.add(new xmlClass(4, "Ravan","Ravan ki Lanka"));
        xmlList.add(new xmlClass(5, "Hanuman","Vayu me"));
    }

    public List<xmlClass> returnAll()
    {
        return xmlList;
    }

    public xmlClass returnOne(int id)
    {
        Predicate<? super xmlClass> predicate = e -> e.getId()==(id);
        return xmlList.stream().filter(predicate).findFirst().orElseThrow(null);
    }

    public xmlClass returnUpdate(xmlClass xml)
    {
        xmlList.add(xml);
        return xml;
    }

}
