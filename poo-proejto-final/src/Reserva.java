import java.time.LocalDateTime;
import java.util.Objects;

public class Reserva {
    private final String nome;
    private final String descricao;
    private final LocalDateTime dataHoraInicialReservada;
    private final LocalDateTime dataHoraFinalReservada;
    private final Pessoa funcionario;

    public Reserva(String nome, String descricao, LocalDateTime dataHoraReservada, LocalDateTime dataHoraFinalReservada, Pessoa funcionario ) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataHoraInicialReservada = dataHoraReservada;
        this.dataHoraFinalReservada = dataHoraFinalReservada;
        this.funcionario = funcionario;
    }

    public LocalDateTime getDataHoraInicialReservada() {
        return dataHoraInicialReservada;
    }

    public LocalDateTime getDataHoraFinalReservada() {
        return dataHoraFinalReservada;
    }

    public String getDay(String tipo) {
        String day;
        if (Objects.equals(tipo, "inicial")) {
            day = String.format("%d", dataHoraInicialReservada.getDayOfMonth());
        }
        else {
            day = String.format("%d", dataHoraFinalReservada.getDayOfMonth());
        }
        return day;
    }

    public String getMonth(String tipo) {
        String month;
        if (Objects.equals(tipo, "inicial")) {
            month = String.format("%d", dataHoraInicialReservada.getMonthValue());
        }
        else {
            month = String.format("%d", dataHoraFinalReservada.getMonthValue());
        }
        return month;

    }

    public String getYear(String tipo) {
        String year;
        if (Objects.equals(tipo, "inicial")) {
            year = String.format("%d", dataHoraInicialReservada.getYear());
        }
        else {
            year = String.format("%d", dataHoraFinalReservada.getYear());
        }
        return year;
    }

    public String getHour(String tipo) {
        String hour;
        if (Objects.equals(tipo, "inicial")) {
            hour = String.format("%d", dataHoraInicialReservada.getHour());
        }
        else {
            hour = String.format("%d", dataHoraFinalReservada.getHour());
        }
        return hour;
    }

    public String getMinute(String tipo) {
        String minute;
        if (Objects.equals(tipo, "inicial")) {
            minute = String.format("%d", dataHoraInicialReservada.getMinute());
        }
        else {
            minute = String.format("%d", dataHoraFinalReservada.getMinute());
        }
        return minute;
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  "Nome -> " + getNome() + "\n" +
                "Descrição -> " + getDescricao() + "\n" +
                "Inicia em-> " + getDay("inicial") + "/" + getMonth("inicial") + "/" + getYear("inicial") + " às " + getHour("inicial") + ":" + getMinute("inicial") + "\n" +
                "Termina em-> " + getDay("final") + "/" + getMonth("final") + "/" + getYear("final") + " às " + getHour("final") + ":" + getMinute("final") + "\n" +
                "Funcionário -> " + funcionario.getNome() + " " + funcionario.getCargo() + "\n" +
                "--------------------------------------";
    }
}
