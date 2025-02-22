package iphone;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
import musica.ReprodutorMusical;
import telefonico.AparelhoTelefonico;
import navegador.NavegadorInternet;

public class  Iphone {
	public static void escolhaAplicacao(String[] args) {
		try {
		System.out.println("==================================================================");
		System.out.println("Parabens por utilizar Iphone! ^-^");	
		
		Scanner leitor = new Scanner (System.in);		

		System.out.println("Escolha uma de nossas aplicações informando sua letra:");
		System.out.println(" Aparelho Telefonico(1)\n Navegador Internet(2)\n Reprodutor Musical(3)");
		int opcao = leitor.nextInt();
		
		
			switch(opcao) {
				case 1:{
					AparelhoTelefonico at = new AparelhoTelefonico();
					at.iniciarAplicacao();
					break;
				}
				case 2:{
					NavegadorInternet nav = new NavegadorInternet();
					nav.iniciarAplicacao();
					break;
				}
				case 3:{
					ReprodutorMusical msc = new ReprodutorMusical();
					msc.iniciarAplicacao();
					break;
				}
				default:
					System.out.println("Opção Invalida.");
					Iphone.escolhaAplicacao(null);
			}
			leitor.close();
		}catch(InputMismatchException e){
			System.out.println("Informe um valor valido!");
			Iphone.escolhaAplicacao(null);
		}
		
	}				
}
