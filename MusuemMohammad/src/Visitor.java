import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Visitor extends person {
	int record_id;
	int Num_ofVisit;
	ArrayList<VisitorRecord> VisitorRecord1;
	Scanner input = new Scanner(System.in);

	public Visitor(String Name, String address, int ID, String NOT, LocalDate dob, int record_id, int Num_ofVisit) {
		super(Name, address, ID, NOT, dob);
		record_id = 100000;
		Num_ofVisit = 0;

	}

	public Visitor() {
		VisitorRecord1 =new ArrayList<VisitorRecord>();
		record_id = 100000;
		Num_ofVisit = 0;

	};

	public ArrayList<VisitorRecord> getVisitorRecord1() {
		return VisitorRecord1;
	}

	public void setVisitorRecord1(ArrayList<VisitorRecord> visitorRecord1) {
		VisitorRecord1 = visitorRecord1;
	}

	public int getRecord_id() {
		return record_id;
	}

	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	public int getNum_ofVisit() {
		return Num_ofVisit;
	}

	public void setNum_ofVisit(int num_ofVisit) {
		Num_ofVisit = num_ofVisit;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return super.getID();
	}

	@Override
	public void setID(int iD) {
		// TODO Auto-generated method stub
		super.setID(iD);
	}
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@SuppressWarnings("deprecation")
	public void book_tour() {
		
		
		System.out.println("Enter your id");
		int idv1 = input.nextInt();
		if (Reseptioniest.availableSubs(idv1)) {

			System.out.println("You have a subscription Remaining in it   (" + Reseptioniest.getSubs(idv1).getCountofsubs() + ") Days.");
			System.out.println("your information is :" + Reseptioniest.getM().getvisitor(idv1).toString());

			if (Reseptioniest .getSubs(idv1).getTG() != null) {

				Reseptioniest.getM().Withguide(1, idv1, null);

			}
			int count;
			count = Reseptioniest.getSubs(idv1).getCountofsubs();
			
			if (count == 0) {

				System.out.println("our subscription has expired\r\n"
						+ "If you want to renew the subscription Enter 1\nif you want delete Enter 2 ");
				int re = input.nextInt();
				if (re == 1) {
					System.out.println("Enter new subscriptions Type\n1.Weekly\n2.Monthly\n3.Yearly");
					int idy = input.nextInt();
					if (idy == 1) {

						Reseptioniest.getSubs(idv1).getTy().setTtype(Tickettype.WEEKLY);
						Reseptioniest.getSubs(idv1).setCountofsubs(5);
						if (Reseptioniest.getM().getvisitor(idv1).getNum_ofVisit() >= 5) {
							SeniorVistor S = new SeniorVistor();
							S.book_tour(Reseptioniest.getSubs(idv1).getTy().getPrice());
							
						}
					} else if (idy == 2) {
						Reseptioniest.getSubs(idv1).getTy().setTtype(Tickettype.MONTHLY);
						Reseptioniest.getSubs(idv1).setCountofsubs(22);
						if (Reseptioniest.getM().getvisitor(idv1).getNum_ofVisit() >= 5) {
							SeniorVistor S = new SeniorVistor();
							S.book_tour(Reseptioniest.getSubs(idv1).getTy().getPrice());
						   }
					}else if (idy == 3) {

						Reseptioniest.getSubs(idv1).getTy().setTtype(Tickettype.YEARLY);
						Reseptioniest.getSubs(idv1).setCountofsubs(250);
						if (Reseptioniest.getM().getvisitor(idv1).getNum_ofVisit() >= 5) {
							SeniorVistor S = new SeniorVistor();
							S.book_tour(Reseptioniest.getSubs(idv1).getTy().getPrice());
					}

				}

			}
				else {
					Reseptioniest.deletesubs(idv1);
					
				}
				
			}
			count--;
			Reseptioniest.getSubs(idv1).setCountofsubs(count);
			int nov = 0;
			nov = Reseptioniest.getSubs(idv1).getV1().getNum_ofVisit();
			nov++;
			Reseptioniest.getSubs(idv1).getV1().setNum_ofVisit(nov);
			System.out.println("Enter Date of tour(Day,Month,year):");
			int day = input.nextInt();
			int month = input.nextInt();
			int year = input.nextInt();
			LocalDate g = LocalDate.of(year, month, day);
			System.out.println("Enter Time of tour(hour,minute):");
			int hour = input.nextInt();
			int minute = input.nextInt();
			LocalTime l1 = LocalTime.of(hour, minute);
			VisitorRecord vr = new VisitorRecord();
			vr.setEnteringdate(g);
			vr.setEnteringtime(l1);
			Reseptioniest.getSubs(idv1).getV1().getVisitorRecord1().add(vr);
			VisitorRecord1.add(vr);
			System.out.println("Sucssesful");
	
		} else {
			System.out.println("Enter type of Ticket:\n1.Multi time ticket.\n2.One Time ticket.");
			int Tt = input.nextInt();
			if(Tt==1) {
			
				System.out.println("You will make a subscription and then book your tour");
				Reseptioniest.registersubs(idv1);
				
				book_tour();
				
			
			}
			else if(Tt==2) {
			OneTimeTecket ot = new OneTimeTecket();
			VisitorRecord vr = new VisitorRecord();
			System.out.println("Are you want tour: 1.with guide,2.without guide\n");
			int egf3 = input.nextInt();
			if (Reseptioniest.getM().availablevisitor(idv1)) {
				Reseptioniest.issuetecketOne(ot, egf3, Reseptioniest.getM().getvisitor(idv1).getName());
				int nov = 0;
				nov = Reseptioniest.getM().getvisitor(idv1).getNum_ofVisit();
				nov++;
				Reseptioniest.getM().getvisitor(idv1).setNum_ofVisit(nov);
				System.out.println("Enter Date of tour(Day,Month,year):");
				int day = input.nextInt();
				int month = input.nextInt();
				int year = input.nextInt();
				LocalDate g2 = LocalDate.of(year, month, day);
				System.out.println("Enter Time of tour(hour,minute):");
				int hour = input.nextInt();
				int minute = input.nextInt();
				LocalTime l2 = LocalTime.of(hour, minute);
				vr.setEnteringdate(g2);
				vr.setEnteringtime(l2);
				VisitorRecord1.add(vr);
				Reseptioniest.getM().getvisitor(idv1).getVisitorRecord1().add(vr);
				Reseptioniest.getM().getvisitor(idv1).setID(idv1);
				Reseptioniest.getM().getvisitor(idv1).setName(name);
				ot.setV(Reseptioniest.getM().getvisitor(idv1));	
				System.out.println("Your ticket price is:" + ot.getPrice() + "$");
					
				
				if (Reseptioniest.getM().getvisitor(idv1).getNum_ofVisit() >= 5) {
					SeniorVistor S = new SeniorVistor();
					S.book_tour(ot.getPrice());
				}
			
			} else {
				Visitor Vn = new Visitor();
				System.out.println("please Enter your name:");
				String name = input.next();
				Reseptioniest.issuetecketOne(ot, egf3, name);
				int Nu;
				Nu = Vn.getNum_ofVisit();
				Nu++;
				Vn.setNum_ofVisit(Nu);
				System.out.println("Enter Date of tour(Day,Month,year):");
				int day = input.nextInt();
				int month = input.nextInt();
				int year = input.nextInt();
				LocalDate g2 = LocalDate.of(year, month, day);
				System.out.println("Enter Time of tour(hour,minute):");
				int hour = input.nextInt();
				int minute = input.nextInt();
				LocalTime l2 = LocalTime.of(hour, minute);
				vr.setEnteringdate(g2);
				vr.setEnteringtime(l2);
				ArrayList<VisitorRecord> VisitorRecord2;
				VisitorRecord2 = new ArrayList<VisitorRecord>();
				VisitorRecord2.add(vr);
				Vn.setVisitorRecord1(VisitorRecord2);
				Vn.setID(idv1);
				Vn.setName(name);
				Reseptioniest.getM().getVlist().add(Vn);
				double price = 20;
				ot.setPrice(price);
				ot.setV(Vn);	
			}
			}
		}
			
		
		
	}
		
	
	@Override
	public String toString() {
		return "Visitor [record_id=" + record_id + ", Num_ofVisit=" + Num_ofVisit + ", VisitorRecord1=" + VisitorRecord1
				+ ", name=" + name + ", address=" + address + ", ID=" + ID + ", NumOftelph=" + NumOftelph
				+ ", dateOfbirth=" + dateOfbirth + "]";
	}

}