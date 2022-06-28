import java.util.ArrayList;

public class Escritorio {
    private String nome;
    private final ArrayList<Sala> salas;

    public Escritorio(String nome) {
        this.nome = nome;
        this.salas = new ArrayList<>();
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
        for (Sala sala : salas) {
            String curr = sala.getNome();
            System.out.println(curr);
        }
    }

    public Sala selecionarSala(String nome) {
        Sala salaSelecionado = null;
        for (Sala sala : salas) {
            if (nome.equals(sala.getNome())) {
                salaSelecionado = sala;
            }
        }
        return salaSelecionado;
    }
}
