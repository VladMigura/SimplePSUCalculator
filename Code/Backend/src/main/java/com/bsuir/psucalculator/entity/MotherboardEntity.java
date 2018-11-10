package com.bsuir.psucalculator.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "motherboard")
public class MotherboardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "socket")
    private String socket;

    @Column(name = "chipset")
    private String chipset;

    @Column(name = "form")
    private String form;

    @Column(name = "type_of_memory")
    private String typeOfMemory;

    @Column(name = "num_of_memory_slots")
    private int numOfMemorySlots;

    @Column(name = "max_memory_volume")
    private int maxMemoryVolume;

    @Column(name = "num_of_memory_channels")
    private int numOfMemoryChannels;

    @Column(name = "built_in_graphics")
    private boolean builtInGraphics;

    @Column(name = "year_of_issue")
    private String yearOfIssue;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;
}
