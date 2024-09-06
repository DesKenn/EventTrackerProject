package com.skilldistillery.yoga.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Yoga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "style_name")
	private String styleName;
	@Column(name = "number_of_poses")
	private int numOfPoses;
	private String origin;
	@Column(name = "practice_time_in_minutes")
	private int practiceTime;
	private Boolean heated;
	
	public Yoga() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public int getNumOfPoses() {
		return numOfPoses;
	}

	public void setNumOfPoses(int numOfPoses) {
		this.numOfPoses = numOfPoses;
	}


	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getPracticeTime() {
		return practiceTime;
	}

	public void setPracticeTime(int practiceTime) {
		this.practiceTime = practiceTime;
	}

	public Boolean getHeated() {
		return heated;
	}

	public void setHeated(Boolean heated) {
		this.heated = heated;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yoga other = (Yoga) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Yoga [id=" + id + ", styleName=" + styleName + ", numOfPoses=" + numOfPoses + ", origin=" + origin
				+ ", practiceTime=" + practiceTime + ", heated=" + heated + "]";
	}
	
	

}
