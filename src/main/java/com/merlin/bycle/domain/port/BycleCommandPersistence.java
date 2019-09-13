package com.merlin.bycle.domain.port;

import com.merlin.bycle.domain.entity.Bycle;

public interface BycleCommandPersistence {

    Bycle createBycle(Bycle bycle);

}
