package com.merlin.bycle.infrastructure.persistence.adapter;

import com.merlin.bycle.domain.entity.Bycle;
import com.merlin.bycle.domain.port.BycleQueryPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BycleQueryPersistenceAdapter implements BycleQueryPersistence {

    @Autowired
    private BycleQueryReposiitory reposiitory;

    @Override
    public List<Bycle> findAll() {
        return (List<Bycle>) reposiitory.findAll();
    }

    @Override
    public Optional<Bycle> findById(Long id) {
        return reposiitory.findById(id);
    }
}
