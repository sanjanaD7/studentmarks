import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private String program;
    private int semester;
    private List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getSemester() {
        return semester;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Course {
    private String name;
    private int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class studentmarks {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("John", "Computer Science", 3);
        Student student2 = new Student("Alice", "Engineering", 2);

        // Adding courses for students
        student1.addCourse(new Course("Mathematics", 80));
        student1.addCourse(new Course("Physics", 35));
        student1.addCourse(new Course("Programming", 50));

        student2.addCourse(new Course("Chemistry", 75));
        student2.addCourse(new Course("Biology", 30));
        student2.addCourse(new Course("Mechanics", 45));

        // Retrieving information about students and their courses
        System.out.println("Students with marks less than 40:");
        retrieveLowMarksStudents(student1);
        retrieveLowMarksStudents(student2);
    }

    public static void retrieveLowMarksStudents(Student student) {
        List<Course> lowMarksCourses = new ArrayList<>();
        for (Course course : student.getCourses()) {
            if (course.getMarks() < 40) {
                lowMarksCourses.add(course);
            }
        }

        if (!lowMarksCourses.isEmpty()) {
            System.out.println("Name: " + student.getName());
            System.out.println("Program: " + student.getProgram());
            System.out.println("Semester: " + student.getSemester());
            System.out.println("Courses with marks less than 40:");
            for (Course course : lowMarksCourses) {
                System.out.println("- " + course.getName() + ": " + course.getMarks());
            }
            System.out.println();
        }
    }
}
