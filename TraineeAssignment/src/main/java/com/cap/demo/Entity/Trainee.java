package com.cap.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="trainee_table")
public class Trainee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRAINEE_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "TRAINEE_SEQ")
	private int traineeId;
	
	@Column(name="trainee_name")
	private String traineeName;
	
	@Column(name="trainee_location")
	private String traineeLocation;
	
	@Column(name="trainee_domain")
	private String traineeDomain;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeLocation() {
		return traineeLocation;
	}

	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}

	public String getTraineeDomain() {
		return traineeDomain;
	}

	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}


}
