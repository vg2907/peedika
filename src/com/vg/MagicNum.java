package com.vg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicNum {

	public static void main(String[] args) {

		String line = "100 1000";
		String[] inputs = line.split(" ");
		int lowerBound = Integer.valueOf(inputs[0]);
		int upperBound = Integer.valueOf(inputs[1]);

		List<Integer> magicNumbers = new ArrayList<Integer>();

		for (int x = 147; x <= 148; x++) {
			if (hasRepeatedDigit(x)) {
				continue;
			}

			if (isMagic(x)) {
				magicNumbers.add(x);
			}
		}

		for (Integer xx : magicNumbers) {
			System.out.println(xx);
		}
	}

	public static boolean isMagic(int number) {
		char[] a = String.valueOf(number).toCharArray();
		boolean[] visited = new boolean[a.length];
		Arrays.fill(visited, Boolean.FALSE);

		int index = 0;
		while (!visited[index]) {
			visited[index] = true;
			index = ((index + (a[index] - 0)) % a.length);
			System.out.println(index);
		}

		boolean isVisited = true;
		for (boolean x : visited) {
			if (!x) {
				isVisited = false;
			}
		}

		return isVisited && index == 0;
	}

	static boolean hasRepeatedDigit(int num) {
		int i = num;
		boolean[] flagArr = new boolean[10];
		while (i > 0) {
			int r = i % 10;
			if (flagArr[r]) {
				return true;
			} else {
				flagArr[r] = true;
			}
			i = i / 10;
		}
		return false;
	}

}
