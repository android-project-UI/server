package com.example.androidserver.ws.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CourseEntity {
    @Id
    private Long id;

    private String publicId;
    private String name;

    @ManyToOne
    private MasterEntity owner;

    @ManyToMany
    private List<StudentEntity> students;

    private String date;

    private int unit;
}
