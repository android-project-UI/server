package com.example.androidserver.ws.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table

public class MasterEntity {

    @Id
    private long id;

    private String publicId;

    private String name;

    private Long profId;

    private String username;

    private String password;

    @OneToMany
    private List<CourseEntity> courses;

    private byte[] image;

    private List<Integer> schedule;


}
