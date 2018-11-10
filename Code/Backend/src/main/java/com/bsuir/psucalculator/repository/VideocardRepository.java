package com.bsuir.psucalculator.repository;

import com.bsuir.psucalculator.entity.VideocardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VideocardRepository extends JpaRepository<VideocardEntity, Long> {

    @Query(value = "SELECT * " +
                    "FROM videocard " +
                    "WHERE (:videocardGpuVendor IS NULL OR gpu_vendor = CAST(:videocardGpuVendor AS TEXT)) " +
                    "AND (:videocardVendor IS NULL OR vendor = CAST(:videocardVendor AS TEXT)) " +
                    "ORDER BY price ASC ",
            nativeQuery = true)
    List<VideocardEntity> findAllByParameters(@Param("videocardGpuVendor") String videocardGpuVendor,
                                              @Param("videocardVendor") String videocardVendor);

    @Query(value = "SELECT DISTINCT gpu_vendor FROM videocard ORDER BY gpu_vendor ",
            nativeQuery = true)
    List<String> getGpuVendors();

    @Query(value = "SELECT DISTINCT vendor FROM videocard ORDER BY vendor ",
            nativeQuery = true)
    List<String> getVendors();
}
