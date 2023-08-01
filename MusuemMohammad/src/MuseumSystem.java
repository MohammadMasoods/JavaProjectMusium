
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class MuseumSystem {
	Scanner input = new Scanner(System.in);
	public String name;
	public String address;
	public String description;
	ArrayList<Visitor> Vlist;
	ArrayList<Guide> Guideslist;
	ArrayList<WorkingDay> WD1;
	ArrayList<subscriptions> subscriptionslist;
	public MuseumSystem(String name, String address, String description, WorkingDay wd) {

		this.name = " Museum The Shadow";
		this.address = " Balata_Nablus_Palestine";
		this.description = " A museum of some of the antiquities found in Tell Balata area";

	}

	MuseumSystem() {
		this.name = " Museum The Shadow";
		this.address = " Balata_Nablus_Palestine";
		this.description = " A museum of some of the antiquities found in Tell Balata area";
	}

	@Override
	public String toString() {
		
		return "";
	}
	
	

	public ArrayList<Guide> getGuideslist() {
		return Guideslist;
	}

	public void setGuideslist(ArrayList<Guide> guideslist) {
		Guideslist = guideslist;
	}

	public ArrayList<subscriptions> getSubscriptionslist() {
		return subscriptionslist;
	}

	public void setSubscriptionslist(ArrayList<subscriptions> subscriptionslist) {
		this.subscriptionslist = subscriptionslist;
	}

	public ArrayList<Visitor> getVlist() {
		return Vlist;
	}

	public void setVlist(ArrayList<Visitor> vlist) {
		Vlist = vlist;
	}


	public ArrayList<Guide> getAvailableguides(WorkingDay Wk) {
		ArrayList<Guide> l = new ArrayList<Guide>();

		for (Guide g : Guideslist) {

			if (g.getWD1().contains(Wk)) {
				l.add(g);
			}
        
		}
		return l;
	}

	public Visitor ReadVisitor(Visitor s) {

		int idv, Num_ofVisit = 0;
		String nv, addv, N_Tv;
		System.out.println("please Enter your following information: ");
		System.out.println("1.Visitor Name ");
		nv = input.next();
		System.out.println("2.Visitor id :");
		idv = input.nextInt();
		System.out.println("3.Visitor Address :");
		addv = input.next();
		System.out.println("4.Enter Date of birth day(Day,Month,year):");
		int day = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();
		LocalDate g = LocalDate.of(year, month, day);
		System.out.println("5.Visitor Telephone Numbur: ");
		N_Tv = input.next();
		System.out.println("you are record id is: " +s.getRecord_id() );
		s.setAddress(addv);
		s.setDateOfbirth(g);
		s.setName(nv);
		s.setNum_ofVisit(Num_ofVisit);
		s.setNumOftelph(N_Tv);
		s.setID(idv);

		return s;

	}

	public void addVisitor(Visitor s) {
		int i=0;
		i = s.getRecord_id();
		i++;
		s.setRecord_id(i);
		ArrayList<VisitorRecord> VisitorRecord1;
		VisitorRecord1 = new ArrayList<VisitorRecord>();
		LocalTime l1 = LocalTime.now();
		LocalDate g = LocalDate.now();
		VisitorRecord vr = new VisitorRecord();
		vr.setEnteringdate(g);
		vr.setEnteringtime(l1);
		VisitorRecord1.add(vr);
		s.setVisitorRecord1(VisitorRecord1);
		Vlist.add(s);

		System.out.println(" visitor has been successfully registered\r\n"
				+ "Knowing that you do not have a subscription yet\r\n" + "This is only visitor registration\r\n"
				+ "Now you can go to the visitor's subscriptions list and take a subscription\r\n"
				+ "Or you can go and book a tour without a subscription");

	}

	public Guide Read(Guide gs) {

		int id, T_P_D, n1;
		String n, add, N_T;
		System.out.println("1.Enter guide Name ");
		n = input.next();
		System.out.println("2.Enter guide id ");
		id = input.nextInt();
		System.out.println("3.Enter guide Telephone Numbur ");
		N_T = input.next();
		System.out.println("Enter Date of birth(Day,Month,year):");
		int day = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();
		LocalDate g = LocalDate.of(year, month, day);
		System.out.println("5.Enter guide Address ");
		add = input.next();
		ArrayList<WorkingDay> WD1;
		WD1 = new ArrayList<WorkingDay>();

		int f = 10;

		System.out.println("6.Specify guide’s working days(enter number of day) (maximum 5 days/week):");
		while (f != 0) {
			System.out.println("1.Sunday\n2.Monday\n3.Tuseday\n4.Wenseday\n5.Thuresday\nif you are finish enter 0");
			f = input.nextInt();
			WorkingDay w4 = null;
			switch (f) {
			case 1:
				WD1.add(w4.SUNDAY);
				break;
			case 2:
				WD1.add(w4.MONDAY);
				break;
			case 3:
				WD1.add(w4.TUSEDAY);
				break;
			case 4:
				WD1.add(w4.WEDNESDAY);
				break;
			case 5:
				WD1.add(w4.THURSDAY);
			default:
				if (f != 0) {
					System.out.println("Wrong entry !\nTry again");
				}
				break;
			}

		}
		System.out.println("7.Specify guide’s number of tours/day (maximum 3 tours/day): ");

		T_P_D = input.nextInt();
		if (T_P_D <= 3) {

			gs.setM_tour_perday(T_P_D);
		}
		ArrayList<Languages> Langueges1 = new ArrayList<>();
		int f1 = 1;
		Languages k = null;
		while (f1 != 0) {
			System.out.println(
					"8.Specify guide’s spoken languages (Click enter after each languege you are entered):\n1.ARABIC\n2.ENGLISH\n3.FRENCH \n4.Spanish \n5.Turkish\n6.CHINES");
			System.out.println("To finish Enter 0");
			f1 = input.nextInt();
			switch (f1) {
			case 1:
				Langueges1.add(k.ARABIC);
				break;
			case 2:
				Langueges1.add(k.ENGLISH);
				break;
			case 3:
				Langueges1.add(k.FRENCH);
				break;
			case 4:
				Langueges1.add(k.Spanish);
				break;
			case 5:
				Langueges1.add(k.Turkish);
				break;
			case 6:
				Langueges1.add(k.CHINES);
				break;
			default:
				if (f1 != 0) {
					System.out.println("Wrong entry !\nTry again");
				}
				break;
			}

		}

		System.out.println(gs.getEmployee_id());
		System.out.printf("9.your employee id is:" + "\n");
		System.out.println(gs.getEmployee_id());
		System.out.println("\n10.Enter Hire Date ");
		System.out.println("Enter Date of tour(Day,Month,year):");
		int day1 = input.nextInt();
		int month1 = input.nextInt();
		int year1 = input.nextInt();
		LocalDate g1 = LocalDate.of(year1, month1, day1);
		System.out.println("You have been successfully registered ");
		gs.setHire_Date(g1);
		gs.setAddress(add);
		gs.setDateOfbirth(g);
		gs.setName(n);
		gs.setNumOftelph(N_T);
		gs.setWD1(WD1);
		gs.set_Languages(Langueges1);
		gs.setEmployee_id(gs.employee_id);
		gs.setID(id);

		return gs;

	}

	public void addGuide(Guide g1) {

		int nd;
		Guideslist.add(g1);
		nd = g1.getEmployee_id();
		nd++;
		g1.setEmployee_id(nd);
	}

	public boolean availablevisitor(int s) {

		for (Visitor V1 : Vlist) {

			if (V1.getID() == s) {
				
				return true;
			}

		}
		System.out.println("is not registered");
		return false;
	}

	public void Withguide(int M, int idv, OneTimeTecket OT) {
		Reseptioniest R1;
		R1 = new Reseptioniest();
		System.out.println("Enter Day you prefer booked tour in it:\n");
		System.out.println("1.Sunday\n2.Monday\n3.Tuseday\n4.Wenseday\n5.Thuresday");
		int f = input.nextInt();
		WorkingDay w4 = null;
		switch (f) {
		case 1:
			w4 = WorkingDay.SUNDAY;
			break;
		case 2:
			w4 = WorkingDay.MONDAY;
			break;
		case 3:
			w4 = WorkingDay.TUSEDAY;
			break;
		case 4:
			w4 = WorkingDay.WEDNESDAY;
			break;
		case 5:
			w4 = WorkingDay.THURSDAY;
		default:
			if (f != 0) {
				System.out.println("Wrong entry !\nTry again");
			}
			break;
		}

		System.out.println("guides available at day You are chosen:");

		for (Guide o : getAvailableguides(w4)) {

			System.out.println(o.toString());

		}

		System.out.println("Enter guide's id who you are chosen");
		int e5 = input.nextInt();
		for (Guide p1 : Guideslist)

		{

			if (p1.getID() == e5) {
				if (M == 1) {

					R1.getSubs(idv).setTG(p1);
				} else if (M == 2) {

					OT.setG(p1);
				}

			}

		}

	}

	public Visitor getvisitor(int f) {

		for (Visitor V1 : Vlist) {

			if (V1.getID() == f) {

				return V1;
			}

		}
		System.out.println("is not registered");
		return null;

	}
	

}
