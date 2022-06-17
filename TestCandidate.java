package exerise02;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCandidate {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		System.out.println("Input n: ");
		num = scanner.nextInt();
		
		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		for(int i=0; i<num; i++) {
			Candidate candidate = new Candidate();
			System.out.println("Input information for candidate " + (i+1));
			candidate.input();
			candidateList.add(candidate);
		}
		
		for(Candidate candidate : candidateList) {
			if(candidate.isScoreHigherThan1()) {
				candidate.show();
			}
		}
	}
}
