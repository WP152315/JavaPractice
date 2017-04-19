/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 19.
 * </pre>
 *
 * @author		: jongs
 * @version 	: 1.0 
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName){
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getmemberName(){
		return memberName;
	}
	
	public static int getMemberCnt() {
		return memberCnt;
	}

	public static void setMemberCnt(int memberCnt) {
		FamilyMember.memberCnt = memberCnt;
	}
	
	public static void printmemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt);
	}
}
