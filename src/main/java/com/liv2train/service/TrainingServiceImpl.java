package com.liv2train.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.liv2train.constant.MessageConstant;
import com.liv2train.dto.TrainingCenterDto;
import com.liv2train.entity.Address;
import com.liv2train.entity.TrainingCenter;
import com.liv2train.exception.RunTimeException;
import com.liv2train.repository.TrainingCenterRepository;
import com.liv2train.response.TrainingResponse;

@Service
public class TrainingServiceImpl extends MessageConstant implements TrainingService {

	@Autowired
	private TrainingCenterRepository trainingCenterRepository;

	@Override
	public ResponseEntity<TrainingResponse> saveTrainingCenter(TrainingCenterDto trainingCenterDto) {
	 try {
		TrainingCenter trainingCenter = new TrainingCenter();
		Address address = new Address();
		trainingCenter.setCenterName(trainingCenterDto.getCenterName());
		trainingCenter.setCenterCode(trainingCenterDto.getCenterCode());
		address.setCity(trainingCenterDto.getAddress().getCity());
		address.setDetailedAddress(trainingCenterDto.getAddress().getDetailedAddress());
		address.setPinCode(trainingCenterDto.getAddress().getPinCode());
		address.setState(trainingCenterDto.getAddress().getState());
		trainingCenter.setAddress(address);
		trainingCenter.setStudentCapacity(trainingCenterDto.getStudentCapacity());
		trainingCenter.setCoursesOffered(trainingCenterDto.getCoursesOffered());
		trainingCenter.setCreatedOn(new Date());
		trainingCenter.setContactEmail(trainingCenterDto.getContactEmail());
		trainingCenter.setContactPhone(trainingCenterDto.getContactPhone());
		return new ResponseEntity<>(new TrainingResponse(new Date(), STATUS_200, TRAINING_CENTER_CREATED_SUCCESSFULLY,
				trainingCenterRepository.save(trainingCenter)), HttpStatus.OK);
	 }
		 catch (Exception e) { 
			 throw new RunTimeException(SOMETHING_WENT_WRONG); 
		 }
		 

	}

	public ResponseEntity<TrainingResponse> trainingCenters() {
		try {
			List<TrainingCenter> trainingCenters = trainingCenterRepository.findAll();
			if (!trainingCenters.isEmpty()) {
				return new ResponseEntity<>(new TrainingResponse(new Date(), STATUS_200,
						TRAINING_CENTER_CREATED_SUCCESSFULLY, trainingCenters), HttpStatus.OK);
			} else {
				return new ResponseEntity<>(
						new TrainingResponse(new Date(), STATUS_204, NO_DATA_FOUND, Collections.emptyList()),
						HttpStatus.NO_CONTENT);
			}
		} catch (Exception e) {
			throw new RunTimeException(SOMETHING_WENT_WRONG);
		}
	}
}
