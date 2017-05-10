/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ PersonTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 26.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class PersonTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person[] persons = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("다나카"),
				new Chinese("왕밍")
		};
		
		for(Person p : persons){
			greeting(p);
		}
		
		
	}
	
	public static void greeting(Person x){
		System.out.println(x.toString());
		x.sayHello();
		x.sayBye();
		System.out.println();
	}

}
