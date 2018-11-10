package com.bsuir.psucalculator.converter;

import com.bsuir.model.CentralProcessingUnitModel;
import com.bsuir.psucalculator.entity.CentralProcessingUnitEntity;

import java.util.ArrayList;
import java.util.List;

public class CentralProcessingUnitConverter {

    public static CentralProcessingUnitModel toCentralProcessingUnitModel(
            CentralProcessingUnitEntity centralProcessingUnitEntity) {

        CentralProcessingUnitModel centralProcessingUnitModel = new CentralProcessingUnitModel();

        centralProcessingUnitModel.setId(centralProcessingUnitEntity.getId());
        centralProcessingUnitModel.setName(centralProcessingUnitEntity.getName());
        centralProcessingUnitModel.setVendor(centralProcessingUnitEntity.getVendor());
        centralProcessingUnitModel.setFamily(centralProcessingUnitEntity.getFamily());
        centralProcessingUnitModel.setCodename(centralProcessingUnitEntity.getCodename());
        centralProcessingUnitModel.setSocket(centralProcessingUnitEntity.getSocket());
        centralProcessingUnitModel.setNumOfCores(centralProcessingUnitEntity.getNumOfCores());
        centralProcessingUnitModel.setNumOfThreads(centralProcessingUnitEntity.getNumOfThreads());
        centralProcessingUnitModel.setClockFrequency(centralProcessingUnitEntity.getClockFrequency().doubleValue());
        centralProcessingUnitModel.setMaxClockFrequency(centralProcessingUnitEntity.getMaxClockFrequency().doubleValue());
        centralProcessingUnitModel.setTdp(centralProcessingUnitEntity.getTdp());
        centralProcessingUnitModel.setBuiltInGraphics(centralProcessingUnitEntity.isBuiltInGraphics());
        centralProcessingUnitModel.setYearOfIssue(centralProcessingUnitEntity.getYearOfIssue());
        centralProcessingUnitModel.setPrice(centralProcessingUnitEntity.getPrice().doubleValue());
        centralProcessingUnitModel.setImageURL(centralProcessingUnitEntity.getImageUrl());

        return centralProcessingUnitModel;
    }

    public static List<CentralProcessingUnitModel> toCentralProcessingUnitModels(
            List<CentralProcessingUnitEntity> centralProcessingUnitEntities) {

        List<CentralProcessingUnitModel> centralProcessingUnitModels = new ArrayList<>();

        centralProcessingUnitEntities.forEach(centralProcessingUnitEntity -> {
            centralProcessingUnitModels.add(CentralProcessingUnitConverter
                    .toCentralProcessingUnitModel(centralProcessingUnitEntity));
        });

        return centralProcessingUnitModels;
    }
}
