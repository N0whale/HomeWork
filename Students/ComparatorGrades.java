package Students;

import java.util.Comparator;

public class ComparatorGrades implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getGrade(), o1.getGrade());
    }
}
