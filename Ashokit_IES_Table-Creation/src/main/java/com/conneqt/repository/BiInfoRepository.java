package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.BiInfo;

@Repository
public interface BiInfoRepository extends JpaRepository<BiInfo, Long> {
    
}

