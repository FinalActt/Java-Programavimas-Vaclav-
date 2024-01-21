import java.util.Arrays;

public class uzd14 {
    public static int[][] sukurtiMatrica(int n, int m) {
        int[][] matrica = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrica[i][j] = i * m + j + 1;
            }
        }
        return matrica;
    }

    public static void main(String[] args) {
        int[][] result = sukurtiMatrica(3, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}