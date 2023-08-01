import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class VisitorRecord {
@Override
	public String toString() {
		return "VisitorRecord [enteringdate=" + enteringdate + ", enteringtime=" + enteringtime + "]";
	}
LocalDate enteringdate;
LocalTime enteringtime;

public VisitorRecord(LocalDate enteringdate, LocalTime enteringtime) {
	super();
	this.enteringdate = enteringdate;
	this.enteringtime = enteringtime;
}
VisitorRecord(){
	this.enteringdate = enteringdate;
	this.enteringtime = enteringtime;
	
}
public LocalDate getEnteringdate() {
	return enteringdate;
}
public void setEnteringdate(LocalDate enteringdate) {
	this.enteringdate = enteringdate;
}
public LocalTime getEnteringtime() {
	return enteringtime;
}
public void setEnteringtime(LocalTime l) {
	this.enteringtime = l;
} 
}
