/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 17.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] s = {
				new IPhone("iPhone 7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
	    for (SmartPhone i : s) {
	         System.out.println(i.toString());
	         i.turnOn();
	         i.pay();
	         i.useSpecialFunction(i);
	         i.turnOff();
	         System.out.println();
	       }

	}

}
