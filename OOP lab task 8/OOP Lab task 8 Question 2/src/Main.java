class Course {
    protected String courseid;
    protected String coursetitle;
    protected int credithours;

    public Course(String courseid, String coursetitle, int credithours) {
        this.courseid = courseid;
        this.coursetitle = coursetitle;
        this.credithours = credithours;
    }

    public void showCourseDetails() {
        System.out.println("Course ID: " + courseid);
        System.out.println("Title: " + coursetitle);
        System.out.println("Credit Hours: " + credithours);
    }
}

class OnlineCourse extends Course {
    private String platformName;
    private String instructor;
    private int durationWeeks;

    public OnlineCourse(String courseid, String coursetitle, int credithours, String platformName, String instructor, int durationWeeks) {
        super(courseid, coursetitle, credithours);
        this.platformName = platformName;
        this.instructor = instructor;
        this.durationWeeks = durationWeeks;
    }

    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platformName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Duration: " + durationWeeks + " weeks");
    }
}

class OnsiteCourse extends Course {
    private String location;
    private String classroomNumber;
    private String instructor;

    public OnsiteCourse(String courseid, String coursetitle, int credithours, String location, String classroomNumber, String instructor) {
        super(courseid, coursetitle, credithours);
        this.location = location;
        this.classroomNumber = classroomNumber;
        this.instructor = instructor;
    }

    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Location: " + location);
        System.out.println("Classroom: " + classroomNumber);
        System.out.println("Instructor: " + instructor);
    }
}

class Feedback {
    public void submitFeedback(String comment) {
        System.out.println("Feedback: " + comment);
    }

    public void submitFeedback(int rating) {
        System.out.println("Rating: " + rating);
    }

    public void submitFeedback(String comment, int rating) {
        System.out.println("-----------");
        System.out.println("Overall Feedback: " + comment + " \nRating: " + rating);
    }
}

public class Main {
    public static void main(String[] args) {
        Course onlineCourse = new OnlineCourse("Abc1", "Introduction to C++", 3, "Codeblocks", "Shehzad", 10);
        Course onsiteCourse = new OnsiteCourse("xyz2", "Introduction to Java", 4, "Islamabad", "D-101", "ALi");

        System.out.println("----- Online Course Info -----");
        onlineCourse.showCourseDetails();

        System.out.println("\n----- Onsite Course Info -----");
        onsiteCourse.showCourseDetails();

        Feedback feedback = new Feedback();
        System.out.println("\n----- Feedback Section -----");
        feedback.submitFeedback("Good Course..!");
        feedback.submitFeedback(4);
        feedback.submitFeedback("Interesting..!",5);
    }
}
