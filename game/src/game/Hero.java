package game;

enum HeroType {
	Mage, Thief, Fighter;

	private static HeroType[] list = HeroType.values();

	public static HeroType getHero(int i) {
		return list[i];
	}
}

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
			nHitPoints = (int)(Math.random()*30)+51;
			nInitiative = (int)(Math.random()*20)+20;
			nAttackRank = (int)(Math.random()*35)+95;
			nDefenseRank = (int)(Math.random()*9)+10;
			nInitialHitPoints = nHitPoints;
			break;
		case Fighter:
			nHitPoints = (int)(Math.random()*15)+71;
			nInitiative = (int)(Math.random()*10)+50;
			nAttackRank = (int)(Math.random()*15)+30;
			nDefenseRank = (int)(Math.random()*9)+20;
			nInitialHitPoints = nHitPoints;
			break;
		case Thief:
			nHitPoints = (int)(Math.random()*15)+86;
			nInitiative = (int)(Math.random()*15)+25;
			nAttackRank = (int)(Math.random()*15)+40;
			nDefenseRank = (int)(Math.random()*6)+29;
			nInitialHitPoints = nHitPoints;
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
		return 1;
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
		nHitPoints = nInitialHitPoints;
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
		nHitPoints += nVal;
	}
	protected void setInitiative(int nVal)
	{
		nInitiative += nInitiative * (nVal/100);
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
		if(obOther.getAttack()>this.getDefense())
		{
			this.setHit(-(obOther.getAttack()-this.getDefense()));
		}
		else
		{	
			this.setHit(-1);
		}
		
	}


	public String toString()
	{
		return String.format("\nClass %s \nHitpoints %d\nAttack %d \nDefence %d\ninitiative %d",nType.toString(),getHit(),getAttack(),getDefense(),getInitiative());
	}
}

class Elf extends Hero{

	String sName;

	public Elf(String sName, HeroType nType)
	{
		super(nType);

		this.sName = sName;

		super.setHit((int)-10/100);
		super.setDefense(5);
		super.setAttack(-5);
		super.setInitiative(5);

	}
	public String toString()
	{
		return sName + super.toString();
	}
}
class Dwarf extends Hero {
	String sName;

	public Dwarf(String sName, HeroType nType)
	{
		super(nType);
		this.sName = sName;

		super.setHit((int)10/100);
		super.setDefense(-15);
		super.setAttack(10);
		super.setInitiative(5);
	}
	public String toString()
	{
		return sName + super.toString();
	}
}
class Hobbit extends Hero {
	String sName;

	public Hobbit(String sName, HeroType nType)
	{
		super(nType);
		this.sName = sName;

		super.setHit((int)-15/100);
		super.setDefense(20);
		super.setAttack(-20);
		super.setInitiative(15);
	}
	public String toString()
	{
		return sName + super.toString();
	}
}
class Human extends Hero {
	String sName;
	public Human(String sName, HeroType nType)
	{
		super(nType);
		this.sName = sName;

		super.setHit(0);
		super.setDefense(0);
		super.setAttack(0);
		super.setInitiative(0);
	}
	public String toString()
	{
		return sName + super.toString();
	}
}

