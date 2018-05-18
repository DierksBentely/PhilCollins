package application;

import java.util.ArrayList;
import java.util.Random;

public class Deck 
{
	ArrayList<Cards> deck = new ArrayList<Cards>();
	private int size = 0;
	Random random = new Random();
	
	// does dead ass nothing
	public Deck()
	{
		
	}
		
	// adding cards to deck
	public void add(Cards card)
	{
		if (this.getSize() < 30)
		{
			deck.add(card);
			size++;
		}
		else
		{
			deckFull();
		}
	
	}
	public int getSize()
	{
		return size;
	}
	public String deckFull()
	{
		return "your deck is full";
	}
	
	// drawing a card
	public void draw()
	{
		if (this.size > 0)
		{
			int drawnCard = random.nextInt(this.size);
			deck.remove(drawnCard);
			this.size = size--;
		}
	}	
	
	public Cards get(int index)
	{
		return deck.get(index);
	}
	
	
}
