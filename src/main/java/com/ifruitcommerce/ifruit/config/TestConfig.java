package com.ifruitcommerce.ifruit.config;


import com.ifruitcommerce.ifruit.entities.User;
import com.ifruitcommerce.ifruit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("teste")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void run (String...args) throws Exception {
        User u1 = new User(null, "LEOMAR", "leomar_vieira@hotmail.com","43999194106", "Comercial1512*");
        User u2 = new User(null, "GUI", "gui_vieira@hotmail.com","4399920458", "Comercial1512");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
