/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ PiggyBank
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amout){
		balance += amout;
		System.out.println(member.getmemberName() + " : " + amout + "원 넣음");
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액" + balance + "원");
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		PiggyBank.balance = balance;
	}
}
