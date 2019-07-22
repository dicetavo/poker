package projet1;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//variables
		double f,c,t = 1.0;
		int r = 0,p = 0;
		
		System.out.println("Convertisseur degrés celcius et degrés fahrenheint");
		
		while (r == 1);
		
		{
		System.out.println("Choisissez le mode de conservation :");
		System.out.println("1 - Convertisseur Celsius - Fahrenheit");
		System.out.println("2 - Convertisseur Fahrenheit - Celsius");
		
		p = sc.nextInt();
		
		System.out.println("Température  à convertir : ");
		
		t = sc.nextInt();

		
		if (p==1) {
			f=((9*t)/5)+32;
			System.out.println("Ca fait" +f);
			
		}
		else if (p==2) { 
			c=((t-32)*5)/9;
			System.out.println("Ca fait" +c);

		}
	
		System.out.println("continuer ? (1- Oui / 2- non");
		
		r = sc.nextInt();
	}
		System.out.println("merci d'avoir joué");
		

}
}