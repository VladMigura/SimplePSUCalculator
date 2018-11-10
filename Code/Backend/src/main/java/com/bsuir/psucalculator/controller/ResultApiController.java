package com.bsuir.psucalculator.controller;

import com.bsuir.api.ResultApi;
import com.bsuir.model.ResultResponseModel;
import com.bsuir.psucalculator.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class ResultApiController implements ResultApi {

    @Autowired
    private ResultService resultService;

    @Override
    public ResponseEntity<ResultResponseModel> getResult(
            @NotNull @Valid @RequestParam(value = "cpuTdpValue", required = true) Integer cpuTdpValue,
            @NotNull @Valid @RequestParam(value = "videocardTdpValue", required = true) Integer videocardTdpValue,
            @NotNull @Valid @RequestParam(value = "hddSsdCount", required = true) Integer hddSsdCount,
            @NotNull @Valid @RequestParam(value = "cdDvdCount", required = true) Integer cdDvdCount,
            @NotNull @Valid @RequestParam(value = "bluRayCount", required = true) Integer bluRayCount,
            @NotNull @Valid @RequestParam(value = "ramModulesCount", required = true) Integer ramModulesCount,
            @NotNull @Valid @RequestParam(value = "fansCount", required = true) Integer fansCount) {

        ResultResponseModel resultResponseModel = resultService.calculateResult(cpuTdpValue, videocardTdpValue,
                hddSsdCount, cdDvdCount, bluRayCount, ramModulesCount, fansCount);

        return new ResponseEntity<>(resultResponseModel, HttpStatus.OK);
    }
}
