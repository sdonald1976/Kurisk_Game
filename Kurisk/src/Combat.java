public class Combat {
	public Creature _player;
	public static Creature mob;
	
    public Combat(Creature _sentPlayer)
    {
        _player = _sentPlayer;
        mob = new Creature();
        getThisInfo();
        Fight();
    }
    public Combat(Creature _sentPlayer, Creature _sentMonster)
    {
        _player = _sentPlayer;
        mob = _sentMonster;
        Fight();
    }
	public static String getThisInfo() {
		String stagin = Staging.getValue();
		System.out.println("This is in Combat. My enemy should be " + stagin);
		System.out.println(stagin);
		switch (stagin) {
			case "Kobold":
				System.out.println("You got Kobold");
				mob.setHealth(15);
				mob.setGold(9);
				mob.setArmor(3);
				mob.setName("Arnie, the Kobold");
				System.out.println(mob.Health + " " + mob.getName());
			break;
			case "Orc":
				System.out.println("You got Orc");
				mob.setHealth(15);
				mob.setGold(9);
				mob.setArmor(3);
				mob.setName("Hanz, the Orc");
				System.out.println(mob.Health + " " + mob.getName());
			break;
			case "Troll":
				System.out.println("You got Troll");
				mob.setHealth(15);
				mob.setGold(9);
				mob.setArmor(3);
				mob.setName("Frederick, the Troll");
				System.out.println(mob.Health + " " + mob.getName());
			break;
			case "Dragon":
				System.out.println("You got Dragon");
				mob.setHealth(15);
				mob.setGold(9);
				mob.setArmor(3);
				mob.setName("Roger, the Dragon");
				System.out.println(mob.Health + " " + mob.getName());
			break;
		}
		return stagin;
		
		
	} // is this where I would start? 
	public void Fight()
	{
	    if (_player != null && mob != null)
	    {
	        while(_player.Health > 0 && mob.Health > 0)
	        {
	           mob.Health--;
	           _player.Health--;
	           System.out.println(mob.getName() + " is at " + mob.Health + " left");
	           System.out.println(_player.getName() + " has only " + _player.Health + " health left!");
	        }
	    }else { System.out.println("Something fucked up."); }
	}
}