package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

	public static int calculateStrength(String password) {
		int length = password.length();
		int score = 0;

		if (length < 6) {
			return score;
		}

		if (length < 11) {
			score += 1;
		} else {
			score += 2;
		}

		if (password.contains("[0-9]")) {
				score += 2;
		}

		if (password.contains("[a-z")) {
			score += 2;
		}

		if (password.contains("[A-Z")) {
			score += 2;
		}

		if (password.contains("[~!@#$%^&*()_-]")) {
			score += 2;
		}

		return score;
	}
}
