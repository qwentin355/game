package game;

	enum HeroType {Mage, Thief, Fighter}

public class Hero {
	private int nAttackRank;
	private int nDefenseRank;
	private int nHitPoints;
	private int nInitiative;
	private int nInitialHitPoints;
	
	public HeroType nType;
	
	public Hero (HeroType nType)
	{
		this.nType = nType;
		switch (nType) {
		case Mage:
			this.nHitPoints = (int)(Math.random()*30)+51;
			this.nInitiative = (int)(Math.random()*20)+20;
			this.nAttackRank = (int)(Math.random()*35)+95;
			this.nDefenseRank = (int)(Math.random()*9)+10;
			break;
		case Fighter:
			this.nHitPoints = (int)(Math.random()*15)+71;
			this.nInitiative = (int)(Math.random()*10)+50;
			this.nAttackRank = (int)(Math.random()*15)+30;
			this.nDefenseRank = (int)(Math.random()*9)+20;
			break;
		case Thief:
			this.nHitPoints = (int)(Math.random()*15)+86;
			this.nInitiative = (int)(Math.random()*15)+25;
			this.nAttackRank = (int)(Math.random()*15)+40;
			this.nDefenseRank = (int)(Math.random()*6)+29;
			break;
		}
	}
	public int getNumAttacksPerturn()
	{
		switch (nType) 
		{
		case Mage:
			return 1;
		case Fighter:
			return 2;
		case Thief:
			return 3;
		}
		return nAttackRank;
	}
	public boolean isDead()
	{
		if (getHit()<=0)
		{
			return true;
		}
		else
			return false;
	}
	public void ressurect()
	{
		setHit(nInitialHitPoints);
	}
	public int getAttack()
	{
		return nAttackRank;
	}
	public int getInitiative()
	{
		return nInitiative;
	}
	public int getDefense()
	{
		return nDefenseRank;
	}
	public int getHit()
	{
		return nHitPoints;
	}
	protected void setHit (int nVal)
	{
		nHitPoints += nHitPoints * (nVal/100);
	}
	protected void setInitiative(int nVal)
	{
		nInitiative += nInitiative *(nVal/100);
	}
	protected void setAttack(int nVal)
	{
		nAttackRank += nAttackRank *(nVal/100);
	}
	protected void setDefense(int nVal)
	{
		nDefenseRank += nDefenseRank * (nVal/100);
	}
	public void defend(Hero obOther)
	{ 
		
	}
	public String toString()
	{
		return String.format("Class %s \nHitpoints %d\nAttack %d \nDefence %d\ninitiative %d",nType.toString(),getHit(),getAttack(),getDefense(),getInitiative());
	}
}
	
	class Elf extends Hero{
		String sName;
		
		public Elf(String sName, HeroType nType)
		{
			super(nType);
			
			this.sName = sName;
			
			super.setHit(-10);
			super.setDefense(5);
			super.setAttack(-5);
			super.setInitiative(5);
		}
		public String toString()
		{
			return super.toString();
		}
	}
	class Dwarf extends Hero {
		String sName;
		
		public Dwarf(String sName, HeroType nType)
		{
			super(nType);

			super.setHit(10);
			super.setDefense(-15);
			super.setAttack(10);
			super.setInitiative(5);
		}
		public String toString()
		{
			return this.nType.toString()+"Dwarf";
		}
	}
	class Hobbit extends Hero {
		String sName;
		
		public Hobbit(String sName, HeroType nType)
		{
			super(nType);

			super.setHit(-15);
			super.setDefense(20);
			super.setAttack(-20);
			super.setInitiative(15);
		}
		public String toString()
		{
			return this.nType.toString()+"Hobbit";

		}
	}
	class Human extends Hero {
		String sName;
		public Human(String sName, HeroType nType)
		{
			super(nType);
			super.setHit(0);
			super.setDefense(0);
			super.setAttack(0);
			super.setInitiative(0);
		}
		public String toString()
		{
			return this.nType.toString()+"Human";

			
		}
	}

