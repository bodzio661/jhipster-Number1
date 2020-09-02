package com.sion0909.number1.service.impl;

import com.sion0909.number1.service.KontrachentService;
import com.sion0909.number1.domain.Kontrachent;
import com.sion0909.number1.repository.KontrachentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Kontrachent}.
 */
@Service
@Transactional
public class KontrachentServiceImpl implements KontrachentService {

    private final Logger log = LoggerFactory.getLogger(KontrachentServiceImpl.class);

    private final KontrachentRepository kontrachentRepository;

    public KontrachentServiceImpl(KontrachentRepository kontrachentRepository) {
        this.kontrachentRepository = kontrachentRepository;
    }

    /**
     * Save a kontrachent.
     *
     * @param kontrachent the entity to save.
     * @return the persisted entity.
     */
    @Override
    public Kontrachent save(Kontrachent kontrachent) {
        log.debug("Request to save Kontrachent : {}", kontrachent);
        return kontrachentRepository.save(kontrachent);
    }

    /**
     * Get all the kontrachents.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public Page<Kontrachent> findAll(Pageable pageable) {
        log.debug("Request to get all Kontrachents");
        return kontrachentRepository.findAll(pageable);
    }


    /**
     * Get one kontrachent by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<Kontrachent> findOne(Long id) {
        log.debug("Request to get Kontrachent : {}", id);
        return kontrachentRepository.findById(id);
    }

    /**
     * Delete the kontrachent by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Kontrachent : {}", id);

        kontrachentRepository.deleteById(id);
    }
}
