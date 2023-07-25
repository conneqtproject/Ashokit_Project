package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.DCEducation;

@Repository
public interface DcEducationRepository extends JpaRepository<DCEducation, Long> {
   
}
