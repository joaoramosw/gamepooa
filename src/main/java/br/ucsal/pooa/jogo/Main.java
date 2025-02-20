package br.ucsal.pooa.jogo;

public class Main {

	
	public static void main(String[] args) {
		//Criar 2 personagens
		Personagem guerreiro = new Personagem(100, 8, 12);
		Personagem mago = new Personagem(100, 5, 18);
		//Criar a engine colocar eles para lutar 
		Engine engine = new Engine(guerreiro, mago);
		engine.lutar();
		
	}
}
