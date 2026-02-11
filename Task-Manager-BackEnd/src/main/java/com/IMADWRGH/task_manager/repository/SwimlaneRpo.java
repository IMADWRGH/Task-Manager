package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Swimlane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SwimlaneRpo extends JpaRepository<Swimlane,Long> {
}
