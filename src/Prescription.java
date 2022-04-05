import java.time.LocalDate;

public class Prescription {
    private String code;
    private Doctor doctor;
    private Patient patient;
    private LocalDate date;
    private PrescriptionItem[] prescriptionItems;
    private PrescriptionItem[] listOfPrescriptionItems;
    private int numOfPrescriptionItems;

    public Prescription(String code, LocalDate date, Doctor doctor ,Patient patient) {
        this.code = code;
        this.date = date;
        this.doctor=doctor;
        this.patient = patient;
        this.prescriptionItems = new PrescriptionItem[6];
        this.numOfPrescriptionItems=0;

    }

    public String getCode() {
        return code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public LocalDate getDate() {
        return date;
    }



    public PrescriptionItem[] getPrescriptionItems() {
        return prescriptionItems;
    }
    public void addPrescriptionItem(PrescriptionItem pi){
        prescriptionItems[numOfPrescriptionItems]=pi;
        numOfPrescriptionItems++;
    }

}
