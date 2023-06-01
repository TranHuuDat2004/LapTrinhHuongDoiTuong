public class Dat_Test {
    public static void main(String args[]) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'T', 'D', 'T', 'U' };
        System.out.println("Array integerArray contains:");
        Dat_GenericMethod.printArray(intArray);
        System.out.println("\nArray doubleArray contains:");
        Dat_GenericMethod.printArray(doubleArray);
        System.out.println("\nArray characterArray contains:");
        Dat_GenericMethod.printArray(charArray);
    }
}