package com.bsuir.psucalculator.service;

import com.bsuir.model.ResultResponseModel;

public interface ResultService {

    ResultResponseModel calculateResult(int cpuTdpValue, int videocardTdpValue, int hddSsdCount, int cdDvdCount,
                                        int bluRayCount, int ramModulesCount, int fansCount);
}
