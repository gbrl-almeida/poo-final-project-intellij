import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class Reserva {
    private String nome;

    private String id;
    private LocalDateTime dataHoraReservada;
    private String descricao;

    public Reserva(String nome, LocalDateTime dataHoraReservada, String descricao ) {
        this.nome = nome;
        this.id = UUID.randomUUID().toString();
        this.dataHoraReservada = dataHoraReservada;
        this.descricao = descricao;
    }

    public LocalDateTime getDataHoraReservada() {
        return dataHoraReservada;
    }

    public String getDayReservada() {
        String day = String.format("%d", dataHoraReservada.getDayOfMonth());
        return day;
    }
    public String getMonthReservada() {
        String month = String.format("%d", dataHoraReservada.getMonthValue());
        return month;
    }

    public String getYearReservada() {
        String year = String.format("%d", dataHoraReservada.getYear());
        return year;
    }

    public String getHourReservada() {
        String hour = String.format("%d", dataHoraReservada.getHour());
        return hour;
    }

    public String getMinuteReservada() {
        String minute = String.format("%d", dataHoraReservada.getMinute());
        return minute;
    }

    public LocalDateTime getHoraReservada() {
        return dataHoraReservada;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getId() {
        return id;
    }

    public String getReservaString() {
        String reservaString =
                "--------------------------------------\n" +
                "Nome -> " + getNome() + "\n" +
                "Descrição -> " + getDescricao() + "\n" +
                "Data -> " + getDayReservada() + "/" + getMonthReservada() + "/" + getYearReservada() + " às " + getHourReservada() + ":" + getMinuteReservada() + "\n" +
                "Id -> " + getId();
        return reservaString;
    }






}
