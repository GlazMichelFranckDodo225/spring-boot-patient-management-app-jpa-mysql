package com.dgmf.service.impl;

import com.dgmf.entity.Patient;
import com.dgmf.repository.PatientRepository;
import com.dgmf.service.PatientService;
import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository patientRepository;

    @Override
    public PatientDtoResponse createPatient(
            PatientDtoRequest patientDtoRequest
    ) {
        Patient patient = mapDtoToPatient(patientDtoRequest);

        Patient savedPatient = patientRepository.save(patient);

        PatientDtoResponse patientDtoResponse = mapPatientToDto(savedPatient);

        return patientDtoResponse;
    }

    @Override
    public List<PatientDtoResponse> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        // Convert List of Patient to List of PatientDtoRequest
        List<PatientDtoResponse> patientDtoResponses = patients.stream()
                .map(patient -> mapPatientToDto(patient))
                .collect(Collectors.toList());

        return patientDtoResponses;
    }

    private PatientDtoResponse mapPatientToDto(Patient patient) {
        // Convert Patient into PatientDtoResponse
        PatientDtoResponse patientDtoResponse = PatientDtoResponse.builder()
                .id(patient.getId())
                .patientName(patient.getPatientName())
                .dob(patient.getDob())
                .isSick(patient.isSick())
                .score(patient.getScore())
                .build();

        return patientDtoResponse;
    }

    private Patient mapDtoToPatient(PatientDtoRequest patientDtoRequest) {
        // Convert PatientDtoRequest to Patient
        Patient patient = Patient.builder()
                .patientName(patientDtoRequest.getPatientName())
                .dob(patientDtoRequest.getDob())
                .isSick(patientDtoRequest.isSick())
                .score(patientDtoRequest.getScore())
                .build();

        return patient;
    }
}
