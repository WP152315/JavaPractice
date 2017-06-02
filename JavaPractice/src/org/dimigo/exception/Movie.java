/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_ Moive
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class Movie {
	private String title;
	private int limitAge;
	public Movie (String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLimitAge() {
		return limitAge;
	}
	public void setLimitAge(int limitAge) {
		this.limitAge = limitAge;
	}
	public void buyTicket(int age){
		try{
			if(age<limitAge){
				throw new Exception(title + "은/는 " + limitAge + "세 이상 관람가입니다.");
			}
			else{
				System.out.println(title + " 즑감하세요.");
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
