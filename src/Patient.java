public class Patient {
    private String firstName;
    private String lastName;
    private String amka;
    private Prescription[] prescriptions;

    public Patient(String fn,String ln,String amka){

        this.firstName=fn;
        this.lastName=ln;
        this.amka=amka;
        this.prescriptions=prescriptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
    }

    public Prescription[] getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Prescription[] prescriptions) {
        this.prescriptions = prescriptions;
    }
}
