import java.time.LocalDate;
import java.util.*;

public class Employee extends person {
	Employee(String Name, String address, int ID, String NOT, LocalDate dob, LocalDate hire, int employee_id) {
		super(Name, address, ID, NOT, dob);

		this.hire_Date = hire;
	}

	Employee() {

		employee_id = 1001;

	}

	LocalDate hire_Date;
	int employee_id;

	public LocalDate getHire_Date() {
		return hire_Date;
	}

	public void setHire_Date(LocalDate hire_Date) {
		this.hire_Date = hire_Date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int r) {
		this.employee_id = r;
	}

	@Override
	public String toString() {
		return null;
	}

}