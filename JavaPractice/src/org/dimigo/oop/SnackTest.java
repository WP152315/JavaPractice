/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 5.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int price[] = {1100,1200,1500};
		int sum = 0;
		
		Snack[] snack = {new Snack("새우깡", "농심" , 1100, 2), new Snack("콘칲", "크라운", 1200, 1), new Snack("허니버터칲", "해태", 1500, 4)};
		
		for(Snack s : snack) {
			System.out.println(s);
		}
		for(int i=0;i<3;i++){
			sum+=snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d",sum)+ "원");
	}



}
