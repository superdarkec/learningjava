import java.util.Scanner;

public class Dobrodosli {
public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner unos= new Scanner(System.in);
	System.out.print("Unesite ime i prezime:");
	
	String punoime = unos.nextLine();

	System.out.println("Zdravo, " + punoime + ", dobrodosao/la u svijet Jave!");
	}

}
