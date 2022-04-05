public class Pharmacy {
   private String name;
   private String address;
   private String phone;
   private Medicine[] listOfMedicines;

   public int getNumOfMedicines() {
      return numOfMedicines;
   }

   public int getNumOfPatients() {
      return numOfPatients;
   }

   public int getNumOfDoctors() {
      return numOfDoctors;
   }

   public int getNumOfPrescriptions() {
      return numOfPrescriptions;
   }

   private int numOfMedicines;
   private Patient[] listOfPatients;
   private int numOfPatients;
   private Doctor[] listOfDoctors;
   private int numOfDoctors;
   private Prescription[] listOfPrescriptions;
   private int numOfPrescriptions;




public Pharmacy() {

   this.name = "Drug Lord";
   this.phone = "6904206996";
   this.address = "Akrotiriou 12,Chania";
   this.listOfDoctors= new Doctor[50];
   this.listOfMedicines= new Medicine[50];
   this.listOfPatients= new Patient[50];
   this.listOfPrescriptions= new Prescription[50];


   this.numOfDoctors=0;
   this.numOfMedicines=0;
   this.numOfPatients=0;
   this.numOfPrescriptions=0;

}

   public void setName(String name) {
      this.name = name;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   public String getName() {
      return name;
   }

   public String getAddress() {
      return address;
   }

   public String getPhone() {
      return phone;
   }

   public Medicine[] getListOfMedicines() {
      return listOfMedicines;
   }

   public Patient[] getListOfPatients() {
      return listOfPatients;
   }

   public Doctor[] getListOfDoctors() {
      return listOfDoctors;
   }

   public Prescription[] getListOfPrescriptions() {
      return listOfPrescriptions;
   }

   public void addMedicine(Medicine m){
      listOfMedicines[numOfMedicines]= m;
      numOfMedicines++;
   }
   public void addPatient(Patient pa){
      listOfPatients[numOfPatients]= pa;
      numOfPatients++;
   }
   public void addDoctor(Doctor d){
      listOfDoctors[numOfDoctors]=d;
      numOfDoctors++;
   }
   public void addPrescription(Prescription pr){
      listOfPrescriptions[numOfPrescriptions]=pr;
      numOfPrescriptions++;
      //O giatros deixnei se kathe sintagi pou eftiakse
      pr.getDoctor().addPrescription(pr);
      //To idio gia ton astheni
      pr.getPatient().addPrescription(pr);
   }

   public Doctor getDoctorByAm(String am) {
      int i;
      for (i = 0; i < numOfDoctors; i++) {
         if (listOfDoctors[i].getAm().equals(am)) {
            return listOfDoctors[i];
         }
      }

//      for (Doctor doc: listOfDoctors) {
//         if (doc.getAm().equals(am)) {
//            return doc;
//         }
//      }

      return null;
   }
   public Patient getPatientByAmka(String amka){
      int i;
      for(i=0;i<numOfPatients;i++){
         if(listOfPatients[i].getAmka().equals(amka)){
            return listOfPatients[i];
         }
      }
      return null;
   }
   public Medicine getMedicineByCode(String code){
      int i;
      for(i=0;i<numOfMedicines;i++){
         if(listOfMedicines[i].getCode().equals(code)){
            return listOfMedicines[i];
         }
      }
      return null;
   }
}
