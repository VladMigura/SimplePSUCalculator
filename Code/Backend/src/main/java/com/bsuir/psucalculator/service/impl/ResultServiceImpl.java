package com.bsuir.psucalculator.service.impl;

import com.bsuir.model.ResultResponseModel;
import com.bsuir.psucalculator.converter.PowerSupplyUnitConverter;
import com.bsuir.psucalculator.entity.PowerSupplyUnitEntity;
import com.bsuir.psucalculator.repository.PowerSupplyUnitRepository;
import com.bsuir.psucalculator.service.ResultService;
import com.bsuir.psucalculator.utility.PowerSupplyUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultServiceImpl implements ResultService {

    @Autowired
    private PowerSupplyUnitRepository powerSupplyUnitRepository;

    @Override
    public ResultResponseModel calculateResult(int cpuTdpValue, int videocardTdpValue, int hddSsdCount,
                                               int cdDvdCount, int bluRayCount, int ramModulesCount, int fansCount) {

        ResultResponseModel resultResponseModel = new ResultResponseModel();

        resultResponseModel.setPowerSupplyModel(PowerSupplyUtility.calculatePowerSupply(cpuTdpValue, videocardTdpValue,
                hddSsdCount, cdDvdCount, bluRayCount, ramModulesCount, fansCount));

        List<PowerSupplyUnitEntity> powerSupplyUnitEntities =
                powerSupplyUnitRepository.findRecommendedPowerSupplyUnit(
                        resultResponseModel.getPowerSupplyModel().getRecommendedPowerSupply(),
                        resultResponseModel.getPowerSupplyModel().getRecommendedPowerSupply() + 100);

        resultResponseModel.setPowerSupplyUnits(
                PowerSupplyUnitConverter.toPowerSupplyUnitModels(powerSupplyUnitEntities));

        return resultResponseModel;
    }
}
