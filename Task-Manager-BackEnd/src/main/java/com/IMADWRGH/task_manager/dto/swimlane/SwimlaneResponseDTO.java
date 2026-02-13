package com.IMADWRGH.task_manager.dto.swimlane;


import com.IMADWRGH.task_manager.dto.board.BoardSummaryDTO;
import com.IMADWRGH.task_manager.dto.card.CardSummaryDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimlaneResponseDTO {

    private Long id;
    private String name;
    private Integer order;
    private BoardSummaryDTO board;        // Nested board info
    private List<CardSummaryDTO> cards;
}
