package person;

public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address, int numCourses) {
        super(name, address);
        this.numCourses = numCourses;
        courses = new String[numCourses];
        grades = new int[numCourses];
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public boolean addCourse(String course) {
        if (numCourses == courses.length) {
            return false;
        }
        courses[numCourses++] = course;
        return true;
    }

    public void addCourseGrade(String course, int grade) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                grades[i] = grade;
                return;
            }
        }
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                    grades[j] = grades[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }

    public double getAverageGrade() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / numCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numCourses=" + numCourses +
                ", courses=" + Arrays.toString(courses) +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
