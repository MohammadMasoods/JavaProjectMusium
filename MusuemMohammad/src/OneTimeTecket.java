import java.util.Date;

public class OneTimeTecket extends Ticket {
	double price;
	Guide G;

	public OneTimeTecket(int ticket_id, double price, Date issue_date, String NotH) {
		super(ticket_id, price, issue_date, NotH);
		// TODO Auto-generated constructor stub
	}

	OneTimeTecket() {
		price = 20;
		G = new Guide();
	}

	@Override
	public Visitor getV() {
		// TODO Auto-generated method stub
		return super.getV();
	}

	@Override
	public void setV(Visitor v) {
		// TODO Auto-generated method stub
		super.setV(v);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public Date getIssue_date() {
		// TODO Auto-generated method stub
		return super.getIssue_date();
	}

	@Override
	public int getTicket_id() {
		// TODO Auto-generated method stub
		return super.getTicket_id();
	}

	@Override
	public void setTicket_id(int ticket_id) {
		// TODO Auto-generated method stub
		super.setTicket_id(ticket_id);
	}

	@Override
	public String getNotH() {
		// TODO Auto-generated method stub
		return super.getNotH();
	}

	@Override
	public void setNotH(String notH) {
		// TODO Auto-generated method stub
		super.setNotH(notH);
	}

	@Override
	public void setIssue_date(Date issue_date) {
		// TODO Auto-generated method stub
		super.setIssue_date(issue_date);
	}

	public Guide getG() {
		return G;
	}

	public void setG(Guide g) {
		G = g;
	}

}
