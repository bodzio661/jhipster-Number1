package com.sion0909.number1.service;

import com.sion0909.number1.domain.Faktura;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link Faktura}.
 */
public interface FakturaService {

    /**
     * Save a faktura.
     *
     * @param faktura the entity to save.
     * @return the persisted entity.
     */
    Faktura save(Faktura faktura);

    /**
     * Get all the fakturas.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<Faktura> findAll(Pageable pageable);


    /**
     * Get the "id" faktura.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Faktura> findOne(Long id);

    /**
     * Delete the "id" faktura.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
