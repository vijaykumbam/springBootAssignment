package com.cap.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.cap.entity.RawMaterialEntity;

@Transactional
public class RawMaterialDaoImplements implements RawMaterialDaoInterface{

	@PersistenceContext
	EntityManager entityManager;
	
	
	@Override
	public String trackRawMaterialOrder(RawMaterialEntity rawMaterialStock) {
		
		return null;
	}

	@Override
	public boolean processDateCheck(RawMaterialEntity rawMaterialStock) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String updateProcessDateinStock(RawMaterialEntity rawMaterialStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateRawMaterialStock(RawMaterialEntity rawMaterialStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesRawMaterialOrderIdExistInStock(String RaworderId) {
	         entityManager.find(RawMaterialEntity.class,RaworderId);
	         return true;
	}

	@Override
	public boolean doesRawMaterialOrderIdExist(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}

}
