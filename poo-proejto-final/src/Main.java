import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


        LocalDateTime dataTimeInicial = LocalDateTime.of(2022, 05, 27, 19, 10, 0);

        LocalDateTime daeTimeFinal = dataTimeInicial.plusMinutes(120);



        System.out.println(daeTimeFinal);




    }
}