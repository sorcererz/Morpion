
public class MorpCheck {

	public boolean wonByX(String case1, String case2, String case3, String case4, String case5, String case6,
			String case7, String case8, String case9) {
		if (case1 == "✘" && case2 == "✘" && case3 == "✘") {
			return true;
		} else if (case1 == "✘" && case4 == "✘" && case7 == "✘") {
			return true;
		} else if (case3 == "✘" && case6 == "✘" && case9 == "✘") {
			return true;
		} else if (case7 == "✘" && case8 == "✘" && case9 == "✘") {
			return true;
		} else if (case2 == "✘" && case5 == "✘" && case8 == "✘") {
			return true;
		} else if (case4 == "✘" && case5 == "✘" && case6 == "✘") {
			return true;
		} else if (case1 == "✘" && case5 == "✘" && case9 == "✘") {
			return true;
		} else if (case3 == "✘" && case5 == "✘" && case7 == "✘") {
			return true;
		} else {
			return false;
		}
	}

	public boolean wonByO(String case1, String case2, String case3, String case4, String case5, String case6,
			String case7, String case8, String case9) {
		if (case1 == "●" && case2 == "●" && case3 == "●") {
			return true;
		} else if (case1 == "●" && case4 == "●" && case7 == "●") {
			return true;
		} else if (case3 == "●" && case6 == "●" && case9 == "●") {
			return true;
		} else if (case7 == "●" && case8 == "●" && case9 == "●") {
			return true;
		} else if (case2 == "●" && case5 == "●" && case8 == "●") {
			return true;
		} else if (case4 == "●" && case5 == "●" && case6 == "●") {
			return true;
		} else if (case1 == "●" && case5 == "●" && case9 == "●") {
			return true;
		} else if (case3 == "●" && case5 == "●" && case7 == "●") {
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
