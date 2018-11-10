package com.bsuir.psucalculator.controller;

import com.bsuir.api.ProcessorApi;
import com.bsuir.model.CentralProcessingUnitModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProcessorApiController implements ProcessorApi {

    @Override
    public ResponseEntity<List<CentralProcessingUnitModel>> getProcessors(
            @Valid @RequestParam(value = "cpuVendor", required = false) String cpuVendor,
            @Valid @RequestParam(value = "cpuFamily", required = false) String cpuFamily,
            @Valid @RequestParam(value = "cpuSocket", required = false) String cpuSocket) {

        return null;
    }
}
