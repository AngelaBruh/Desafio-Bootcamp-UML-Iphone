package telefonico;

import java.util.Scanner;
import inicio.inicioAplicativo;
import iphone.Iphone;
import java.util.InputMismatchException;
import java.util.Locale;

public class AparelhoTelefonico extends inicioAplicativo{
	Scanner leitor = new Scanner(System.in);
	
	public void iniciarAplicacao() {
		try {
			System.out.println("============");
			System.out.println(" 1 - Relizar ligação\n 2 - Atender Ligação\n 3 - Gravar um correio de Voz\n 4 - Voltar para tela inicial(vt)");
			System.out.println("Digite uma das opções:");
			int opcao = leitor.nextInt();
		
			switch(opcao) {
			case 1:{
				System.out.println("Digite o numero:");
				leitor.next();
				String numero = leitor.nextLine();
				ligar(numero);
				break;
			}
			case 2:{
				atender();
				break;
			}
			case 3:{
				iniciarCorreioVoz();
				break;
			}
			case 4:{
				Iphone.escolhaAplicacao(null);
				break;
			}
			default:
				System.out.println("Opção Invalida.");
				iniciarAplicacao();
			}		
			leitor.close();
		}catch(InputMismatchException e){
			System.out.println("Informe um valor valido!");
			Iphone.escolhaAplicacao(null);
		}
	}




	private void ligar(String numero) {
		System.out.println("Chamando ...");
	}
	private void atender() {
		System.out.println("Ligação em andamento");
	}
	private void iniciarCorreioVoz() {
		System.out.println("Mensagem encaminhada para o correio de voz");
	}

}
