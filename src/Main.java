import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //!Sample scenario
        //0. Doctors and nurses available
        //1. Patient walks in
        //2. Books appointment
        //3. Sees Doctor
        //4. Sees Nurse
        //5. Makes Payment
        //Exits

        //0.Init Doctor
        Address doctorsAddress = new Address("Mr", "Joseph", "Off.", "Set.", new Date(), "M", "Kisumu", "+00000", "+00000s");
        Department doctorsDepartment = new Department("ENT");
        Doctor doctor = new Doctor("Employed", new Date(), null, "BMed.", "Certified", "English", new Date(), doctorsAddress, doctorsDepartment, "W001", "ENT");

        //0. Init Nurse
        Address nurseAddress = new Address("Miss", "Josephina", "Belcalis", "Bacardi", new Date(), "F", "Kisumu", "+00000", "+00000s");
        Department nurseDepartment = new Department("ENT");
        Nurse nurse= new Nurse("Employed", new Date(), null, "Nursing", "Nursing", "English", new Date(), nurseAddress, nurseDepartment, "W001");

        //1.
        Address patientAddress = new Address("Mr", "Joe", "Robert", "Biden", new Date(), "M", "Kisumu", "+00000", "+00000s");
        Patient patient = new Patient(31, 51, "Plumber", new Date(), null, null, "Lactose allergy", null, patientAddress);

        //2.
        Appointment appointment = new Appointment(new Date(), "To see doctor. In stable condition.", doctor.staffId);
        patient.bookAppointment(appointment);

        //3.
        doctor.treatPatient(patient);
        doctor.givePrescription(patient);

        //4.
        nurse.attendToPatient(patient);
        nurse.administerInjection(patient);

        //5.
        Payment payment = new Payment("MPESA", 3000.0, "KSH", patient.id, appointment.appointmentId);
        patient.makePayment(payment, appointment);

        //-----------------------------Checks---------------//

        for (int x = 0; x < patient.appointmentList.size(); x++) {
            System.out.println("\n Appointment: " + patient.appointmentList.get(x).appointmentDescription);
        }

        for (int x = 0; x < patient.historyList.size(); x++) {
            System.out.println("\n History: " + patient.historyList.get(x).narrative);
        }

        System.out.println("\n " + payment.paymentMethod+ ": " + patient.address.getFullName() + " has paid " + payment.currencyCode + " "+ payment.paymentAmount);
    }
}