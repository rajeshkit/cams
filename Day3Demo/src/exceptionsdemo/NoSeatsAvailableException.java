package exceptionsdemo;

public class NoSeatsAvailableException extends RuntimeException{
    public NoSeatsAvailableException(String msg)
    {
        super(msg);
    }
}
