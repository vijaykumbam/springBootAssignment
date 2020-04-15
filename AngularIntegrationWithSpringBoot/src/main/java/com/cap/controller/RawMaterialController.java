package com.cap.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.entity.RawMaterialEntity;
import com.cap.service.RawMaterialServiceInterface;


@RestController
@RequestMapping("/RawMaterialStockManagement")
public class RawMaterialController {
	
	@Autowired
	RawMaterialServiceInterface rawMaterialService;
	
	
	@GetMapping("/trackBy/{id}")
	public ResponseEntity<Object> trackProductOrder(@PathVariable("id") String id)
	{
		return rawMaterialService.trackRawMaterialOrder(id);
	}
	
	
	@PutMapping("/updateExitDate/{id,....}")
	public String updateExitDate(@PathVariable("id") String id, @RequestBody Map<String, Object> paramMap ) {
		
		return id;
	}
	
	
	@PutMapping("/updateProductStockDetails")
	public String updateProductStockDetails(@PathVariable("id") String id, @RequestBody Map<String, Object> paramMap ) {
		
		return id;
	}
	
	
}
