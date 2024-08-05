package com.example.demo.secondaryrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Secondary extends JpaRepository<com.example.demo.secondaryentity.Secondary, Integer> {
}
