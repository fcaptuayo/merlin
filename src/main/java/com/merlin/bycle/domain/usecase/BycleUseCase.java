package com.merlin.bycle.domain.usecase;

import com.merlin.bycle.domain.entity.Bycle;
import com.merlin.bycle.domain.exception.BycleNotFoundException;

import java.util.List;

public interface BycleUseCase {

    List<Bycle> getAllBycle();

    Bycle createBycle(Bycle bycle);

    Bycle findByIdBycle(Long id) throws BycleNotFoundException;

}
