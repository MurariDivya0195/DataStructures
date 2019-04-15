package com.BridgeLabs.DataStructures;

import java.util.ArrayList;
import java.util.List;

import com.BridgeLabs.Util.DataStructureUtil;

public class Prime2D {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		List<Integer> primes = DataStructureUtil.primeNumber(1000);
		int rows = 10;
		int cols = 100;
		int[][] prime2d = new int[rows][cols];
		int i = 1;
		try {
			while (i <= primes.size()) {
				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 100) {
						prime2d[0][j] = primes.get(i);
						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 200) {
						prime2d[1][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 300) {
						prime2d[2][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 400) {
						prime2d[3][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 500) {
						prime2d[4][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 600) {
						prime2d[5][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 700) {
						prime2d[6][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 800) {
						prime2d[7][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 900) {
						prime2d[8][j] = primes.get(i);

						i++;
					}
				}

				for (int j = 0; j < cols; j++) {
					if (primes.get(i) < 1000) {
						prime2d[9][j] = primes.get(i);

						i++;
					}
				}

			}

		} catch (Exception e) {
			e.fillInStackTrace();
		}

		for (int k = 0; k < rows; k++) {
			for (int j = 0; j < cols; j++) {
				if (prime2d[k][j] != 0) {
					System.out.print(prime2d[k][j] + " ");
				}
			}
			System.out.println();
		}

	}
}