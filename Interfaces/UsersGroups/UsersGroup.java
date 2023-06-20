package Interfaces.UsersGroups;

import Abstract.Users.UserImpl;

import java.util.List;

public interface UsersGroup<T extends UserImpl> {

    void add(List<T> group);

    void add(T user);
}