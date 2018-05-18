package application;

public class Cards 
{
	private String name="null";
	private int mana= 0;
	private int attack =0;
	private int health =0;
	
	public Cards()
	{
		
	}
	
	
	
	public Cards(String name, int mana, int attack, int health)
	{
		this.name = name;
		this.mana = mana;
		this.attack = attack;
		this.health = health;
	}
	
	
	public void takeDamage(int health, int enemyAttack)
	{
		this.health = this.health-enemyAttack;
		die(this.health);
	}
	
	
	
	private void die(int health)
	{
		if (this.health <= 0)
		{
			// this is dead
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public static Cards randomCard(int index)
	{
		if (index == 0)
		{
			Cards card = new Cards("snowflipper penguin", 0, 1, 1);
			return card;

		}
		if (index == 1)
		{
			Cards card = new Cards("angry bird", 1, 1, 1);
			return card;
			
		}
		if (index == 2)
		{
			Cards card = new Cards("goldshire footman", 1, 1, 2);
			return card;
			
		}
		if (index == 3)
		{
			Cards card = new Cards("bloodsail corsair ", 1, 1, 2);
			return card;
			
		}
		if (index == 4)
		{
			Cards card = new Cards("mountain giant", 12, 8, 8);
			return card;
			
		}
		if (index == 5)
		{
			Cards card = new Cards("voidlord", 9, 3, 9);
			return card;
			
		}
		if (index == 6)
		{
			Cards card = new Cards("fire fly", 1, 2, 1);
			return card;
			
		}
		if (index == 7)
		{
			Cards card = new Cards("mana wyrm", 1, 1, 3);
			return card;
			
		}
		if (index == 8)
		{
			Cards card = new Cards("emeriss", 10, 8, 8);
			return card;
			
		}
		if (index == 9)
		{
			Cards card = new Cards("glenda crowskin", 6, 3, 6);
			return card;
		}
		else
		{
			return null;
		}
	}
	
		
}
