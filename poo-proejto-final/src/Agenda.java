import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Agenda {
    private ArrayList<Reserva> reservas;

    private Escritorio escritorio;


    public Agenda(String nomeEscritorio) {
        this.reservas = new ArrayList<Reserva>();
        this.escritorio = new Escritorio(nomeEscritorio);
    }

    public void  addReserva(Reserva reserva) {
        boolean valido = false;
        try {
            for (int counter = 0; counter < reservas.size(); counter++) {
                if (reserva.getDataHoraInicialReservada().isAfter(reservas.get(counter).getDataHoraFinalReservada()) || reserva.getDataHoraInicialReservada().isEqual(reservas.get(counter).getDataHoraFinalReservada())) {
                    valido = true;
                } else if (reserva.getDataHoraFinalReservada().isAfter(reservas.get(counter).getDataHoraInicialReservada())) {

                }
            }


        }
    }

}
