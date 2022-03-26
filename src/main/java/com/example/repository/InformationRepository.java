package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Information;

public interface InformationRepository extends JpaRepository<Information, Integer>{

}
