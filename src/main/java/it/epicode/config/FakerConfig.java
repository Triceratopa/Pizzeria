package it.epicode.config;

import org.springframework.context.annotation.Configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;

@Configuration
public class FakerConfig {
    @Bean
    public Faker faker() {
        return new Faker(Locale.ITALIAN);
    }

}