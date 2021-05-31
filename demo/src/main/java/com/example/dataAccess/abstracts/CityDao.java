package com.example.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.concretes.City;

public interface CityDao  extends JpaRepository<City, Integer>{

}
