public class Patient {
    private String firstName;
    private String lastName;
    private String amka;
    private Prescription[] prescriptions;
    private int numOfPrescriptions;

    public Patient(String fn,String ln,String amka){

        this.firstName=fn;
        this.lastName=ln;
        this.amka=amka;
        this.numOfPrescriptions=0;
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

    public void addPrescription(Prescription prescription){
        prescriptions[numOfPrescriptions]=prescription;
        numOfPrescriptions++;
    }

    public void print(){
        System.out.println("Patient's Firstname: "+ firstName+", Lastname: "+ lastName+", Id: "+ amka);

        for(int i=0;i<numOfPrescriptions;i++){
            prescriptions[i].print();
        }
    }
}
