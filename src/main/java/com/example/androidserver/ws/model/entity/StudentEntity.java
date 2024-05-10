package com.example.androidserver.ws.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentEntity {

    @Id
    private Long id;

}
