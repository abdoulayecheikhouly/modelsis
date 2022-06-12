package com.cheikhou.ly.backend.restController;

import com.cheikhou.ly.backend.entities.Role;
import com.cheikhou.ly.backend.entities.User;
import com.cheikhou.ly.backend.services.interfaces.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UtilisateurRestController {
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.listUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUserParId(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable("id") Long id, @RequestBody User user){
        User u = userService.getUserParId(id);

        u.setPrenom(user.getPrenom());
        u.setNom(user.getNom());
        u.setPassword(user.getPassword());
        u.setUserName(user.getUserName());

        return userService.addNewUser(user);
    }

    @GetMapping(path ="/login/{userName}")
    public User getUserByUsername(@PathVariable("userName") String userName){
        return userService.findParUserName(userName);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addNewUser(user);
    }

    @PostMapping("/roles")
    public Role addRole(@RequestBody Role role){
        return userService.addNewRole(role);
    }

    @PostMapping("/addRoleUser")
    public void addRoleUser(@RequestBody AddRoleUser addRoleUser){
        userService.addRoleToUser(addRoleUser.getUserName(), addRoleUser.getRoleName());

    }
}

@Data
class AddRoleUser{
    private String userName;
    private String roleName;
}
