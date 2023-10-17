package com.dgmf.service.impl;

import com.dgmf.entity.Patient;
import com.dgmf.repository.PatientRepository;
import com.dgmf.service.PatientService;
import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Override
    public PatientDtoResponse createPatient(
            PatientDtoRequest patientDtoRequest
    ) {
        Patient patient = Patient.builder()
                .patientName(patientDtoRequest.getPatientName())
                .dob(patientDtoRequest.getDob())
                .isSick(patientDtoRequest.isSick())
                .score(patientDtoRequest.getScore())
                .build();

        Patient savedPatient = patientRepository.save(patient);

        PatientDtoResponse patientDtoResponse = PatientDtoResponse.builder()
                .id(savedPatient.getId())
                .patientName(savedPatient.getPatientName())
                .dob(savedPatient.getDob())
                .isSick(savedPatient.isSick())
                .score(savedPatient.getScore())
                .build();

        return patientDtoResponse;
    }
}
