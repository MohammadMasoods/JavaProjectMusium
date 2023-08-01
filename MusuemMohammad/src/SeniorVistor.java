import java.time.LocalDate;
import java.util.*;

public class SeniorVistor extends Visitor {
	double DiscountRate;

	Scanner input = new Scanner(System.in);

	SeniorVistor(String Name, String address, int ID, String NOT, LocalDate dob, int record_id, int Num_ofVisit) {
		super(Name, address, ID, NOT, dob, record_id, Num_ofVisit);
		DiscountRate = 0.2;
	}

	SeniorVistor() {

		DiscountRate = 0.2;

	}

	public double getDiscountRate() {
		return DiscountRate;
	}

	public void setDiscountRate(double discountRate) {
		DiscountRate = discountRate;
	}

	
	public void book_tour(double price) {
		double price1 ;
		price1 =price -price*DiscountRate;
		
		System.out.println("Because you are a Senior Vistor, you will get a discount 20%\r\n"
				+ "Your new price is"+price1+"$");
		
		
	}



}
