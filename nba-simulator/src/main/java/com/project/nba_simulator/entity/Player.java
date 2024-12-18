package com.project.nba_simulator.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private String position;
//
//    public Player(Long id, String firstName, String lastName, int height, int weight, String position) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.height = height;
//        this.weight = weight;
//        this.position = position;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//    public int getWeight() {
//        return weight;
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
//    public String getPosition() {
//        return position;
//    }
}