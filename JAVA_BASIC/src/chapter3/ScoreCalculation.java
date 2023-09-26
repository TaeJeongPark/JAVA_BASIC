package chapter3;

import java.util.Scanner;

public class ScoreCalculation {

	public static int[] input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생의 수가 몇 명입니까? : ");
		int cnt = sc.nextInt();
		
		int score[] = new int[cnt];
		
		for(int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "번째 학생의 성적을 입력해주세요 : ");
			score[i] = sc.nextInt();
		}
		
		sc.close();
		
		return score;
		
	}
	
	public static int sum(int[] score) {
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		return sum;
		
	}
	
	public static double average(int[] score) {
		
		return sum(score) / score.length;
		
	}
	
	public static int max(int[] score) {
		
		int max = 0;
		
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) max = score[i];
		}
		
		return max;
		
	}
	
	public static int min(int[] score) {
		
		int min = 999999;
		
		for(int i = 0; i < score.length; i++) {
			if(min > score[i]) min = score[i];
		}
		
		return min;
		
	}
	
	public static void main(String[] args) {
				
		int score[] = input();
		
		System.out.println("학생들의 평균 점수 : " + average(score));
		System.out.println("가장 높은 점수 : " + max(score));
		System.out.println("가장 낮은 점수 : " + min(score));
		
	}

}
