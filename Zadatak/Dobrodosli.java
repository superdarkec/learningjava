import java.util.Scanner;

public class Dobrodosli {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner unos= new Scanner(System.in);
		System.out.print("Unesite ime i prezime:");
		
		String punoime = unos.nextLine();
	
		System.out.println("Zdravo, " + punoime + ", dobrodosao/la u svijet Jave!");
	}
	
	public static String SpojiIme(String s1, String s2)
	{
		return s1 + " " + s2;
	}

	public static void GenerirajPitanja(int brojPitanja)
	{
		Scanner unos= new Scanner(System.in);
		int pravilniRezultati = 0;
		int nepravilniRezultati = 0;
		
		for(int i=0; i<brojPitanja; i++)
		{
			int i1 = (int)(Math.random()*10); 
			int i2 = (int)(Math.random()*10);
			
			System.out.print("Koliko je " + i1 + " - " + i2 + "?" );
			
			System.out.print("Unesite odgovor: ");
			int odgovor = unos.nextInt();
			
			if (i1 - i2 == odgovor)
				pravilniRezultati++;
			else
				nepravilniRezultati++;
		}
		
		unos.close();
		
		System.out.print("Broj pravilnih rezultata: " + pravilniRezultati);
		System.out.print("Broj nepravilnih rezultata: " + nepravilniRezultati);
	}
}
