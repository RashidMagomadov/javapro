package com.rmagomadov.javapro.service;

import com.rmagomadov.javapro.model.Permission;
import com.rmagomadov.javapro.model.User;
import com.rmagomadov.javapro.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> get(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    public void createUser(String username, String password, Set<Permission> permissions) {
        User user = new User()
                .setUsername(username)
                .setPassword(password)
                .setPermissions(permissions);
        userRepository.save(user);

    }
}
