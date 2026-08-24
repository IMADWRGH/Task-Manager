package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

    List<Board> findAllByUsersIdOrderByIdDesc(Long userId);

    boolean existsByIdAndUsersId(Long boardId, Long userId);
}
