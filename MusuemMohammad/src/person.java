import java.time.LocalDate;
import java.util.*;

public class person {
	String name;
	String address;
	int ID;
	String NumOftelph;
	LocalDate dateOfbirth;

	public person() {

	};

	public person(String name, String address, int iD, String numOftelph, LocalDate dateOfbirth) {
		super();
		this.name = name;
		this.address = address;
		ID = iD;
		NumOftelph = numOftelph;
		this.dateOfbirth = dateOfbirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNumOftelph() {
		return NumOftelph;
	}

	public void setNumOftelph(String numOftelph) {
		NumOftelph = numOftelph;
	}

	public LocalDate getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(LocalDate dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	@Override
	public String toString() {
		return "]";
	}

}
