package com.bilgeadam.utility;


import com.bilgeadam.repository.IRepository;
import com.bilgeadam.repository.entity.Personal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class DataImpl {
    private final IRepository repository;
    @PostConstruct
    public void initData(){

    }
    public void createUser(){
        Personal personal=Personal.builder()
                .name("Hilal")
                .address("Ankara")
                .email("hilaler1@hotmail.com")
                .nationalId(2352462462L)
                .photo("foto")
                .build();
    }
}
