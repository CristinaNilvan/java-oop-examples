public class Student {
    private final String name;
    private final float labMark;
    private final float courseMark;

    public Student(String name, float labMark, float courseMark) {
        this.name = name;
        this.labMark = labMark;
        this.courseMark = courseMark;
    }

    public String getName() {
        return name;
    }

    public float getMark(int markNumber) {
        if (markNumber == 1)
            return labMark;
        else if (markNumber == 2)
            return courseMark;

        return 0;
    }

    public float calculateCourseTotal() {
        return (float) (0.4 * labMark + 0.6 * courseMark);
    }
}