import java.util.*;

public class Dat_Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the length of the vector
        System.out.print("Enter the length of the vector: ");
        int n = sc.nextInt();

        // Create the vector
        Vector<Integer> X = new Vector<Integer>(n);

        // Get the elements of the vector
        System.out.println("Enter the elements of the vector:");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            X.add(x);
        }

        // Calculate the values of f(X) and store them in a new vector Y
        Vector<Integer> Y = new Vector<Integer>(n);
        for (int i = 0; i < n; i++) {
            int x = X.get(i);
            int y = 2*x*x + 1;
            Y.add(y);
        }

        // Output the values of Y to the screen
        System.out.println("The values of Y are:");
        for (int i = 0; i < n; i++) {
            System.out.println(Y.get(i));
        }
        sc.close();
    }
}
