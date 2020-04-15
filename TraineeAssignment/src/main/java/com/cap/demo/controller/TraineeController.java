package com.cap.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.demo.Entity.Trainee;
import com.cap.demo.service.ServiceInterface;


@RestController
@RequestMapping(name="/base")
public class TraineeController {
	
	@Autowired
	ServiceInterface tsi;
	
	//Create the new trainee record
	@PostMapping("/newtrainee")
	public ResponseEntity<Object> newtrainee(@RequestBody Trainee tr) 
	{
		tsi.create(tr);
		return new ResponseEntity<>("Created",HttpStatus.OK);
	}
	
	
	//Delete the record..........
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteTrainer(@PathVariable("id") int id)
	{
		tsi.delete(id);
		return new ResponseEntity<>("Deleted",HttpStatus.NO_CONTENT);
	}
	
	//FindBy the record.........
	@GetMapping("/find/{id}")
	public ResponseEntity<Trainee> viewTrainer(@PathVariable("id") int id)
	{
		Trainee tr=tsi.findById(id);
		return new ResponseEntity<Trainee>(tr,HttpStatus.OK);
		
	}
	
	//Updateby the Id
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateTrainer(@PathVariable("id") int id,@RequestBody Trainee tr)
	{
		tsi.update(id);
		return new ResponseEntity<>("Updated",HttpStatus.OK);
	}
	
}
