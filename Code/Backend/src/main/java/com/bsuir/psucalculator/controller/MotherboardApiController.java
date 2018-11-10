package com.bsuir.psucalculator.controller;

import com.bsuir.api.MotherboardApi;
import com.bsuir.model.MotherboardModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class MotherboardApiController implements MotherboardApi {

    @Override
    public ResponseEntity<List<MotherboardModel>> getMotherboards(
            @NotNull @Valid @RequestParam(value = "supportedCpuSocket", required = true) String supportedCpuSocket,
            @Valid @RequestParam(value = "motherboardVendor", required = false) String motherboardVendor,
            @Valid @RequestParam(value = "motherboardChipset", required = false) String motherboardChipset,
            @Valid @RequestParam(value = "motherboardForm", required = false) String motherboardForm) {

        return null;
    }
}
