package com.liv2train.controller;

import static com.liv2train.constant.UrlConstant.REGISTRATION;
import static com.liv2train.constant.UrlConstant.TRAINING_CENTERS;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.liv2train.dto.TrainingCenterDto;
import com.liv2train.response.TrainingResponse;
import com.liv2train.service.TrainingService;

@RestController
public class TrainingController {

	@Autowired
	private TrainingService trainingService;

	@PostMapping(REGISTRATION)
	public ResponseEntity<TrainingResponse> saveTrainingCenter(
			@Valid @RequestBody TrainingCenterDto trainingCenterDto) {
		return trainingService.saveTrainingCenter(trainingCenterDto);
	}

	@GetMapping(TRAINING_CENTERS)
	public ResponseEntity<TrainingResponse> trainingCenters() {
		return trainingService.trainingCenters();
	}
}
