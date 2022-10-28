import java.util.Date;
import java.util.Random;

public class Nurse extends Staff{
    public String wardNumber;

    public Nurse(int _staffId, String _employmentStatus, Date _startDate, Date _endDate, String _education, String _certifications, String _languages, Date _birthDate, Address _address, Department _department, String _wardNumber) {
        staffId = _staffId;
        employmentStatus = _employmentStatus;
        startDate = _startDate;
        endDate = _endDate;
        education = _education;
        certifications = _certifications;
        languages = _languages;
        birthDate = _birthDate;
        address = _address;
        department = _department;
        wardNumber = _wardNumber;
    }

    public boolean attendToPatient(Patient patient) {
        Random rand = new Random();
        int historyId  = rand.nextInt(1000);
        History history = new History(historyId, new Date(), "Attended to by nurse", this.staffId);
        patient.historyList.add(history);
        return true;
    }

    public boolean administerInjection(Patient patient) {
        Random rand = new Random();
        int historyId  = rand.nextInt(1000);
        History history = new History(historyId, new Date(), "Received injection", this.staffId);
        patient.historyList.add(history);
        return true;
    }
}
