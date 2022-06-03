import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Agenda {
    private ArrayList<Reserva> reservas;

    private String escritorio;

    public Agenda(String escritorio) {
        this.reservas = new ArrayList<Reserva>();

        this.escritorio = escritorio;

    }

}
