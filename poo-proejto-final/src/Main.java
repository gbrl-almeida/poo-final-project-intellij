import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        Reserva testeReserva = new Reserva("onboarding dev", agora, "ensinando a galera a usar o notion");
        Reserva testeReserva1 = new Reserva("onboarding dev", agora, "ensinando a galera a usar o notion");

        System.out.println(testeReserva.getReservaString());
        System.out.println(testeReserva1.getReservaString());




    }
}