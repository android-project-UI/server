package com.example.androidserver.ws.model.response;

import com.example.androidserver.ws.model.entity.CourseEntity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class MasterResponse {

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
