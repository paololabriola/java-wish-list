package jana60;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Sessione 5: Pasquale Meo, Paolo Labriola, Tonia Fioretto, Simone Carrella.
		
		Scanner scan = new Scanner(System.in);
		boolean flag = false;
		String conferma;
		
		List<String> listaDiDesideri = new ArrayList<String>(3);
		
		do {
			
			System.out.print("Inserisci il tuo desiderio: ");
			listaDiDesideri.add(scan.nextLine());
			System.out.println("La lista ora contiene " + listaDiDesideri.size() + " desideri.");
			
			if(listaDiDesideri.size() == 3)
				flag =true;
			else {
			
				do {
					
					System.out.print("Vuoi inserire un nuovo desiderio? ");
					conferma = scan.nextLine();
				
					if(!conferma.equalsIgnoreCase("si") && !conferma.equalsIgnoreCase("no"))
					System.out.println("Rispondi solo Si o No.");
				
				}while(!conferma.equalsIgnoreCase("no") && !conferma.equalsIgnoreCase("si"));
				
				if(conferma.equalsIgnoreCase("no"))
					flag = true;
				
			}
			
			
		}while(!flag);

		for(int i = 0; i < listaDiDesideri.size(); i++) {
			
			System.out.println("Il desiderio numero " + (i + 1) + " è " + listaDiDesideri.get(i));
			
		}
		
	}

}
