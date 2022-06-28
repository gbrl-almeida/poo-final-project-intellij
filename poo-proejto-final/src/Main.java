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

        Pessoa funcionario = selecaoFuncionario();

        Reserva reservaTeste = new Reserva("teste1", "a", LocalDateTime.of(2022, 6, 28, 10, 10, 0), LocalDateTime.of(2022, 6, 28, 10, 30, 0), funcionario);
        Reserva reservaTeste2 = new Reserva("teste2", "a", LocalDateTime.of(2023, 6, 28, 10, 10, 0), LocalDateTime.of(2023, 6, 28, 10, 30, 0), funcionario);



        Escritorio escritorio = selecaoEscritorio(escritoriosDisponiveis);
        Sala sala = selecaoSala(escritorio);

        sala.addReserva(reservaTeste);
        sala.addReserva(reservaTeste2);

        int triagem1 = 0;
        while (triagem1 != 6) {
            triagem1 = triagem();


            if (triagem1 == 1) {
                verAgenda(sala);
            }

            if (triagem1 == 2) {

                criarReserva(sala, funcionario);
            }

            if (triagem1 == 3) {

                cancelarReserva(sala);
            }

            if (triagem1 == 4) {

                criarSala(escritorio);
            }
        }
    }


    public static Escritorio selecaoEscritorio( Escritorios escritoriosDisponiveis) {
            Scanner q1 = new Scanner(System.in);
            System.out.println("Qual escritório você quer gerenciar? (Digite o nome exato)");
            escritoriosDisponiveis.printEscritorios();
            String r1 = q1.nextLine();

            return escritoriosDisponiveis.selecionarEscritorio(r1);
        }
    public static Pessoa selecaoFuncionario() {

        Scanner q1 = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String r1 = q1.nextLine();

        Scanner q2 = new Scanner(System.in);
        System.out.println("Qual seu cargo?");
        String r2 = q2.nextLine();

        return new Pessoa(r1, r2);
    }

    public static Sala selecaoSala(Escritorio escritorio) {
        Scanner q1 = new Scanner(System.in);
        System.out.println("Qual sala desse escritório? (Digite o nome exato)");
        escritorio.printSalas();
        String r1 = q1.nextLine();

        return escritorio.selecionarSala(r1);
    }
    public static int triagem() {
        Scanner q1 = new Scanner (System.in);
        System.out.println ("""
                Escolha uma opção :\s
                 1- Ver Agenda\s
                 2- Fazer uma Reservar\s
                 3- Cancelar uma Reserva\s
                 4- Criar Nova Sala para o Escritorio Atual""");
        String r1 = q1.nextLine();
        return Integer.parseInt(r1);
    }

    public static void criarSala(Escritorio escritorio) {
        Scanner q1 = new Scanner(System.in);
        System.out.println("Qual será o nome da sala?");
        String r1 = q1.nextLine();

        Scanner q2 = new Scanner(System.in);
        System.out.println("Qual será a capacidade da sala?");
        int r2 = q2.nextInt();

        Scanner q3 = new Scanner(System.in);
        System.out.println("A sala tem projetor? false para não e true para sim");
        boolean r3 = q3.nextBoolean();

        Sala salaCriada = new Sala(r1, r2, r3);
        escritorio.addSala(salaCriada);
    }


    public static void verAgenda(Sala sala) {
        sala.printAgenda();
    }

    public static void cancelarReserva(Sala sala) {
        Scanner q1 = new Scanner (System.in);
        System.out.println("Qual a reserva que deseja cancelar");
        verAgenda(sala);
        int r1 = q1.nextInt();
        sala.removeReserva(r1 - 1);

    }
    public static void criarReserva(Sala sala, Pessoa funcionario) {
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

        String descricao = q6.nextLine();

        String[] data;
        data = r2.split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        String[] hora;
        hora = r3.split(":");
        int hour = Integer.parseInt(hora[0]);
        int minuto = Integer.parseInt(hora[1]);

        String[] horaAdd;
        horaAdd = r4.split(":");
        int hourAdd = Integer.parseInt(horaAdd[0]);
        int minutoAdd = Integer.parseInt(horaAdd[1]);

        LocalDateTime DataHoraInicial = LocalDateTime.of(ano, mes, dia, hour, minuto, 0);
        LocalDateTime DataHoraFinal = DataHoraInicial.plusHours(hourAdd).plusMinutes(minutoAdd);

        Reserva reservaCriada = new Reserva(r5, descricao, DataHoraInicial, DataHoraFinal, funcionario);

        sala.addReserva(reservaCriada);

    }
}