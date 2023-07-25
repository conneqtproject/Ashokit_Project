package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.DCPlanSelection;

@Repository
public interface DcPlanSelectionRepository extends JpaRepository<DCPlanSelection, Long> {
    
}
