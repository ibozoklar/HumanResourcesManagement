package com.bilgeadam.repository;


import com.bilgeadam.repository.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<Personal,Long> {



}
