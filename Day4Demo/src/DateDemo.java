import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.function.DoubleToIntFunction;

public class DateDemo {
    public static void display(){
        System.out.println("display1");
        System.out.println("display2");
        System.out.println("display3");
    }
    public static void main(String[] args) {
        String dateOfBirth="02-12-1998";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        if(k==0) {
            LocalDate convertedDob = LocalDate.parse(dateOfBirth, dateTimeFormatter);
            System.out.println(convertedDob);
        }
        DateTimeFormatter dateTimeFormatter1=DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        String date=dateTimeFormatter1.format(convertedDob);
        System.out.println(date);
    }
}
