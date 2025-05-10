package com.hazem.BuggyApp.Services.User;

import com.hazem.BuggyApp.Entity.User;
import com.hazem.BuggyApp.Repository.UserRepository;
import com.hazem.BuggyApp.utility.EmailUtility;
import com.hazem.BuggyApp.utility.PasswordUtility;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User newUser) {

        if(userRepository.existsByEmail(newUser.getEmail())) {
            throw new RuntimeException("User with id " + newUser.getId() + " already exists");
        }
        if(!PasswordUtility.checkPasswordStructureValidity(newUser.getPassword())){
            throw new RuntimeException("the password must is not  valid");
        }
        if(!EmailUtility.isValidEmail(newUser.getEmail())) {
            throw new RuntimeException("the email is invalid");
        }
        return userRepository.save(newUser);
    }
    @Override
    public User updateUser(User user) {
        if (!checkUserAutority(user.getId())) {
            throw new RuntimeException("User is not authorized to update this user");
        }

        User existing = userRepository.findById(user.getId())
                .orElseThrow(() -> new RuntimeException("User not found with id " + user.getId()));

        // Mise à jour seulement si la valeur en entrée n'est pas null
        if (user.getEmail() != null) {
            existing.setEmail(user.getEmail());
        }
        if (user.getFullName() != null) {
            existing.setFullName(user.getFullName());
        }
        if (user.getPhone() != null) {
            existing.setPhone(user.getPhone());
        }
        if (user.getPassword() != null) {
            existing.setPassword(PasswordUtility.generatePasswordHash(user.getPassword()));
        }


        return userRepository.save(existing);
    }
    @Override
    public void deleteUser(Integer userId) {
        if(!this.checkUserAutority(userId)) {
            throw new RuntimeException("User is not authorized to delete this user");
        }
        if(!userRepository.existsById(userId)) {
            throw new RuntimeException("User with id " + userId + " does not exist");
        }
        userRepository.deleteById(userId);
    }

    private boolean checkUserAutority(Integer userId){
        return true;
    }
}
