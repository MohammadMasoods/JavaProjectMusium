import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class MuseumManagementSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome in Museum" + "\nName of Museum:" + " Museum The Shadow" + "\nAddress:"
				+ " Balata_Nablus_Palestine" + "\nDescription:"
				+ " A museum of some of the antiquities found in Tell Balata area" +

				"\nWorking Day:" + "Sunday to Thuresday" + "\n");
		    MuseumSystem M = new MuseumSystem();
		    Reseptioniest R;
		    R = new Reseptioniest();
		    ArrayList<Visitor> Vlist;
		    ArrayList<Guide> Guideslist;
		    ArrayList<subscriptions> subscriptionslist=new ArrayList<subscriptions>();
		    Vlist=new ArrayList<Visitor> ();
		    Guideslist =new ArrayList<Guide> ();
		    Guide G2 = new Guide();
		    M.setSubscriptionslist(subscriptionslist);
		    M.setVlist(Vlist);
			LocalDate g1 = LocalDate.of(2021, 2, 20);
			G2.setHire_Date(g1);
			G2.setAddress("Balata Albalad");
			LocalDate g2 = LocalDate.of(2000, 2, 20);
			G2.setDateOfbirth(g2);
			G2.setName("Mohammad Salah");
			G2.setNumOftelph("0592365987");
			ArrayList<WorkingDay> Workingdaylist = new ArrayList<WorkingDay>();
			WorkingDay WD1 = WorkingDay.SUNDAY;
			WorkingDay WD2 = WorkingDay.TUSEDAY;
			WorkingDay WD3 = WorkingDay.THURSDAY;
			Workingdaylist.add(WD1);
			Workingdaylist.add(WD2);
			Workingdaylist.add(WD3);
			G2.setWD1(Workingdaylist);
			ArrayList<Languages> Langueges1 = new ArrayList<>();
			Languages L = Languages.ARABIC;
			Languages L1 = Languages.ENGLISH;
			Languages L2 = Languages.FRENCH;
			Langueges1.add(L);
			Langueges1.add(L1);
			Langueges1.add(L2);
			G2.set_Languages(Langueges1);
			G2.setEmployee_id(G2.getEmployee_id());
			G2.setM_tour_perday(3);
			G2.setID(345);
			M.setGuideslist(Guideslist);
			M.getGuideslist().add(G2);
			int e1 = G2.getEmployee_id();
			e1++;
			G2.setEmployee_id(e1);

			Guide G3 = new Guide();
			LocalDate g3 = LocalDate.of(2020, 3, 20);
			G3.setHire_Date(g3);
			G3.setAddress("coper");
			LocalDate g5 = LocalDate.of(2001, 5, 25);
			G3.setDateOfbirth(g5);
			G3.setName("Omar Barghothi");
			G3.setNumOftelph("059298655");
			ArrayList<WorkingDay> Workingdaylist1 = new ArrayList<WorkingDay>();
			WorkingDay WD4 = WorkingDay.MONDAY;
			WorkingDay WD6 = WorkingDay.WEDNESDAY;
			Workingdaylist1.add(WD4);
			Workingdaylist1.add(WD6);
			G3.setWD1(Workingdaylist1);
			ArrayList<Languages> Langueges2 = new ArrayList<>();
			Languages L3 = Languages.ARABIC;
			Languages L4 = Languages.ENGLISH;
			Languages L5 = Languages.FRENCH;
			Langueges2.add(L3);
			Langueges2.add(L4);
			Langueges2.add(L5);
			G3.set_Languages(Langueges2);
			G3.setEmployee_id(G3.getEmployee_id());
			G3.setM_tour_perday(2);
			G3.setID(111);
			M.getGuideslist().add(G3);
			int e = G3.getEmployee_id();
			e++;
			G3.setEmployee_id(e);

			Visitor V = new Visitor();
			V.setAddress("Ginin");
			LocalDate g0 = LocalDate.of(1999, 6, 3);
			V.setDateOfbirth(g0);
			V.setName("Mustafa jo");
			V.setNum_ofVisit(3);
			V.setNumOftelph("0568976543");
			V.setRecord_id(V.getRecord_id());
			V.setID(123);
			int i = V.getRecord_id();
			i++;
			V.setRecord_id(i);
			ArrayList<VisitorRecord> VisitorRecord1;
			VisitorRecord1 = new ArrayList<VisitorRecord>();
			LocalTime l1 = LocalTime.of(5, 15);
			LocalDate g = LocalDate.of(2020, 5, 24);
			VisitorRecord vr = new VisitorRecord();
			vr.setEnteringdate(g);
			vr.setEnteringtime(l1);
			VisitorRecord1.add(vr);
			V.setVisitorRecord1(VisitorRecord1);
			M.getVlist().add(V);

			Visitor V1 = new Visitor();
			V1.setAddress("Nablus");
			LocalDate gp = LocalDate.of(1998, 03, 03);
			V1.setDateOfbirth(gp);
			V1.setName("Ahmad");
			V1.setNum_ofVisit(6);
			V1.setNumOftelph("0564566543");
			V1.setRecord_id(V.getRecord_id());
			V1.setID(500);
			int i1 = V1.getRecord_id();
			i1++;
			V1.setRecord_id(i);
			ArrayList<VisitorRecord> VisitorRecord2;
			VisitorRecord2 = new ArrayList<VisitorRecord>();
			LocalTime l2 = LocalTime.of(5, 15);
			LocalDate g12 = LocalDate.of(2020, 5, 24);
			VisitorRecord vr1 = new VisitorRecord();
			vr1.setEnteringdate(g12);
			vr1.setEnteringtime(l2);
			VisitorRecord2.add(vr1);
			V1.setVisitorRecord1(VisitorRecord2);
			M.getVlist().add(V1);

			MultiTimeTecket Mt1 = new MultiTimeTecket();
			subscriptions Su = new subscriptions();
			Tickettype tt = Tickettype.WEEKLY;
			double price = 100;
			Mt1.setPrice(price);
			int CountSubs = 5;
			price = price * 0.2 + price;
			Mt1.setPrice(price);
			Mt1.setNotH(V1.getName());
			Date dy;
			dy = new Date();
			Mt1.setIssue_date(dy);
			int Tid;
			Tid = Mt1.getTicket_id();
			Mt1.setTicket_id(Tid);
			Tid++;
			Mt1.setTtype(tt);
			Mt1.setV(V1);
			Su.setCountofsubs(CountSubs);
			Su.setV1(V1);
			Su.setTy(Mt1);
			Su.setTG(G3);
			M.getSubscriptionslist().add(Su);
		    R.setM(M);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int x = 10;
		while (x != 5) {
			System.out.printf(R.toString());
			x = input.nextInt();
			switch (x) {
			case 1:
				Guide G1 = new Guide();
				R.getM().Read(G1);;
				R.getM().addGuide(G1);
				break;
			case 2:
				System.out.println(" Enter Visitor id");
				int idv6 = input.nextInt();
				if(R.getM().availablevisitor(idv6)) {
					System.out.println(" Visitor is already registered");
				}
				else {
				Visitor Vi = new Visitor();
				R.getM().ReadVisitor(Vi);
				R.getM().addVisitor(Vi);
				}
				break;

			case 3:
				
				int e0 = 15;
				while (e0 != 4) {
					System.out.println("How can we serve ?\n1.register subs\n2.edit Subs\n3.delete subs\n4.exist");
					e0 = input.nextInt();
					switch (e0) {
					case 1:
						System.out.println("Enter your id");
						int idf = input.nextInt();
						R.registersubs(idf);
						break;
					case 2:
						R.editSubs();
						break;
					case 3:
						System.out.println(" Enter Visitor id");
						int idvl = input.nextInt();
						System.out.println(" if you are sure delete sub Enter 1\nelse Enter 2");
						int idv7 = input.nextInt();
						if (idv7 == 1) {
							R.deletesubs(idvl);
						}
						break;
					default:
						if (e0 != 4) {
							System.out.println("Wrong entry !\nTry again");
						}
						break;
					}
				}
				break;
			case 4:
				Visitor vn = new Visitor();
				vn.book_tour();
			
				break;
				
			default:
				if (x != 5) {
					System.out.println("Wrong entry !\nTry again");
				}
				break;
			}

		}
	}
}
