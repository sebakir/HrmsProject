package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.VerificationCode;

public interface VerificationCodeDao  extends JpaRepository<VerificationCode, Integer>{

}
