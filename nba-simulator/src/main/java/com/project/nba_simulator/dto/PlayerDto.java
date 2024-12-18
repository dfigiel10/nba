package com.project.nba_simulator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private String position;
//
//    public PlayerDto(Long id, String firstName, String lastName, int height, int weight, String position) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.height = height;
//        this.weight = weight;
//        this.position = position;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public String getPosition() {
//        return position;
//    }


}