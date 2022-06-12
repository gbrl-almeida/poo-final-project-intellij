import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        Scanner q1 = new Scanner (System.in);
        System.out.println ("Escolha uma opção : \n 1- Ver Reservas existentes \n 2- Fazer uma Reservar\n 3- Cancelar uma Reserva");
        String r1 = q1.nextLine();
        int intR1 = Integer.parseInt(r1);

        /*if (r1 == "1" ) {

        } */

        if (intR1 == 2 ) {
            Scanner q2 = new Scanner (System.in);
            System.out.println("Para qual dia é a reserva? (DD/MM/AAAA)");
            String r2 = q2.nextLine();

            Scanner q3 = new Scanner (System.in);
            System.out.println("Quando vai começar a reserva? (HH:MM)");
            String r3 = q3.nextLine();

            Scanner q4 = new Scanner (System.in);
            System.out.println("Qual a duração da reserva? (HH:MM)");
            String r4 = q4.nextLine();

            Scanner q5 = new Scanner (System.in);
            System.out.println("Qual o nome da reserva?");
            String r5 = q5.nextLine();

            Scanner q6 = new Scanner (System.in);
            System.out.println("Descrição (opcional)");
            String r6= q6.nextLine();

            String nomeReserva = r5;
            String descricao = r6;

            String data[] = new String[3];
            data = r2.split("/");
            int dia = Integer.parseInt(data[0]);
            int mes = Integer.parseInt(data[1]);
            int ano = Integer.parseInt(data[2]);

            String hora[] = new String[2];
            hora = r3.split(":");
            int hour = Integer.parseInt(data[0]);
            int minuto = Integer.parseInt(data[1]);

            String horaAdd[] = new String[2];
            horaAdd = r4.split(":");
            int hourAdd = Integer.parseInt(data[0]);
            int minutoAdd = Integer.parseInt(data[1]);

            LocalDateTime DataHoraInicial = LocalDateTime.of(ano, mes, dia, hour, minuto, 0);
            LocalDateTime DataHoraFinal = DataHoraInicial.plusHours(hourAdd).plusMinutes(minutoAdd);

            Reserva reservaCriada = new Reserva(nomeReserva, descricao, DataHoraInicial, DataHoraFinal);



        }
    }
}