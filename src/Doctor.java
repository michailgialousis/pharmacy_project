public class Doctor {
    private String firstName;
    private String lastName;
    private String am;
    private Prescription[] prescriptions;
    private int numOfPrescriptions;

    public Doctor(String fn, String ln, String am) {

        this.firstName = fn;
        this.lastName = ln;
        this.am = am;
        this.numOfPrescriptions = 0;
        this.prescriptions = new Prescription[50];
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

    public void addPrescription(Prescription prescription) {
        prescriptions[numOfPrescriptions] = prescription;
        numOfPrescriptions++;
    }

    public void print() {
        System.out.println("Doctor's Id: " + am + ", Firstname: " + firstName + ", Lastname: " + lastName);
        for (int i = 0; i < numOfPrescriptions; i++) {
            prescriptions[i].print();
        }
    }
}
