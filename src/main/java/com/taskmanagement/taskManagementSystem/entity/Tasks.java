package com.taskmanagement.taskManagementSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task_table")
public class Tasks {
    //define fields ;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "status")
    private String status;

    @Column(name = "created_on")
    private String createdOn;

    @Column(name = "updated_on")
    private String updatedOn;

    @Column(name = "task_description")
    private String taskDetails;

    //Constructors
    public Tasks(){

    }

    public Tasks(int userId,String taskName,String status,String createdOn,String updatedOn,String taskDetails){
        this.userId = userId;
        this.taskName = taskName;
        this.status = status;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
        this.taskDetails = taskDetails;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "id=" + id +
                ", userId=" + userId +
                ", taskName='" + taskName + '\'' +
                ", status='" + status + '\'' +
                ", createdOn='" + createdOn + '\'' +
                ", updatedOn='" + updatedOn + '\'' +
                ", taskDetails='" + taskDetails + '\'' +
                '}';
    }
}
