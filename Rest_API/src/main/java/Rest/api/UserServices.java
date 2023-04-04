package Rest.api;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

//import static Rest.api.UserDAO.Users;

@RestController
public class UserServices {

    /*private MessageSource messageSource;
    public UserServices(MessageSource messageSource)
    {
        this.messageSource = messageSource;
    }*/

    @Autowired
    private UserDAO service;

    public UserServices(UserDAO service)
    {
        this.service = service;
    }

    @GetMapping("/users")
    public List<user> retrieve()
    {
        return service.findAl();
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(code= HttpStatus.NOT_FOUND)
    public user retrieveOne(@PathVariable int id)
    {
        user ur = service.findOne(id);
        if(ur==null)
        {
            throw new ResourceNotFound("id this is runtime exception --> Resource not found .... "+id);
        }
        return ur;
    }


    //for hateoas
    //the Entity Model and WebMvcLinkBuilder both are needed
    @GetMapping("/users/hateoas/{id}")
    //@ResponseStatus(code= HttpStatus.NOT_FOUND)
    public EntityModel<user> retrieveOneByHateoas(@PathVariable int id)
    {
        user ur = service.findOne(id);
        if(ur==null)
        {
            throw new ResourceNotFound("id this is runtime exception --> Resource not found .... "+id);
        }

        EntityModel<user> entityModel = EntityModel.of(ur);
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).retrieve());
        WebMvcLinkBuilder link2 = linkTo(methodOn(this.getClass()).retrieveOne(id));

        entityModel.add(link.withRel("all-users"), link2.withSelfRel());

        return entityModel;
    }

    @PostMapping("/users/post")
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    public user createOne(@Valid @RequestBody user us)
    {
        return service.save(us);
    }

    @DeleteMapping("/users/{id}")
    public void deleteOne(@PathVariable int id)
    {
        service.deleteById(id);
    }

    @PutMapping("/users/{id}")
    public user updateOne(@RequestBody user ur ,@PathVariable int id)
    {
        service.updateById(ur ,id);
        return ur;
    }


}
