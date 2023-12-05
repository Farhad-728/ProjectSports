package com.example.springapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Exercise {
    private int exerciseId;
    private String name;
    private int sets;
    private int reps;
    private double weight;
    private int duration;
}
