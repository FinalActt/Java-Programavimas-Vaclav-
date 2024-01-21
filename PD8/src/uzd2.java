import java.util.ArrayList;
import java.util.List;

public class uzd2
{
    public static List<Integer> countPrimeNumbers(int start, int end) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int start = 10;
        int end = 50;

        List<Integer> primeNumbers = countPrimeNumbers(start, end);

        System.out.println("Pirminiai skaičiai tarp " + start + " ir " + end + ":");
        for (int prime : primeNumbers) {
            System.out.print(prime + ", ");
        }
    }
}