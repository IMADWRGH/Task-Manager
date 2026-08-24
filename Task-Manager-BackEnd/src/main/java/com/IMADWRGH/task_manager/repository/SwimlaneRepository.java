package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Swimlane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SwimlaneRepository extends JpaRepository<Swimlane, Long> {

    List<Swimlane> findAllByBoardIdOrderByPositionAsc(Long boardId);

    long countByBoardId(Long boardId);
}
