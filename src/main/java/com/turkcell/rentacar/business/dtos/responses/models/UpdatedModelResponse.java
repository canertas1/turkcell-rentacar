package com.turkcell.rentacar.business.dtos.responses.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedModelResponse {
    private int id;

    private String name;

    private LocalDateTime updatedDate;
}
