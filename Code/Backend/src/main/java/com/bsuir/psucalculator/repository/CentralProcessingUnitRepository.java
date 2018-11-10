package com.bsuir.psucalculator.repository;

import com.bsuir.psucalculator.entity.CentralProcessingUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CentralProcessingUnitRepository extends JpaRepository<CentralProcessingUnitEntity, Long> {

    @Query(value = "SELECT * " +
                    "FROM cpu " +
                    "WHERE (:cpuVendor IS NULL OR vendor = CAST(:cpuVendor AS TEXT)) " +
                    "AND (:cpuFamily IS NULL OR family = CAST(:cpuFamily AS TEXT)) " +
                    "AND (:cpuSocket IS NULL OR socket = CAST(:cpuSocket AS TEXT)) " +
                    "ORDER BY price ASC ",
            nativeQuery = true)
    List<CentralProcessingUnitEntity> findAllByParameters(@Param("cpuVendor") String cpuVendor,
                                                          @Param("cpuFamily") String cpuFamily,
                                                          @Param("cpuSocket") String cpuSocket);

    @Query(value = "SELECT DISTINCT vendor FROM cpu ORDER BY vendor ",
            nativeQuery = true)
    List<String> getVendors();

    @Query(value = "SELECT DISTINCT family FROM cpu ORDER BY family ",
            nativeQuery = true)
    List<String> getFamilies();

    @Query(value = "SELECT DISTINCT socket FROM cpu ORDER BY socket ",
            nativeQuery = true)
    List<String> getSockets();
}
