package com.example.mygatedsociety.config;

import com.example.mygatedsociety.mapper.GuestMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public GuestMapper guestMapper(){
        return Mappers.getMapper((GuestMapper.class));
    }
}
