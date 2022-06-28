
import java.util.ArrayList;

public class Agenda{
    private ArrayList<Reserva> reservas;

    public Agenda() {
        this.reservas = new ArrayList<Reserva>();
    }
    public void printReservas() {
        System.out.println("chegou em printReservas");
        System.out.println(size());
        for (int i=0; i<size(); i++) {
            String curr = reservas.get(i).getReservaString();

            System.out.println(curr);
        }
    }

    public int size() {
       return reservas.size();
    }

    public void addReserva(Reserva reserva) {
        boolean valido = true;
            for (int counter = 0; counter < reservas.size(); counter++) {
                if (reserva.getDataHoraFinalReservada().isAfter((reservas.get(counter).getDataHoraInicialReservada())) && (reserva.getDataHoraFinalReservada().isBefore((reservas.get(counter).getDataHoraFinalReservada())) || reserva.getDataHoraFinalReservada().isEqual((reservas.get(counter).getDataHoraFinalReservada())))) {
                    valido = false;
                    System.out.println("1-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                    break;
                } else if ((reserva.getDataHoraInicialReservada().isAfter((reservas.get(counter).getDataHoraInicialReservada())) || reserva.getDataHoraInicialReservada().isEqual((reservas.get(counter).getDataHoraInicialReservada()))) && (reserva.getDataHoraInicialReservada().isBefore(reservas.get(counter).getDataHoraFinalReservada()))) {
                    valido = false;
                    System.out.println("2-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                    break;
                } else if (reserva.getDataHoraInicialReservada().isBefore((reservas.get(counter).getDataHoraInicialReservada())) && reserva.getDataHoraFinalReservada().isAfter((reservas.get(counter).getDataHoraFinalReservada()))) {
                    valido = false;
                    System.out.println("3-Já existe uma reserva que comtempla esse mesmo intervalo duração nessa sala. Por favor, escolhe um horário diferente.");
                    break;
                }


            }

        if (valido == true) {
            System.out.println("adicionou");
            reservas.add(reserva);
        }
    }
}
