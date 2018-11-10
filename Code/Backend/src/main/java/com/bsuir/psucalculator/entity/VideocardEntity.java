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
@Table(name = "videocard")
public class VideocardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "gpu_vendor")
    private String gpuVendor;

    @Column(name = "clock_frequency")
    private BigDecimal clockFrequency;

    @Column(name = "max_clock_frequency")
    private BigDecimal maxClockFrequency;

    @Column(name = "tdp")
    private int tdp;

    @Column(name = "memory_volume")
    private BigDecimal memoryVolume;

    @Column(name = "type_of_memory")
    private String typeOfMemory;

    @Column(name = "vga_support")
    private boolean vgaSuport;

    @Column(name = "dvi_support")
    private boolean dviSupport;

    @Column(name = "hdmi_support")
    private boolean hdmiSupport;

    @Column(name = "display_port_support")
    private boolean displayPortSupport;

    @Column(name = "year_of_issue")
    private String year_of_issue;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "image_url")
    private String imageUrl;
}
