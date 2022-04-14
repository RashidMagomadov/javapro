package com.rmagomadov.javapro.repository;

import com.rmagomadov.javapro.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {

    Optional<User> findByUsernameAndPassword(String username, String password);
}
