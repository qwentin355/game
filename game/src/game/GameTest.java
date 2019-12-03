
package game;
public class GameTest 
{
	public static void main(String[] args) 
	{
//		Elf Harry = new Elf("Harry",HeroType.Thief);
//		Human Bary = new Human ("Barry",HeroType.Mage);
//
//		while(!Bary.isDead()&&!Harry.isDead())
//		{
//			for (int i =0;i<Bary.getNumAttacksPerturn();i++)
//			{
//				Harry.defend(Bary);
//				System.out.println(Harry.toString());
//				System.out.println();
//			}
//			for (int i =0;i<Harry.getNumAttacksPerturn();i++)
//			{
//				Bary.defend(Harry);
//				System.out.println(Bary.toString());
//				System.out.println();
//			}
//		}
//		
		
		
				Hero[] Heros = new Hero[36];
		
				int count = 0;
				for(int i = 0;i<=9;i++)
				{
					count++;
					if(count>2)
					{
						count=0;
					}
					Heros[i] = new Elf("Elf"+i,HeroType.getHero(count));
				}
				for (int i =10;i<=18;i++) 
				{
					count++;
					if(count>2)
					{
						count=0;
					}
					Heros[i] = new Dwarf("Dwarf"+(i-10),HeroType.getHero(count));
				}
				for (int i =19;i<=27;i++) 
				{
					count++;
					if(count>2)
					{
						count=0;
					}
					Heros[i] = new Human("Human"+(i-19),HeroType.getHero(count));
				}
				for (int i = 28;i<36;i++)
				{
					count++;
					if(count>2)
					{
						count=0;
					}
					Heros[i] = new Hobbit("Hobbit"+(i-28),HeroType.getHero(count));
				}
		
				for (Hero x: Heros)
				{
					System.out.println(x.toString());
					System.out.println();
		
					for(int i = 0; i<Heros.length;i++)
					{
						Hero_battleRound(x,Heros[i]);
					}
				}
			}
			public static void Hero_battleRound(Hero obHero1, Hero obHero2)
			{
				if (obHero1.getInitiative()>obHero2.getInitiative())
				{
					while(obHero1.getHit()>0 && obHero2.getHit()>0)
					{
						for(int i = 0;i<=obHero1.getNumAttacksPerturn();i++)
						{
							obHero2.defend(obHero1);
						}
						for (int i = 0; i<obHero2.getNumAttacksPerturn();i++)
						{
							obHero1.defend(obHero2);
						}
					}
				}
				else if (obHero1.getInitiative()<obHero2.getInitiative())
				{
					while(obHero1.getHit()>0 && obHero2.getHit()>0)
					{
						for (int i = 0; i<obHero2.getNumAttacksPerturn();i++)
						{
							obHero1.defend(obHero2);
						}
						for(int i = 0;i<=obHero1.getNumAttacksPerturn();i++)
						{
							obHero2.defend(obHero1);
						}
					}
				}
				else 
				{
					while(obHero1.getHit()>0 && obHero2.getHit()>0)
					{
						for (int i = 0; i<obHero2.getNumAttacksPerturn();i++)
						{
							obHero1.defend(obHero2);
						}
						for(int i = 0;i<=obHero1.getNumAttacksPerturn();i++)
						{
							obHero2.defend(obHero1);
						}
					}
				}
				if(obHero1.isDead())
				{
					System.out.println(obHero2.toString());
				}
				else
				{
					System.out.println(obHero1.toString());
				}
	}
}

