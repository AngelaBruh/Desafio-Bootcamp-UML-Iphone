package navegador;

import java.util.Scanner;
import inicio.inicioAplicativo;
import java.util.InputMismatchException;
import java.util.Locale;
import iphone.Iphone;

public class NavegadorInternet extends inicioAplicativo{
	Scanner leitor = new Scanner(System.in);
	
	public void iniciarAplicacao() {
		try {
			System.out.println("============");
			System.out.println(" 1 - Pesquisar\n 2 - Adicionar uma nova aba\n 3 - Atualizar Pagina\n 4 - Voltar para tela inicial");
			System.out.println("O que você deseja?");
			int opcao = leitor.nextInt();
		
			switch(opcao){
				case 1:{
					System.out.println("Campo de pesquisa:");
					leitor.next();
					String url = leitor.nextLine();
					exibirPagina(url);
					break;
				}
				case 2:{
					adicionarNovaAba();
					break;
				}
				case 3:{
					atualizarPagina();
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
	
	
	
	private void exibirPagina(String url) {
		System.out.println("Exibindo: " + url);
	}
	private void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}
	private void atualizarPagina() {
		System.out.println("Pagina atualizada");
	}
}
