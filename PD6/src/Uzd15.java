public class Uzd15 {
    public static void main(String[] args) {
        // Example array
        double[] array = {1.5, 2.5, 3.5, 4.5, 5.5};

        // Find the element closest to the average
        double closestElement = findClosestToAverage(array);

        // Output the result
        System.out.println("Element closest to the average: " + closestElement);
    }

    private static double findClosestToAverage(double[] array) {
        // Calculate the average of the array
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / array.length;

        // Find the element closest to the average
        double closestElement = array[0];
        double minDifference = Math.abs(array[0] - average);

        for (int i = 1; i < array.length; i++) {
            double difference = Math.abs(array[i] - average);
            if (difference < minDifference) {
                minDifference = difference;
                closestElement = array[i];
            }
        }

        return closestElement;
    }
}