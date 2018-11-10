package com.bsuir.psucalculator.controller;

import com.bsuir.api.ProcessorApi;
import com.bsuir.model.CentralProcessingUnitFiltersModel;
import com.bsuir.model.CentralProcessingUnitModel;
import com.bsuir.psucalculator.service.CentralProcessingUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProcessorApiController implements ProcessorApi {

    @Autowired
    private CentralProcessingUnitService centralProcessingUnitService;

    @Override
    public ResponseEntity<CentralProcessingUnitFiltersModel> getProcessorFilters() {

        CentralProcessingUnitFiltersModel centralProcessingUnitFiltersModel =
                centralProcessingUnitService.getProcessorFilters();

        return new ResponseEntity<>(centralProcessingUnitFiltersModel, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<CentralProcessingUnitModel>> getProcessors(
            @Valid @RequestParam(value = "cpuVendor", required = false) String cpuVendor,
            @Valid @RequestParam(value = "cpuFamily", required = false) String cpuFamily,
            @Valid @RequestParam(value = "cpuSocket", required = false) String cpuSocket) {

        List<CentralProcessingUnitModel> centralProcessingUnitModels =
                centralProcessingUnitService.getProcessorsByParameters(cpuVendor, cpuFamily, cpuSocket);

        return new ResponseEntity<>(centralProcessingUnitModels, HttpStatus.OK);
    }
}
