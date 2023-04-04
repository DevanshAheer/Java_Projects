package POST.api;
// Implement POST http request for Employee to create a new employee. versioning

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningAll {

    @GetMapping("/v1/person")
    public personv1 getFirstVersionOfPerson()
    {
        return new personv1("Devansh Aheer");
    }

    @GetMapping(path="/person", params = "version=1")
    public personv1 getFirstVersionOfPersonRequestParameter()
    {
        return new personv1("Devansh Aheer");
    }

    @GetMapping(path = "/person/header", headers= "X-API-VERSION=1")
    public personv1 getFirstOfPersonHeaders()
    {
        return new personv1("Devansh Aheer");
    }

    @GetMapping(path="/person/accept", produces= "application/vnd.company.app-v1+json")
    public personv1 getFirstVersionOfPersonAcceptHeader()
    {
        return new personv1("Devansh Aheer");
    }

    @GetMapping("/v2/person")
    public personv2 getSecondVersionOfPerson()
    {
        return new personv2(new namingPerson("Devansh", "Aheer"));
    }

    @GetMapping(path = "/person", params = "version=2")
    public personv2 getSecondVersionOfPersonRequestParameter()
    {
        return new personv2(new namingPerson("Devansh", "Aheer"));
    }

    @GetMapping(path ="/person/headers", headers= "X-API-VERSION=2")
    public personv2 getSecondOfPersonVersions()
    {
        return new personv2(new namingPerson("Devansh", "Aheer"));
    }

    @GetMapping(path="/person/accept", produces= "application/vnd.company.app-v2+json")
    public personv2 getSecondVersionOfPersonAcceptHeader()
    {
        return new personv2(new namingPerson("Devansh", "Aheer"));
    }
}



