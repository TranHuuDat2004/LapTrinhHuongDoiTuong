public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition;

    // Default constructor
    public Manager() {
        super();
        position = "Head of Administrative Office";
        salaryCoefficientPosition = 5.0;
    }

    // Constructor with parameter
    public Manager(String ID, String fullName, double coefficientsSalary, String position,
                   double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.position = position;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    // Full parameter constructor
    public Manager(String ID, String fullName, int yearJoined, double coefficientsSalary,
                   int numDaysOff, String position, String department,
                   double salaryCoefficientPosition) {
        super(ID, fullName, yearJoined, coefficientsSalary, numDaysOff);
        this.position = position;
        this.department = department;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
    }

    // Override the method to evaluate employee emulation
    @Override
    public String considerEmulation() {
        return "A";
    }

    // Method for calculating position bonus
    public double bonusByPosition() {
        double basicSalary = 1150;
        return basicSalary * salaryCoefficientPosition;
    }

    // Override the method for calculating salaries for managers
    @Override
    public double getSalary() {
        double basicSalary = 1150;
        // double senioritySalary = getSenioritySalary();
        double positionBonus = bonusByPosition();
        double emulationCoefficient = 0.0;
        String emulation = considerEmulation();
        if (emulation.equals("A")) {
            emulationCoefficient = 1.0;
        } else if (emulation.equals("B")) {
            emulationCoefficient = 0.75;
        } else if (emulation.equals("C")) {
            emulationCoefficient = 0.5;
        }
        return basicSalary + basicSalary * (+ emulationCoefficient) +
                 + positionBonus;
    }
}

