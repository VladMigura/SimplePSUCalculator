package com.bsuir.psucalculator.service;

import com.bsuir.psucalculator.entity.VideocardEntity;

import java.util.List;

public interface VideocardService {

    List<VideocardEntity> getVideocardsByParameters(String videocardGpuVendor, String videocardVendor);
}
