import java.util.ArrayList;

public class Escritorios {
    private final ArrayList<Escritorio> escritorios;


    public Escritorios() {
        this.escritorios = new ArrayList<>();
    }

    public void printEscritorios() {
        for (Escritorio escritorio : escritorios) {
            String curr = escritorio.getNome();
            System.out.println(curr);
        }
    }

    public Escritorio selecionarEscritorio(String nome) {
        Escritorio escritorioSelecionado = null;
        for (Escritorio escritorio : escritorios) {
            if (nome.equals(escritorio.getNome())) {
                escritorioSelecionado = escritorio;
            }
        }
        return escritorioSelecionado;
    }

    public void addEscritorio(Escritorio escritorioRecebido) {
        escritorios.add(escritorioRecebido);

    }
}
