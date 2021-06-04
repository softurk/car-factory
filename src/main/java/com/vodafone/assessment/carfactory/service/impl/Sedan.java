package com.vodafone.assessment.carfactory.service.impl;

import com.vodafone.assessment.carfactory.service.Car;
import org.springframework.stereotype.Service;

@Service
public class Sedan implements Car {

    @Override
    public String getType() {
        return "Sedan Car has procuced";
    }
}
