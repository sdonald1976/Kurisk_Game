import java.util.Random;

public class Staging {
	String test = getValue();

	public static String getValue() {
		Creature human = new Creature();
		human.setHealth(20);
		human.setGold(30);
		human.setArmor(6);
		human.setName("bob");
		System.out.println(human.Health + " " + human.getName());

		Random random = new Random();
		int mobNum = random.nextInt(100);
		String opponent = null;
		if (mobNum >= 0 && mobNum <= 30) {
			opponent = "Kobold";
			System.out.println("This is " + opponent);
		} else if (mobNum >= 31 && mobNum <= 60) {
			opponent = "Orc";
			System.out.println("This is " + opponent);
		} else if (mobNum >= 61 && mobNum <= 90) {
			opponent = "Troll";
			System.out.println("This is " + opponent);
		} else if (mobNum >= 91 && mobNum <= 100) {
			opponent = "Dragon";
			System.out.println("This is " + opponent);
		} else {
			System.out.println("Something must have gone wrong...");
		}

//		System.out.println("This is " + opponent + " 2.");
		return opponent;
	}
}

