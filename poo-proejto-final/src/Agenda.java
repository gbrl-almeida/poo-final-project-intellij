
import java.util.ArrayList;

public class Agenda{
    private final ArrayList<Reserva> reservas;

    public Agenda() {
        this.reservas = new ArrayList<>();
    }
    public void printReservas() {
        for (int i=0; i<size(); i++) {
            String curr = reservas.get(i).toString();

            System.out.println( "Id: " + (i+1) + "\n" + curr);
        }
    }

    public int size() {
       return reservas.size();
    }

    public void removeReserva(int id) {
        if (id > size() - 1 ) {
            throw new IllegalArgumentException("Não existe reserva com o id informado");
        } else {
            reservas.remove(id);
        }
    }

    public void addReserva(Reserva reserva) {
        boolean valido = true;
        for (Reserva value : reservas) {
            if (reserva.getDataHoraFinalReservada().isAfter((value.getDataHoraInicialReservada())) && (reserva.getDataHoraFinalReservada().isBefore((value.getDataHoraFinalReservada())) || reserva.getDataHoraFinalReservada().isEqual((value.getDataHoraFinalReservada())))) {
                valido = false;
                System.out.println("1-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                break;
            } else if ((reserva.getDataHoraInicialReservada().isAfter((value.getDataHoraInicialReservada())) || reserva.getDataHoraInicialReservada().isEqual((value.getDataHoraInicialReservada()))) && (reserva.getDataHoraInicialReservada().isBefore(value.getDataHoraFinalReservada()))) {
                valido = false;
                System.out.println("2-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                break;
            } else if (reserva.getDataHoraInicialReservada().isBefore((value.getDataHoraInicialReservada())) && reserva.getDataHoraFinalReservada().isAfter((value.getDataHoraFinalReservada()))) {
                valido = false;
                System.out.println("3-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                break;
            }
        }

        if (valido) {
            reservas.add(reserva);
        }
    }
}
