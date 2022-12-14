import java.util.Date;
import java.util.Random;

public class Doctor extends Staff{

    public String wardNumber;
    public String speciality;

    public Doctor(String _employmentStatus, Date _startDate, Date _endDate, String _education, String _certifications, String _languages, Date _birthDate, Address _address, Department _department, String _wardNumber, String _speciality) {
        Random rand = new Random();
        this.staffId  = rand.nextInt(1000);
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
        speciality = _speciality;
    }

    public boolean givePrescription (Patient patient) {
        patient.setPrescription("3 tablets, 3 times a day"); // gives prescription here
        History history = new History(new Date(), "Prescription: 3 tablets, 3 times a day", this.staffId);
        patient.historyList.add(history);
        return true;
    }

    public boolean treatPatient (Patient patient) {
        patient.setSickness("Malaria"); // diagnoses sickness here
        History history = new History(new Date(), "Treated for: Malaria", this.staffId);
        patient.historyList.add(history);
        return true;
    }
}