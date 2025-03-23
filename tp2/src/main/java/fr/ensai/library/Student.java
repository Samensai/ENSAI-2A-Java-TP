public class Student extends Person{
    private int academicYear;
    private boolean isClassDelegate;

    // Constructor
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }
}
