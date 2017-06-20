import java.util.Scanner;
public class DarkecMasina {

	public static void main(String[] args) {
		//string, double, int i boolean
		//1:spoji 2 stringa(String)
		//2:saberi 2 broja (int)
		//3:provjeri da li je broj djeljiv sa 2 ili 3 (boolean)
		//4:prosjek 3 decimalna broja (double)
		//0:izlaz iz programa
	
	//Spoji 2 stringa
	@SuppressWarnings("resource")							// komentar 1: SuppressWarnings, ako ga koristiš, dovoljan je samo jedan
	Scanner inputstring = new Scanner (System.in);
	System.out.print("Unesite dva imena:");
	String ime1 = inputstring.next();
	String ime2 = inputstring.next();
	String obaimena = ime1 + " " + "i" + " " + ime2;
	
	System.out.println("Svi znamo da su Darkec i Sale gotivniji nego" + " " + obaimena + ".");
	
	//String s1 = "";
	//int i = 123;
	//s1 = Integer.toString(i);
	
	String s1 = "";
	int prestupne = 0;
	
	for(int i=101; i<=2100; i++)
	{
		if (i%4==0)
		{
			s1 += Integer.toString(i);
			prestupne++;
			
			if (prestupne%10==0)
			{
				System.out.println(s1);
				s1 = "";
			}
		}
	}
	System.out.println("Od 101 do 2100 godine ima: " + prestupne + "prestupnih godina.");
	
	//Saberi 2 broja
	@SuppressWarnings("resource")
	Scanner inputint = new Scanner (System.in);
	System.out.print("Unesite dva broja:");
	int i1 = inputint.nextInt();
	int i2 = inputint.nextInt();
	int zbir = i1 + i2;
	System.out.println("Zbir brojeva" + " " + i1 + " " +"i" +" " + i2 + " " + "je" + " " + zbir);	
	
	//Provjeri da li je broj djeljiv sa 2 ili 3
	@SuppressWarnings("resource")
	Scanner unos = new Scanner(System.in);
		System.out.print("Molimo Vas unesite jedan broj:");
		int broj = unos.nextInt();
		if (broj % 2 == 0 && broj % 3 == 0){
			System.out.println(broj + " " + "je djeljiv sa 2 i sa 3.");
		}
		if (broj % 2 == 0 || broj % 3 == 0){
			System.out.println(broj + " " + "je djeljiv sa 2 ili sa 3.");
		}
		if (broj % 2 == 0 ^ broj % 3 == 0) {
			System.out.println(broj + " "+"je djeljiv sa 2 ili sa 3 ali ne sa oba.");
		}
		else{
			System.out.println("Broj" + " " + broj + " " + "nije djeljiv sa 2 ili 3.");
		}
	
	//Prosjek 3 decimalna broja
	@SuppressWarnings("resource")
	Scanner inputdouble = new Scanner (System.in);
	System.out.println("Unesite tri decimalna broja:");
	double d1 = inputdouble.nextDouble();
	double d2 = inputdouble.nextDouble();
	double d3 = inputdouble.nextDouble();
	double prosjek = (d1 + d2 + d3)/3;
	System.out.println("Prosjek brojeva" + " " + d1 + d2 + d3 + " " +"je"+" "+ prosjek);
	}
}