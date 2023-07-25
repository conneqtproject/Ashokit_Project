package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.IES_User;

@Repository
public interface IesUserRepository extends JpaRepository<IES_User, Long> {
   
}
