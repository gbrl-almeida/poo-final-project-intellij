import java.util.ArrayList;
import java.util.Calendar;

public class Agenda {
    private ArrayList<Calendar> agenda;

    public Agenda() {
        this.agenda = new ArrayList<Calendar>();
    }

    public Object getAll() {
        for( int i = 0; i < this.agenda.size(); i++) {
            System.out.println(this.agenda.get(i).getTime());
        }
        return agenda;
    }
}
