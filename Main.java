package app;


import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x,y;
		String choix;
		int quitter = 0;
		
		
		do {
			
		System.out.println("1. addition (+)");
		System.out.println("2. soustraction (-)");
		System.out.println("3. multiplication(*)");
		System.out.println("4. division (/) ");
		System.out.println("5. sinus (sin)");
		System.out.println("6. cosinus (cos)");
		System.out.println("7. tangente (tan)");
		System.out.println("0. quitter");
		System.out.println();
		
		do {
			System.out.println("veuillez choisir l'operation: ");
			  choix = scan.next();
		}while(!choix.equals("1")||!choix.equals("2")||!choix.equals("3")||!choix.equals("4")||!choix.equals("5")||!choix.equals("6")||!choix.equals("7")||!choix.equals("+")
				||!choix.equals("-")||!choix.equals("/")||!choix.equals("*")||!choix.equals("sin")||!choix.equals("cos")||!choix.equals("tan"));
				 
				
				System.out.println("entrer premier nombre: ");
				 x= scan.nextInt();
				 System.out.println("entrer deuxieme nombre: ");
				 y= scan.nextInt();
				
				if(choix.equals("1")||choix.equals("+")){
					
					Math.addition(x, y);
				}
				else if(choix.equals("2")||choix.equals("-")){
					
					Math.soustraction(x, y);
				}
				else if(choix.equals("3")||choix.equals("*")){
					
					Math.multiplication(x, y);
				}
				else if (choix.equals("4")||choix.equals("/")){
					
					Math.division(x, y);
				}
				else if(choix.equals("5")||choix.equals("sin")){
					
					Math.sinus(x);
				}
				else if(choix.equals("6")||choix.equals("cos")){
					
					Math.cosinus(x);
				}
				else if (choix.equals("7")||choix.equals("tan")){
					
					Math.tangente(x);
				}
				
				else {
					System.out.println("invalid");
				}
				System.out.println(" voulez vous quittter?: ");
				quitter = scan.nextInt();
				
		}while(quitter != 0);
	}			
	
	}

	
	



