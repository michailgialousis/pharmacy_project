import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PharmacyConsole {

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pharmacy pha = new Pharmacy();
// Arxikopoihseis

        //Gia astheni
        pha.addPatient(new Patient("patient1_nm", "patient1_sm", "11111111"));
        pha.addPatient(new Patient("patient2_nm", "patient2_sm", "22222222"));
        pha.addPatient(new Patient("patient3_nm", "patient3_sm", "33333333"));
        pha.addPatient(new Patient("patient4_nm", "patient4_sm", "44444444"));
        pha.addPatient(new Patient("patient5_nm", "patient5_sm", "55555555"));

        //Gia farmako
        pha.addMedicine(new Medicine("med11111", " med1_nm", 10));
        pha.addMedicine(new Medicine("med22222", " med2_nm", 20));
        pha.addMedicine(new Medicine("med33333", " med3_nm", 30));
        pha.addMedicine(new Medicine("med44444", " med4_nm", 40));
        pha.addMedicine(new Medicine("med55555", " med5_nm", 50));

        //Gia giatro
        pha.addDoctor(new Doctor("doctor1_nm", "doctor1_sm", "doc11111"));
        pha.addDoctor(new Doctor("doctor2_nm", "doctor2_sm", "doc22222"));
        pha.addDoctor(new Doctor("doctor3_nm", "doctor3_sm", "doc33333"));
        pha.addDoctor(new Doctor("doctor4_nm", "doctor4_sm", "doc44444"));
        pha.addDoctor(new Doctor("doctor5_nm", "doctor5_sm", "doc55555"));

        //Gia sintagi
        Prescription pr = new Prescription("prescr11111", LocalDate.parse("23/03/2022", dtf), pha.getDoctorByAm("doc11111"), pha.getPatientByAmka("11111111"));
        //Eidikotera gia farmaka kai posotites tous
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 2));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med22222"), 4));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med33333"), 1));
        pha.addPrescription(pr);

        pr = new Prescription("prescr22222", LocalDate.parse("24/03/2022", dtf), pha.getDoctorByAm("doc11111"), pha.getPatientByAmka("22222222"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 1));
        pha.addPrescription(pr);

        pr = new Prescription("prescr33333", LocalDate.parse("25/03/2022", dtf), pha.getDoctorByAm("doc22222"), pha.getPatientByAmka("22222222"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 3));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 3));

        pr = new Prescription("prescr44444", LocalDate.parse("26/03/2022", dtf), pha.getDoctorByAm("doc22222"), pha.getPatientByAmka("33333333"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med44444"), 1));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med33333"), 2));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 1));
        pha.addPrescription(pr);

        pr = new Prescription("prescr55555", LocalDate.parse("01/04/2022", dtf), pha.getDoctorByAm("doc33333"), pha.getPatientByAmka("33333333"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 1));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med55555"), 1));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med22222"), 1));
        pha.addPrescription(pr);

        pr = new Prescription("prescr66666", LocalDate.parse("04/04/2022", dtf), pha.getDoctorByAm("doc33333"), pha.getPatientByAmka("11111111"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med44444"), 2));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med55555"), 2));
        pha.addPrescription(pr);

        pr = new Prescription("prescr77777", LocalDate.parse("06/04/2022", dtf), pha.getDoctorByAm("doc44444"), pha.getPatientByAmka("44444444"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med44444"), 1));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med11111"), 2));
        pha.addPrescription(pr);

        pr = new Prescription("prescr88888", LocalDate.parse("16/04/2022", dtf), pha.getDoctorByAm("doc44444"), pha.getPatientByAmka("55555555"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med22222"), 5));
        pha.addPrescription(pr);

        pr = new Prescription("prescr99999", LocalDate.parse("20/04/2022", dtf), pha.getDoctorByAm("doc55555"), pha.getPatientByAmka("55555555"));
        pr.addPrescriptionItem(new PrescriptionItem(pha.getMedicineByCode("med55555"), 5));
        pha.addPrescription(pr);


        //Menu

        int userOption = 0;
        StandardInputRead reader = new StandardInputRead();

        while (userOption != 9) {
            printMenu();
            userOption = reader.readPositiveInt("Please choose one of the above.");

            switch (userOption) {
                case 1:
                    String medCode, medName;
                    int medPrice;
                    medCode = reader.readString("Give me medicine code:");
                    medName = reader.readString("Give me medicine name:");
                    medPrice = reader.readPositiveInt("Give me medicine price:");
                    pha.addMedicine(new Medicine(medCode, medName, medPrice));
                    reader.readString("Press any key to continue...");
                    break;
                case 2:
                    String docFname, docLname, docId;
                    docFname = reader.readString("Give me doctor first name:");
                    docLname = reader.readString("Give me doctor last name:");
                    docId = reader.readString("Give me doctor id:");
                    pha.addDoctor(new Doctor(docFname, docLname, docId));
                    reader.readString("Press any key to continue...");
                    break;
                case 3:
                    String patFname, patLname, patId;
                    patFname = reader.readString("Give me patient first name:");
                    patLname = reader.readString("Give me patient last name:");
                    patId = reader.readString("Give me patient id:");
                    pha.addPatient(new Patient(patFname, patLname, patId));
                case 8:
                    print(pha);


            }


        }


    }

    private static void print(Pharmacy pha) {
        System.out.println("Doctors: ");
        for (Doctor doc : pha.getListOfDoctors()) {
            if (doc == null) {
                break;
            }
            System.out.println("A.M. " + doc.getAm() + ", Name: " + doc.getLastName() + " " + doc.getFirstName());
            System.out.println("Prescriptions");
            if (doc.getPrescriptions() != null) {
                for (Prescription pres : doc.getPrescriptions()) {
                    System.out.println("Code: " + pres.getCode() + "Date: " + pres.getDate() + "Patient: " + pres.getPatient());
                }
            }
        }
        System.out.println("====================================================");
        System.out.println("Medicines: ");
        for (Medicine med : pha.getListOfMedicines()) {
            if (med == null) {
                break;
            }
            System.out.println("Code: " + med.getCode() + ", Price: " + med.getPrice() + ", Name: " + med.getName());
        }
        System.out.println("====================================================");
        System.out.println("Prescriptions");
        for (Prescription pre : pha.getListOfPrescriptions()) {
            if (pre == null)
                break;
            System.out.println("Code: " + pre.getCode() + "Patient Amka " + pre.getPatient().getAmka() + "Patient Name " +
                    pre.getPatient().getLastName() + " " + pre.getPatient().getFirstName() + ", Date: " +
                    pre.getDate() + "Doctor Name: " + pre.getDoctor().getLastName());
            System.out.println("        Prescription Items: ");
            for (PrescriptionItem preItem: pre.getPrescriptionItems()) {
                if (preItem == null)
                    break;
                System.out.println("         Medicine Name: " + preItem.getMedicine().getName() + ", Quantity: " + preItem.getAmount());
            }
        }

    }

    public static void printMenu() {
        System.out.println("                 Welcome to the Drug Lord");
        System.out.println("=======================================================");
        System.out.println("1. Insert a medicine..................................");
        System.out.println("2. Insert a doctor.............................");
        System.out.println("3. Insert a patient..............................");
        System.out.println("4. Insert a prescription.................................");
        System.out.println("5. Delete a prescription..............................");
        System.out.println("6. Find a prescription.......................");
        System.out.println("7. Calculate cost.......................");
        System.out.println("8. Print..............");

        System.out.println("9. Exit................................................");
        System.out.println("=======================================================");
    }


}
