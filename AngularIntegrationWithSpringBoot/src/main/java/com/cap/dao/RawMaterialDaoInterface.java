package com.cap.dao;

import com.cap.entity.RawMaterialEntity;

public interface RawMaterialDaoInterface {
	
	public String trackRawMaterialOrder (RawMaterialEntity rawMaterialStock );
	public boolean processDateCheck(RawMaterialEntity rawMaterialStock);
	public String updateProcessDateinStock(RawMaterialEntity rawMaterialStock);
	public String updateRawMaterialStock(RawMaterialEntity rawMaterialStock);
	public boolean doesRawMaterialOrderIdExistInStock(String orderId);
	public boolean doesRawMaterialOrderIdExist(String orderId);
	
}
