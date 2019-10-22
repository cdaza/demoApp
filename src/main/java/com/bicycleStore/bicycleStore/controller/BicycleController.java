package com.bicycleStore.bicycleStore.controller;

import com.bicycleStore.bicycleStore.model.BicycleModel;
import com.bicycleStore.bicycleStore.service.BicycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.ok;

@RestController
public class BicycleController {

    private BicycleService bicycleService;

    public BicycleController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @PostMapping("/bicycle/create")
    public ResponseEntity insertUser(@RequestBody BicycleModel bicycle) {
        bicycleService.createUser(bicycle);
        return ok(bicycle);
    }
}
