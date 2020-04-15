package com.cap.demo.service;

import com.cap.demo.Entity.Trainee;

public interface ServiceInterface {

	public void create(Trainee t);

	public Trainee findById(int id);

	public void delete(int id);

	public void update(int id);
}
