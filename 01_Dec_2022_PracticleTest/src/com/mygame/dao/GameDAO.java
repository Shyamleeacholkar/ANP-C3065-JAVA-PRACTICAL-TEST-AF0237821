package com.mygame.dao;

public class GameDAO 
{
	public String cityName[]= {"CHENNAI","MUMBAI","DELHI","KOLKATTA","HYDERABAD"};
	public void getCityName() {
		for (int i=0;i<cityName.length;i++) {
			System.out.println(cityName[i]);
		}
	}
	/*public static void main(String[] args) 
	{
		GameDAO GameDAOobj=new GameDAO();
		GameDAOobj.getCityName();
	}*/

}