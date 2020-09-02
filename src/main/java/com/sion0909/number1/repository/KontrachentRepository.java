package com.sion0909.number1.repository;

import com.sion0909.number1.domain.Kontrachent;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Kontrachent entity.
 */
@SuppressWarnings("unused")
@Repository
public interface KontrachentRepository extends JpaRepository<Kontrachent, Long> {
}
