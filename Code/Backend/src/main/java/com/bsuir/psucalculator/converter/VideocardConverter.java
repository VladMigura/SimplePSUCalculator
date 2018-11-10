package com.bsuir.psucalculator.converter;

import com.bsuir.model.VideocardModel;
import com.bsuir.psucalculator.entity.VideocardEntity;

import java.util.ArrayList;
import java.util.List;

public class VideocardConverter {

    public static VideocardModel toVideocardModel(VideocardEntity videocardEntity) {

        VideocardModel videocardModel = new VideocardModel();

        videocardModel.setId(videocardEntity.getId());
        videocardModel.setName(videocardEntity.getName());
        videocardModel.setVendor(videocardEntity.getVendor());
        videocardModel.setGpuVendor(videocardEntity.getGpuVendor());
        videocardModel.setClockFrequency(videocardEntity.getClockFrequency().doubleValue());
        videocardModel.setMaxClockFrequency(videocardEntity.getMaxClockFrequency().doubleValue());
        videocardModel.setMemoryVolume(videocardEntity.getMemoryVolume().doubleValue());
        videocardModel.setTypeOfMemory(videocardEntity.getTypeOfMemory());
        videocardModel.setVgaSupport(videocardEntity.isVgaSuport());
        videocardModel.setDviSupport(videocardEntity.isDviSupport());
        videocardModel.setHdmiSupport(videocardEntity.isHdmiSupport());
        videocardModel.setDisplayPortSupport(videocardEntity.isDisplayPortSupport());
        videocardModel.setYearOfIssue(videocardEntity.getYearOfIssue());
        videocardModel.setPrice(videocardEntity.getPrice().doubleValue());
        videocardModel.setImageURL(videocardEntity.getImageUrl());
        videocardModel.setTdp(videocardEntity.getTdp());

        return videocardModel;
    }

    public static List<VideocardModel> toVideocardModels(List<VideocardEntity> videocardEntities) {

        List<VideocardModel> videocardModels = new ArrayList<>();

        videocardEntities.forEach(videocardEntity -> {
            videocardModels.add(VideocardConverter.toVideocardModel(videocardEntity));
        });

        return videocardModels;
    }
}
