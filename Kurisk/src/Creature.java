
public class Creature {
	public int Health;
	private int armor;
	private int gold;
	private String name;

	public int getArmor() {
		return armor;
	}
	public int getGold() {
		return gold;
	}
	public String getName() {
		return name;
	}
	public void setHealth(int newValue) {
		Health = newValue;
	}
	public void setArmor(int newValue) {
		armor = newValue;
	}
	public void setGold(int newValue) {
		gold = newValue;
	}
	public void setName(String newName){
		name = newName;
	}
	
}
