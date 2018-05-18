package application;

import java.util.ArrayList;

public class Hand extends Deck
{
	private ArrayList<Cards> hand = new ArrayList<Cards>();
	private int size;
	
	public Hand()
	{
		
	}
	
	// adding cards to deck
		public void add(Cards card)
		{
			if (this.getSize() < 10)
			{
				deck.add(card);
				size++;
			}
			else
			{
				// cannot as your hand is full
			}
		
		}
		public int getSize()
		{
			return this.size;
		}

	
	
	

}
