package com.IMADWRGH.task_manager.dto.auth;


import com.IMADWRGH.task_manager.dto.user.UserResponseDTO;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponseDTO {

    private String accessToken;
    private String refreshToken;
    private UserResponseDTO user;
}
