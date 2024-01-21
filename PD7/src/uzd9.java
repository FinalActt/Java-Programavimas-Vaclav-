import java.util.Arrays;

public class uzd9 {
    public static String rikiuotiAbeceliskai(String eilute) {
        char[] simboliai = eilute.toCharArray();
        Arrays.sort(simboliai);
        return new String(simboliai);
    }

    public static void main(String[] args) {
        String result = rikiuotiAbeceliskai("openai");
        System.out.println("Rezultatas: " + result);
    }
}