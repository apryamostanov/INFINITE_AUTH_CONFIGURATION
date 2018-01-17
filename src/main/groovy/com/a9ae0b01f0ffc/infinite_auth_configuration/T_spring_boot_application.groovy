package com.a9ae0b01f0ffc.infinite_auth_configuration

import com.a9ae0b01f0ffc.infinite_auth_configuration.base.T_auth_base_5_context
import com.a9ae0b01f0ffc.infinite_auth_configuration.data.T_data_generator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class T_spring_boot_application implements CommandLineRunner {

    @Autowired
    private T_auth_base_5_context p_auth_base_5_context

    static void main(String[] args) {
        SpringApplication.run(T_spring_boot_application.class, args)
    }

    @Autowired
    private T_data_generator p_data_generator

    @Override
    void run(String... args) throws Exception {
        p_data_generator.generate_data()
        p_auth_base_5_context.init_standalone()
    }
}
