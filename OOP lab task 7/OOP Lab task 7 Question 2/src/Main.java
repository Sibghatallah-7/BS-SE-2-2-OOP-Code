class Person {
    String personname;
    double age;

    void print() {
        System.out.println("Person Name: " + personname);
        System.out.println("Age: " + age);
    }
}

class Patient extends Person {
    String diseasetype;
    String recommendedmedicine;

    public Patient(String personname, int age, String diseasetype, String recommendedmedicine) { super(); }

    void print() {
        System.out.println("-----Patient Details: -----");
        System.out.println("Person Name: " + personname);
        System.out.println("Age: " + age);
        System.out.println("Disease Type: " + diseasetype);
        System.out.println("Recommended Medicine: " + recommendedmedicine);
        System.out.println();
    }
}

class Medicarepatient extends Person {
    String diseasetype;
    String recommendedmedicine;
    String nameofthehospital;
    String nameoftheward;
    double roomnumber;

    public Medicarepatient(String personname, int age, String diseasetype, String recommendedmedicine, String hospital, String ward, double roomnumber) { super(); }

    void print() {
        System.out.println("-----Medicare Patient Details: -----");
        System.out.println("Person Name: " + personname);
        System.out.println("Age: " + age);
        System.out.println("Disease Type: " + diseasetype);
        System.out.println("Recommended Medicine: " + recommendedmedicine);
        System.out.println("Name of the Hospital: " + nameofthehospital);
        System.out.println("Name Of the Ward: " + nameoftheward);
        System.out.println("Room Number: " + roomnumber);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Patient p1 = new Patient("Zain", 30, "FLU", "Disperine");
        Medicarepatient p2 = new Medicarepatient("Ahmed", 23, "Lung Disease", "Paracetamol", "XYZ Hospital", "Antibiotics", 93);

        p1.print();
        p2.print();
    }
}
