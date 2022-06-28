public class Sala extends Agenda {

    private String nome;
    private int capacidade;
    private boolean temProjetor;

    private Agenda agenda;


    public Sala(String nome, int capacidade, boolean temProjetor) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.temProjetor = temProjetor;
        this.agenda = new Agenda();
    }

    public void printAgenda() {
        agenda.printReservas();
        System.out.println("chegou em printAgenda");
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
