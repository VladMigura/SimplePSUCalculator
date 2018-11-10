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
@Table(name = "cpu")
public class CentralProcessingUnitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "family")
    private String family;

    @Column(name = "codename")
    private String codename;

    @Column(name = "socket")
    private String socket;

    @Column(name = "num_of_cores")
    private int numOfCores;

    @Column(name = "num_of_threads")
    private int numOfThreads;

    @Column(name = "clock_frequency")
    private double clockFrequency;

    @Column(name = "max_clock_frequency")
    private double maxClockFrequency;

    @Column(name = "tdp")
    private int tdp;

    @Column(name = "built_in_graphics")
    private boolean builtInGraphics;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "price")
    private double price;

    @Column(name = "image_url")
    private String imageUrl;
}
