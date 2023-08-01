import java.util.*;
import java.util.Date;

public class Ticket {

	int ticket_id;
	double price;
	Tickettype Ttype;
	Date issue_date;
	String NotH;
	Visitor V;

	Ticket(int ticket_id, double price, Date issue_date, String NotH) {

		setNotH(NotH);
		setPrice(price);
		setIssue_date(issue_date);
		setTicket_id(ticket_id);
	}

	Ticket() {
		ticket_id = 999;
		V = new Visitor();

	}

	public double getPrice() {
		return price;
	}

	public Visitor getV() {
		return V;
	}

	public void setV(Visitor v) {
		V = v;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getIssue_date() {
		return issue_date;
	}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public Tickettype getTtype() {
		return Ttype;
	}

	public void setTtype(Tickettype ttype) {
		Ttype = ttype;
	}

	public String getNotH() {
		return NotH;
	}

	public void setNotH(String notH) {
		NotH = notH;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

	@Override
	public String toString() {
		return "Ticket [+" + "ticket_id=" + ticket_id + ", price=" + price + ", Ttype=" + Ttype + ", issue_date="
				+ issue_date + ", NotH=" + NotH + "]";
	}

}