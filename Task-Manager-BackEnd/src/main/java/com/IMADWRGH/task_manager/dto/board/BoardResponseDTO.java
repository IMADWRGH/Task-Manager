package com.IMADWRGH.task_manager.dto.board;

import com.IMADWRGH.task_manager.dto.swimlane.SwimlaneSummaryDTO;
import com.IMADWRGH.task_manager.dto.user.UserSummaryDTO;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardResponseDTO {

    private Long id;
    private String name;
    private List<UserSummaryDTO> users;        // Nested user info
    private List<SwimlaneSummaryDTO> swimlanes;
}
