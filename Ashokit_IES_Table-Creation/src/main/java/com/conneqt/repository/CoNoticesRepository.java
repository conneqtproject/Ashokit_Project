package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.CoNotice;

@Repository
public interface CoNoticesRepository extends JpaRepository<CoNotice, Long> {
    
}
