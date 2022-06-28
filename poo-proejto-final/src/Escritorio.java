import java.util.ArrayList;

public class Escritorio {
    private String nome;
    private ArrayList<Sala> salas;

    public Escritorio(String nome) {
        this.nome = nome;
        this.salas = new ArrayList<Sala>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void addSala(Sala salaRecebida) {
        salas.add(salaRecebida);
    }

    public void printSalas() {
        for (int i=0; i<salas.size(); i++) {
            String curr = salas.get(i).getNome();
            System.out.println(curr);
        }
    }

    public Sala selecionarSala(String nome) {
        Sala salaSelecionado = null;
        for (int i=0; i<salas.size(); i++) {
            if (nome.equals(salas.get(i).getNome())) {
                salaSelecionado = salas.get(i);
            }
        }
        return salaSelecionado;
    }
}
