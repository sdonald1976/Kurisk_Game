import java.util.ArrayList;
import java.util.Random;

public class Main {
	static Creature human = new Creature();

    public static void main(String args[]) throws InterruptedException {
    	//Introduce the Game
    	System.out.println("Welcome to this crappy game. For starters, let's just start with a name.");
    	
		human.setHealth(20);
		human.setGold(30);
		human.setArmor(6);
		human.setName("bob");
    	
    	ArrayList<String> backPack = new ArrayList<>();
    	
 //   	System.out.println(getPlayer.hps + " " + getPlayer.ac + " " + getPlayer.dexterity);
 //   	getPlayer.hps--;
 //   	System.out.println(getPlayer.hps);
    	
 //    	System.out.println("Ok, Tell me your name: ");	
 //   	String input = Input.getUserInput();
 //   	System.out.println("Hello " + input);

    	boolean playing = true;
    	while (playing){
    		System.out.println("You are in the middle of town.\nn | e | s | w\nHPS: " + human.Health);
    		String gameInput = Input.getUserInput();
/**    		if (gameInput.equals("n") || gameInput.equals("north") || gameInput.equals("bakery")) {
    			Bakery getBread = new Bakery();
    			getBread.counter();
    		}else if (gameInput.equals("s") || gameInput.equals("south") || gameInput.equals("armory")) {
        		Armory getEquip = new Armory();
        		getEquip.counter();
    		}else if (gameInput.equals("e") || gameInput.equals("east") || gameInput.equals("woods")) {
           		Woods getMap = new Woods();
           		getMap.forest();
    		}else if (gameInput.equals("w") || gameInput.equals("west") || gameInput.equals("mountains")) {
           		Mountains getMap = new Mountains();
           		getMap.hills();
  //  		}else if (gameInput.equals("fight")) {
  //			Battle kickAss = new Battle();
  //         	kickAss.
    		}else if (gameInput.equals("i") || gameInput.equals("inventory") || gameInput.equals("inv")) {
    			Inventory.print(Inventory.backPack);
    		}else if (gameInput.equals("quit")) {
    			System.out.println("Thanks for playing...");
    			playing = false; 
    		}else if (gameInput.equals("help")) {
    			Help getHelp = new Help();
    			getHelp.assist();
    		}else if (gameInput.equals("xp") || gameInput.equals("exp")) {
    			System.out.println("EXP: " + getPlayer.pxp);
    		}else if (gameInput.equals("score")) {
    			System.out.println("EXP: " + getPlayer.pxp + "  Gold: " + getPlayer.pgold);
    			**/
    			if (gameInput.equals("fight")) {
    			    Combat combat = new Combat(human);
    			}
    			else 
    			{
    			    System.out.println("That was an invalid command.");    		
    		    }
    		}
    }
}
    