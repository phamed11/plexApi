package com.phamed.dbModels;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionsRepository extends JpaRepository<Collections, Long> {
}