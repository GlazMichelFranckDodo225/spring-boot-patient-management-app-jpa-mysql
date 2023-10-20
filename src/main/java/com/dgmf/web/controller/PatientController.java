package com.dgmf.web.controller;

import com.dgmf.service.PatientService;
import com.dgmf.web.dto.PatientDtoRequest;
import com.dgmf.web.dto.PatientDtoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController
// @RequestMapping("/api/v1/patients")
@Controller
@RequiredArgsConstructor
public class PatientController {
    private final PatientService patientService;

    // http://localhost:8080/index
    @GetMapping("/index")
    public String patients() {
        return "patients";
    }
}
