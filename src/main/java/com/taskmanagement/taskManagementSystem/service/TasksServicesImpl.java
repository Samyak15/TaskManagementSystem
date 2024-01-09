package com.taskmanagement.taskManagementSystem.service;

import com.taskmanagement.taskManagementSystem.dao.TasksRepository;
import com.taskmanagement.taskManagementSystem.entity.Tasks;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TasksServicesImpl implements TasksServices{

    private TasksRepository tasksRepository;

    public TasksServicesImpl (TasksRepository tasksRepository){
        this.tasksRepository = tasksRepository;
    }

    @Override
    public void createTask(Tasks task) {
        tasksRepository.save(task);
    }

    public List<Tasks> seeTasks(Integer id){
        List<Tasks> list = tasksRepository.findAllTasksOfAUser(id);
        return list;
    }

    @Override
    public void statusupdate(Integer id,String statustoupdate) {
        Tasks task = tasksRepository.getById(id);
        System.out.println(task.getTaskName());
        task.setStatus(statustoupdate);
        System.out.println(task.getStatus());

    }

    @Override
    public String getTaskDetails(Integer id){
        String details =  tasksRepository.findTaskDetails(id);
        return details;
    }


}
