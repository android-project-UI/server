package com.example.androidserver.ws.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class SessionEntity {

    @Id
    private Long id;

    private String publicId;
    private String name;
    private Date date;
}
