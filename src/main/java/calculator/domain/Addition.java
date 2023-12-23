package calculator.domain;

public final class Addition extends Operation {
	public Digit operate(final Digit first, final Digit second) {
		return new Digit(first.digit() + second.digit());
	}
}
