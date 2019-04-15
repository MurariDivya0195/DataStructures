package com.BridgeLabs.DataStructures;

import java.util.List;

import com.BridgeLabs.Util.DataStructureUtil;
import com.BridgeLabs.Util.QueueLinkedList;

public class AnagramQueue {

	public static void main(String[] args) {
		List<Integer> primes = DataStructureUtil.primeNumber(1000);
		List<Integer> anagrams = DataStructureUtil.primeAnagrams(primes);
		AnagramStack.anagramsStored(anagrams);
		QueueLinkedList<Integer> anagramQueue = new QueueLinkedList<Integer>();
		for (Integer e : anagrams) {
			anagramQueue.insert(e);
			System.out.print(" " + e);
		}

	}

}