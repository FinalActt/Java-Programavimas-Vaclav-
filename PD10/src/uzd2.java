import java.util.ArrayList;
import java.util.Iterator;

public class uzd2 {
    public static void main(String[] args) {

        ArrayList<Integer> skaiciuSarasas = new ArrayList<>();
        skaiciuSarasas.add(3);
        skaiciuSarasas.add(7);
        skaiciuSarasas.add(2);
        skaiciuSarasas.add(8);
        skaiciuSarasas.add(6);


        SarasasRedaguotojas redaguotojas = new SarasasRedaguotojas();
        redaguotojas.isvalykDidesniusUz5(skaiciuSarasas);


        System.out.println("Gautas sąrašas: " + skaiciuSarasas);
    }
}

class SarasasRedaguotojas {
    public void isvalykDidesniusUz5(ArrayList<Integer> sarasas) {
        Iterator<Integer> iterator = sarasas.iterator();

        while (iterator.hasNext()) {
            Integer skaicius = iterator.next();
            if (skaicius > 5) {
                iterator.remove();
            }
        }
    }
}