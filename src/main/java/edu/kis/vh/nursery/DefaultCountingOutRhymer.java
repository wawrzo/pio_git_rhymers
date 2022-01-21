package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
	private static final int NUMBERS_SIZE = 12;
	private static final int TOTAL_INITIAL_VALUE = -1;

	private final int[] numbers = new int[getNumbersSize()];

	public static int getNumbersSize() {
		return NUMBERS_SIZE;
	}

	public static int getTotalInitialValue() {
		return TOTAL_INITIAL_VALUE;
	}

	public int getTotal() {
		return total;
	}

	private int total = getTotalInitialValue();

	public void countIn(int in) {
		if (!isFull())
			getNumbers()[++total] = in;
	}
	public boolean callCheck() {
		return total == getTotalInitialValue();
	}
	public boolean isFull() {
		return total == getNumbersSize() - 1;
	}
	protected int peekaboo() {
		if (callCheck())
			return getTotalInitialValue();
		return getNumbers()[total];
	}
	public int countOut() {
		if (callCheck())
			return getTotalInitialValue();
		return getNumbers()[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}
}
