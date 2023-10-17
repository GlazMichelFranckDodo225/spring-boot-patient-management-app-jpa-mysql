package com.dgmf.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PatientDtoResponse {
    private Long id;
    private String patientName;
    private Date dob;
    private boolean isSick;
    private int score;
}

