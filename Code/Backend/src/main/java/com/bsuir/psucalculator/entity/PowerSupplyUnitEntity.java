package com.bsuir.psucalculator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "psu")
public class PowerSupplyUnitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "power")
    private int power;

    @Column(name = "efficiency")
    private int efficiency;

    @Column(name = "certificate")
    private boolean certificate;

    @Column(name = "price")
    private double price;

    @Column(name = "image_url")
    private String imageUrl;
}
