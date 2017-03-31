/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *		|_	Question
 *
 *	1.		 개요 :
 * 2.	 작성일 : 2017. 3. 31.
 *</pre>
 * @author DELL_PC
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] qu = {"1.가장 좋아하는 가수는?", "2.가장 좋아하는 배우는?", "3.가장 좋아하는 과목은?"};
		String[] an = {"아이린", "박보영", "응용 프로그래밍"};
		for(int i = 0; i < 3; i++){
			System.out.println(qu[i]);
			String answer = scanner.nextLine();
			if(answer.equals(an[i])) System.out.println("정답입니다!");
			else	System.out.println("틀렸습니다!");
		}
		StringBuilder sb = new StringBuilder("가장 좋아하는 가수는? ");
		sb.append("아이린입니다.\n").append("가장 좋아하는 배우는? ").append("박보영입니다.\n").append("가장 좋아하는 과목은? ").append("응용 프로그래밍입니다.");
		System.out.println("<< 결과 출력 >>");
		System.out.println(sb.toString());
	}

}
