package com.IMADWRGH.task_manager.dto.card;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardCreateRequestDTO {

    @NotBlank(message = "Card name is required")
    @Size(max = 100)
    private String name;

    private String content;

    @NotNull(message = "Swimlane ID is required")
    private Long swimlaneId;

    private Long assigneeId;

    private Integer order;
}
