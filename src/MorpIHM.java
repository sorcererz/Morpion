import java.util.Scanner;

public class MorpIHM {
	
	public void display(String arg) {
		System.out.println(arg);
	}
	
	public void displayChoice() {
        display("Choisissez le numéro de la case à modifier, ou appuyer sur 0 pour quitter le jeu");
    }
	
	public void displayGrid(String case1,String case2,String case3,String case4,String case5,String case6,String case7,String case8,String case9) {
		display("\u250F" + "\u2501" + "\u2501" + "\u2501" + "\u2533" + "\u2501" + "\u2501" + "\u2501" + "\u2533" + "\u2501" + "\u2501" + "\u2501" + "\u2513");
		display("\u2503" + " " + case1 + " " + "\u2503" + " "+ case2 + " " + "\u2503" + " "+ case3 + " " + "\u2503");
		display("\u2523" + "\u2501" + "\u2501" + "\u2501" + "\u254B" + "\u2501" + "\u2501" + "\u2501" + "\u254B" + "\u2501" + "\u2501" + "\u2501" + "\u252B");
		display("\u2503" + " " + case4 + " " + "\u2503" + " "+ case5 + " " + "\u2503" + " "+ case6 + " " + "\u2503");
		display("\u2523" + "\u2501" + "\u2501" + "\u2501" + "\u254B" + "\u2501" + "\u2501" + "\u2501" + "\u254B" + "\u2501" + "\u2501" + "\u2501" + "\u252B");
		display("\u2503" + " " + case7 + " " + "\u2503" + " "+ case8 + " " + "\u2503" + " "+ case9 + " " + "\u2503");
		display("\u2517" + "\u2501" + "\u2501" + "\u2501" + "\u253B" + "\u2501" + "\u2501" + "\u2501" + "\u253B" + "\u2501" + "\u2501" + "\u2501" + "\u251B");

	}
	
	public String read() {
		Scanner scan = new Scanner(System.in); //initialize the Scanner object and read the value of the terminal
		return scan.next(); //return the next string the user types in the terminal
	}
}
