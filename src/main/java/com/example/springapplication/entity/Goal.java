package com.example.springapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Goal {
    private int goalId;
    private String name;
    private String target;
    private Date deadLine;
    private String status;

}
