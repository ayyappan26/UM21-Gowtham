package com.ultramain.um21.collectionpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAssignment {
	public static String country1, country2;
	public static String capital1, capital2;
	HashMap<String, String> M1 = new HashMap<>();
	HashMap<String, String> M2 = new HashMap<>();

	public static void main(String[] args) {
		HashMapAssignment hash = new HashMapAssignment();
		hash.storeCountryCapital("India", "Delhi");
		hash.storeCountryCapital("Japan", "Tokyo");
		System.out.println("------------------");
		hash.retrieveCaptial(country1);
		System.out.println("------------------");
		hash.retrieveCountry(capital1);

		HashMap<String, String> hash1 = hash.swapKey();

		for (Map.Entry<String, String> s1 : hash1.entrySet()) {
			System.out.println(s1.getKey() + " " + s1.getValue());
		}
		System.out.println("-------------------");
		ArrayList<String> s2 = hash.list();
		for (int i = 0; i < s2.size(); i++) {
			System.out.println(s2.get(i));
		}

	}

	public void storeCountryCapital(String CountryName, String Capital) {
		if (M1.isEmpty()) {
			country1 = CountryName;
			capital1 = Capital;
			M1.put(CountryName, Capital);

			for (Map.Entry<String, String> fir : M1.entrySet()) {
				System.out.println(fir.getKey() + " " + fir.getValue());
			}
		} else {
			country2 = CountryName;
			capital2 = Capital;
			M1.put(CountryName, Capital);

			for (Map.Entry<String, String> sec : M1.entrySet()) {
				System.out.println(sec.getKey() + " " + sec.getValue());
				break;
			}

		}
	}

	public void retrieveCaptial(String CountryName) {
		System.out.println(M1.get(CountryName));
	}

	public void retrieveCountry(String Capital) {

		String value = Capital;
		for (Entry<String, String> entry : M1.entrySet()) {

			if (entry.getValue() == value) {
				break;
			}
		}

	}

	public HashMap<String, String> swapKey() {
		String val = null;
		String key = null;

		for (String s : M1.keySet()) {
			key = s;
			val = M1.get(key);
			M2.put(val, key);
		}
		return M2;
	}

	public ArrayList<String> list() {
		Set<String> set = new HashSet<String>(M1.keySet());
		set.addAll(M1.values());

		ArrayList<String> arr = new ArrayList<>(set);
		return arr;
	}
}



