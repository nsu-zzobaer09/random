class Patient {
    private String name;
    private String PatientID;
    private String diagnosis;
    private double billAmount;
    
    // Static counter to track total patients created
    static int count = 0;

    // Parameterized constructor
    Patient(String name, String PatientID, String diagnosis, double billAmount) {
        this.name = name;
        this.PatientID = PatientID;
        this.diagnosis = diagnosis;
        this.billAmount = billAmount;
        count++;
    }

    // Copy constructor
    public Patient(Patient copy) {
        this.name = copy.name;
        this.PatientID = copy.PatientID;
        this.diagnosis = copy.diagnosis;
        this.billAmount = copy.billAmount;
        count++;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(String PatientID) {
        this.PatientID = PatientID;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setBill(double billAmount) {
        this.billAmount = billAmount;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getPatientID() {
        return this.PatientID;
    }

    public String getDiagnosis() {
        return this.diagnosis;
    }

    public double getbillAmount() {
        return this.billAmount;
    }

    // Overloaded Method 1: Adds 8% tax
    public void calculateBill() {
        double tax = billAmount * 0.08;
        this.billAmount = this.billAmount + tax;
        System.out.println("Total Bill: " + this.billAmount);
    }

    // Overloaded Method 2: Calculates by days (flat rate)
    public double calculateBill(int days) {
        this.billAmount = days * 150;
        return this.billAmount;
    }

    // Overloaded Method 3: Calculates by days and custom daily rate
    public void calculateBill(int days, double dailyRate) {
        this.billAmount = days * dailyRate;

        if (billAmount > 3450.00) {
            System.out.println("Review with Finance");
        } else if (billAmount > 2530.00) {
            System.out.println("Large Purchase");
        } else {
            System.out.println("Bill: " + this.billAmount);
        }
    }

    @Override
    public String toString() {
        return "PatientID: " + this.PatientID +
               " Name: " + this.name +
               " Diagnosis: " + this.diagnosis +
               " Bill Amount: " + this.billAmount;
    }

    public static int getCount() {
        return count;
    }
}

public class _2534194042 {
    public static void main(String[] args) {

        // 1. Create individual patients
        Patient p1 = new Patient("abc", "XYSJD", "Fever", 200.00);
        Patient p2 = new Patient("abdc", "XYD", "Flu", 20000.00);

        // 2. Test the copy constructor
        Patient patient1 = new Patient("abc", "XYSJD", "Fever", 200.00);
        Patient patient2 = new Patient(patient1);

        // 3. Print manual details using getters
        System.out.println("Name: " + p1.getName() + " ID: " + p1.getPatientID()
                + " Diagnosis: " + p1.getDiagnosis()
                + " Bill: " + p1.getbillAmount());

        System.out.println("Name: " + p2.getName() + " ID: " + p2.getPatientID()
                + " Diagnosis: " + p2.getDiagnosis()
                + " Bill: " + p2.getbillAmount());

        // 4. Print using overridden toString()
        System.out.println(p1.toString());

        System.out.println("\n--- Ward B Patients ---");
        
        // 5. Create an array of Patient objects
        Patient[] WardB = new Patient[4];
        WardB[0] = new Patient("abc", "efef", "Diagnosis", 200);
        WardB[1] = new Patient("abc", "fedef", "Diagnosis", 1000);
        WardB[2] = new Patient("abc", "fsdf", "Diagnosis", 1000);
        WardB[3] = new Patient("abc", "jfenf", "Diagnosis", 2123132);

        // 6. Iterate through the array and print each patient
        for (int i = 0; i < WardB.length; i++) {
            System.out.println(WardB[i].toString());
        }

        // 7. Output the total number of Patient objects created
        System.out.println("\nTotal Patient Count: " + Patient.getCount());

        // 8. Find the highest bill in Ward B
        double highest = WardB[0].getbillAmount();

        for (int i = 1; i < WardB.length; i++) {
            if (WardB[i].getbillAmount() > highest) {
                highest = WardB[i].getbillAmount();
            }
        }

        System.out.println("Highest Bill: " + highest);
    }
}