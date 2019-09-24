
public class Main {

	public static void main(String[] args) {
		MorpIHM ihm = new MorpIHM();
		MorpGenerate morpion = new MorpGenerate();
		MorpCheck check = new MorpCheck();
		String strChoice;
		int choice;
		ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
		do {
			ihm.displayChoice();
			strChoice = ihm.read(); // new instance of a value typed into the terminal
			choice = Integer.parseInt(strChoice);

			switch (choice) {
			case 0:
				ihm.display("Fin du jeu");
				break;
			case 1:
				if (morpion.getCase1() == "1") {
					if (morpion.isTurn()) {
						morpion.setCase1("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase1("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 2:
				if (morpion.getCase2() == "2") {
					if (morpion.isTurn()) {
						morpion.setCase2("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase2("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 3:
				if (morpion.getCase3() == "3") {
					if (morpion.isTurn()) {
						morpion.setCase3("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase3("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 4:
				if (morpion.getCase4() == "4") {
					if (morpion.isTurn()) {
						morpion.setCase4("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase4("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 5:
				if (morpion.getCase5() == "5") {
					if (morpion.isTurn()) {
						morpion.setCase5("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase5("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 6:
				if (morpion.getCase6() == "6") {
					if (morpion.isTurn()) {
						morpion.setCase6("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase6("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 7:
				if (morpion.getCase7() == "7") {
					if (morpion.isTurn()) {
						morpion.setCase7("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase7("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 8:
				if (morpion.getCase8() == "8") {
					if (morpion.isTurn()) {
						morpion.setCase8("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase8("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			case 9:
				if (morpion.getCase9() == "9") {
					if (morpion.isTurn()) {
						morpion.setCase9("X");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(false);
						boolean resultWon = check.wonByX(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						if (resultWon == true) {
							ihm.display("Partie gagnée par les X !");
						}
						break;
					} else {
						morpion.setCase9("O");
						ihm.displayGrid(morpion.getCase1(), morpion.getCase2(), morpion.getCase3(), morpion.getCase4(), morpion.getCase5(), morpion.getCase6(), morpion.getCase7(), morpion.getCase8(), morpion.getCase9());
						morpion.setTurn(true);
						break;
					}
				} else {
					ihm.display("Case déjà remplie, veuillez choisir une autre case");
					break;
				}
			default:
				ihm.display("Erreur ! Selectionnez un nombre de 1 à 9 correspondant à une case.");
				break;
			}

		} while (choice != 0);		
	}

}
