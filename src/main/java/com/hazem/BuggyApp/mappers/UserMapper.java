package com.hazem.BuggyApp.mappers;

import com.hazem.BuggyApp.Dto.UserDto;
import com.hazem.BuggyApp.Entity.User;

public class UserMapper {
    // Convertit une entité User vers un DTO (inclut le password)
    public static UserDto toDto(User user) {
        if (user == null) return null;

        return new UserDto(
                user.getId(),
                user.getEmail(),
                user.getFullName(),
                user.getPhone(),
                null,
                user.getRole()
        );
    }

    public static User toEntity(UserDto dto) {
        if (dto == null) {
            return null;
        }

        User user = new User();
        user.setId(dto.getId());
        user.setEmail(dto.getEmail());
        user.setFullName(dto.getFullName());
        user.setPhone(dto.getPhone());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return user;
    }
}
