package opgave03;

public class Main {
    public static void main(String[] args) {
        double[][] input = {
                {23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}
        };
        int[] result = locateSmallest(input);
        System.out.println("Mindste tal er i " + result[0] + ", " + result[1]);
    }

    private static int[] locateSmallest(double[][] input) {
        int minRow = 0;
        int minCol = 0;
        double min = input[0][0]; // Første element starter som min

        for (int row = 0; row < input.length; row++) {
            for (int col = 0; col < input[row].length; col++) {
                if (input[row][col] < min) {
                    min = input[row][col]; // Update min
                    minRow = row;          // Gem row index
                    minCol = col;          // Gem column index
                }
            }
        }

        return new int[]{minRow, minCol};
    }
}
