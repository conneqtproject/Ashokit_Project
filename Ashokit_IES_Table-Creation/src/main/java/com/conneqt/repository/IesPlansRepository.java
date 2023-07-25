package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.IES_Plan;

@Repository
public interface IesPlansRepository extends JpaRepository<IES_Plan, Long> {
   
}

