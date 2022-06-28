
public class Sala {

    private String nome;
    private int capacidade;
    private final boolean temProjetor;

    private final Agenda agenda;


    public Sala(String nome, int capacidade, boolean temProjetor) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
        this.agenda = new Agenda();
    }

    public void printAgenda() {
        agenda.printReservas();
    }

    public void addReserva(Reserva reserva) {
        agenda.addReserva(reserva);
    }

    public void removeReserva(int id) {
        agenda.removeReserva(id);
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int novaCapacidade) {
        this.capacidade = novaCapacidade;
    }

}
