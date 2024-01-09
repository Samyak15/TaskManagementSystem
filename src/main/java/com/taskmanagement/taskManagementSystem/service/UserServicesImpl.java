package com.taskmanagement.taskManagementSystem.service;

import com.taskmanagement.taskManagementSystem.dao.user_Repository;
import com.taskmanagement.taskManagementSystem.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices{

    private user_Repository userRepository;
    @Autowired
    public UserServicesImpl(user_Repository theuserRepository){
        this.userRepository = theuserRepository;
    }
    @Override
    public void createUser(user User) {
        userRepository.save(User);
    }
}
