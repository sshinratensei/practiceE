package task3;

import java.util.ArrayList;
import java.util.List;

public enum Subject {
    MATH(1, 2, 3, 4, 5),
    RUSSIAN(3, 4, 5),
    GEOGRAPHY(1),
    KYRGYZ(2, 3, 4),
    SPORTS(1, 2, 3),
    BIOLOGY(1, 2);

    Subject(Integer... courses) {
        this.courses = new ArrayList<>();
        for (Integer course : courses) {
            this.courses.add(course);
        }
    }

    public List<Integer> getCourses() {
        return courses;
    }

    private List<Integer> courses;
}