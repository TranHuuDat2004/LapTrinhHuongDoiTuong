public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(10, 2);
            System.out.println("10 / 2 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int result = calculator.multiply(1001, 2);
            System.out.println("1001 * 2 = " + result);
        } catch (NumberOutOfRangeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

