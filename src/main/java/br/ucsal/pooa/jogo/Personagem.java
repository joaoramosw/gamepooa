package br.ucsal.pooa.jogo;

public class Personagem {

	
	private Integer vida;
	private Integer defesa;
	private Integer ataque;
	
	
	
	public Personagem(Integer vida, Integer defesa, Integer ataque) {
		super();
		this.vida = vida;
		this.defesa = defesa;
		this.ataque = ataque;
	}
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getDefesa() {
		return defesa;
	}
	public void setDefesa(Integer defesa) {
		this.defesa = defesa;
	}
	public Integer getAtaque() {
		return ataque;
	}
	public void setAtaque(Integer ataque) {
		this.ataque = ataque;
	}
	
	
	
}
