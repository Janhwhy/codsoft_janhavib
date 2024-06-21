import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int Subjects = Subjects();
        int[] marks = inputMarks(Subjects);
        int total = Total(marks);
        float Percentage = Percentage(total, Subjects);
        char grade = calculateGrade(Percentage);
        displayResults(total, Percentage, grade);

    }

    public static int Subjects() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        return sc.nextInt();
    }

    public static int[] inputMarks(int Subjects) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[Subjects];
        for (int i = 0; i < Subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        return marks;
    }

    public static int Total(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public static float Percentage(int Marks, int Subjects) {
        return (float) Marks / Subjects 3
        ; //type casting from int to float
    }
     public static char calculateGrade(float Percentage) {
        if (Percentage >= 90) {
            return 'A';
        } else if (Percentage >= 80) {
            return 'B';
        } else if (Percentage >= 70) {
            return 'C';
        } else if (Percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
public static void displayResults(int Marks, float Percentage, char grade) {
        System.out.println("Total Marks: " + Marks);
        System.out.println("Average Percentage: " + Percentage + "%");
        System.out.println("Grade: " + grade);
    }
}


