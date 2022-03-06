package io.pw;

public class RegSpilling2 {
	public static void main(String...args) {
		long startTime = System.nanoTime();
		long d = 0;
		for (int i = 0; i < 1_000_000_000; i++) {
			d += 2 * (i*i);
		}
		System.out.println((double) (System.nanoTime() - startTime) / 1000000000 + " s");
	}
}
