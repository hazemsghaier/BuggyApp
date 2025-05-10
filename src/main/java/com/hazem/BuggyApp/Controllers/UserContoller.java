package com.hazem.BuggyApp.Controllers;

import com.hazem.BuggyApp.Dto.UserDto;
import com.hazem.BuggyApp.Entity.User;
import com.hazem.BuggyApp.Services.User.IUserService;
import com.hazem.BuggyApp.Services.User.UserService;
import com.hazem.BuggyApp.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserContoller {
    private final IUserService userService;
    @PostMapping("/users/register")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(UserMapper.toEntity(userDto));
        return ResponseEntity.ok(UserMapper.toDto(user));
    }
    @PutMapping("/users/{userId}")
    public ResponseEntity<UserDto> updateUser(@PathVariable Integer userId,@RequestBody UserDto userDto) {
        userDto.setId(userId);
        User user = userService.updateUser(UserMapper.toEntity(userDto));
        return ResponseEntity.ok(UserMapper.toDto(user));
    }
    @DeleteMapping("/users/{userId}")
    public void deleteUser(@PathVariable Integer userId) {
        userService.deleteUser(userId);

    }

}
