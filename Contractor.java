// makes interface that follows the "payable" contract
// lines 4-6 are instance variables (private fields) and allows to store info
public interface Payable {
    double getPayment();
    double workingHours();
    String information();
}

// the class implements payable and writes all the methods
public class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    // this is the constructor, contractor is the object itself
    // the method runs to initialize the variables
    public Contractor(String name, double hourlyRate, double hoursWorked){
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override           // gets the payment due
    public double getPayment() {
        return hourlyRate * hoursWorked;
    }

    @Override           // returns how many hours worked
    public double workingHours() {
        return hoursWorked;
    }

    @Override           // builds a sentence based upon data provided
    public String information() {
        return "Contractor Name: " + name + ", Hourly Rate: $" + hourlyRate +
                ", Hours Worked: " + hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {

        // contractor is an object, P is an instance variable, new actually creates it
        // using the method above.
        Contractor P = new Contractor("Pedro", 17.75, 40);
        System.out.println(P.getPayment());     // gets P's payment due
        System.out.println(P.workingHours());   // gets P's hours worked
        System.out.println(P.information());    // get's P's information and prints it
    }
}