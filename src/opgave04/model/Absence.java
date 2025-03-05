package opgave04.model;

public class Absence {

    private int[][] absenceSchema = {
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {2, 0, 0, 0, 3, 1, 0, 2, 0, 0, 0, 0},
            {1, 2, 1, 2, 1, 2, 0, 2, 0, 0, 4, 0},
            {5, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0}
    };

    // Udskriver fraværstallene med elevnummer og måned.

    public void print() {
        System.out.println("Fraværsskema:");
        System.out.println("Elev  | Jan Feb Mar Apr Maj Jun Jul Aug Sep Okt Nov Dec");
        System.out.println("--------------------------------------------------------");

        for (int student = 0; student < absenceSchema.length; student++) {
            System.out.printf("%-5d |", student);
            for (int month = 0; month < absenceSchema[student].length; month++) {
                System.out.printf("%3d ", absenceSchema[student][month]);
            }
            System.out.println();
        }
    }

    // Returnerer det samlede antal fraværsdage for en bestemt elev.
    public int totalAbsence(int studentNumber) {
        int total = 0;
        if (studentNumber >= 0 && studentNumber < absenceSchema.length) {
            for (int days : absenceSchema[studentNumber]) {
                total += days;
            }
        }
        return total;
    }

    //Returnerer gennemsnittet af fraværsdage pr. måned for en bestemt elev.

    public double average(int studentNumber) {
        if (studentNumber >= 0 && studentNumber < absenceSchema.length) {
            return (double) totalAbsence(studentNumber) / absenceSchema[studentNumber].length;
        }
        return 0;
    }


    //Returnerer antallet af elever, der ikke har haft fravær overhovedet.

    public int studentsWithoutAbsence() {
        int count = 0;
        for (int[] student : absenceSchema) {
            boolean hasAbsence = false;
            for (int days : student) {
                if (days > 0) {
                    hasAbsence = true;
                    break;
                }
            }
            if (!hasAbsence) {
                count++;
            }
        }
        return count;
    }


    //Returnerer elevnummeret for den elev, der har haft flest fraværsdage.
    public int mostAbsence() {
        int maxStudent = 0;
        int maxAbsence = totalAbsence(0);

        for (int student = 1; student < absenceSchema.length; student++) {
            int currentAbsence = totalAbsence(student);
            if (currentAbsence > maxAbsence) {
                maxAbsence = currentAbsence;
                maxStudent = student;
            }
        }
        return maxStudent;
    }


    //Nulstiller fraværsdagene for en bestemt elev.

    public void reset(int studentNumber) {
        if (studentNumber >= 0 && studentNumber < absenceSchema.length) {
            for (int i = 0; i < absenceSchema[studentNumber].length; i++) {
                absenceSchema[studentNumber][i] = 0;
            }
        }
    }
}


