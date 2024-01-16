import java.util.Scanner;

public class Uzd1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pasirinkite figūrą (1 - trikampis, 2 - stačiakampis, 3 - kvadratas): ");
        int choice = scanner.nextInt();
        int size = 6;

        switch (choice) {
            case 1:
                drawTriangle(size);
                break;
            case 2:
                drawRectangle(size);
                break;
            case 3:
                drawSquare(size);
                break;
        }

        scanner.close();
    }

    private static void drawTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawRectangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}