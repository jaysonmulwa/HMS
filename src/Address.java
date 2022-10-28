public class Address {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthDate;
    private boolean gender;
    private String homeAddress;
    private String phone;
    private String kinContacts;

    public Address (String _title, String _firstName, String _middleName, String _lastName, String _birthDate, boolean _gender, String _homeAddress, String _phone, String _kinContacts) {
        title = _title;
        firstName = _firstName;
        middleName = _middleName;
        lastName = _lastName;
        birthDate = _birthDate;
        gender = _gender;
        homeAddress = _homeAddress;
        phone = _phone;
        kinContacts = _kinContacts;
    }
}
