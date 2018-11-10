package com.bsuir.psucalculator.service.impl;

import com.bsuir.model.VideocardFiltersModel;
import com.bsuir.model.VideocardModel;
import com.bsuir.psucalculator.converter.VideocardConverter;
import com.bsuir.psucalculator.entity.VideocardEntity;
import com.bsuir.psucalculator.repository.VideocardRepository;
import com.bsuir.psucalculator.service.VideocardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideocardServiceImpl implements VideocardService {

    @Autowired
    private VideocardRepository videocardRepository;

    @Override
    public List<VideocardModel> getVideocardsByParameters(String videocardGpuVendor, String videocardVendor) {

        List<VideocardEntity> videocardEntities =
                videocardRepository.findAllByParameters(videocardGpuVendor, videocardVendor);

        return VideocardConverter.toVideocardModels(videocardEntities);
    }

    @Override
    public VideocardFiltersModel getVideocardFilters() {

        VideocardFiltersModel videocardFiltersModel = new VideocardFiltersModel();

        videocardFiltersModel.setGpuVendors(videocardRepository.getGpuVendors());
        videocardFiltersModel.setVendors(videocardRepository.getVendors());

        return videocardFiltersModel;
    }
}
