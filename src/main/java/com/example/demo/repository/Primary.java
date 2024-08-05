package com.example.demo.repository;

import com.example.demo.entity.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Primary extends JpaRepository<PrimaryEntity,Integer> {
}
