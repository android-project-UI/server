package com.example.androidserver.ws.model.entity;

<<<<<<< HEAD
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
=======

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
>>>>>>> 4e9c0481a9e4203076b88d62ca6fdcdd618267ab
public class StudentEntity {
    @Id
    private Long id;

<<<<<<< HEAD
    private String publicId;
=======
    @Id
    private Long id;
>>>>>>> 4e9c0481a9e4203076b88d62ca6fdcdd618267ab

    private String firstName;

    private String lastName;

    private String UserId;

    @ManyToMany
    private List<CourseEntity> courses;
}
