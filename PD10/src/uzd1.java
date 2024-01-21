import java.util.ArrayList;

class SveikiejiSkaiciai {
    private ArrayList<Integer> skaiciai;

    public SveikiejiSkaiciai() {
        this.skaiciai = new ArrayList<>();
    }

    public void pridetiSkaiciu(int skaicius) {
        this.skaiciai.add(skaicius);
    }

    public void atspausdintiSarasa() {
        for (Integer skaicius : skaiciai) {
            System.out.print(skaicius + " ");
        }
        System.out.println();
    }
}

public class uzd1 {
    public static void main(String[] args) {
        SveikiejiSkaiciai sveikiejiSkaiciai = new SveikiejiSkaiciai();


        for (int i = 1; i <= 10; i++) {
            sveikiejiSkaiciai.pridetiSkaiciu(i);
        }


        sveikiejiSkaiciai.atspausdintiSarasa();
    }
}