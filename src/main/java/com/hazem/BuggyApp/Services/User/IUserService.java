package com.hazem.BuggyApp.Services.User;

import com.hazem.BuggyApp.Entity.User;

public interface IUserService {
    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Integer userId);
}
