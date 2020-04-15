package com.cap.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.cap.dao.RawMaterialDaoInterface;
import com.cap.entity.RawMaterialEntity;

public class RawMaterialServiceImplement implements RawMaterialServiceInterface{

	@Autowired
	RawMaterialDaoInterface rawMaterialDao;
	
	
	@Override
	public String trackRawMaterialOrder(RawMaterialEntity rawMaterialStock) 
	{
		String orderId = rawMaterialStock.getOrderId();
		boolean result = doesRawMaterialOrderIdExist(orderId);
		if(result == true)
		{
			return rawMaterialStock.toString();
		}
		else
		{
			return "Not Found";
		}
	}

	@Override
	public boolean doesRawMaterialOrderIdExist(String orderId) {
		boolean result = rawMaterialDao.doesRawMaterialOrderIdExist(orderId);
		if(result == true)
			return true;
		else
			return false;
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
	public boolean validateManufacturingDate(Date manufacturing_date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateExpiryDate(Date manufacturing_date, Date expiry_date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String updateRawMaterialStock(RawMaterialEntity rawMaterialStock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doesRawMaterialOrderIdExistinStock(String orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
