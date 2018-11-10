package com.bsuir.psucalculator.service;

import com.bsuir.model.VideocardFiltersModel;
import com.bsuir.model.VideocardModel;

import java.util.List;

public interface VideocardService {

    List<VideocardModel> getVideocardsByParameters(String videocardGpuVendor, String videocardVendor);
    VideocardFiltersModel getVideocardFilters();
}
