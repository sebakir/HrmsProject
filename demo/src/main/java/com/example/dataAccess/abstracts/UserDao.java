package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.User;

//Base classımız jpaRepository Birinci parametre classımız ikinci parametre id Tipi
//Crud operasyonları hazır olarak geliyor
public interface UserDao extends JpaRepository<User, Integer> {

}
