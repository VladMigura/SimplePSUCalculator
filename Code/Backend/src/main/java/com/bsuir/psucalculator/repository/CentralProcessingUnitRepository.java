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
                    "AND (:cpuFamiy IS NULL OR family = CAST(:cpuFamily AS TEXT)) " +
                    "AND (:cpuSocket IS NULL OR socket = CAST(:cpuSocket AS TEXT)) ",
            nativeQuery = true)
    List<CentralProcessingUnitEntity> findAllByParameters(@Param("cpuVendor") String cpuVendor,
                                                          @Param("cpuFamily") String cpuFamily,
                                                          @Param("cpuSocket") String cpuSocket);
}
