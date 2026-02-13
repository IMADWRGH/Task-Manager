package com.IMADWRGH.task_manager.dto.swimlane;

import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SwimlaneUpdateRequestDTO {

    @Size(max = 100)
    private String name;

    private Integer order;
}
