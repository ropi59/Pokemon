
public class Pokemon {

	//attributs
	private String nom;
	private int health;
	private int attack;
	private String type;
	private boolean isDead;
	
	//constructeurs
	public Pokemon() {
		
	}

	public Pokemon(String nom, int health, int attack, String type) {
		this.nom = nom;
		this.health = health;
		this.attack = attack;
		this.type = type;
	}
	
	//method to verif if pokemon is dead
	public boolean isDead() {
		if (this.health <= 0) {
			this.isDead = true;
		}return this.isDead;
		
	}
	
	//method to attack
	public int attaquer(Pokemon p) {
		System.out.println("attaque griffe!");
		p.health -= this.attack;
		return p.health;
	}

	//getters setters
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	@Override
	public String toString() {
		return "Pokemon [nom=" + nom + ", health=" + health + ", attack=" + attack + ", type=" + type + ", isDead="
				+ isDead + "]";
	}

	
	
	
}
