package pojo;

import java.util.List;

public class Class {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> studentss;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return studentss;
    }

    public void setStudents(List<Student> students) {
        this.studentss = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher=" + teacher +
                ", students=" + studentss +
                '}';
    }
}
