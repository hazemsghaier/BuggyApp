package com.hazem.BuggyApp.Services.User;

import com.hazem.BuggyApp.Entity.User;
import com.hazem.BuggyApp.Repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User newUser) {

        //verifier si le user deja existe ou non
        //verifier que les regle du validation du pasword est valide
        //verifier si le mail est valide aussi


        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User deleteUser(User user) {
        return null;
    }
}
