import java.util.Scanner;

public class Uzd7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kiek dalyvavo bėgikų: ");
        int begSK = scanner.nextInt();

        int[] begLk = new int[begSK];
        int sum = 0;

        // Irasoma i array
        for (int i = 0; i < begSK; i++)
        {
            System.out.print("Įveskite " + (i + 1) + " bėgiko laiką ");
            int in = scanner.nextInt();
            sum += in;

            begLk[i] = in;
        }


        System.out.println("Greičiausio bėgiko laikas: " + greicLk(begLk) + " sek.");

        // Vidurkis
        int vid = sum / begSK;
        System.out.println("Jis buvo: " + (vid - greicLk(begLk)) + " sek geresnis už vidurkį.");
    }

    public static int greicLk(int[] beg) {
        int smallest = beg[0];

        for (int i = 1; i < beg.length; i++) {
            if (beg[i] < smallest) {
                smallest = beg[i];
            }
        }

        return smallest;
    }
}
