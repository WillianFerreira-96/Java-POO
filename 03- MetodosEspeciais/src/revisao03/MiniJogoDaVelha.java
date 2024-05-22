package revisao03;

import javax.swing.*;

public class MiniJogoDaVelha {
	private int scoreP1, scoreP2;
	private String jogoDaVelha[][] = new String [3][3];
	private String interfaceJogo = "";
	
	void gerarFront() {
		setjogoDaVelha("[      ]", 0, 0);setjogoDaVelha("[      ]", 1, 0);setjogoDaVelha("[      ]", 2, 0);
		setjogoDaVelha("[      ]", 0, 1);setjogoDaVelha("[      ]", 1, 1);setjogoDaVelha("[      ]", 2, 1);
		setjogoDaVelha("[      ]", 0, 2);setjogoDaVelha("[      ]", 1, 2);setjogoDaVelha("[      ]", 2, 2);
		
		interfaceJogo = getjogoDaVelha(0,0) + getjogoDaVelha(1,0) + getjogoDaVelha(2,0) + "\n" +
						getjogoDaVelha(0,1) + getjogoDaVelha(1,1) + getjogoDaVelha(2,1) + "\n" +
						getjogoDaVelha(0,2) + getjogoDaVelha(1,2) + getjogoDaVelha(2,2);
		JOptionPane.showInputDialog(interfaceJogo);
	}
	
	public int getScoreP2() {
		return this.scoreP2;
	}
	public void setScoreP2(int addScore) {
		this.scoreP2 = addScore;
	}
	public int getScoreP1() {
		return this.scoreP1;
	}
	public void setScoreP1(int addScore) {
		this.scoreP1 = addScore;
	}
	public String getjogoDaVelha(int coluna, int linha) {
		return this.jogoDaVelha[coluna][linha];
	}
	public void setjogoDaVelha(String valor, int coluna, int linha) {
		this.jogoDaVelha[coluna][linha] = valor;
	}
	
}
