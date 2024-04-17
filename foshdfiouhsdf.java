import java.util.Arrays;

public class foshdfiouhsdf {
    public static void main(String[] args) {

//        Step 1: Create an array with numbers from 1 to 10 and print it to the console.
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        System.out.println("Array 1 elements:");
        for (int number : a) {
            System.out.print(number + " ");
        }

//        Step 2: Calculate the sum of all numbers in the array and print the result to the console.
        int sum = 0;
        for (int number : a) {
            sum += number;
        }
        System.out.println("");
        System.out.println("Summe des arrays " + sum);


//        Step 3: Find the largest number in the array and print it to the console.

        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        System.out.println("largest number in the array: " + largest);

//        Step 4: Create a second array with numbers from 11 to 20.

        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 11;
        }
        System.out.println("Array 2 elements:");
        for (int number : numbers2) {
            System.out.print(number + " ");
        }

//        Step 5: Perform element-wise addition of both arrays and store the result in a third array. Print the result array to the console.

        int[] additionofbotharrays = new int[10];
        for (int i = 0; i < additionofbotharrays.length; i++) {
            additionofbotharrays[i] = a[i] + numbers2[i];
        }

        System.out.println("\naddition of both arrays ");

        System.out.println(Arrays.toString(additionofbotharrays));


//        // Create a 2x2 matrix (2-dimensional array)
//        int[][] matrix = new int[2][2];
//        // Assign values to the matrix
//        matrix[0][0] = 1;
//        matrix[0][1] = 2;
//        matrix[1][0] = 3;
//        matrix[1][1] = 4;
//        // Access and print values from the matrix
//        System.out.println("Matrix elements:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println(); // Move to the next row
//        }

    }
}
