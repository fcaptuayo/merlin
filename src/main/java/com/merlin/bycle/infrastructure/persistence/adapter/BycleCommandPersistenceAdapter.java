package com.merlin.bycle.infrastructure.persistence.adapter;

import com.merlin.bycle.domain.entity.Bycle;
import com.merlin.bycle.domain.port.BycleCommandPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BycleCommandPersistenceAdapter implements BycleCommandPersistence {

    @Autowired
    private BycleCommandReposiitory reposiitory;

    @Override
    public Bycle createBycle(Bycle bycle) {
        return reposiitory.save(bycle);
    }

}
