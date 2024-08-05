package com.example.demo.secondaryentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Secondary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String msg;
}
