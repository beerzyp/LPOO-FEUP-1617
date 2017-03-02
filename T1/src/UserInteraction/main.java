package UserInteraction;

import Game.DungeonMap;
import Game.GEGuard;
import Game.GEHero;
import Game.GEOgre;
import Game.GameElements;
import Game.GameLogic;
import Game.GameMap;
import Game.OgreMap;

public class main {
	public static void main(String[] args)
	{
	GameMap dungeon = new DungeonMap();
	GameMap ogremap = new OgreMap();

	GameElements Guard = new GEGuard(2,3,'G');
	GameElements Ogre = new GEOgre(2,4,'O', 2, 4);
	GameElements Hero = new GEHero(1,1,'H');

	
	GameLogic logic = new GameLogic(ogremap);
	
	logic.addGameElements(Hero);
	logic.addGameElements(Ogre);
	
	
	//começo do jogo
	
	
	if(logic.getMap().moveTo(1, 1))
	{
		//jogada numero 1
		logic.testKey(1, 1); //testa primeiro a key para nao sobrepor o hero (nesta posicao ainda nao apanhou a chave)
		Hero.setx(1); // joga com o hero
		Hero.sety(1); // joga com o hero
		
		Ogre.move(logic.getActualMap()); //move o ogre random com a sua arma
		
		for(int i =0; i < logic.getActualMap().length; i++) //pinta o jogo
		{
			System.out.println(logic.setGame()[i]); //MUITO IMPORTANTE, so existe um save do jogo para o tabuleiro nesta funcao setGame()
		}
		
		logic.cleanActualMap(); // limpa o mapa clonado
		
		//jogada numero 2
		logic.testKey(1, 7); //testa primeiro a key para nao sobrepor o hero
		Hero.setx(1); // joga com o hero
		Hero.sety(7); // joga com o hero
		
		Ogre.move(logic.getActualMap()); //move o ogre random com a sua arma
		
		for(int i =0; i < logic.getActualMap().length; i++) //pinta o jogo
		{
			System.out.println(logic.setGame()[i]);
		}
		
		logic.cleanActualMap(); // limpa o mapa clonado
		
		//jogada numero 3 (repete tudo igual)
		logic.testKey(2, 2);
		logic.testKey(2, 2);
		Hero.setx(2);
		Hero.sety(2);
		Ogre.move(logic.getActualMap());
		for(int i =0; i < logic.getActualMap().length; i++)
		{
			System.out.println(logic.setGame()[i]);
		}
		
	}
	
	
	}

}