package com.sion0909.number1.service.impl;

import com.sion0909.number1.service.FakturaService;
import com.sion0909.number1.domain.Faktura;
import com.sion0909.number1.repository.FakturaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Faktura}.
 */
@Service
@Transactional
public class FakturaServiceImpl implements FakturaService {

    private final Logger log = LoggerFactory.getLogger(FakturaServiceImpl.class);

    private final FakturaRepository fakturaRepository;

    public FakturaServiceImpl(FakturaRepository fakturaRepository) {
        this.fakturaRepository = fakturaRepository;
    }

    /**
     * Save a faktura.
     *
     * @param faktura the entity to save.
     * @return the persisted entity.
     */
    @Override
    public Faktura save(Faktura faktura) {
        log.debug("Request to save Faktura : {}", faktura);
        return fakturaRepository.save(faktura);
    }

    /**
     * Get all the fakturas.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<Faktura> findAll(Pageable pageable) {
        log.debug("Request to get all Fakturas");
        return fakturaRepository.findAll(pageable);
    }


    /**
     * Get one faktura by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Faktura> findOne(Long id) {
        log.debug("Request to get Faktura : {}", id);
        return fakturaRepository.findById(id);
    }

    /**
     * Delete the faktura by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Faktura : {}", id);

        fakturaRepository.deleteById(id);
    }
}
