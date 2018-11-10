package com.bsuir.psucalculator.repository;

import com.bsuir.psucalculator.entity.MotherboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MotherboardRepository extends JpaRepository<MotherboardEntity, Long> {

    @Query(value = "SELECT * " +
                    "FROM motherboard " +
                    "WHERE socket = CAST(:supportedCpuSocket AS TEXT) " +
                    "AND (:motherboardVendor IS NULL OR vendor = CAST(:motherboardVendor AS TEXT)) " +
                    "AND (:motherboardChipset IS NULL OR chipset = CAST(:motherboardChipset AS TEXT)) " +
                    "AND (:motherboardForm IS NULL OR form = CAST(:motherboardForm AS TEXT)) " +
                    "ORDER BY price ASC ",
            nativeQuery = true)
    List<MotherboardEntity> findAllByParameters(@Param("supportedCpuSocket") String supportedCpuSocket,
                                                @Param("motherboardVendor") String motherboardVendor,
                                                @Param("motherboardChipset") String motherboardChipset,
                                                @Param("motherboardForm") String motherboardForm);

    @Query(value = "SELECT DISTINCT vendor FROM motherboard ORDER BY vendor ",
            nativeQuery = true)
    List<String> getVendors();

    @Query(value = "SELECT DISTINCT chipset FROM motherboard ORDER BY chipset ",
            nativeQuery = true)
    List<String> getChipsets();

    @Query(value = "SELECT DISTINCT form  FROM motherboard ORDER BY form ",
            nativeQuery = true)
    List<String> getForms();
}
