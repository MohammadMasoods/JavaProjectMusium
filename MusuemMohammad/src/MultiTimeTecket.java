import java.util.Date;

public class MultiTimeTecket extends Ticket {
	Tickettype Ttype;
	double price;

	MultiTimeTecket(int ticket_id, double price, Date issue_date, String NotH) {
		super(ticket_id, price, issue_date, NotH);
	}

	MultiTimeTecket() {

	}

	public Tickettype getTtype() {
		return Ttype;
	}

	public void setTtype(Tickettype ttype) {
		Ttype = ttype;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MultiTimeTecket [Ttype=" + Ttype + ", price=" + price + "]";
	}
	

}
