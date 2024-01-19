import java.util.Scanner;

public class Uzd7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate sum and product
        int sum = calculateSum(numbers);
        int product = calculateProduct(numbers);

        // Display results
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Product of the array elements: " + product);

        scanner.close();
    }

    // Function to calculate the sum of an array
    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Function to calculate the product of an array
    private static int calculateProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        return product;
    }
}