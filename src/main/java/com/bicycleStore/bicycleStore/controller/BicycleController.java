package com.bicycleStore.bicycleStore.controller;

import com.bicycleStore.bicycleStore.model.BicycleModel;
import com.bicycleStore.bicycleStore.service.BicycleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Api(description = "Service for manage bicycle information")
@RestController
public class BicycleController {

    private BicycleService bicycleService;

    public BicycleController(BicycleService bicycleService) {
        this.bicycleService = bicycleService;
    }

    @ApiOperation("Service to insert bicycle")
    @PostMapping("/bicycle/create")
    public ResponseEntity insertBicycle(@RequestBody BicycleModel bicycle) {
        bicycleService.createBicycle(bicycle);
        return ok(bicycle);
    }

    @ApiOperation("Service to get all bicycles")
    @GetMapping("/bicycles")
    public ResponseEntity allBicycles() {
        List<BicycleModel> bicycles = bicycleService.findAllBicycles();
        return ok(bicycles);
    }
    @ApiOperation("Service to delete bicycle for id")
    @DeleteMapping("bicycle/delete/{id}")
    public ResponseEntity deleteBicycle(@PathVariable int id) {
        bicycleService.deleteBicycle(id);
        return ok("user Deleted");
    }
}
