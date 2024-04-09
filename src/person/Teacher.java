package person;



public class Teacher extends Person {
    String name;
    String address;
    int numCourses;
    String[] courses;
    public Teacher(String name, String address) {
        this.name = name;
        this.address = address;
        this.numCourses = 0;
        this.courses = new String[30];
    }
    public boolean addCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                return false;
            }
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourse(String course) {
        boolean found = false;
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                found = true;
                break;
            }
        }
        return found;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public static void main(String[] args) {
        // Tạo một đối tượng Teacher
        Teacher teacher = new Teacher("Mr. Smith", "456 School Ave");
        teacher.addCourse("Math");
        teacher.addCourse("Science");
        System.out.println(teacher.toString());
        System.out.println("Courses: ");
        for (int i = 0; i < teacher.numCourses; i++) {
            System.out.println(teacher.courses[i]);
        }
        teacher.removeCourse("Math");
        System.out.println("After removing course: ");
        for (int i = 0; i < teacher.numCourses; i++) {
            System.out.println(teacher.courses[i]);
        }
    }
}