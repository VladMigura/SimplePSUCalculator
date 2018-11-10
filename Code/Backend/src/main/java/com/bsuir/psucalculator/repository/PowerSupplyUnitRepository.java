package com.bsuir.psucalculator.repository;

import com.bsuir.psucalculator.entity.PowerSupplyUnitEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PowerSupplyUnitRepository extends JpaRepository<PowerSupplyUnitEntity, Long> {

    @Query(value = "SELECT * " +
                    "FROM psu " +
                    "WHERE power >= :recommendedPowerSupply " +
                    "AND power <= :maxRecommendedPowerSupply ",
            nativeQuery = true)
    List<PowerSupplyUnitEntity> findRecommendedPowerSupplyUnit(
            @Param("recommendedPowerSupply") int recommendedPowerSupply,
            @Param("maxRecommendedPowerSupply") int maxRecommendedPowerSupply);
}
