package com.IMADWRGH.task_manager.dto.swimlane;

import jakarta.validation.constraints.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimlaneCreateRequestDTO {

    @NotBlank(message = "Swimlane name is required")
    @Size(max = 100)
    private String name;

    @NotNull(message = "Board ID is required")
    private Long boardId;

    private Integer order;
}
