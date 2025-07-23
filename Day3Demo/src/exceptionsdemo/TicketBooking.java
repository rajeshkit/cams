package exceptionsdemo;

import java.io.FileNotFoundException;

public class TicketBooking {
    public static void main(String[] args) {
        System.out.println("Line 1");
        int totalSeats=0;
        if(totalSeats<=0){
            throw new NoSeatsAvailableException("Tickets sold out");
        }else {
            System.out.println("Booking successfull");
        }
        System.out.println("Line 2");
    }
}
