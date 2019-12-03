package game;

public class GameTest {

	public static void main(String[] args) {
		Elf[] ElfMage = new Elf[3];
	
		
		for(int i = 0;ElfMage.length>i;i++)
		{
			ElfMage[i] = new Elf("name"+i,HeroType.Mage);
		}
		for (Elf x:ElfMage) {
		System.out.println(x.toString());
		System.out.println();
		}
		
	
		

	}
}
