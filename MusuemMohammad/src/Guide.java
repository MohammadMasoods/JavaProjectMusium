import java.time.LocalDate;
import java.util.*;

public class Guide extends Employee {
	int M_tour_perday;
	ArrayList<Languages> languages;
	ArrayList<WorkingDay> WD1;
	WorkingDay i;

	Guide(String Name, String address, int ID, String NOT, LocalDate dob, LocalDate hire, int employee_id,
			int toursperday) {
		super(Name, address, ID, NOT, dob, hire, employee_id);
		this.M_tour_perday = toursperday;

	}

	Guide() {
		employee_id = 1001;

	}

	public int getM_tour_perday() {

		return M_tour_perday;
	}

	@Override
	public String toString() {
		return "Guide [languages=" + languages + ", WD1=" + WD1 + ", employee_id=" + employee_id + ", name=" + name
				+ ", address=" + address + ", ID=" + ID + ", NumOftelph=" + NumOftelph + "]";
	}

	public void setM_tour_perday(int m_tour_perday) {
		M_tour_perday = m_tour_perday;
	}

	void setWh_g(WorkingDay w) {
		w = i;

	};

	public ArrayList<WorkingDay> getWD1() {
		return WD1;
	}

	public void setWD1(ArrayList<WorkingDay> wD1) {
		WD1 = wD1;
	}

	ArrayList<Languages> getLanguges() {
		return languages;
	}

	public void set_Languages(ArrayList<Languages> languages) {

		this.languages = languages;
	}

	@Override
	public LocalDate getHire_Date() {
		// TODO Auto-generated method stub
		return super.getHire_Date();
	}

	@Override
	public void setHire_Date(LocalDate hire_Date) {
		// TODO Auto-generated method stub
		super.setHire_Date(hire_Date);
	}

	@Override
	public int getEmployee_id() {
		// TODO Auto-generated method stub
		return super.getEmployee_id();
	}

	@Override
	public void setEmployee_id(int r) {
		// TODO Auto-generated method stub
		super.setEmployee_id(r);
	}

}
