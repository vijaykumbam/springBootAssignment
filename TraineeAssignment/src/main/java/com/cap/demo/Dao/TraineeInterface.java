package com.cap.demo.Dao;

import java.util.List;

import com.cap.demo.Entity.Trainee;


public interface TraineeInterface {
	
	public void create(Trainee t);

	public Trainee findById(int id);

	public void delete(int id);

	public void update(int id);

	
}
