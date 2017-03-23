/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_	Car
 *
 *	1.		 개요 :
 * 2.	 작성일 : 2017. 3. 23.
 *</pre>
 * @author DELL_PC
 * @version : 1.0
 */
public class Car {
	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int maxspeed = 255;
	private int price = 50000000;
	
	public String getCompany()
	{
		return company;
	}
	public String getModel()
	{
		return model;
	}
	public String getColor()
	{
		return color;
	}
	public int getMaxspeed()
	{
		return maxspeed;
	}
	public int getPrice()
	{
		return price;
	}
	// setter 메소드 선언
	public void setCompany(String newCompany)
	{
		company = newCompany;
	}
	
	public void setModel(String newModel)
	{
		model = newModel;
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}
	
	public void setMaxspeed(int newMaxspeed)
	{
		maxspeed = newMaxspeed;
	}
	
	public void setPrice(int newPrice)
	{
		price = newPrice;
	}
	
	
	
	
}
