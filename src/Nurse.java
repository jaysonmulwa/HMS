import java.util.Date;

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

    public Patient attendToPatient(Patient patient) {
        return patient;
    }

    public void administerInjection() {

    }
}
