package com.turkcell.rentacar.business.dtos.responses.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GotCarResponse {
    private int id;
    private String name;
    private String brandName;
    private int dailyPrice;

    private String fuelName;

    private String transmissionName;
    
}
