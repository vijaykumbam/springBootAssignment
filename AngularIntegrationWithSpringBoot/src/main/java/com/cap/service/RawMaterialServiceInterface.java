package com.cap.service;

import java.util.Date;

import com.cap.entity.RawMaterialEntity;

public interface RawMaterialServiceInterface {

	public String trackRawMaterialOrder (RawMaterialEntity rawMaterialStock );
	public boolean doesRawMaterialOrderIdExist(String orderId);
	public boolean processDateCheck(RawMaterialEntity rawMaterialStock);
	public String updateProcessDateinStock(RawMaterialEntity rawMaterialStock);
	public boolean validateManufacturingDate (Date manufacturing_date);
	public boolean validateExpiryDate(Date manufacturing_date , Date expiry_date);
	public String updateRawMaterialStock(RawMaterialEntity rawMaterialStock);
	public boolean doesRawMaterialOrderIdExistinStock(String orderId);
}
