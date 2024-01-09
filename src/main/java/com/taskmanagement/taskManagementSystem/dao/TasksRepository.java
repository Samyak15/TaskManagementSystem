package com.taskmanagement.taskManagementSystem.dao;

import com.taskmanagement.taskManagementSystem.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.*;

public interface TasksRepository extends JpaRepository<Tasks,Integer> {

    // Custom query using @Query annotation
    //method for finding tasks of a particular user
    @Query("SELECT t FROM Tasks t WHERE t.userId=:theid")
    List<Tasks> findAllTasksOfAUser(@Param("theid") Integer id);

    @Query("UPDATE Tasks t SET t.status = :nstatus WHERE t.id = :thegivenid")
    void statusUpdate(@Param("thegivenid") Integer id,@Param("nstatus") Optional<String> nstatus);

    @Query("SELECT t.taskDetails FROM Tasks t WHERE t.id = :theid")
    String findTaskDetails(@Param("theid") Integer id);


    
}
