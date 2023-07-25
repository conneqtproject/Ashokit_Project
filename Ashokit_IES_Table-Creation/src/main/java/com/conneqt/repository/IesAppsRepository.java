package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.IES_App;

@Repository
public interface IesAppsRepository extends JpaRepository<IES_App, Long> {
    // Add custom query methods if needed
}
