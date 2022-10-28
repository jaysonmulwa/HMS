import java.util.Date;

public class Appointment {
    public int appointmentId;
    public Date appointmentDate;
    public String appointmentDescription;
    public int staffId;

    public Appointment (int _appointmentId, Date _appointmentDate, String _appointmentDescription, int _staffId) {
        appointmentId = _appointmentId;
        appointmentDate = _appointmentDate;
        appointmentDescription = _appointmentDescription;
        staffId = _staffId;
    }
}
