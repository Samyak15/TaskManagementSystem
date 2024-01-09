package com.taskmanagement.taskManagementSystem.rest;

import com.taskmanagement.taskManagementSystem.entity.Tasks;
import com.taskmanagement.taskManagementSystem.service.TasksServices;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TasksRestController {
    //create an entity manager
    private TasksServices tasksServices;

    public TasksRestController(TasksServices tasksServices){
        this.tasksServices = tasksServices;
    }

    //post api for adding a new task
    @PostMapping("/addTask")
    public void createNewTask(@RequestBody Tasks task){

        tasksServices.createTask(task);
    }

    //get api for seeing all the tasks
    @GetMapping("/seeTask")
    public List<Tasks> seeTasks(@RequestBody Integer id){
        return tasksServices.seeTasks(id);
    }

    //put api to update the status
    @PutMapping("/statusUpdation")
    public void statusupdation(@RequestBody updateRequest req){
        tasksServices.statusupdate(req.getId(),req.getStatus());
    }

    @GetMapping("/taskDetails")
    public String gettingTaskDetails(@RequestBody Integer id){
        return tasksServices.getTaskDetails(id);
    }

    static class updateRequest{
        private Integer id;
        private String status;

        public updateRequest(){

        }

        public updateRequest(Integer id,String status){
            this.id = id;
            this.status = status;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "updateRequest{" +
                    "id=" + id +
                    ", status='" + status + '\'' +
                    '}';
        }
    }
}
