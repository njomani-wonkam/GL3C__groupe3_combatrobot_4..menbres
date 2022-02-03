package cmr.nouveau.combat;

public class Robot_0 {
	
	private String nom;
	private int vie;
	private int attack;
	
	public Robot_0(String nom, int vie, int attack){
		this.nom = nom;
		this.vie = vie;
		this.attack = attack;
	}
	
	public void fire(int fire){
		this.vie -= fire;
		
	}
	
		
public void isDead(int vie){
		
		if (getVie() == 0) {
			
			System.out.println(nom + " est mort");
		}
		
	}

	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	private String name;
	private int attack;
	private int health;
	
	public Robot(String name, int attack, int health){
		this.name = name;
		this.attack = attack;
		this.health = health;
	}

	public String getName() {
		return name;
	}
	
	// Methode pour retirer les points de vie d'un joueur
	public void domage(int domage){
		
		this.health -= domage;
		
		System.out.println(name + " vient de subir " + domage + " point de dégat");
		
		
	}
	
	
	//////////////////////////////////////////////////

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	 */
	 
	
	
}
