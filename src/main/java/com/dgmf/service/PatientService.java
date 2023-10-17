package com.dgmf.service;

import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;

public interface PatientService {
    PatientDtoResponse createPatient(PatientDtoRequest patientDtoRequest);
}
