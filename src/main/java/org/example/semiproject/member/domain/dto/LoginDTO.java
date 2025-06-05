package org.example.semiproject.member.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LoginDTO {
    private String userid;
    private String passwd;
}