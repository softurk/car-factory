package com.vodafone.assessment.carfactory.service.impl;

import com.vodafone.assessment.carfactory.service.Car;
import org.springframework.stereotype.Service;

@Service
public class Hatchback implements Car {

    @Override
    public String getType() {
        return "Hatchback Car has procuced";
    }
}
