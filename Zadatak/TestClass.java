import java.util.Scanner;


public class TestClass {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 = Spoji dva stringa
		// 2 = Zbroji dva broja
		// 3 = Veci broj
		// 4 = Prosjek brojeva
		// 0 = Izlaz iz programa

		@SuppressWarnings("resource")
		
		String punoime = SpojiDvaStringa();
		System.out.println("Zdravo, " + punoime + ", dobrodosao/la u svijet Jave!");
	
		int a = 1;
		int b = 2;
		String c = "3";
		String d = "3";
		Boolean provjera = true;
		
		b = 2;
		
		if (provjera)
		{
			System.out.print("a je jednako b");
		}
		else if(a == b)
		{
			System.out.print("a nije jednako b");
		}
		else
		{
			System.out.print("jebiga neznam ni ja");
		}
	}
	
	public String SpojiDvaStringa()
	{
		Scanner unos= new Scanner(System.in);
		System.out.print("Unesite ime i prezime:");
		
		String ime = unos.next();
		String prezime = unos.next();
		
		String punoime = ime + " " + prezime;
		
		//return punoime;
		
		return "";
	}
	
	public int ZbrojiDvaBroja(int i1, int i2, int i3)
	{
		return i1 + 12 + i3;
	}
	
	// funkcija provjerava da li je i1 veci od i2
	public Boolean VeciBroj(int i1, int i2)
	{
		// 1 i 3
		// veci broj je 3
		// a > b  .. a veci od b
		// a < b .. a manji od b
		// a == b .. a jednak b
		Boolean b = i1 > i2;
		return b;
	}
}
