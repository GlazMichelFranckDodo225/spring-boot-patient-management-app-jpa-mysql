package com.dgmf;

import com.dgmf.entity.Patient;
import com.dgmf.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// 1er Patient
		patientRepository.save(
				new Patient(
				null,
				"John Doe",
				new Date(),
				false,
				100
				)
		);

		// 2e Patient
		patientRepository.save(
				new Patient(
						null,
						"Paul Stewart",
						new Date(),
						true,
						210
				)
		);

		// 3e Patient
		patientRepository.save(
				new Patient(
						null,
						"Alice Cordoba",
						new Date(),
						false,
						56
				)
		);
	}
}
