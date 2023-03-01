public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principe principe = new Principe();
		Bruja bruja = new Bruja();
		VidaPersonajePrincipe vidaPersonajePrincipe = new VidaPersonajePrincipe(92);
		
		principe.Moverse();
		principe.Mision();
		principe.Atacar();
		System.out.println("-----------------------");
		bruja.Moverse();
		bruja.Mision();
		bruja.Atacar();
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");

		System.out.println(vidaPersonajePrincipe);
		System.out.println("La vida de la armadura del principe es: " + vidaPersonajePrincipe.getVidaArmadura());
		vidaPersonajePrincipe.setVidaArmadura(120);
		vidaPersonajePrincipe.setCantidadVida(130);
		System.out.println("La cantidad de vida ha sido modificada");
		System.out.println(vidaPersonajePrincipe);
		System.out.println("La vida de la armadura del principe es: " + vidaPersonajePrincipe.getVidaArmadura());
		System.out.println("La cantidad de vida sin armadura del principe fue modificada a: " + vidaPersonajePrincipe.laCantidadDeVida());
		

	}

}

abstract class Personajes{
	
	
	void Moverse() {
		System.out.println("Me dirijo al combate");
	}
	
	abstract void Atacar(); 
	
	abstract void Mision(); 
		
		
}

class Principe extends Personajes{
	
	void Moverse() {
		System.out.println("Hola, soy el principe");
		super.Moverse();
	}
	
	void Atacar() {
		
		System.out.println("Con mi caballo y mi espada ralizare mi ataque");
		
	}
	
	void Mision(){
		
		System.out.println("Mi mision es derrivar la torre de mi oponente");
	}
	
}

class Bruja extends Personajes{
	
	void Moverse() {
		System.out.println("Hola, soy la bruja");
		super.Moverse();
	}
	
	void Atacar() {
		
		
	}
	
	void Mision(){
		
		System.out.println("Mi mision es defender la torre del rey ");
	}
	
	
}

class vidaPersonaje{
	
	private int cantidadVida;
	
	vidaPersonaje(int cantidadVida){
		this.cantidadVida = cantidadVida; 
	}
	
	public int laCantidadDeVida(){
		return cantidadVida;
	}
	
	public void setCantidadVida(int cantidadVida) {
		this.cantidadVida = cantidadVida;
		
	}
	
}

class VidaPersonajePrincipe extends vidaPersonaje{
	
	private int vidaArmadura=100;
	
	VidaPersonajePrincipe(int cantidadVida){
		super(cantidadVida);
	}
	
	@Override
	public String toString() {
        return "Vida del principe= " + (super.laCantidadDeVida()+vidaArmadura);
    }
	
	public int getVidaArmadura() {
		return vidaArmadura;
	}
	
	public void setVidaArmadura(int vidaArmadura) {
		this.vidaArmadura = vidaArmadura;
	}
	
}
