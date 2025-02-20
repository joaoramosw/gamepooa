package br.ucsal.pooa.jogo;

public class Engine {

	private Personagem p1;
	private Personagem p2;
	
	
	
	public Engine(Personagem p1, Personagem p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	



	public void lutar() {
		Personagem ataque = this.p1;
		Personagem defesa = this.p2;
		Personagem change;
		
		
		
		while (p1.getVida()>0 && p2.getVida()>0) {
			Integer dano = (ataque.getAtaque()-defesa.getDefesa());
			defesa.setVida(defesa.getVida() - dano);
			change = ataque;
			ataque = defesa;
			defesa = change;
		}
		
		
		if(p1.getVida()<=0) {
			System.out.println("P2 WIN");
		}else {
			System.out.println("P1 WIN");
		}
		
	}
}
