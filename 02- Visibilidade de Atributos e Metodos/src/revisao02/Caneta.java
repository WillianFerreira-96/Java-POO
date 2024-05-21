package revisao02;

import javax.swing.*;
import java.util.Random;

public class Caneta {
	//Atributos
	private int carga = 100;
	private boolean tampada = true;
	
	//Metodos	
	protected void escrever() {
		String msg = "";
		if(this.tampada == false && this.carga >= 3) {
			msg += "888    888          888 888               888       888                  888      888 888 \n"; 
			msg += "888    888          888 888               888   o   888                  888      888 888 \n";
			msg += "888    888          888 888               888  d8b  888                  888      888 888 \n";
			msg += "8888888888  .d88b.  888 888  .d88b.       888 d888b 888  .d88b.  888d888 888  .d88888 888 \n";
			msg += "888    888 d8P  Y8b 888 888 d88''88b      888d88888b888 d88''88b 888P'   888 d88' 888 888 \n";
			msg += "888    888 88888888 888 888 888  888      88888P Y88888 888  888 888     888 888  888 Y8P \n";
			msg += "888    888 Y8b.     888 888 Y88..88P      8888P   Y8888 Y88..88P 888     888 Y88b 888  '  \n";
			msg += "888    888  'Y8888  888 888  'Y88P'       888P     Y888  'Y88P'  888     888  'Y88888 888 \n";
			System.out.println(msg);
			this.carga-= 3;
			this.menu();
		}else if(this.tampada == true){
			JOptionPane.showMessageDialog(null, "A Caneta esta Tampada!\n Por favor destampe a caneta!");
			this.menu();
		}else if(this.carga < 3) {
			JOptionPane.showMessageDialog(null, "A Caneta esta com " + this.carga + "% de Tinta!\n Voce precisa de 3% para escrever.");
			this.menu();
		}		
	}
	
	protected void desenhar() {
		String msg = "";
		if(this.tampada == false && this.carga >= 7) {
			Random random = new Random();
			int int_random = random.nextInt(5);			
			switch(int_random){
				case 0:
					msg="";
					msg += "▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n";
					msg += "░░░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀████▀\n";
					msg += "░░░░░░░░░░░░▀█▄█▄███▀░░░▀██▄█▄█▀\n";
					System.out.println(msg);
					this.carga-= 7;
					this.menu();
					break;
				case 1:
					msg="";
					msg += "─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\n";
					msg += "█░░░█░░░░░░░░░░▄▄░██░█\n";
					msg += "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█\n";
					msg += "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█\n";
					msg += "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀\n";
					System.out.println(msg);
					this.carga-= 7;
					this.menu();
					break;
				case 2:
					msg="";
					msg += "───────────▀▄\n";
					msg += "──█▄▄▄▄▄███▀▄─▄▄\n";
					msg += "▄▀──▀▄─▀▀█▀▀▄▀──▀▄\n";
					msg += "▀▄▀▀█▀▀████─▀▄──▄▀\n";
					msg += "──▀▀──────────▀▀\n";
					System.out.println(msg);
					this.carga-= 7;
					this.menu();
					break;
				case 3:
					msg = "";
					msg += "░▄▀▀▀▀▄░░▄▄\n";
					msg += "█░░░░░░▀▀░░█░░░░░░▄░▄\n";
					msg += "█░║░░░░██░████████████\n";
					msg += "█░░░░░░▄▄░░█░░░░░░▀░▀\n";
					msg += "░▀▄▄▄▄▀░░▀▀\n";
					System.out.println(msg);
					this.carga-= 7;
					this.menu();
					break;
				case 4: 
					msg = "";
					msg += "──▒▒▒▒▒────▄████▄─────\n";
					msg += "─▒─▄▒─▄▒──███▄█▀──────\n";
					msg += "─▒▒▒▒▒▒▒─�?████──█──█──\n";
					msg += "─▒▒▒▒▒▒▒──█████▄──────\n";
					msg += "─▒─▒─▒─▒───▀████▀─────\n";
					System.out.println(msg);
					this.carga-= 7;
					this.menu();
					break;
			}		
		}else if(this.tampada == true){
			JOptionPane.showMessageDialog(null, "A Caneta esta Tampada!\n Por favor destampe a caneta!");
			this.menu();
		}else if(this.carga < 7) {
			JOptionPane.showMessageDialog(null, "A Caneta esta com " +this.carga+ "% de Tinta!\n Voce precisa de 7% para escrever.");
			this.menu();
		}
	}
	
	protected void tampar() {
		if(this.tampada == false) {
			this.tampada = true;
			JOptionPane.showMessageDialog(null, "Sua Caneta Foi Tampada!");
			this.menu();
		}else {
			JOptionPane.showMessageDialog(null, "A Caneta Ja esta Tampada!");
			this.menu();
		}
	}
	
	protected void destampar() {
		if(this.tampada == true) {
			this.tampada = false;
			JOptionPane.showMessageDialog(null, "Sua Caneta Foi Destampada!");
			this.menu();
		}else {
			JOptionPane.showMessageDialog(null, "A Caneta Ja esta Destampada!");
			this.menu();
		}
	}
	
	public void menu() {
		int op;
		String txt = "";
		String status = "";
		
		if(this.tampada == true) {
			status = "Caneta Tampada";
		}else {
			status = "Caneta Destampada";
		}
		
		txt+= "----------CANETA DIGITAL----------\n";
		txt+= "Escolha uma opcao:\n";
		txt+= "1- Escrever\n";
		txt+= "2- Desenhar\n";
		txt+= "3- Tampar \n";
		txt+= "4- Destampar\n";
		txt+= "0- Sair\n";
		txt+= "\n\nTinta: " + this.carga + "%";
		txt+= "\nStatus: " + status; 
		op = Integer.parseInt(JOptionPane.showInputDialog(txt));
		while(op < 0 || op > 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Valor Invalido! \n Digite Novamente!\n" + txt));
		}
		switch(op) {
			case 0:
				if(this.tampada == false) {
					JOptionPane.showMessageDialog(null, "Tampe a caneta antes de sair!");
					this.menu();
				}else {
					JOptionPane.showMessageDialog(null, "Muito Obrigado! :)\n Bye Bye!");
				}
			break;	
			case 1:
				escrever();
			break;
			case 2:
				desenhar();
			break;
			case 3:
				tampar();
			break;
			case 4:
				destampar();
			break;
		}
		
	}
}
