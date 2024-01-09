package com.taskmanagement.taskManagementSystem.rest;

import com.taskmanagement.taskManagementSystem.entity.user;
import com.taskmanagement.taskManagementSystem.service.UserServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {
    private UserServices userServices;

    //quick and dirty : inject user dao
    public UserRestController(UserServices userServices){
        this.userServices = userServices;
    }

    //expose endpoint
    @PostMapping("/addUser")
    public void createNewUser(@RequestBody user User){
        userServices.createUser(User);
    }

}
