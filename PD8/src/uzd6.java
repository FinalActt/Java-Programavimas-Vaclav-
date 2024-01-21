import java.util.Scanner;

public class uzd6
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite pirmąjį skaičių:");
        double number1 = scanner.nextDouble();

        System.out.print("Įveskite operaciją (+, -, *, /, sin, cos, tg, %, √, ^):");
        String operation = scanner.next();

        double result = 0.0;

        switch (operation) {
            case "+":
                System.out.println("Įveskite antrąjį skaičių:");
                double number2 = scanner.nextDouble();
                result = number1 + number2;
                break;
            case "-":
                System.out.println("Įveskite antrąjį skaičių:");
                number2 = scanner.nextDouble();
                result = number1 - number2;
                break;
            case "*":
                System.out.println("Įveskite antrąjį skaičių:");
                number2 = scanner.nextDouble();
                result = number1 * number2;
                break;
            case "/":
                System.out.println("Įveskite antrąjį skaičių:");
                number2 = scanner.nextDouble();
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Dalyba iš nulio negalima.");
                    return;
                }
                break;
            case "sin":
                result = Math.sin(Math.toRadians(number1));
                break;
            case "cos":
                result = Math.cos(Math.toRadians(number1));
                break;
            case "tg":
                result = Math.tan(Math.toRadians(number1));
                break;
            case "%":
                System.out.println("Įveskite procentą:");
                double percent = scanner.nextDouble();
                result = (percent / 100) * number1;
                break;
            case "√":
                result = Math.sqrt(number1);
                break;
            case "^":
                System.out.println("Įveskite laipsnį:");
                int power = scanner.nextInt();
                result = Math.pow(number1, power);
                break;
            default:
                System.out.println("Neatpažinta operacija.");
                return;
        }

        System.out.printf("Rezultatas: %.4f%n", result);
    }
}