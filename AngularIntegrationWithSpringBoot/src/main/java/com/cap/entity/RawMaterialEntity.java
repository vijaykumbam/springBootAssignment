package com.cap.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RawMaterialEntity {
	
	@Override
	public String toString() {
		return "RawMaterialEntity [orderId=" + orderId + ", name=" + name + ", pricePerUnit=" + pricePerUnit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseId=" + warehouseId + ", deliveryDate=" + deliveryDate + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", processDate=" + processDate + ", qualityCheck="
				+ qualityCheck + "]";
	}
	@Id
	private String orderId;
	private String name;
	@Column(name="price_per_unit")
	private double pricePerUnit;
	private double quantityValue;
	private double quantityUnit;
	private double price;
	
	
	private String warehouseId;
	private Date deliveryDate;
	private Date manufacturingDate;
	private Date expiryDate;
	private Date processDate;
	private String qualityCheck;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	
	
	
	
}
