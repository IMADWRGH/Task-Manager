package com.IMADWRGH.task_manager.dto.user;

import com.IMADWRGH.task_manager.entities.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean emailVerified;
    private Role role;
}
