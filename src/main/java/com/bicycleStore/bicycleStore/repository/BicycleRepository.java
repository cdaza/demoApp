package com.bicycleStore.bicycleStore.repository;

import com.bicycleStore.bicycleStore.model.BicycleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleRepository extends JpaRepository<BicycleModel, Integer> {
}
