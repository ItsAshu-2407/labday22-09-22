package Simple.illustrateInheritence;

import javax.persistence.Entity;

@Entity
public class fresherEmployee extends employee{			//employee class is inherited to access its variables.
	private int contractPeriod;			//Instance Variables of fresher employee is created.
	private int increment;
	@Override
	public String toString() {				//to string method is used to display the details of employee.
		return "fresherEmployee [empFirstName=" +empFirstName+", empLastName=" +empLastName+", contractPeriod=" + contractPeriod + ", increment=" + increment + "]";
	}
	public int getContractPeriod() {			//Getters and Setters are used to get and set the details taken from the user.
		return contractPeriod;
	}
	public void setContractPeriod(int contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	public int getIncrement() {
		return increment;
	}
	public void setIncrement(int increment) {
		this.increment = increment;
	}
	
}
