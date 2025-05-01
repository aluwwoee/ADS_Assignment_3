public class Student {
    private String fullName;

    public Student(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" + fullName + '}';
    }
}
