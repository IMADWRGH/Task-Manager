package com.IMADWRGH.task_manager.dto.board;

import jakarta.validation.constraints.Size;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardUpdateRequestDTO {

    @Size(max = 100)
    private String name;
}
