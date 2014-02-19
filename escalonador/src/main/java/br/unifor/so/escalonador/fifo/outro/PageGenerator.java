package br.unifor.so.escalonador.fifo.outro;

public class PageGenerator {

	private static final int DEFAULT_SIZE = 20; // Padrão: 100
	private static final int RANGE = 7; // Padrão: 9

	int[] referenceString;

	public PageGenerator() {
		this(DEFAULT_SIZE);
	}

	public PageGenerator(int count) {
		if (count < 0)
			throw new IllegalArgumentException();

		java.util.Random generator = new java.util.Random();
		referenceString = new int[count];

		for (int i = 0; i < count; i++)
			referenceString[i] = generator.nextInt(RANGE + 1);
	}

	public int[] getReferenceString() {
		return referenceString;
	}
}