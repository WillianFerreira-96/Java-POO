package revisao01;

import javax.swing.*;
import java.util.Random;

public class Caneta {
	//Atributos
	int  carga = 100;
	boolean tampada = true;
	
	//Metodos	
	void escrever() {
		String msg = "";
		if(tampada == false && carga >= 3) {
			msg += "888    888          888 888               888       888                  888      888 888 \n"; 
			msg += "888    888          888 888               888   o   888                  888      888 888 \n";
			msg += "888    888          888 888               888  d8b  888                  888      888 888 \n";
			msg += "8888888888  .d88b.  888 888  .d88b.       888 d888b 888  .d88b.  888d888 888  .d88888 888 \n";
			msg += "888    888 d8P  Y8b 888 888 d88''88b      888d88888b888 d88''88b 888P'   888 d88' 888 888 \n";
			msg += "888    888 88888888 888 888 888  888      88888P Y88888 888  888 888     888 888  888 Y8P \n";
			msg += "888    888 Y8b.     888 888 Y88..88P      8888P   Y8888 Y88..88P 888     888 Y88b 888  '  \n";
			msg += "888    888  'Y8888  888 888  'Y88P'       888P     Y888  'Y88P'  888     888  'Y88888 888 \n";
			System.out.println(msg);
			carga-= 3;
			menu();
		}else if(tampada == true){
			JOptionPane.showMessageDialog(null, "A Caneta esta Tampada!\n Por favor destampe a caneta!");
			menu();
		}else if(carga < 3) {
			JOptionPane.showMessageDialog(null, "A Caneta esta com " + carga + "% de Tinta!\n Voce precisa de 3% para escrever.");
			menu();
		}		
	}
	
	void desenhar() {
		String msg = "";
		if(tampada == false && carga >= 7) {
			Random random = new Random();
			int int_random = random.nextInt(5);			
			switch(int_random){
				case 0:
					msg="";
					msg += "▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\n";
					msg += "░░░░░░░░░░▀█▄▀▄▀██████░▀█▄▀▄▀████▀\n";
					msg += "░░░░░░░░░░░░▀█▄█▄███▀░░░▀██▄█▄█▀\n";
					System.out.println(msg);
					carga-= 7;
					menu();
					break;
				case 1:
					msg="";
					msg += "─▄▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄\n";
					msg += "█░░░█░░░░░░░░░░▄▄░██░█\n";
					msg += "█░▀▀█▀▀░▄▀░▄▀░░▀▀░▄▄░█\n";
					msg += "█░░░▀░░░▄▄▄▄▄░░██░▀▀░█\n";
					msg += "─▀▄▄▄▄▄▀─────▀▄▄▄▄▄▄▀\n";
					System.out.println(msg);
					carga-= 7;
					menu();
					break;
				case 2:
					msg="";
					msg += "───────────▀▄\n";
					msg += "──█▄▄▄▄▄███▀▄─▄▄\n";
					msg += "▄▀──▀▄─▀▀█▀▀▄▀──▀▄\n";
					msg += "▀▄▀▀█▀▀████─▀▄──▄▀\n";
					msg += "──▀▀──────────▀▀\n";
					System.out.println(msg);
					carga-= 7;
					menu();
					break;
				case 3:
					msg = "";
					msg += "░▄▀▀▀▀▄░░▄▄\n";
					msg += "█░░░░░░▀▀░░█░░░░░░▄░▄\n";
					msg += "█░║░░░░██░████████████\n";
					msg += "█░░░░░░▄▄░░█░░░░░░▀░▀\n";
					msg += "░▀▄▄▄▄▀░░▀▀\n";
					System.out.println(msg);
					carga-= 7;
					menu();
					break;
				case 4: 
					msg = "";
					msg += "──▒▒▒▒▒────▄████▄─────\n";
					msg += "─▒─▄▒─▄▒──███▄█▀──────\n";
					msg += "─▒▒▒▒▒▒▒─▐████──█──█──\n";
					msg += "─▒▒▒▒▒▒▒──█████▄──────\n";
					msg += "─▒─▒─▒─▒───▀████▀─────\n";
					System.out.println(msg);
					carga-= 7;
					menu();
					break;
			}		
		}else if(tampada == true){
			JOptionPane.showMessageDialog(null, "A Caneta esta Tampada!\n Por favor destampe a caneta!");
			menu();
		}else if(carga < 7) {
			JOptionPane.showMessageDialog(null, "A Caneta esta com " +carga+ "% de Tinta!\n Voce precisa de 7% para escrever.");
			menu();
		}
	}
	
	void tampar() {
		if(tampada == false) {
			tampada = true;
			JOptionPane.showMessageDialog(null, "Sua Caneta Foi Tampada!");
			menu();
		}else {
			JOptionPane.showMessageDialog(null, "A Caneta Ja esta Tampada!");
			menu();
		}
	}
	
	void destampar() {
		if(tampada == true) {
			tampada = false;
			JOptionPane.showMessageDialog(null, "Sua Caneta Foi Destampada!");
			menu();
		}else {
			JOptionPane.showMessageDialog(null, "A Caneta Ja esta Destampada!");
			menu();
		}
	}
	void menu() {
		int op;
		String txt = "";
		String status = "";
		
		if(tampada == true) {
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
		txt+= "\n\nTinta: " + carga + "%";
		txt+= "\nStatus: " + status; 
		op = Integer.parseInt(JOptionPane.showInputDialog(txt));
		while(op < 0 || op > 4) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Valor Invalido! \n Digite Novamente!\n" + txt));
		}
		switch(op) {
			case 0:
				JOptionPane.showMessageDialog(null, "Muito Obrigado! :)\n Bye Bye!");
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
