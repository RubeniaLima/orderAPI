package com.project.orderAPI.config;

import com.project.orderAPI.entities.User;
import com.project.orderAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null,"Rose Mary","rosemary@email.com","562314122","123",null);
        User u2 = new User(null,"Rick Green ","rickg@email.com","58588556","1233546",null);

        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
