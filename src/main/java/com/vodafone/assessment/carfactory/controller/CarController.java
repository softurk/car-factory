package com.vodafone.assessment.carfactory.controller;

import com.vodafone.assessment.carfactory.factory.CarFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/car")
public class CarController {

    private final CarFactory carFactory;

    @Autowired
    public CarController(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @GetMapping("/getType")
    public String produceCar(@RequestParam String carType) {
        log.info("getType service called");
        return carFactory.getProduceCar(carType);
    }

}
