package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelRepository extends JpaRepository<Label, Long> {

    List<Label> findAllByBoardIdOrderByNameAsc(Long boardId);

    boolean existsByIdAndBoardId(Long labelId, Long boardId);
}
