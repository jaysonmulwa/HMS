public class Doctor extends Staff{

    public String wardNumber;
    public String speciality;

    public Doctor() {

    }

    public void givePrescription () {
        // we probably require a new prescription class for this.
    }

    public Patient treatPatient (Patient patient) {
        return patient;
    }
}