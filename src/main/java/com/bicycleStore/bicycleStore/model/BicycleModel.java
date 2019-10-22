package com.bicycleStore.bicycleStore.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class BicycleModel {

    @Id
    @GeneratedValue
    private int id;
    private String model;
    private String marco;
    private String rin;
    private String size;
    private String type;
    private String prize;
}
