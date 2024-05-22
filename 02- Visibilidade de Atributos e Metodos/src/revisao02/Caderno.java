package revisao02;

import javax.swing.*;

public class Caderno {
	private String linhas[] = new String[15];
	private String pagina;
	private int contMenu = 0;
	
	private void pgBranco() {		
		for(int cont = 0; cont < 15 ; cont++) {
			this.linhas[cont] = "\n" + (cont + 01) +"-___________________________________" ;
		}
	}
	
	private void gerarPg(){
		this.pagina = "";
		for(int cont = 0; cont < 15 ; cont++) {
			this.pagina+=this.linhas[cont];			
		}
	}

  	protected void escrever() {
  		String txt;
  		int quantLinhas;
  		int numlinha; 
  		
  		this.gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nEm qual linha deseja escrever?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		txt = "\n" + numlinha +"- ";
		txt += JOptionPane.showInputDialog("Escreva aqui:");
		quantLinhas = txt.length();		
		for(int cont = quantLinhas; cont < 40 ; cont++) {
			txt+= "_";
		}
		this.linhas[numlinha - 1] = txt;
		
		this.gerarPg();
		this.menu();
	}
  	
  	protected void editarLinha() {

  		int numlinha; 
  		
  		this.gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nEm qual linha voce deseja Editar?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		
  		String txtTest = "\n" + JOptionPane.showInputDialog("Edite o texto:", linhas[numlinha - 1]);
  		this.linhas[numlinha - 1] = limitaString(txtTest, 40);
  		
  		this.gerarPg();
  		this.menu();
  	}
  	
  	String limitaString(String texto, int maximo){
		   if (texto.length() <= maximo){
		      return texto;
		   }else{
		      return texto.substring(0, maximo);
		   }
		}
  	
  	protected void apagarLinha() {
  		int numlinha; 
  		
  		this.gerarPg();  		
  		numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nEm qual linha voce deseja Apagar?"));
  		while(numlinha<1 || numlinha>15) {
  			numlinha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nNumero da linha invalido\nDigite novamente:"));
  		}
  		
  		this.linhas[numlinha - 1] = "\n" + (numlinha) +"-___________________________________";
		
  		this.gerarPg();
  		this.menu();
	}
  	
  	protected void apagarTudo() {
  		int escolha; 
  		escolha = Integer.parseInt(JOptionPane.showInputDialog("Tem certeza que deseja apagar tudo?\n\n1- SIM\n2- NAO"));
  		while(escolha < 1 || escolha > 2) {
  			escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha invalida\nDigite novamente:\n\n1- SIM\n2- NAO"));
  		}
  		if(escolha == 1) {
  			pgBranco();
  	  		gerarPg();  	  		
  		}
  		this.menu();
  	}
	
  	protected void menu() {
  		int escolha;
  		String txtMenu;
  		if(this.contMenu == 0 ) {
  			pgBranco();
  			gerarPg();
  			this.contMenu++;
  		}
  		
  		txtMenu= "\n\n\n---------------Menu---------------\n";
  		txtMenu+="1- Escrever\n";
  		txtMenu+="2- Editar Linha\n";
  		txtMenu+="3- Apagar Linha\n";
  		txtMenu+="4- Apagar Tudo\n";
  		txtMenu+="0- Sair\n";
  		
  		escolha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + txtMenu + "\nEscolha uma opcao:"));
  		while(escolha<0 || escolha>4) {
  			escolha = Integer.parseInt(JOptionPane.showInputDialog(this.pagina + "\n\n\nEscolha invalida\nDigite novamente:"));
  		}
  		
  		switch(escolha) {
  		case 1:
  			this.escrever();
  			break;
  		case 2:
  			this.editarLinha();
  			break;
  		case 3:
  			this.apagarLinha();
  			break;
  		case 4:
  			this.apagarTudo();
  			break;
  		case 0:
  			JOptionPane.showMessageDialog(null, "Bye Bye! Muito Obrigado ;)");
  			break;
  		}
  		
  	}
}