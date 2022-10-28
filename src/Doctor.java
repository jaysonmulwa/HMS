import java.util.Date;

public class Doctor extends Staff{

    public String wardNumber;
    public String speciality;

    public Doctor(int _staffId, String _employmentStatus, Date _startDate, Date _endDate, String _education, String _certifications, String _languages, Date _birthDate, Address _address, Department _department, String _wardNumber, String _speciality) {
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
        speciality = _speciality;
    }

    public boolean givePrescription (Patient patient) {
        return true;
    }

    public boolean treatPatient (Patient patient) {
        return false;
    }
}