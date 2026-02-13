package com.IMADWRGH.task_manager.dto.board;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardCreateRequestDTO {

    @NotBlank(message = "Board name is required")
    @Size(max = 100)
    private String name;

    // Optional: initial user IDs to add to the board
    private List<Long> userIds;
}
