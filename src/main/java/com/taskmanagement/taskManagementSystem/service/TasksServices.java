package com.taskmanagement.taskManagementSystem.service;

import com.taskmanagement.taskManagementSystem.entity.Tasks;

import java.util.List;

public interface TasksServices {

    void createTask(Tasks task);

    List<Tasks> seeTasks(Integer id);

    void statusupdate(Integer id,String statustoupdate);

    String getTaskDetails(Integer id);

}
