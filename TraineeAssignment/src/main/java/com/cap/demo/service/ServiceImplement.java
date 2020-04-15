package com.cap.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.Dao.TraineeInterface;
import com.cap.demo.Entity.Trainee;

@Service
public class ServiceImplement implements ServiceInterface {

	@Autowired
	TraineeInterface ti;
	
	@Override
	public void create(Trainee t) {
		// TODO Auto-generated method stub
		ti.create(t);
	}

	@Override
	public Trainee findById(int id) {
	
		return ti.findById(id);
	}

	public void delete(int id) {
		ti.delete(id);
		
	}

	@Override
	public void update(int id) {
		ti.update(id);
	}

}
