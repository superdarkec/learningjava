import java.util.Scanner;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//@SuppressWarnings("resource")
		
		Scanner scn = new Scanner(System.in);
		
		// Prvi ispis glavnog menija
		PrikaziMeni();
		
		Boolean zaustavi = false;
		
		while (scn.hasNext())
		{
			String opcija = scn.next();
			if (opcija.equals("1"))	// korisnik je odabrao opciju 1
			{
				String punoime = SpojiDvaStringa(scn);
				System.out.println("Zdravo, " + punoime + ", dobrodosao/la u svijet Jave!");
			}
			else if (opcija.equals("2"))	// korisnik je odabrao opciju 2
			{
				int rezultat = ZbrojiDvaBroja(scn);
				System.out.println("Rezultat: " + rezultat);
			}
			else if (opcija.equals("3"))	// korisnik je odabrao opciju 3
			{
				VeciBroj(scn);
			}
			else if (opcija.equals("4"))	// korisnik je odabrao opciju 4
			{
				Prosjek(scn);
			}
			else if (opcija.equals("0"))	// korisnik je odabrao opciju 0 - zeli izaci iz programa
			{
				System.out.println("Hvala i dovidjenja!");
				zaustavi = true;
			}
			
			if (zaustavi)
				break;
			else
				// Kad se zavrsi odabrana funkcija, ponovo ispisi meni
				PrikaziMeni();
		}
	}
	
	public static void PrikaziMeni()
	{
		System.out.println("");
		System.out.println("------------------------------------------------------");
		System.out.println("MAIN MENU:");
		System.out.println("1 = Spoji dva stringa:");
		System.out.println("2 = Zbroji dva broja:");
		System.out.println("3 = Veci broj:");
		System.out.println("4 = Prosjek brojeva:");
		System.out.println("0 = Izlaz iz programa:");
		System.out.println("------------------------------------------------------");
		
		System.out.println("");
		System.out.println("Unesite opciju:");
	}
	
	// funkcija trazi da se ime i prezime
	// i vrati neki string
	public static String SpojiDvaStringa(Scanner unos)
	{
		System.out.print("Unesite ime i prezime:");
		
		String ime = unos.next();
		String prezime = unos.next();
		
		return ime + " " + prezime;
	}
	
	// funkcija trazi da se unesu dva broja
	// i vrati sumu brojeva
	public static int ZbrojiDvaBroja(Scanner unos)
	{
		System.out.print("Unesite prvi broj:");
		int i1 = unos.nextInt();
		
		System.out.print("Unesite drugi broj:");
		int i2 = unos.nextInt();
		
		return i1 + i2;
	}
	
	// funkcija provjerava da li je i1 veci od i2
	public static Boolean VeciBroj(Scanner unos)
	{
		System.out.print("Unesite prvi broj:");
		int i1 = unos.nextInt();
		
		System.out.print("Unesite drugi broj:");
		int i2 = unos.nextInt();
		
		Boolean b = i1 > i2;
		
		if (b)
			System.out.print("Prvi broj je veci");
		else
			System.out.print("Drugi broj je veci (ili mozda jednak .. hmmm)");
		
		return b;
	}
	
	public static double Prosjek(Scanner unos)
	{
		System.out.print("Unesite prvi broj:");
		double d1 = unos.nextDouble();
		
		System.out.print("Unesite drugi broj:");
		double d2 = unos.nextDouble();
		
		double prosjek = (d1 + d2) / 2;
		
		System.out.print("Prosjek unesenih brojeva je: " + prosjek);
		return prosjek;
	}
}
