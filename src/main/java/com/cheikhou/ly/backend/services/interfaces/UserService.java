package com.cheikhou.ly.backend.services.interfaces;

import com.cheikhou.ly.backend.entities.Role;
import com.cheikhou.ly.backend.entities.User;

import java.util.List;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    void addRoleToUser(String userName,String roleName);
    User findParUserName(String userName);
    List<User> listUsers();
    User getUserParId(Long id);
    void deleteUser(Long id);
}
