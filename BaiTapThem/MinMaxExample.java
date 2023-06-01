public class MinMaxExample{
    public static void main(String[] args) {
        int[] intArray = {4, 7, 2, 9, 1};
        int min = intArray[0];
        int max = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            } else if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        System.out.println("So nho nhat la: " + min);
        System.out.println("So lon nhat la: " + max);
    }
} 
    

