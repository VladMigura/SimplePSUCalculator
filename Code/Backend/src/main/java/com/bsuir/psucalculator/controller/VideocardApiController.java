package com.bsuir.psucalculator.controller;

import com.bsuir.api.VideocardApi;
import com.bsuir.model.VideocardFiltersModel;
import com.bsuir.model.VideocardModel;
import com.bsuir.psucalculator.service.VideocardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VideocardApiController implements VideocardApi {

    @Autowired
    private VideocardService videocardService;

    @Override
    public ResponseEntity<VideocardFiltersModel> getVideocardFilters() {

        VideocardFiltersModel videocardFiltersModel = videocardService.getVideocardFilters();
        return new ResponseEntity<>(videocardFiltersModel, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<VideocardModel>> getVideocards(
            @Valid @RequestParam(value = "videocardGpuVendor", required = false) String videocardGpuVendor,
            @Valid @RequestParam(value = "videocardVendor", required = false) String videocardVendor) {

        List<VideocardModel> videocardModels =
                videocardService.getVideocardsByParameters(videocardGpuVendor, videocardVendor);

        return new ResponseEntity<>(videocardModels, HttpStatus.OK);
    }
}
