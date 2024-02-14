package com.luis.workshopmongo.config;

import com.luis.workshopmongo.domain.User;
import com.luis.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
public class Instatiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User (null, "Maria", "maria@gmail.com");
        User alex = new User (null, "Alex", "alex@gmail.com");
        User bob = new User (null, "Bob", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria,alex,bob));

    }
}