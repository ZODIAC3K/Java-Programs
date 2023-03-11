import java.io.IOException;

public class All_Execeptions {
    public static void main(String[] args) {
        // Arithmetic Exception Example.
        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("");
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        }

        // Array Index Out Of Bounds Exception Example.
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("Array Index Out Of Bounds Exception occurred: " + e.getMessage());
        }

        // Null Pointer Exception Example.
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("");
            System.out.println("Null Pointer Exception occurred: " + e.getMessage());
        }

        // IO Exception Example.
        try {
            throw new IOException("Error reading file");
        } catch (IOException e) {
            System.out.println("");
            System.out.println("IO Exception occurred: " + e.getMessage());
        }
    }
}

// public class All_Execeptions {
//     public static void main(String[] args) {
//         try {
//             int[] arr = new int[5];
//             arr[6] = 9; // this will throw an ArrayIndexOutOfBoundsException
//             int result = divide(); // this will throw an ArithmeticException
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array index out of bounds: " + e.getMessage());
//         } catch (ArithmeticException e) {
//             System.out.println("Arithmetic exception: " + e.getMessage());
//         } catch (NumberFormatException e) {
//             System.out.println("Number format exception: " + e.getMessage());
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("String index out of bounds: " + e.getMessage());
//         } catch (Exception e) {
//             System.out.println("An error occurred: " + e.getMessage());
//         }
//     }

//     private static int divide() throws ArithmeticException {
//         int numerator = 10;
//         int denominator = 0;
//         return numerator / denominator;
//     }
// }