package Interfaces;

import Entities.Users.Student;
import Entities.Users.Teacher;
import Entities.UsersGroups.StudentGroup;
import Interfaces.UsersGroups.UsersGroup;

import java.util.List;

public interface StudyGroup extends UsersGroup<Student> {

    String getSGUID();

    StudentGroup getStudentGroup();

    void setStudentGroup(StudentGroup studentGroup);

    Teacher getMentor();

    void setMentor(Teacher mentor);

    List<Student> getStudents();

    Student getStudentLeader();
}