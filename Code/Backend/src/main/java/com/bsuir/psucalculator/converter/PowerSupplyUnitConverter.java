package com.bsuir.psucalculator.converter;

import com.bsuir.model.PowerSupplyUnitModel;
import com.bsuir.psucalculator.entity.PowerSupplyUnitEntity;

import java.util.ArrayList;
import java.util.List;

public class PowerSupplyUnitConverter {

    public static PowerSupplyUnitModel toPowerSupplyUnitModel(PowerSupplyUnitEntity powerSupplyUnitEntity) {

        PowerSupplyUnitModel powerSupplyUnitModel = new PowerSupplyUnitModel();

        powerSupplyUnitModel.setId(powerSupplyUnitEntity.getId());
        powerSupplyUnitModel.setName(powerSupplyUnitEntity.getName());
        powerSupplyUnitModel.setVendor(powerSupplyUnitEntity.getVendor());
        powerSupplyUnitModel.setPower(powerSupplyUnitEntity.getPower());
        powerSupplyUnitModel.setEfficiency(powerSupplyUnitEntity.getEfficiency());
        powerSupplyUnitModel.setCertificate(powerSupplyUnitEntity.isCertificate());
        powerSupplyUnitModel.setPrice(powerSupplyUnitEntity.getPrice().doubleValue());
        powerSupplyUnitModel.setImageURL(powerSupplyUnitEntity.getImageUrl());

        return powerSupplyUnitModel;
    }

    public static List<PowerSupplyUnitModel> toPowerSupplyUnitModels(
            List<PowerSupplyUnitEntity> powerSupplyUnitEntities) {

        List<PowerSupplyUnitModel> powerSupplyUnitModels = new ArrayList<>();

        powerSupplyUnitEntities.forEach(powerSupplyUnitEntity -> {
            powerSupplyUnitModels.add(PowerSupplyUnitConverter.toPowerSupplyUnitModel(powerSupplyUnitEntity));
        });

        return powerSupplyUnitModels;
    }
}
