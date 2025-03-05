package opgave04;

import opgave04.model.Absence;

public class Main {
    public static void main(String[] args) {
        Absence absence = new Absence();

        // Udskriver fraværsskemaet
        absence.print();

        // Tester totalAbsence() metoden
        int student = 3;
        System.out.println("\nSamlet fravær for elev " + student + ": " + absence.totalAbsence(student));

        // Tester average() metoden
        System.out.println("Gennemsnitligt fravær for elev " + student + ": " + absence.average(student));

        // Tester studentsWithoutAbsence() metoden
        System.out.println("Antal elever uden fravær: " + absence.studentsWithoutAbsence());

        // Tester mostAbsence() metoden
        System.out.println("Elev med mest fravær: " + absence.mostAbsence());

        // Tester reset() metoden
        System.out.println("\nNulstiller fravær for elev " + student + "...");
        absence.reset(student);
        absence.print();
    }
}





