package com.BridgeLabs.DataStructures;

import java.util.List;

import com.BridgeLabs.Util.DataStructureUtil;

public class AnagramStack {
	
	public static void main(String[] args) {
		
		
		List<Integer> primes= DataStructureUtil.primeNumber();
		List<Integer> anagrams=DataStructureUtil.isAnagram(primes);
		System.out.println(anagrams.size());
		anagramsStored(anagrams);
	}

	public static void anagramsStored(List<Integer> anagrams) {
		
		// TODO Auto-generated method stub
		
		for(int i=0;i<anagrams.size();i++)
		{
			for(int j=1;j<anagrams.size();j++)
			{
				if(anagrams.get(i)==anagrams.get(j))
				{
						anagrams.remove(j);
				}
			}
		}
		
		System.out.println(anagrams.size());
		
		for(int i=0;i<anagrams.size();i++)
		{
			if(anagrams.get(i)<anagrams.get(i+1))
			{
				int temp=anagrams.get(i);
				anagrams.set(i+1, anagrams.get(i));
				anagrams.set(i,temp);
			}
		}
		
		for(int e :anagrams)
		{
			System.out.println(e);
		}
	}
}

