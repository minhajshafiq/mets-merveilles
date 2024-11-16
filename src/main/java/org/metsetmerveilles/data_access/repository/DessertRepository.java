package org.metsetmerveilles.data_access.repository;

import org.metsetmerveilles.data_access.entity.DessertEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends JpaRepository<DessertEntity, Long> {
}