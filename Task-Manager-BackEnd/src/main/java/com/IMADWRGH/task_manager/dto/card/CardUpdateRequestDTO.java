package com.IMADWRGH.task_manager.dto.card;

import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardUpdateRequestDTO {

    @Size(max = 100)
    private String name;

    private String content;

    private Long swimlaneId;  // Allow moving card to different swimlane

    private Long assigneeId;  // Allow reassigning

    private Integer order;
}
