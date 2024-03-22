package org.humber.project.repositories;

import org.humber.project.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerJPARepository extends JpaRepository<CustomerEntity, Long> {
}
