package com.IMADWRGH.task_manager.dto.card;

import com.IMADWRGH.task_manager.dto.swimlane.SwimlaneSummaryDTO;
import com.IMADWRGH.task_manager.dto.user.UserSummaryDTO;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardResponseDTO {

    private Long id;
    private String name;
    private String content;
    private Integer order;
    private UserSummaryDTO assignee;      // ← Nested user info (Bob's data!)
    private SwimlaneSummaryDTO swimlane;
}
