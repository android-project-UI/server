package com.example.androidserver.ws.model.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
<<<<<<< HEAD
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
>>>>>>> 4e9c0481a9e4203076b88d62ca6fdcdd618267ab

import java.util.List;

@Entity
@Table
<<<<<<< HEAD
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
=======
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
>>>>>>> 4e9c0481a9e4203076b88d62ca6fdcdd618267ab
public class MasterEntity {

    @Id
    private Long id;

    private String publicId;

    private String name;

    private Long profId;

    private String username;

    private String password;

    @OneToMany
    private List<CourseEntity> courses;

    private byte[] image;

    private int[] schedule;

}
