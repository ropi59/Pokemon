
public class PokemonEau extends Pokemon{
	
	//type of pokemon
	private String type = "eau";
	
	//constructeurs
	public PokemonEau() {

	}
	
	public PokemonEau(String nom, int health, int attack, String type) {
		super(nom, health, attack, type);
		
	}
	
	//method to attack
	public int attaquer(Pokemon p) {
		System.out.println("attaque eau!");
		int hp = p.getHealth();
		int atk = getAttack();
			if (p.getType().equals ("feu")) {
				atk = (atk*2);
			} else if (p.getType().equals ("plant") || p.getType().equals ("eau")) {
				atk = (atk/2);
			}
		hp -= atk;
		p.setHealth(hp);
		return p.getHealth();
	}

	@Override
	public String toString() {
		return "PokemonEau [nom=" + super.getNom() + ", health=" + super.getHealth() + ", attack=" + super.getAttack() + ", type=" + type + ", isDead="
				+ super.isDead() + "]";
	}
}
