package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepo extends JpaRepository<Board,Long> {
}
