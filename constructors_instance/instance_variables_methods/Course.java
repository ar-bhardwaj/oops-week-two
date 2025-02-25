public class Course {
    // Instance variables (specific to each course)
    public String courseName;
    public int duration; // Duration in weeks
    public double fee;

    // Class variable (shared among all courses)
    public static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 8, 500.0);
        Course course2 = new Course("Web Development", 12, 700.0);

        // Display initial course details
        System.out.println("Before Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Updating institute name
        Course.updateInstituteName("Global Tech Institute");

        // Display course details after updating institute name
        System.out.println("After Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
