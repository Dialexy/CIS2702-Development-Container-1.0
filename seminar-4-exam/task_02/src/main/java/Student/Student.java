package Student;

public class Student {
    // Write your code below!
    private String studentId;
    private String name;
    private int grade;
    private boolean isPassing;

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        if (grade > 100 || grade < 0) {
            throw new IllegalArgumentException("Grade must be between 0 - 100");
            // System.err.println("Grade must be between 0 and 100");
            // this.grade = 0;
        } else {
            this.grade = grade;
        }

        this.isPassing = grade >= 50;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public int getGrade () {
        return this.grade;
    }

    public boolean isPassing() {
        return this.isPassing;
    }
    
    public void setGrade(int newGrade) {
        if (newGrade > 100 || newGrade < 0) {
            throw new IllegalArgumentException("Grade must be between 0 - 100");
            // System.err.println("Grade must be between 0 and 100");
        } else {
            this.isPassing = newGrade >= 50;
            this.grade = newGrade;
        }
    }

    public void displayInfo() {
        System.out.println("Student ID: " + this.studentId);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Garde: " + this.grade);
        System.out.println("Student passing?: " + this.isPassing);
    }
}