package com.hazem.BuggyApp.Dto;

import com.hazem.BuggyApp.Enum.Roles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private Integer id;
    private String email;
    private String fullName;
    private String phone;
    private String password;
    private Roles role;
}
