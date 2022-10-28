import java.util.Date;
import java.util.Random;

public class Appointment {
    public int appointmentId;
    public Date appointmentDate;
    public String appointmentDescription;
    public int staffId;

    public Appointment (Date _appointmentDate, String _appointmentDescription, int _staffId) {
        Random rand = new Random();
        appointmentId = rand.nextInt(1000);
        appointmentDate = _appointmentDate;
        appointmentDescription = _appointmentDescription;
        staffId = _staffId;
    }
}
