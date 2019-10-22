package com.bicycleStore.bicycleStore.service;

import com.bicycleStore.bicycleStore.model.BicycleModel;
import com.bicycleStore.bicycleStore.repository.BicycleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BicycleService {

    private BicycleRepository bicycleRepository;

    public BicycleService(BicycleRepository bicycleRepository) {
        this.bicycleRepository = bicycleRepository;
    }

    public BicycleModel createBicycle(BicycleModel bicycle) {
        return bicycleRepository.save(bicycle);
    }

    public List<BicycleModel> findAllBicycles() {
        return bicycleRepository.findAll();
    }

    public void deleteBicycle(int id) {
        bicycleRepository.deleteById(id);
    }
}
