public class Student {
    public String name;
    public int rollno;
    public double marks;

    public Student(String name, int rollno, double marks) {
        this.marks = marks;
        this.name = name;
        this.rollno = rollno;
    }

    private char grades() {
        if (marks <= 35) {
            return 'C';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grades());
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student("Aditi", 101, 85.5);

        // Displaying student details and grade
        student1.displayDetails();
    }
}
