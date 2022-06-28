import java.util.ArrayList;

public class Escritorios {
    private ArrayList<Escritorio> escritorios;



    public Escritorios() {
        this.escritorios = new ArrayList<Escritorio>();
    }

    public void printEscritorios() {
        for (int i=0; i<escritorios.size(); i++) {
            String curr = escritorios.get(i).getNome();
            System.out.println(curr);
        }
    }

    public int getQuantidadeEscritorios() {
        return escritorios.size();
    }

    public Escritorio selecionarEscritorio(String nome) {
        Escritorio escritorioSelecionado = null;
        for (int i=0; i<escritorios.size(); i++) {
            if (nome.equals(escritorios.get(i).getNome())) {
                escritorioSelecionado = escritorios.get(i);
            }
        }
        return escritorioSelecionado;
    }

    public void addEscritorio(Escritorio escritorioRecebido) {
        escritorios.add(escritorioRecebido);

    }
}
