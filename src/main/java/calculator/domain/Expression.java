package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public final class Expression {
	private static final char PLUS = '+';
	private static final char MINUS = '-';
	private static final char MULTIPLY = '*';
	private static final char DIVISION = '/';
	private final List<Digit> digits;
	private final List<Operator> operators;

	public Expression(final String input) {
		digits = new ArrayList<>();
		operators = new ArrayList<>();
		String[] strings = input.split(" ");
		for (String string : strings) {
			parseExpression(string);
		}
	}

	public List<Digit> numbers() {
		return digits;
	}

	public List<Operator> operators() {
		return operators;
	}

	private void parseExpression(final String string) {
		char character = string.charAt(0);
		if (character == PLUS || character == MINUS || character == MULTIPLY || character == DIVISION) {
			operators.add(new Operator(character));
			return;
		}
		if (Character.isDigit(character)) {
			digits.add(new Digit(character - '0'));
			return;
		}
		throw new IllegalArgumentException("사칙 연산 기호가 아닙니다.");
	}

	public Digit indexOfDigits(final int index) {
		return digits.get(index);
	}

	public Operator indexOfOperators(final int index) {
		return operators.get(index);
	}

	public void insertDigit(final int index, final Digit digit) {
		digits.set(index, digit);
	}
}
