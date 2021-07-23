package com.liv2train.service;

import org.springframework.http.ResponseEntity;

import com.liv2train.dto.TrainingCenterDto;
import com.liv2train.response.TrainingResponse;

public interface TrainingService {

	public ResponseEntity<TrainingResponse> saveTrainingCenter(TrainingCenterDto trainingCenterDto);

	public ResponseEntity<TrainingResponse> trainingCenters();

}
