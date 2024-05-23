package revisao03;

import javax.swing.*;

public class MiniJogoDaVelha {
	String jogoDaVelha[][] = new String [3][3];
	String interfaceJogo;
	int parImpar = 0;
	
	Player p1 = new Player();
	Player p2 = new Player();
	
	
	void gerarFront() {		
		for(int colum = 0; colum <= 2; colum++) {
			for(int row = 0; row <= 2;row++) {
				if(getJogoDaVelha(colum,row) == null) {
					setJogoDaVelha(" ",colum,row);	
				}				
			}
		}
		
		interfaceJogo = "Player X : "+ p1.nome + " " + p1.score + "\n" +
						"Player O : "+ p2.nome + " " + p2.score + "\n\n" +		
						"      1-" + "     2-" + "     3-\n"+
						"4- [  " +  getJogoDaVelha(0, 0) + "  ]" + "[  " +  getJogoDaVelha(0, 1) + "  ]" + "[  " +  getJogoDaVelha(0, 2) + "  ]\n" +
						"5- [  " +  getJogoDaVelha(1, 0) + "  ]" + "[  " +  getJogoDaVelha(1, 1) + "  ]" + "[  " +  getJogoDaVelha(1, 2) + "  ]\n" +
						"6- [  " +  getJogoDaVelha(2, 0) + "  ]" + "[  " +  getJogoDaVelha(2, 1) + "  ]" + "[  " +  getJogoDaVelha(2, 2) + "  ]\n";			
	}
	
	void escolherPosicao() {
		int escolhaColuna;
		int escolhaLinha;
		p1.nome = "Willian";
		p1.score = 100;
		
		p2.nome = "Maria";
		p2.score = 100;
		
		this.gerarFront();
		
		escolhaColuna = Integer.parseInt(JOptionPane.showInputDialog(interfaceJogo + "\n\nEscolha a COLUNA desejada: (1, 2 ou 3)"));
		while(escolhaColuna <1 || escolhaColuna >3) {
			escolhaColuna = Integer.parseInt(JOptionPane.showInputDialog(interfaceJogo + "\n\nNumero Invalido!\nDigite novamente:\n(1, 2 ou 3)"));			
		}		
		escolhaLinha = Integer.parseInt(JOptionPane.showInputDialog(interfaceJogo + "\n\nEscolha a LINHA desejada: (4, 5 ou 6)"));
		while(escolhaLinha <4 || escolhaLinha >6) {
			escolhaLinha = Integer.parseInt(JOptionPane.showInputDialog(interfaceJogo + "\n\nNumero Invalido!\nDigite novamente:\n(4, 5 ou 6)"));	
		}
		
		escolhaColuna -= 1;	
		switch(escolhaLinha) {
		case 4:
			escolhaLinha = 0;
			break;
		case 5:
			escolhaLinha = 1;
			break;
		case 6:
			escolhaLinha = 2;
			break;
		}	
		if(parImpar%2 == 0) {
			setJogoDaVelha("X", escolhaColuna, escolhaLinha);
		}else {
			setJogoDaVelha("O", escolhaColuna, escolhaLinha);
		}
	}

	public String getJogoDaVelha(int coluna, int linha) {
		return this.jogoDaVelha[coluna][linha];
	}
	public void setJogoDaVelha(String valor, int coluna, int linha) {
		this.jogoDaVelha[coluna][linha] = valor;
	}
	
}
