import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Reseptioniest extends Employee {
	static MuseumSystem M;
	static Scanner input = new Scanner(System.in);

	Reseptioniest(String Name, String address, int ID, String NOT, LocalDate dob, LocalDate hire, int employee_id) {
		super(Name, address, ID, NOT, dob, hire, employee_id);
	}

	public Reseptioniest() {
		
	}

	public static MuseumSystem getM() {
	return M;
}

public void setM(MuseumSystem m) {
	M = m;
}

	static void registersubs(int idf) {
		MultiTimeTecket Mt = new MultiTimeTecket();
		if (availableSubs(idf)) {

			System.out.println("You already have a subscription");
			System.out.println("Your information subscription is:" + getSubs(idf).toString());
		} else {

			if (getM().availablevisitor(idf)) {
				System.out.println("your information is:" + getM().getvisitor(idf).toString());
				subscriptions s = new subscriptions();
				System.out.println("Enter type of subscription:");
				System.out.println("1.Weekly subscription\n2.Montly subscription\n3.yearly subscription\n");
				int egf = input.nextInt();
				System.out.println("Are you want subs: 1.with guide,2.without guide\n");
				int wg = input.nextInt();
				if (wg == 1) {
					Guide o = new Guide();
					s.setTG(o);

				} else {
					s.setTG(null);

				}
						
				if (egf == 1) {

					Tickettype tt = Tickettype.WEEKLY;
					double price = 100;
					Mt.setPrice(price);
					issuetecketMulti(tt, idf, Mt, wg);
					int CountSubs = 5;
					s.setCountofsubs(CountSubs);
					s.setV1(getM().getvisitor(idf));
					s.setTy(Mt);
					getM().getSubscriptionslist().add(s);
					System.out.println("A successful subscription");

				} else if (egf == 2) {
					Tickettype tt = Tickettype.MONTHLY;
					double eg2 = 300;
					Mt.setPrice(eg2);
					issuetecketMulti(tt, idf, Mt, wg);
					int CountSubs = 22;
					s.setCountofsubs(CountSubs);
					s.setV1(getM().getvisitor(idf));
					s.setTy(Mt);
					getM().getSubscriptionslist().add(s);
					System.out.println("A successful subscription");
				} else if (egf == 3) {

					Tickettype tt = Tickettype.YEARLY;
					double eg2 = 2500;
					Mt.setPrice(eg2);
					issuetecketMulti(tt, idf, Mt, wg);
					int CountSubs = 250;
					s.setCountofsubs(CountSubs);
					s.setV1(getM().getvisitor(idf));
					s.setTy(Mt);
					getM().getSubscriptionslist().add(s);
					System.out.println("A successful subscription");
				

				}

			} else {
				Visitor g = new Visitor();
				getM().ReadVisitor(g);
				getM().addVisitor(g);
				System.out.println("Your information has been registered and now you will go to choose your subscription");
				registersubs(idf);

			}
		}

	}

	static void issuetecketMulti(Tickettype tt, int u, MultiTimeTecket mt, int wg) {

		mt.setNotH(getM().getvisitor(u).getName());
		Date dy;
		dy = new Date();
		mt.setIssue_date(dy);
		int Tid;
		Tid = mt.getTicket_id();
		mt.setTicket_id(Tid);
		Tid++;
		mt.setTtype(tt);

		if (wg == 1) {
			double price;
			price = mt.getPrice();
			price = price * 0.2 + price;
			mt.setPrice(price);
			System.out.println("Your subscription price is:" + mt.getPrice() + "$");

		}

		else if (wg == 2) {

			double prise;
			prise = mt.getPrice();
			mt.setPrice(prise);
			System.out.println("Your subscription price is:" + mt.getPrice() + "$");

		}

		mt.setV(getM().getvisitor(u));

	}

	static void issuetecketOne(OneTimeTecket ot, int wg, String n) {
		ot.setNotH(n);
		Date dy;
		dy = new Date();
		ot.setIssue_date(dy);
		int Tid;
		Tid = ot.getTicket_id();
		ot.setTicket_id(Tid);
		Tid++;
		ot.setTtype(null);

		if (wg == 1) {
			getM().Withguide(2, 0, ot);
			double price;
			price = ot.getPrice()+8;
			ot.setPrice(price);

		}

		else if (wg == 2) {

			double prise;
			prise = ot.getPrice();
			ot.setPrice(prise);
			System.out.println("Your ticket price is:" + ot.getPrice() + "$");

		}

	}

	static void deletesubs(int idv7) {
		int i=0;
		if(availableSubs(idv7)) {
		for (subscriptions V : getM().getSubscriptionslist()) {

			if (V.getV1().getID() == idv7) {
				break;
			}
         i++;
		}
		getM().getSubscriptionslist().remove(i);
		System.out.println("Deleted");
		System.out.println("He does not have a subscription");
		}
		else {
			System.out.println("He does not have a subscription");
		}

	}

	void editSubs() {
		
		System.out.println(" Enter Visitor id");
		int idv6 = input.nextInt();
		
		if(availableSubs(idv6)) {

				if (getSubs(idv6).getV1().getID() == idv6) {
					System.out.println(" Your information subs is:");
					System.out.println(getSubs(idv6).toString());
					System.out.println(" Choose the information field that you want to edit");
					
					int x = 10;
					while (x != 7) {
						System.out.println(
								"1.Name\n2.ID\n3.Date of birth\n4.telephone Number\n5.address\n6.subscriptions Type\n7.Finish edit");
						x = input.nextInt();
						switch (x) {
						case 1:
							System.out.println(" Enter new Name");
							String s;
							s = input.next();
							getSubs(idv6).getV1().setName(s);
							System.out.println("new name is:" + s + "\n");
							break;
						case 2:
							System.out.println(" Enter new ID");
							int id = input.nextInt();
							getSubs(idv6).getV1().setID(id);
							System.out.println("new ID is:" + id + "\n");
							break;
						case 3:
							System.out.println("4.Enter guide new Birth Day :Year,Month,Week ");
							int day = input.nextInt();
							int month = input.nextInt();
							int year = input.nextInt();
							LocalDate g = LocalDate.of(year, month, day);
							getSubs(idv6).getV1().setDateOfbirth(g);
							System.out.println("new Birth Day is" + g.toString());
							break;
						case 4:
							System.out.println(" Enter new telephone Number ");
							String s1;
							s1 = input.next();
							getSubs(idv6).getV1().setNumOftelph(s1);
							System.out.println("new telephone Number is:" + s1);
							break;
						case 5:
							System.out.println(" Enter new  address ");
							String s2;
							s2 = input.next();
							getSubs(idv6).getV1().setAddress(s2);
							System.out.println("new  address is:" + s2);

							break;
						case 6:
							System.out.println("Enter new subscriptions Type\n1.Weekly\n2.Monthly\n3.Yearly");
							int idy = input.nextInt();
							if (idy == 1) {

								getSubs(idv6).getTy().setTtype(Tickettype.WEEKLY);
							} else if (idy == 2) {
								getSubs(idv6).getTy().setTtype(Tickettype.MONTHLY);

							} else if (idy == 3) {

								getSubs(idv6).getTy().setTtype(Tickettype.YEARLY);
							}

							break;
						case 7:
							System.out.println(" New Visitor information subscription is:"+getSubs(idv6).toString());
							break;
						default:
							if(x!=0) {System.out.println("Wrong entry !\nTry again");}
							break;

						}

					}

				}

		
		}
		else {
			System.out.println("He does not have a subscription");
			
		}
		}

	

	public static boolean availableSubs(int id9) {
		
		for (subscriptions V1 : getM().getSubscriptionslist()) {

			if (V1.getV1().getID() == id9) {
				System.out.println("is subscriped");
				return true;
			}

		}
		System.out.println("He does not have a subscription");
		return false;

	}

	public static subscriptions getSubs(int id9) {
		
		for (subscriptions S1 : getM().getSubscriptionslist()) {

			if (S1.getV1().getID() == id9) {

				return S1;
			}

		}
		System.out.println("He does not have a subscription");
		return null;

	}

	@Override
	public String toString() {
		return "How can  we serve you? \n1.Guide registration .\n2.Visitor registration.\n3.subscriptions to the visitors.\n4.Book tour.\n5.Exit The Musuem";
	}

}
