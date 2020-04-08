package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int n = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				n++;
			}
		}
		return n;
	}
	
	public static double findTallest(List<Double> peeps) {
		double n = peeps.get(0);
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i) > n) {
				n = peeps.get(i);
			}
		}
		return n;
	}
	
	public static String findLongestWord(List<String> words) {
		String lw = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > lw.length()) {
				lw = words.get(i);
			}
		}
		return lw;
	}
	
	public static boolean containsSOS(List<String> message) {
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).equals(" ... --- ... ")) {
				return true;
			}
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
		boolean sorted = false;
		while(!sorted) {
			for(int i = 1; i < results.size(); i++) {
				if(results.get(i) < results.get(i - 1)) {
					double a = results.get(i);
					results.toArray()[i] = results.get(i - 1);
					results.toArray()[i - 1] = a;
				}
			}
			sorted = true;
			for(int i = 1; i < results.size(); i++) {
				if(results.get(i) < results.get(i - 1)) {
					sorted = false;
				}
			}
		}
		return results;
	}
	
	public static List<String> sortDNA(List<String> DNA) {
		List<String> s = DNA;
		boolean sorted = false;
		while(!sorted) {
			for(int i = 1; i < DNA.size(); i++) {
				if(DNA.get(i).length() < DNA.get(i - 1).length()) {
					String a = DNA.get(i);
					DNA.toArray()[i] = DNA.get(i - 1);
					DNA.toArray()[i - 1] = a;
				}
			}
			sorted = true;
			for(int i = 1; i < DNA.size(); i++) {
				if(DNA.get(i).length() < DNA.get(i - 1).length()) {
					sorted = false;
				}
			}
		}
		return s;
	}
}
