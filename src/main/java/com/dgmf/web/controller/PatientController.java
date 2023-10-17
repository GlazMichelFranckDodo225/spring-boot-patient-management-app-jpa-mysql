package com.dgmf.web.controller;

import com.dgmf.service.PatientService;
import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/create")
    public ResponseEntity<PatientDtoResponse> createPatient(
            @RequestBody PatientDtoRequest patientDtoRequest
            ) {
        return new ResponseEntity<>(
                patientService.createPatient(patientDtoRequest),
                HttpStatus.CREATED
        );
    }
}
