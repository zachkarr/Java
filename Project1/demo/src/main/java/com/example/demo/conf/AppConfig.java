package com.example.demo.conf;

import com.example.demo.ds.DataSource;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan("com.example.demo")

public class AppConfig {
    @Bean
   public DataSource ds () {
    return new DataSource();
    };

}
