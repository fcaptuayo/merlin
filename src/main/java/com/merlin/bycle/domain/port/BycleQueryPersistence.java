package com.merlin.bycle.domain.port;

import com.merlin.bycle.domain.entity.Bycle;

import java.util.List;
import java.util.Optional;

public interface BycleQueryPersistence {

    List<Bycle> findAll();

    Optional<Bycle> findById(Long id);
}
