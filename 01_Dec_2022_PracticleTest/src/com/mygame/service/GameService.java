package com.mygame.service;
import com.mygame.dao.GameDAO;

public class GameService 
{
	public void getCityNameService() {
		GameDAO GameDAOobj=new GameDAO();
		GameDAOobj.getCityName();
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameService GameServiceobj=new GameService();
		GameServiceobj.getCityNameService();
	}*/
}

