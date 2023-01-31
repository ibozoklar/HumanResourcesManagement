package com.bilgeadam.controller;

import com.bilgeadam.dto.request.RegisterRequestDto;
import com.bilgeadam.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;


    @PostMapping("/register")
    public ResponseEntity<Boolean> register(@RequestBody @Valid RegisterRequestDto dto){

        return ResponseEntity.ok(authService.register(dto));

    }

    @PutMapping("/updateAddress/{id}/{address}")
    public ResponseEntity<Boolean> updateAddress(@PathVariable Long id, @PathVariable String address){

        return ResponseEntity.ok(authService.updateAddress(id, address));
    }




}
