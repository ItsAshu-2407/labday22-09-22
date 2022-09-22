package Simple.illustrateInheritence;

import javax.persistence.Entity;

@Entity
public class experienceEmployee extends employee {			//employee class is inherited to access its variables.
	private int experience;					//Instance Variables of experience employee is created.
	private int hike;
	@Override
	public String toString() {
		return "experienceEmployee [empFirstName=" +empFirstName+", empLastName=" +empLastName+" ,experience=" + experience + ", hike=" + hike + "]";
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getHike() {
		return hike;
	}
	public void setHike(int hike) {
		this.hike = hike;
	}
	
}
