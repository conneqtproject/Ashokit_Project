package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.DCIncome;

@Repository
public interface DcIncomeRepository extends JpaRepository<DCIncome, Long> {

}
