package Eksempel;

public class MultipleArrays {
    public static void main(String[] args) {
        int[][] ints = new int[6][5];

        for(int outer = 0; outer < ints.length; outer++)
            for (int inner = 0; inner < ints.length; inner++) {
                ints[outer][inner] = outer * inner;

            }


        ints[2][3] = 14;
        System.out.println(ints[2][3] = 14);

        int[][] example = {
                {2,3,4},
                {1,2},
                {9,8,7,6,5}
        };
        System.out.println(example[1][1]); //Indeks 1,1
    }
}
