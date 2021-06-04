package com.vodafone.assessment.carfactory.factory;

import com.vodafone.assessment.carfactory.service.impl.Cabrio;
import com.vodafone.assessment.carfactory.service.impl.Hatchback;
import com.vodafone.assessment.carfactory.service.impl.Sedan;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@Component
public class CarFactory {

    private final Cabrio cabrio;
    private final Hatchback hatchback;
    private final Sedan sedan;

    public String getProduceCar(String carType) {
        String response = "cannot be empty or null";
        if (carType != null && !carType.isEmpty()) {
            switch (carType.toLowerCase()) {
                case "cabrio":
                    return cabrio.getType();
                case "hatchback":
                    return hatchback.getType();
                case "sedan":
                    return sedan.getType();
                default:
                    throw new IllegalArgumentException("Invalid car type: " + carType);
            }
        }
        return response;
    }

}
