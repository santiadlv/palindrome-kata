package mx.tec.kata;

public class PalindromeValidator {
	public boolean validate(String string) {
		String stringWithoutSpaces = string.replaceAll("\\s+","");
		for (int i = 0; i < stringWithoutSpaces.length() / 2; ++i) {
				if (stringWithoutSpaces.charAt(i) != stringWithoutSpaces.charAt(stringWithoutSpaces.length() - 1 - i)) {
					return false;
				}
		}
		return true;
	}
}