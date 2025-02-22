package musica;

import java.util.InputMismatchException;
import java.util.Scanner;
import inicio.inicioAplicativo;
import iphone.Iphone;
import java.util.Locale;


public class ReprodutorMusical extends inicioAplicativo{
	Scanner leitor = new Scanner(System.in);
	
	public void iniciarAplicacao() {
		
		try {
			System.out.println("============");
			System.out.println(" 1 - Play\n 2 - Stop\n 3 - Selecionar\n 4 - Voltar para tela inicial(vt)");
			System.out.println("O que você deseja?");
			int opcao = leitor.nextInt();
		
			switch(opcao) {
			case 1:{
				tocar();
				break;
			}
			case 2:{
				pausar();
				break;
			}
			case 3:{
				System.out.println("Informe a musica:");
				leitor.next();
				String musica = leitor.nextLine();
				selecionarMusica(musica);
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
	

	private void tocar() {
		System.out.println("Musica tocando");
	}
	private void pausar() {
		System.out.println("Musica pausada");
	}
	private void selecionarMusica(String musica) {
		System.out.println("Tocando: " + musica);
	}
	
}
