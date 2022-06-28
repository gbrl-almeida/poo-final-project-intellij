import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Escritorio escritorioTeste = new Escritorio("trade1");
        Escritorio escritorioTeste2 = new Escritorio("trade2");
        Escritorios escritoriosDisponiveis = new Escritorios();
        escritoriosDisponiveis.addEscritorio(escritorioTeste);
        escritoriosDisponiveis.addEscritorio(escritorioTeste2);

        Sala salaTeste = new Sala("sala1", 10, true);
        Sala salaTeste2 = new Sala("sala2", 1, false);
        Sala salaTeste3 = new Sala("sala1", 2, false);

        escritorioTeste.addSala(salaTeste);
        escritorioTeste.addSala(salaTeste2);
        escritorioTeste2.addSala(salaTeste3);


        Reserva reservaTeste = new Reserva("teste1", "a", LocalDateTime.of(2022, 6, 28, 10, 10, 0), LocalDateTime.of(2022, 6, 28, 10, 30, 0));
        Reserva reservaTeste2 = new Reserva("teste2", "a", LocalDateTime.of(2023, 6, 28, 10, 10, 0), LocalDateTime.of(2023, 6, 28, 10, 30, 0));

        Sala sala = selecaoSala(escritoriosDisponiveis);

        sala.addReserva(reservaTeste);
        sala.addReserva(reservaTeste2);

        int triagem1 = 0;
        while (triagem1 != 6) {
            triagem1 = triagem();


            if (triagem1 == 1) {
                verAgenda(sala);
                System.out.println("chegou em triagem = 1");
            }

            if (triagem1 == 2) {

                criarReserva(sala);

                System.out.println("tamanho da agenda:" + String.valueOf(sala.size()));
            }
        }
    }

    public static Sala selecaoSala( Escritorios escritoriosDisponiveis) {
            Scanner q1 = new Scanner(System.in);
            System.out.println("Qual escritório você quer gerenciar? (Digite o nome exato)");
            escritoriosDisponiveis.printEscritorios();
            String r1 = q1.nextLine();

            Escritorio escritorioSelecionado = escritoriosDisponiveis.selecionarEscritorio(r1);

            Scanner q2 = new Scanner(System.in);
            System.out.println("Qual sala desse escritório? (Digite o nome exato)");
            escritorioSelecionado.printSalas();
            String r2 = q2.nextLine();

            return escritorioSelecionado.selecionarSala(r2);
        }
    public static int triagem() {
        Scanner q1 = new Scanner (System.in);
        System.out.println ("Escolha uma opção : " +
                "\n 1- Ver Agenda " +
                "\n 2- Fazer uma Reservar " +
                "\n 3- Cancelar uma Reserva " +
                "\n 4- Adicionar Sala " +
                "\n 5- Adicionar Escritório " +
                "\n 6- Fechar " );
        String r1 = q1.nextLine();
        int intR1 = Integer.parseInt(r1);
        return intR1;
    }

    public static void criarEscritorio(String nomeEscritorio) {
        Escritorio escritorio = new Escritorio(nomeEscritorio);
    }

    public static void verAgenda(Sala sala) {
        sala.printAgenda();
        System.out.println("chegou em verAgenda");
    }
    public static void criarReserva(Sala sala) {
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

        String data[];
        data = r2.split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        String hora[];
        hora = r3.split(":");
        int hour = Integer.parseInt(hora[0]);
        int minuto = Integer.parseInt(hora[1]);

        String horaAdd[];
        horaAdd = r4.split(":");
        int hourAdd = Integer.parseInt(horaAdd[0]);
        int minutoAdd = Integer.parseInt(horaAdd[1]);

        LocalDateTime DataHoraInicial = LocalDateTime.of(ano, mes, dia, hour, minuto, 0);
        LocalDateTime DataHoraFinal = DataHoraInicial.plusHours(hourAdd).plusMinutes(minutoAdd);

        Reserva reservaCriada = new Reserva(nomeReserva, descricao, DataHoraInicial, DataHoraFinal);

        sala.addReserva(reservaCriada);

    };
}