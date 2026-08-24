package com.IMADWRGH.task_manager.repository;

import com.IMADWRGH.task_manager.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

    List<Card> findAllBySwimlaneIdOrderByPositionAsc(Long swimlaneId);

    long countBySwimlaneId(Long swimlaneId);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
            UPDATE Card c SET c.position = c.position + 1
            WHERE c.swimlane.id = :swimlaneId AND c.position >= :from
            """)
    int shiftRightFrom(@Param("swimlaneId") Long swimlaneId, @Param("from") int from);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("""
            UPDATE Card c SET c.position = c.position - 1
            WHERE c.swimlane.id = :swimlaneId AND c.position > :from
            """)
    int shiftLeftAfter(@Param("swimlaneId") Long swimlaneId, @Param("from") int from);
}
