package Training;

import java.util.Scanner;

public class ConversionF_C {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		char response = 'O';
		float resultat ;
	
		System.out.println("choisir le mode de convertion");
		System.out.println("1 - convertisseur Celsuis - Fahrenheit ");
		System.out.println("2 - convertisseur Fahrenheit - Celsuis ");
		float rep=sc.nextFloat();
		
		while(response =='O' && (rep ==1 || rep ==2)) {
			System.out.println("Température à convertir : ");

			if(rep==1) {
				
				float temp=sc.nextFloat();
				resultat=(9/5)*temp+32;
				System.out.println(temp+" °C correspond à "+ arrondi(resultat,2)+" °F.");
				//vider la lgne lue
				sc.nextLine();
				
			}
			else {
				
				float temp=sc.nextFloat();
				resultat=((temp-32)*5)/9;
				System.out.println(temp+" °F correspond à "+ arrondi(resultat,2)+" °C.");
				sc.nextLine();
			
			}
			// recommencer ou quiter  
		
			 do{       
			        System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
			        response = sc.nextLine().charAt(0);
			       
			      }while(response != 'O' && response != 'N');
		
		}
		System.out.println("Au revoir !");
	}


	// methode arrondi
	public static double arrondi(double A, int B) {
	    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	  } 
}
