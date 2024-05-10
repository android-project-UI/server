package com.example.androidserver.ws.model.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Builder
@AllArgsConstructor
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
