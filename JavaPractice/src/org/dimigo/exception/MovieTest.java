/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ MoiveTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Movie[] movies = {
				new Movie("에일리언:커버넌트", 15),
				new Movie("가디언즈 오브 갤럭시",12)
		};
		int age = 13;
		for(Movie movie : movies){
			movie.buyTicket(age);
		}
	}

}
