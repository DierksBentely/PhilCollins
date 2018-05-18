package application;
	
import java.util.ArrayList;
import java.util.Random;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	Deck deck = new Deck();
	Hand myHand = new Hand();
	Random random = new Random();
	
	@Override
	public void start(Stage primaryStage) {
		try 
		{
			while(deck.getSize() < 30)
			{
				// test thing to fill my deck with garbage cards
				Cards card = Cards.randomCard(random.nextInt(10));
				deck.add(card);
				
			}
			
			for (int i = 0; i < deck.getSize(); i++)
			{
				// how to reference specific cards in the deck or hand
				System.out.println(deck.get(i).getName());	
				
			}
			
			
			
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
