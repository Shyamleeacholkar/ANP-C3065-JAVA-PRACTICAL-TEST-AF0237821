package com.mygame.view;
import java.util.Random;
import com.mygame.service.GameService;

public class GameView 
{
	public Class<Random> displayCityNameWithBanks() {
		GameService GameServiceobj=new GameService();
		GameServiceobj.getCityNameService();
		return Random.class;
	}	
	
}
