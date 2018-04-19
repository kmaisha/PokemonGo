
public class Pokemon {
	//declares and initializes variables 
	String species = "";
	int attack = 0;
	int defense = 0;
	int speed = 0;
	//Constructs a Pokemon object with species 
	public Pokemon (String species){
		this.species = species;
		//Calculates attack
		attack = ((species.length() * 4) + 2);
		//Calculates defense
		defense = ((species.length() * 2) + 7);
		//Calculates speed
		speed = ((species.length() * 3) + 5);	
	}
	//This method increases attack by given boost
	public void grow (int boost){
		attack += boost;
	}
	//This method increases defense by given boost
	public void harden (int boost){
		defense += boost;
	}
	//This method increases speed by given boost
	public void haste (int boost){
		speed += boost;
	}
	//String method retrieves Specie names
	public String getSpecies(){
		return species;
	}
	//String method sets Specie names to the attributed value
	public void setSpecies(String spc){
		species = spc;
	}
	//Retrieves integer attack value 
	public int getAttack(){
		return attack;
	}
	//Sets integer attack value to the attributed value
	public void setAttack(int atk){
		attack = atk;
	}
	//Retrieves integer defense value
	public int getDefense(){
		return defense;
	}
	//Sets integer defense value to the attributed value
	public void setDefense(int def){
		defense = def;
	}
	//Retrieves integer speed value
	public int getSpeed(){
		return speed;
	}
	//Sets integer speed value to the attributed value
	public void setSpeed(int spd){
		speed = spd;
	}

}
