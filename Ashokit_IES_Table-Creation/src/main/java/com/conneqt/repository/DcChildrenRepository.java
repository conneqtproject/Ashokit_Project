package com.conneqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.entity.DCChildren;

@Repository
public interface DcChildrenRepository extends JpaRepository<DCChildren, Long> {

}
