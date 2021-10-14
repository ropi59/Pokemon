
public class PokemonFeu extends Pokemon{
	
	//type of pokemon
	private String type = "feu";
	
	//constructeurs
	public PokemonFeu() {

	}
	
	public PokemonFeu(String nom, int health, int attack, String type) {
		super(nom, health, attack, type);
		
	}
	
	//method to attack
	public int attaquer(Pokemon p) {
		System.out.println("attaque feu!");
		int hp = p.getHealth();
		int atk = getAttack();
			if (p.getType().equals ("plant")) {
				atk = (atk*2);
			} else if (p.getType().equals ("feu") || p.getType().equals ("eau")) {
				atk = (atk/2);
			}
		hp -= atk;
		p.setHealth(hp);
		return p.getHealth();
	}

	@Override
	public String toString() {
		return "PokemonFeu [nom=" + super.getNom() + ", health=" + super.getHealth() + ", attack=" + super.getAttack() + ", type=" + type + ", isDead="
				+ super.isDead() + "]";
	}

}
