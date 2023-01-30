package com.bilgeadam.service;

import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.repository.IRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IRepository repository;

    public String register(RegisterRequestDto registerRequestDto){




        return "";
    }


}
