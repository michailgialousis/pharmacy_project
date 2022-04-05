public class PrescriptionItem {
    private Medicine medicine;
    private int amount;

    public PrescriptionItem(Medicine medicine, int amount) {
        this.medicine = medicine;
        this.amount = amount;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
//Methodos gia ypologismo timhs syntagis

  public int getPrescriptionPrice() {
        return getAmount() * medicine.getPrice();
    }

    public void print() {
        System.out.println("Medicine Name: " + medicine.getName() + ", Amount: " + amount);
    }
}
