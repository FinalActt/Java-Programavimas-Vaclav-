import java.util.Random;

public class uzd4 {
    private double x;
    private double y;
    private double z;

    public uzd4(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double calculateDotProduct(uzd4 other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public double calculateAngle(uzd4 other) {
        double dotProduct = calculateDotProduct(other);
        double lengthProduct = calculateLength() * other.calculateLength();

        if (lengthProduct == 0) {
            return 0;
        }

        return Math.acos(dotProduct / lengthProduct);
    }

    public uzd4 add(uzd4 other) {
        return new uzd4(x + other.x, y + other.y, z + other.z);
    }

    public uzd4 subtract(uzd4 other) {
        return new uzd4(x - other.x, y - other.y, z - other.z);
    }

    public static uzd4[] generateRandomVectors(int n) {
        Random random = new Random();
        uzd4[] vectors = new uzd4[n];

        for (int i = 0; i < n; i++) {
            double randomLength = random.nextDouble() * 10;
            vectors[i] = new uzd4(randomLength, randomLength, randomLength);
        }

        return vectors;
    }

    public static void main(String[] args) {
        uzd4 vector1 = new uzd4(1, 2, 3);
        uzd4 vector2 = new uzd4(4, 5, 6);

        System.out.printf("Vector 1 length: %.2f\n", vector1.calculateLength());
        System.out.printf("Vector 2 length: %.2f\n", vector2.calculateLength());

        System.out.println("Dot product: " + vector1.calculateDotProduct(vector2));
        System.out.printf("Angle between vectors: %.2f\n", vector1.calculateAngle(vector2));

        uzd4 sum = vector1.add(vector2);
        System.out.printf("Vector sum: (%.2f, %.2f, %.2f)\n", sum.x, sum.y, sum.z);
    }
}