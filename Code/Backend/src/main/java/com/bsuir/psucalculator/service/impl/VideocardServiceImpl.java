package com.bsuir.psucalculator.service.impl;

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
    public List<VideocardEntity> getVideocardsByParameters(String videocardGpuVendor, String videocardVendor) {

        return null;
    }
}
