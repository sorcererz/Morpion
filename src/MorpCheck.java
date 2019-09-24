
public class MorpCheck {

	public boolean wonByX(String case1, String case2, String case3, String case4, String case5, String case6,
			String case7, String case8, String case9) {
		if (case1 == "X" && case2 == "X" && case3 == "X") {
			return true;
		} else if (case1 == "X" && case4 == "X" && case7 == "X") {
			return true;
		} else if (case3 == "X" && case6 == "X" && case9 == "X") {
			return true;
		} else if (case7 == "X" && case8 == "X" && case9 == "X") {
			return true;
		} else if (case2 == "X" && case5 == "X" && case8 == "X") {
			return true;
		} else if (case4 == "X" && case5 == "X" && case6 == "X") {
			return true;
		} else if (case1 == "X" && case5 == "X" && case9 == "X") {
			return true;
		} else if (case3 == "X" && case5 == "X" && case7 == "X") {
			return true;
		} else {
			return false;
		}
	}

	public boolean wonByO(String case1, String case2, String case3, String case4, String case5, String case6,
			String case7, String case8, String case9) {
		if (case1 == "O" && case2 == "O" && case3 == "O") {
			return true;
		} else if (case1 == "O" && case4 == "O" && case7 == "O") {
			return true;
		} else if (case3 == "O" && case6 == "O" && case9 == "O") {
			return true;
		} else if (case7 == "O" && case8 == "O" && case9 == "O") {
			return true;
		} else if (case2 == "O" && case5 == "O" && case8 == "O") {
			return true;
		} else if (case4 == "O" && case5 == "O" && case6 == "O") {
			return true;
		} else if (case1 == "O" && case5 == "O" && case9 == "O") {
			return true;
		} else if (case3 == "O" && case5 == "O" && case7 == "O") {
			return true;
		} else {
			return false;
		}
	}

	public boolean draw(String case1, String case2, String case3, String case4, String case5, String case6, String case7,
			String case8, String case9) {
		if (case1 != "1" && case2 != "2" && case3 != "3" && case4 != "4" && case5 != "5" && case6 != "6" && case7 != "7"
				&& case8 != "8" && case9 != "9") {
			return true;
		} else {
			return false;
		}
	}
}
