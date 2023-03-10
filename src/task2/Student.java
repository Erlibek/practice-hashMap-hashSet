package task2;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String idStudent;

    public Student(String name, String group, String idStudent) {
        this.name = name;
        this.group = group;
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return Objects.equals(idStudent, student.idStudent);
    }

    @Override
    public int hashCode() {
        return idStudent != null ? idStudent.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", idStudent='" + idStudent + '\'' +
                '}';
    }
}