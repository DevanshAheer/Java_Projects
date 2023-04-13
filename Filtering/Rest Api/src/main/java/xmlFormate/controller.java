package xmlFormate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    public xmlController service;

    public controller(xmlController service)
    {
        this.service = service;
    }
    @GetMapping("/xml")
    public List<xmlClass> viewAll()
    {
        return service.returnAll();
    }

    @GetMapping("/xml/{id}")
    public xmlClass viewOne(@PathVariable int id)
    {
        xmlClass xml = service.returnOne(id);
        if(xml==null)
        {
            throw new ResourceNotFound("id this is runtime exception --> Resource not found .... "+id);
        }
        return xml;
    }


    @PostMapping("/xmlPost")
    public xmlClass updateOne(@RequestBody xmlClass xml)
    {
        xmlClass xml1 = service.returnUpdate(xml);
        if(xml1==null)
        {
            throw new ResourceNotFound("id this is runtime exception --> Resource not found .... ");
        }
        return xml1;
    }


}
