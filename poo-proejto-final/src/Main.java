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
            System.out.println("Qual a data que deseja reservar? (DD/MM/AAAA)");
            String r2 = q2.nextLine();

            Scanner q3 = new Scanner (System.in);
            System.out.println("Qual o horário da reserva? (HH:MM)");
            String r3 = q3.nextLine();

            Scanner q4 = new Scanner (System.in);
            System.out.println("Qual o nome da reserva?");
            String r4 = q4.nextLine();

            Scanner q5 = new Scanner (System.in);
            System.out.println("Descrição (opcional)");
            String r5 = q5.nextLine();

            String nomeReserva = r4;
            String descricao = r5;

            String data[] = new String[3];
            data = r2.split("/");

            String hora[] = new String[3];
            hora = r3.split("/");
            LocalDateTime DataHora = LocalDateTime.of(data[2], data[1], data[0], hora[0], hora[1], 0);



           // Reserva reservaCriada = new Reserva()

        }

        //Reserva testeReserva = new Reserva("onboarding dev", agora, "ensinando a galera a usar o notion");
        //Reserva testeReserva1 = new Reserva("onboarding dev", agora, "ensinando a galera a usar o notion");

        //System.out.println(testeReserva.getReservaString());
        //System.out.println(testeReserva1.getReservaString());




    }
}