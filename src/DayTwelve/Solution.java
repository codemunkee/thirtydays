package DayTwelve;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate() {
        double totalPoints = 0;
        double earnedPoints = 0;

        for (int score: testScores) {
            totalPoints += 100;
            earnedPoints += score;
        }

        char grade = 'O';

        // so we don't divide by zero
        if (testScores.length == 0) {
            return grade;
        }

        double gradePercent = (earnedPoints / totalPoints) * 100;

        if (gradePercent < 40) {
            grade = 'T';
        } else if (gradePercent < 55) {
            grade = 'D';
        } else if (gradePercent < 70) {
            grade = 'P';
        } else if (gradePercent < 80) {
            grade = 'A';
        } else if (gradePercent < 90) {
            grade = 'E';
        }

        return grade;

    }


}

public class Solution {

    public static void main(String[] args) {
        Student stud = new Student("Heraldo", "Memelli", 8135627, new int[] {100, 80} );
        stud.printPerson();

    }

}
