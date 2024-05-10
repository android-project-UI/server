package com.example.androidserver.ws.repository;

import com.example.androidserver.ws.model.entity.MasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MasterRepository extends JpaRepository<MasterEntity,Long> {
    Optional<MasterEntity> findByPublicId(String publicId);
}
