
public class PokemonFeu extends Pokemon{
	
	//type of pokemon
	private String type = "feu";
	
	//constructeurs
	public PokemonFeu() {
		super();
	}
	
	public PokemonFeu(String nom, int health, int attack, String type) {
		super(nom, health, attack);
		this.type = type;
	}
	
	//method to attack
	public int attaquer(Pokemon p) {
		System.out.println("attaque feu!");
		//super(p.getHealth(), getAttack());
		int hp = p.getHealth();
		int atk = getAttack();
		hp -= atk;
		p.setHealth(hp);
		return p.getHealth();
	}

	@Override
	public String toString() {
		return "PokemonFeu [type=" + type + ", isDead()=" + isDead() + ", getNom()=" + getNom() + ", getHealth()="
				+ getHealth() + ", getAttack()=" + getAttack() + "]";
	}
	
	
}
