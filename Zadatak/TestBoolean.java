import java.util.Scanner;


public class TestBoolean {

	public static void main(String[] args) {
		//1. Generisati dva nasumicna borja
				int b1 = (int) (Math.random() *10);
				int b2 = (int) (Math.random() *10);
			//1. Ukoliko b1 < b2 zamjeniti b1 sa b2
				if (b1<b2){
					int privremeno =b1;
					b1= b2;
					b2= privremeno;
				}
			//3. Pitaj korisnika da odgovori na pitanje "Kolike je b1 - b2"
			    System.out.print("Koliko je" + " " + b1 + "-" + b2 +"?");
			    @SuppressWarnings("resource")
			    Scanner unos= new Scanner(System.in);
			    int odgovor = unos.nextInt();
			//4. Ocjeni odgovor i ispisi rezultate
			    if (b1 - b2 == odgovor){
			    	System.out.println("Odogovor je tacan!");
			    }
			    else{
			    	System.out.println("Odgovor nije tacan!");
			    	System.out.println(b1 + "-" + b2 + "=" + (b1 - b2));
			    }
			
			}

		}