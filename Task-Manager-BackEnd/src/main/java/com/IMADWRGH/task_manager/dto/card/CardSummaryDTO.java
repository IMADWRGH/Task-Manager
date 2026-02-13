package com.IMADWRGH.task_manager.dto.card;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CardSummaryDTO {

    private Long id;
    private String name;
    private Integer order;
}
