package com.bsuir.psucalculator.converter;

import com.bsuir.model.MotherboardModel;
import com.bsuir.psucalculator.entity.MotherboardEntity;

import java.util.ArrayList;
import java.util.List;

public class MotherboardConverter {

    public static MotherboardModel toMotherboardModel(MotherboardEntity motherboardEntity) {

        MotherboardModel motherboardModel = new MotherboardModel();

        motherboardModel.setId(motherboardEntity.getId());
        motherboardModel.setName(motherboardEntity.getName());
        motherboardModel.setVendor(motherboardEntity.getVendor());
        motherboardModel.setSocket(motherboardEntity.getSocket());
        motherboardModel.setChipset(motherboardEntity.getChipset());
        motherboardModel.setForm(motherboardEntity.getForm());
        motherboardModel.setTypeOfMemory(motherboardEntity.getTypeOfMemory());
        motherboardModel.setNumOfMemorySlots(motherboardEntity.getNumOfMemorySlots());
        motherboardModel.setMaxMemoryVolume(motherboardEntity.getMaxMemoryVolume());
        motherboardModel.setNumOfMemoryChannels(motherboardEntity.getNumOfMemoryChannels());
        motherboardModel.setBuiltInGraphics(motherboardEntity.isBuiltInGraphics());
        motherboardModel.setYearOfIssue(motherboardEntity.getYearOfIssue());
        motherboardModel.setPrice(motherboardEntity.getPrice());
        motherboardModel.setImageURL(motherboardEntity.getImageUrl());

        return motherboardModel;
    }

    public static List<MotherboardModel> toMotherboardModels(List<MotherboardEntity> motherboardEntities) {

        List<MotherboardModel> motherboardModels = new ArrayList<>();

        motherboardEntities.forEach(motherboardEntity -> {
            motherboardModels.add(MotherboardConverter.toMotherboardModel(motherboardEntity));
        });

        return motherboardModels;
    }
}
