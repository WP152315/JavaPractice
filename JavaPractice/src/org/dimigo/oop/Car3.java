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
public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxspeed;
	private int price;
	
	public Car3(String company,String model,String color,int maxspeed,int price)
	{
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
		this.price = price;
	}
	
	public Car3(String company,String model,String color,int maxspeed){
		this(company, model, color, maxspeed,0);
	}
	
	public Car3(String company,String model,String color)
	{
		this(company,model,color,0,0);
	}
	
	
	
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
	
	
	
	
}
