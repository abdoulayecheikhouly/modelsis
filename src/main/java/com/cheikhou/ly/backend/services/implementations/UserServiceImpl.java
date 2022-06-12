package com.cheikhou.ly.backend.services.implementations;

import com.cheikhou.ly.backend.entities.Role;
import com.cheikhou.ly.backend.entities.User;

import com.cheikhou.ly.backend.repository.RoleRepository;
import com.cheikhou.ly.backend.repository.UserRepository;
import com.cheikhou.ly.backend.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User user = userRepository.findByUserName(userName);
        Role role = roleRepository.findByRoleName(roleName);
        user.getRoles().add(role);

    }

    @Override
    public User findParUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserParId(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
