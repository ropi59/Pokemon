
public class Main {

	public static void main(String[] args) {

		//pokemons creation
		PokemonEau p1 = new PokemonEau("Tortank", 100, 10, "eau");
		PokemonFeu p2 = new PokemonFeu("Dracofeu", 90, 50, "feu");
		PokemonPlant p3 = new PokemonPlant("Bulbizarre", 90, 5, "plant");
		Pokemon p4 = new Pokemon("Roucarnage", 150, 30, "normal");
		
		//test pokemon fights
		System.out.println(p1);
		p2.attaquer(p1);
		p1.isDead();
		
		System.out.println(p1);
		
		System.out.println(p3);
		p2.attaquer(p3);
		System.out.println(p3);
	}

}
