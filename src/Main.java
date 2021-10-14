
public class Main {

	public static void main(String[] args) {

		PokemonEau p1 = new PokemonEau("Tortank", 100, 10, "eau");
		PokemonFeu p2 = new PokemonFeu("Dracofeu", 90, 20, "feu");
		PokemonPlant p3 = new PokemonPlant("Bulbizarre", 120, 5, "plante");
		Pokemon p4 = new Pokemon("Roucarnage", 150, 30);
		
		System.out.println(p1);
		p2.attaquer(p1);
		p1.isDead();
		
		System.out.println(p1);
	}

}
