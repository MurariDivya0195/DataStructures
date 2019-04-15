package com.BridgeLabs.DataStructures;

import java.util.List;

import com.BridgeLabs.Util.DataStructureUtil;
import com.BridgeLabs.Util.StackLinkedList;

public class AnagramStack {

	public static void main(String[] args) {

		List<Integer> primes = DataStructureUtil.primeNumber(1000);
		List<Integer> anagrams = DataStructureUtil.primeAnagrams(primes);

		System.out.println(anagrams.size());
		anagramsStored(anagrams);

		StackLinkedList<Integer> anagramsStack = new StackLinkedList<Integer>();

		for (Integer e : anagrams) {

			try {
				anagramsStack.push(e);
				System.out.print(e + " ");
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}

	}

	public static void anagramsStored(List<Integer> anagrams) {

		for (int i = 0; i < anagrams.size(); i++) {
			for (int j = 1; j < anagrams.size(); j++) {
				if (anagrams.get(i) == anagrams.get(j)) {
					anagrams.remove(j);
				}
			}
		}

		System.out.println(anagrams.size());

	}
}
