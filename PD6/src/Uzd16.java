import java.text.DecimalFormat;

public class Uzd16 {

    public static void main(String[] args) {
        double[] januaryTemperatures = {-11.5, -10.3, -12, -6.5, -5, -15.5};
        double[] februaryTemperatures = {-16, -14.5, -11, -10.3, -3.5, 0};
        double[] marchTemperatures = {-3, -2.5, 0, 5, 9.5, 11.2};

        printAverageTemperature("Sausio", calculateAverage(januaryTemperatures));
        printAverageTemperature("Vasario", calculateAverage(februaryTemperatures));
        printAverageTemperature("Kovo", calculateAverage(marchTemperatures));

        double overallAverage = calculateOverallAverage(januaryTemperatures, februaryTemperatures, marchTemperatures);
        System.out.println("Bendras vidurkis: " + formatToTwoDecimalPlaces(overallAverage));
    }

    private static double calculateAverage(double[] temperatures) {
        double sum = 0;
        for (double temperature : temperatures) {
            sum += temperature;
        }
        return sum / temperatures.length;
    }

    private static double calculateOverallAverage(double[]... temperatureArrays) {
        double sum = 0;
        int count = 0;
        for (double[] temperatures : temperatureArrays) {
            for (double temperature : temperatures) {
                sum += temperature;
                count++;
            }
        }
        return sum / count;
    }

    private static void printAverageTemperature(String month, double average) {
        System.out.println("Vidutinė " + month + " temperatūra: " + formatToTwoDecimalPlaces(average));
    }

    private static String formatToTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}