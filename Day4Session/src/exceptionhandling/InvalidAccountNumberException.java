package exceptionhandling;

public class InvalidAccountNumberException extends Exception{
    InvalidAccountNumberException(String msg){
        super(msg);

    }
}
