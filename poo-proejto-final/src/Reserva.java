import java.util.Calendar;

public class Reserva {
    private String nome;
    private Calendar dataReservada;
    private String descricao;

    public Reserva(String nome, Calendar dataReservada, String descricao ) {
        this.nome = nome;
        this.dataReservada = dataReservada;
        this.descricao = descricao;
    }

    public Calendar getDataReservada() {
        return dataReservada;
    }
}
