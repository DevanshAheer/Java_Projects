package Rest.api;

public class ResourceNotFound extends RuntimeException{
    public ResourceNotFound(String s) {
        super(s);
    }
}
