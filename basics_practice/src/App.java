import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        LocalDate n = LocalDate.now();
        System.out.println(n);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);

        DateTimeFormatter formatTimeObj = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm::ss");

        String formattedDate = datetime.format(formatTimeObj);
        System.out.println("after format " + formattedDate);

    }
}
