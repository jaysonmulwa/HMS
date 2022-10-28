import java.util.ArrayList;
import java.util.Date;

public class Patient {

    private int id;
    private int age;
    private int weight;
    private String occupation;
    private Date dateAdmitted;
    private String sickness;
    private String prescription;
    private String allergies;
    private String specialRequests;
    private Address address;
    public ArrayList<History> historyList;

    public Patient (int id, int age, int weight, String occupation, Date dateAdmitted, String sickness, String prescription, String allergies, String specialRequests, Address address) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.occupation = occupation;
        this.dateAdmitted = dateAdmitted;
        this.sickness = sickness;
        this.prescription = prescription;
        this.allergies = allergies;
        this.specialRequests = specialRequests;
        this.address = address;
        ArrayList<History> _hs = new ArrayList<History>();
        this.historyList = _hs;
    }
    public Appointment bookAppointment() {
        return null;
    }
}
