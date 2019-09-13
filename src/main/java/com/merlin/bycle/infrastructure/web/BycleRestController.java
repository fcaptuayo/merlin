package com.merlin.bycle.infrastructure.web;

import com.merlin.bycle.domain.entity.Bycle;
import com.merlin.bycle.domain.exception.BycleNotFoundException;
import com.merlin.bycle.domain.usecase.BycleUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bycles")
public class BycleRestController {

    @Autowired
    private BycleUseCase useCase;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Bycle> createBycle(@RequestBody Bycle bycle) {
        return new ResponseEntity<Bycle>(useCase.createBycle(bycle), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Bycle> findById(@PathVariable("id") Long id) throws BycleNotFoundException {
        return new ResponseEntity<Bycle>(useCase.findByIdBycle(id), HttpStatus.OK);
    }

}
