package opgave02;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {1, 2, 3, 4.0},
                {5, 6.5, 7, 8},
                {9, 10, 11, 10},
                {13, 14, 15, 16}
        };
        System.out.println(averageMajorDiagonal(input));
    }

    private static double averageMajorDiagonal(double[][] input) {
        double total = 0;
        double size = input.length;

        for (int i = 0; i < size; i++) {
            total += input[i][i];
        }

        return (double) total / size;
    }
}
