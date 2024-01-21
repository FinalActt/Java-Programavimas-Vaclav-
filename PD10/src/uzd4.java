import java.util.ArrayList;
import java.util.Random;

public class uzd4 {
    private ArrayList<String> atspalviai;

    public uzd4() {
        atspalviai = new ArrayList<>();
    }

    public void generuotiAtspalvi() {
        Random rand = new Random();
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        String hexSpalva = String.format("#%02X%02X%02X", r, g, b);
        atspalviai.add(hexSpalva);
    }

    public void generuotiAtspalvius(int kiekis) {
        for (int i = 0; i < kiekis; i++) {
            generuotiAtspalvi();
        }
    }

    public ArrayList<String> gautiAtspalvius() {
        return atspalviai;
    }

    public static void main(String[] args) {
        uzd4 generatorius = new uzd4();
        generatorius.generuotiAtspalvius(5);

        System.out.println("Sugeneruoti atspalviai:");
        for (String atspalvis : generatorius.gautiAtspalvius()) {
            System.out.println(atspalvis);
        }
    }
}
