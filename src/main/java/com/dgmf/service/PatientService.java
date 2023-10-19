package com.dgmf.service;

import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;

import java.util.List;

public interface PatientService {
    PatientDtoResponse createPatient(PatientDtoRequest patientDtoRequest);
    List<PatientDtoResponse> getAllPatients();
}
