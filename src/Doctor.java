public class Doctor {
    private String firstName;
    private String lastName;
    private String am;
    private Prescription[] prescriptions;

    public Doctor(String fn,String ln,String am){

        this.firstName=fn;
        this.lastName=ln;
        this.am=am;
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

    public String getAm() {
        return am;
    }

    public void setAm(String am) {
        this.am = am;
    }

    public Prescription[] getPrescriptions() {
        return prescriptions;
    }

    public void setPrescriptions(Prescription[] prescriptions) {
        this.prescriptions = prescriptions;
    }
}
