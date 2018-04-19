/**Changes made:
 * Changed the pokemonIn variable from 'static int' to just 'int'
 */

public class Pokedex {
	//Creates an array using Pokemon Class 
	Pokemon arrayPm [] = new Pokemon[1];
	//Declares and Initializes variables
	int size = arrayPm.length;
	int pokemonIn = 0;
	//Creates a Pokedex constructor with integer size as the parameters, which is the array length  
	public Pokedex (int size){
		//initializes Pokemon[] array
		this.size = size;
		arrayPm = new Pokemon [size];
	}//closes constructor
	//Creates a method with array of strings  
	public String[] listPokemon (){
		//Creates an array of Strings 
		String[] pokemonNames = new String [pokemonIn];
		//If - else to check the number of pokemons on the array.
		if (pokemonIn == 0){
			//Returns null if there are no pokemons in the list 
			return null;
		}//closes if statement 
		else {
			//Declares and initializes i
			int i = 0;
			//do-while loop to list all the stored pokemons
			do{
				//Accesses the pokemon names stored in Pokemon array  
				pokemonNames[i] = arrayPm[i].getSpecies();
				//Increments i
				i++;
			}while (i < pokemonIn); //Loop runs as long as i is less then pokemonIn
			//Returns the array of Strings of pokemon names 
			return pokemonNames;
		}//closes else statement
	}//Closes listPokemon method
	//Boolean method takes in and stores species in Pokedex using String 
	public boolean addPokemon(String species){
		//Declares and initializes i
		int i = 0;
		//While loop to check if the same pokemon is being added  
		while(i < pokemonIn){
			//If statement checks if the specie being added already exists in the pokemon array
			if(arrayPm[i].getSpecies().equalsIgnoreCase(species)){
				//Prints duplicate if user tries to add same pokemon more than once
				String samePokemon = "Duplicate";
				System.out.println(samePokemon);
				//Returns false if duplicate pokemon is being added 
				return false;
			}//closes if statement
			//Increments i
			i++;
		}//closes while loop
		//If-else to check how many pokemons are stored compare to the array length (size)
		if (pokemonIn < size){
			//Add pokemon to next index of the Pokemon Array
			arrayPm[pokemonIn] = new Pokemon (species);
			//Increment pokemonIn as long as less than size 
			pokemonIn++;
			//Return true for successfully adding the pokemons
			return true;
		}//closes if statement
		else {
			//When the pokemonIn is equal to size, print max 
			System.out.println("max");
			//Returns false as it fails to add the another polemon
			return false;
		}//closes else statement
	}//closes addPokemon method
	//Int array method for pokemons status (attack, defense and speed)
	public int[] checkStats(String species){
		//Declares and initializes variables 
		int nullVal = 0;
		int i = 0;
		//Creates an integer array that has length of 3
		int statsArray [] = new int [3];
		//While loop to check how many pokemons are stored
		while (i < pokemonIn){
			//Checks if the pokemon exists in the Pokemon array
			if (arrayPm[i].getSpecies().equalsIgnoreCase(species)){
				//sets nullVal to 1
				nullVal = 1;
				//Sets the value for attack, defense and speed to specific index respectfully for the pokemon at the i-th index of pokemon array 
				statsArray [0] = arrayPm[i].getAttack();
				statsArray [1] = arrayPm[i].getDefense();
				statsArray [2] = arrayPm[i].getSpeed();
				//Returns integer array
				return statsArray;
			}//Closes if statement
			else{
				//sets nullVal to 0
				nullVal = 0;
			}//closes else statement
			//Increments i
			i++;
		}//closes while look
		//If - else to check nullVal
		if (nullVal == 0){
			//Return null if nullVAl is 0
			return null;
		}//closes if statement 
		else {
			//Return the integer array made of attack, defense and speed when nullVal is not 0
			return statsArray;
		}//closes else statement
	}//closes checkStats method
	//Method that alphabetize the species in the Pokemon array
	public void sortPokemon(){
		//Declares and initializes sort
		String sort = "";
		//nested for loop to get the position of the pokemon in the Pokemon array
		//Referenced from http://www.sanfoundry.com/java-program-sort-names-alphabetical-order/
		for (int i = 0; i < pokemonIn; i++) {
			for (int j = i + 1; j < pokemonIn; j++) {
				//Compares the pokemons at i and j index from Pokemon array 
				if (arrayPm[i].getSpecies().compareToIgnoreCase(arrayPm[j].getSpecies()) > 0) {
					//Sets the pokemons in a ascending sort
					sort = arrayPm[i].getSpecies();
					//Swaps the pokemons 
					arrayPm[i].species = arrayPm[j].getSpecies();
					//Sets the pokemons in alphabetical order 
					arrayPm[j].species = sort;
				}//closes if statement 
			}//closes 2nd for-loop
		}//closes 1st for-loop
	}//closes sort method
}//closes Pokedex class
