package revisao01;

import javax.swing.*;
import java.util.Random;

public class Caneta {
	//Atributos
	String modelo;
	String cor;
	double ponta;
	int  carga;
	boolean tampada;
	
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
		}else if(tampada == true){
			JOptionPane.showMessageDialog(null, "A Caneta esta tampada!");
		}else if(carga < 3) {
			JOptionPane.showMessageDialog(null, "A Caneta esta sem tinta!");
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
					break;
			}		
		}
	}
	
	void tampar() {
		
	}
	
	void destampar() {
		
	}
}
