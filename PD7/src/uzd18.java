import java.util.Scanner;

public class uzd18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Įveskite pirmą skaičių: ");
        double num1 = scanner.nextDouble();
        System.out.print("Įveskite veiksmą (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Įveskite antrą skaičių: ");
        double num2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Neteisingas veiksmas.");
                return;
        }

        System.out.println("Rezultatas: " + result);
    }
}