package Entities;

import Abstract.Units.StructuralUnit;
import Entities.UsersGroups.TeachersGroup;
import Entities.Users.Teacher;

import java.util.Map;

public class Faculty extends StructuralUnit<StudyGroupImpl, TeachersGroup, Teacher> {

    public Faculty(Map<String, StudyGroupImpl> unit, TeachersGroup leader) {
        super(unit, leader);
    }

}