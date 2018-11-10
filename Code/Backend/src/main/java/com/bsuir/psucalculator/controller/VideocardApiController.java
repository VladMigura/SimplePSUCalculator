package com.bsuir.psucalculator.controller;

import com.bsuir.api.VideocardApi;
import com.bsuir.model.VideocardModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class VideocardApiController implements VideocardApi {

    @Override
    public ResponseEntity<List<VideocardModel>> getVideocards(
            @Valid @RequestParam(value = "videocardGpuVendor", required = false) String videocardGpuVendor,
            @Valid @RequestParam(value = "videocardVendor", required = false) String videocardVendor) {

        return null;
    }
}
