public class Main {
    public static void main(String[] args) {
        Student myStudent = new Student("Amanda Jones", 9, 8);

        String name = myStudent.getName();
        System.out.println("Name : " + name);

        float firstMark = myStudent.getMark(1);
        System.out.println("Lab mark : " + firstMark);

        float secondMark = myStudent.getMark(2);
        System.out.println("Course mark : " + secondMark);

        float courseTotal = myStudent.calculateCourseTotal();
        System.out.println("Course total : " + courseTotal);
    }
}