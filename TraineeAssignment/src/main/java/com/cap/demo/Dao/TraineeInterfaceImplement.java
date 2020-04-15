package com.cap.demo.Dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cap.demo.Entity.Trainee;

@Transactional
@Repository
public class TraineeInterfaceImplement implements TraineeInterface{

	@PersistenceContext
	EntityManager em;
	
	//To create the the trainee record in the database.................
	@Override
	public void create(Trainee t) {
		// TODO Auto-generated method stub
		em.persist(t);
	}

	

	@Override
	public Trainee findById(int id) {
		// TODO Auto-generated method stub
		return em.find(Trainee.class, id);
	}

	//Delete the record from the Database.........
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Trainee objRefernce = em.find(Trainee.class, id);
		em.remove(objRefernce);
		System.out.println("Object is removed from the record");
		
	}

	//Update the record......
	@Override
	public void update(int id) 
	{
		// TODO Auto-generated method stub
		Trainee obj = em.find(Trainee.class, id);
		obj.setTraineeDomain("WEBDEVELOPMENT");
		obj.setTraineeId(11606974);
		System.out.println("Object is updated");
	}
	

}
