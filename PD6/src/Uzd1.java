public class Uzd1 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }

        System.out.print("Source Array: ");
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.print(sourceArray[i] + " ");
        }

        System.out.println();

        System.out.print("Target Array: ");
        for (int i = 0; i < targetArray.length; i++) {
            System.out.print(targetArray[i] + " ");
        }
    }
}
