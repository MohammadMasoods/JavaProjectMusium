import java.time.LocalDate;
import java.util.*;

public class RegularVistor extends Visitor {

	public RegularVistor() {

	}

	public RegularVistor(String Name, String address, int ID, String NOT, LocalDate dob, int record_id,
			int Num_ofVisit) {
		super(Name, address, ID, NOT, dob, record_id, Num_ofVisit);

	}

	@Override
	public void book_tour() {
		// TODO Auto-generated method stub
		super.book_tour();
	}

	

}
