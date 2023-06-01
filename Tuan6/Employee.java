public class Employee {
    private String ID;
    private String fullName;
    private int yearJoined;
    private double coefficientsSalary;
    private int numDaysOff;
    private static final int BASIC_SALARY = 1150;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = 2020;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff) {
        this.ID = ID;
        this.fullName = fullName;
        this.yearJoined = yearJoined;
        this.coefficientsSalary = coefficientsSalary;
        this.numDaysOff = numDaysOff;
    }


    public String considerEmulation() {
        if (this.numDaysOff <= 1) {
            return "A";
        } else if (this.numDaysOff <= 3) {
            return "B";
        } else {
            return "C";
        }
    }

    public double getSalary() {
        double emulationCoefficient;
        String emulationGrade = considerEmulation();
        if (emulationGrade.equals("A")) {
            emulationCoefficient = 1.0;
        } else if (emulationGrade.equals("B")) {
            emulationCoefficient = 0.75;
        } else {
            emulationCoefficient = 0.5;
        }
         
        return BASIC_SALARY + BASIC_SALARY * (this.coefficientsSalary + emulationCoefficient);
    }
}
