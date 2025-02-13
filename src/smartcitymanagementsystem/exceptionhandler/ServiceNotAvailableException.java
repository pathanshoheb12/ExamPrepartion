package smartcitymanagementsystem.exceptionhandler;

public class ServiceNotAvailableException extends  RuntimeException{
    public ServiceNotAvailableException(String msg)
    {
        super(msg);
    }
}
