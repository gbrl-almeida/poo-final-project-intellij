import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Agenda {
    private Date dataInicial;
    private Calendar di;
    private Date dataFinal;
    private Calendar df;


    public Agenda() {
        dataInicial = new Date();
        dataFinal = new Date();

        this.di = Calendar.getInstance();
        this.df = Calendar.getInstance();

        di.setTime(dataInicial);

    }

}
