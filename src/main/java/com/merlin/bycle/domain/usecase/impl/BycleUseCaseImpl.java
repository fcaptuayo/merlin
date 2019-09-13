package com.merlin.bycle.domain.usecase.impl;

import com.merlin.bycle.domain.entity.Bycle;
import com.merlin.bycle.domain.exception.BycleNotFoundException;
import com.merlin.bycle.domain.port.BycleCommandPersistence;
import com.merlin.bycle.domain.port.BycleQueryPersistence;
import com.merlin.bycle.domain.usecase.BycleUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BycleUseCaseImpl implements BycleUseCase {

    private BycleCommandPersistence commandPersistence;
    private BycleQueryPersistence queryPersistence;

    @Autowired
    public BycleUseCaseImpl(BycleCommandPersistence commandPersistence, BycleQueryPersistence queryPersistence) {
        this.commandPersistence = commandPersistence;
        this.queryPersistence = queryPersistence;
    }

    @Override
    public List<Bycle> getAllBycle() {
        return this.queryPersistence.findAll();
    }

    @Override
    public Bycle createBycle(Bycle bycle) {
        return this.commandPersistence.createBycle(bycle);
    }

    @Override
    public Bycle findByIdBycle(Long id) throws BycleNotFoundException {
        Optional<Bycle> response = this.queryPersistence.findById(id);
        return response.orElseThrow(() -> new BycleNotFoundException(""));
    }
}
