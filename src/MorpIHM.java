import java.util.Scanner;

public class MorpIHM {
	
	public void display(String arg) {
		System.out.println(arg);
	}
	
	public void displayChoice() {
        display("Choisissez le numéro de la case à modifier, ou appuyer sur 0 pour quitter le jeu");
    }
	
	public void displayGrid(String case1,String case2,String case3,String case4,String case5,String case6,String case7,String case8,String case9) {
		display(case1 + " " + case2 + " " + case3);
		display(case4 + " " + case5 + " " + case6);
		display(case7 + " " + case8 + " " + case9);
	}
	
	public String read() {
		Scanner scan = new Scanner(System.in); //initialize the Scanner object and read the value of the terminal
		return scan.next(); //return the next string the user types in the terminal
	}
}
