package org.fastcampus.student_management.domain;

import java.util.List;

public class CourseList {

    private final List<Course> courses;

    public CourseList(List<Course> course) {
        this.courses = course;
    }

    public void changeAllCourseFee(int fee) {
        for (Course course : courses) {
            if (course.isSameDay(DayOfWeek.SATURDAY) || course.isSameDay(DayOfWeek.SUNDAY)) {
                course.changeFee((int) (fee * 1.5));
            }
            course.changeFee(fee);
        }
    }
}