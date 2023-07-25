package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.EdEligibilityDetails;

@Repository
public interface EdEligDtlsRepository extends JpaRepository<EdEligibilityDetails, Long> {
    
}
