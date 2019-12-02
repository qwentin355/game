package game;

public class Hero {
	private int nAttackRank;
	private int nDefenseRank;
	private int nHitPoints;
	private int nInitiative;
	
	public HeroType nType;
	
	enum HeroType {Mage, Thief, Fighter}
	
	public Hero(HeroType nType)
	{
		
	}
	public int getNumAttacksPerturn()
	{
		
	}
	public boolean isDead()
	{
		
	}
	public void ressurect()
	{
		
	}
	public int getAttack()
	{
		
	}
	public int getInitiative()
	{
		
	}
	public int getDefense()
	{
		
	}
	public int getHit()
	{
		
	}
	protected void setHit (int nVal)
	{
		
	}
	protected void setInitiative(int nVal)
	{
		
	}
	protected void setAttack(int nVal)
	{
		
	}
	protected void setDefense(int nVal)
	{
		
	}
	public void deffend(Hero obOther)
	{ 
		
	}
	public String toString()
	{
		
	}
}
	
	class Elf extends Hero {
		String sName;
		
		public Elf(String sName, HeroType nType)
		{
			
		}
		public String toString()
		{
			
		}
	}
	class Dwarf extends Hero {
		String sName;
		
		public Dwarf(String sName, HeroType nType)
		{
			
		}
		public String toString()
		{
			
		}
	}
	class Hobbit extends Hero {
		String sName;
		
		public Hobbit(String sName, HeroType nType)
		{
			
		}
		public String toString()
		{
			
		}
	}
	class Human extends Hero {
		String sName;
		
		public Human(String sName, HeroType nType)
		{
			
		}
		public String toString()
		{
			
		}
}
