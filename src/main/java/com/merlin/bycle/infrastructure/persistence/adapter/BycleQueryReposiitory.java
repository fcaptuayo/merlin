package com.merlin.bycle.infrastructure.persistence.adapter;

import com.merlin.bycle.domain.entity.Bycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BycleQueryReposiitory extends CrudRepository<Bycle, Long> {
}
