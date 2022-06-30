package exerise02;

import java.util.Scanner;

public class Candidate {
	
	private int id;
	private String name;
	private String dateOfBirth;
	private float mathScore;
	private float literatureScore;
	private float englishScore;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input candidate id: ");
		this.id = scanner.nextInt();
		
		System.out.println("Input candiate name: ");
		this.name = scanner.nextLine();
		
		System.out.println("Input date of birth: ");
		this.dateOfBirth = scanner.nextLine();
		
		System.out.println("Input math score: ");
		this.mathScore = scanner.nextFloat();
		
		System.out.println("Input literature score: ");
		this.literatureScore = scanner.nextFloat();
		
		System.out.println("Input english score: ");
		this.englishScore = scanner.nextFloat();
	}
	
	public void show() {
		System.out.println("Candidate id: " + this.id);
		System.out.println("Candidate name: " + this.name);
		System.out.println("Date of birth: " + this.dateOfBirth);
		System.out.println("Math point: " + this.mathScore);
		System.out.println("Literature point: " + this.literatureScore);
		System.out.println("English point: " + this.englishScore);
	}

	//Check if total score is higher than 1
	public boolean isScoreHigherThan1() {
		float totalScore;
		
		totalScore = this.mathScore + this.literatureScore + this.englishScore;
		
		if(totalScore <= 1) {
			return false;
		}
		
		return true;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getMathScore() {
		return mathScore;
	}

	public void setMathScore(float mathScore) {
		this.mathScore = mathScore;
	}

	public float getLiteratureScore() {
		return literatureScore;
	}

	public void setLiteratureScore(float literatureScore) {
		this.literatureScore = literatureScore;
	}

	public float getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(float englishScore) {
		this.englishScore = englishScore;
	}
}
