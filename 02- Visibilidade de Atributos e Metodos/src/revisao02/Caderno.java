package revisao02;

import javax.swing.*;

public class Caderno {
	String linhas[] = new String[15];
	String pagina;
	int contMenu = 0;
	
	void pgBranco() {		
		for(int cont = 0; cont < 15 ; cont++) {
			linhas[cont] = "\n" + (cont + 01) +"-___________________________________" ;
		}
	}
	
	void mostrarPg() {
		JOptionPane.showMessageDialog(null,pagina);
	}
	
	void gerarPg(){
		pagina = "";
		for(int cont = 0; cont < 15 ; cont++) {
			pagina+=linhas[cont];			
		}
	}

  	void escrever() {
  		String txt;
  		int quantLinhas;
  		int numlinha; 
  		
  		gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nEm qual linha deseja escrever?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		txt = "\n" + numlinha +"-";
		txt += JOptionPane.showInputDialog("Escreva aqui:");
		quantLinhas = txt.length();		
		for(int cont = quantLinhas; cont < 40 ; cont++) {
			txt+= "_";
		}
		linhas[numlinha - 1] = txt;
		
		gerarPg();
		mostrarPg();
	}
  	
  	void editarLinha() {
  		int numlinha; 
  		
  		gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nEm qual linha voce deseja Editar?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		
  		linhas[numlinha - 1] = JOptionPane.showInputDialog("Edite o texto:", linhas[numlinha - 1]);
		
		gerarPg();
		mostrarPg();
  	}
  	
  	void apagarLinha() {
  		int numlinha; 
  		
  		gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nEm qual linha voce deseja Apagar?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		
  		linhas[numlinha - 1] = "\n" + (numlinha) +"-___________________________________";
		
		gerarPg();
		mostrarPg();
	}
  	
  	void apagarTudo() {
  		int escolha; 
  		escolha = Integer.parseInt(JOptionPane.showInputDialog("Tem certeza que deseja apagar tudo?\n\n1- SIM\n2- NAO"));
  		while(escolha != 1 || escolha != 2) {
  			escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha invalida\nDigite novamente:\n\n1- SIM\n2- NAO"));
  		}
  		if(escolha == 1) {
  			pgBranco();
  	  		gerarPg();
  		}else {
  			menu();
  		}
  		
  	}
	
  	void menu() {
  		int escolha;
  		String txtMenu;
  		if(contMenu == 0 ) {
  			pgBranco();
  		}
  		contMenu++;
  		
  		gerarPg();
  		escolha = Integer.parseInt(JOptionPane.showInputDialog(pagina + "\n\n\nEscolha uma ação));
  		
  		/*
  		 txtMenu+="---------------Menu---------------";
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="
txtMenu+="

  		 */
  	}
}