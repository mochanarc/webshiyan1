package com.gk.pojo;
import java.util.List;
public class School1 {
   private Integer id;
    private String schoolname;
    private List<Course>courseList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course>courseList) {
        this.courseList = courseList;
    }
    @Override
    public String toString() {
        return "School1{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\''+","+ "courseList=" + courseList  +
                '}';
    }
}
