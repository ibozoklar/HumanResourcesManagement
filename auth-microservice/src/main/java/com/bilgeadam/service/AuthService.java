package com.bilgeadam.service;

import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.mapper.AuthMapper;
import com.bilgeadam.repository.IRepository;
import com.bilgeadam.repository.entity.Personal;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IRepository repository;

    public Boolean register(RegisterRequestDto dto){

        Optional<Personal> personal = repository.findOptionalByEmail(dto.getEmail());

        if (personal.isPresent()){

            throw new RuntimeException("BU EMAIL ADRESI ALINMIS...");

        }else {

            repository.save(AuthMapper.INSTANCE.toPersonal(dto));

            return true;
        }

    }

    public Boolean updateAddress(Long id, String address){

        Optional<Personal> personal = repository.findById(id);

        if (personal.isEmpty()){
            throw new RuntimeException("BU KULLANICI BULUNAMADI...");
        }

        personal.get().setAddress(address);
        repository.save(personal.get());
        return true;
    }


}
