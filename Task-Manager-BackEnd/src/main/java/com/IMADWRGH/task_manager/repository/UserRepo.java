package com.IMADWRGH.task_manager.repository;


import com.IMADWRGH.task_manager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepo extends JpaRepository<User,Long> {
}
