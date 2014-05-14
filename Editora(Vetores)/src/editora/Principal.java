package editora;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner entry = new Scanner (System.in);
	Livro[] L = new Livro[20];
	Revista[]R = new Revista[20];
	boolean controle = true;
	int op = 0;
	int contaLivro = 0;
	int contaRevista = 0;
	String cadLivro;
	String cadEdit;
	String cadAutor;
	int numPag =0;
	int i = 0;
	String cadRevista;
	String buscaNome = null;
	String buscaRevista = null;
	int cont = 0;
	
	L[0] = new Livro();
	L[1] = new Livro();
	L[2] = new Livro();
	L[3] = new Livro();
	L[4] = new Livro();
	L[5] = new Livro();
	L[6] = new Livro();
	L[7] = new Livro();
	L[8] = new Livro();
	L[9] = new Livro();
	L[10] = new Livro();
	L[11] = new Livro();
	L[12] = new Livro();
	L[13] = new Livro();
	L[14] = new Livro();
	L[15] = new Livro();
	L[16] = new Livro();
	L[17] = new Livro();
	L[18] = new Livro();
	L[19] = new Livro();
	
	R[0] = new Revista();
	R[1] = new Revista();
	R[2] = new Revista();
	R[3] = new Revista();
	R[4] = new Revista();
	R[5] = new Revista();
	R[6] = new Revista();
	R[7] = new Revista();
	R[8] = new Revista();
	R[9] = new Revista();
	R[10] = new Revista();
	R[11] = new Revista();
	R[12] = new Revista();
	R[13] = new Revista();
	R[14] = new Revista();
	R[15] = new Revista();
	R[16] = new Revista();
	R[17] = new Revista();
	R[18] = new Revista();
	R[19] = new Revista();
	
	
		do {
			System.out.println("Que operação você deseja realizar?"
							+ "\n 1 - Cadastrar Livros"
							+ "\n 2 - Cadastrar Revistas"
							+ "\n 3 - Visualizar Livros Cadastrados"
							+ "\n 4 - Visualizar Revistas Cadastradas"
							+ "\n 5 - Quantidade de Livros Cadastrados"
							+ "\n 6 - Quantidade de Revistas Cadastradas"
							+ "\n 7 - Mostrar Informações de Livro por Autor"
							+ "\n 8 - Mostrar Informações de Revista por Titulo e Edição"
							+ "\n 9 - Finalizar o Programa");
			op = entry.nextInt();

			
		
			switch (op) {

			case 1:
				// cadastraLivro
			
				while (controle == true){
				System.out.println("Digite o nome do Autor:");
				cadAutor = entry.next();
				L[i].setAutor(cadAutor);
				
				System.out.println("Digite o numero de Páginas:");
				numPag = entry.nextInt();
				L[i].setNumeroDePaginas(numPag);
				
				System.out.println("Digite a editora: ");
				cadEdit = entry.next();
				L[i].setEditora(cadEdit);
				
				System.out.println("Digite o Titulo do livro: ");
				cadLivro = entry.next();
				L[i].setTitulo(cadLivro);
				
				
				System.out.println("Deseja cadastrar outro livro?");
				cadLivro= entry.next().toUpperCase();
				controle= cadLivro.equals("S")?true:false;
				contaLivro++;
				}
				break;

			case 2:
				// cadastraRevista
				
				while (controle == true){
					System.out.println("Digite o nome da Revista:");
					cadRevista = entry.nextLine();
					R[i].setTitulo(cadRevista);
					
					System.out.println("Digite a categoria da Revista:");
					cadRevista = entry.nextLine();
					R[i].setCategoria(cadRevista);
					
					System.out.println("Digite a quantidade de páginas da Revista:");
					numPag = entry.nextInt();
					L[i].setNumeroDePaginas(numPag);
					contaRevista++;
					
					System.out.println("Deseja cadastrar outra revista?");
					cadLivro= entry.next().toUpperCase();
					controle= cadLivro.equals("S")?true:false;
					};
				break;

			case 3:
				// visualiza livros...
				for (i= 0; i < L.length; i++)
					System.out.println(L[i]);
				break;

			case 4:
				// visualiza revistas...
				for (i = 0; i < R.length; i++)
					System.out.println(R[i]);
				break;
			case 5:
				// mostra quantidade de livros...
				System.out.println("A quantidade de livros cadastrados é: "+ contaLivro);
				break;

			case 6:
				// mostra quantidade de revistas...
				System.out.println("A quantidade de revistas cadastradas é: "+ contaRevista);
				break;

			case 7:
				// busca pelo nome do autor...
				
				System.out.println("Digite o nome do registro para busca");
				buscaNome = entry.next();
				if (buscaNome.contentEquals(L[cont].getAutor())) {
					System.out.println("Livro:" + L[cont].getTitulo());
					System.out.println("Editora:"+L[cont].getEditora());
					System.out.println("Numero de Páginas:"+L[cont].getNumeroDePaginas());

				} else
					System.out.println("Nome não encontrado");
				cont++;
				break;

			case 8:
				// busca pelo titulo e edição...
				System.out.println("Digite o nome do registro para busca");
				buscaRevista = entry.next();
				if (buscaRevista.contentEquals(R[cont].getTitulo())) {
					System.out.println("Livro:" + R[cont].getTitulo());
					System.out.println("Editora:"+R[cont].getEdicao());
					System.out.println("Numero de Páginas:"+L[cont].getNumeroDePaginas());
				} else
					System.out.println("Revista não encontrada");
				cont++;
				
				break;

			case 9:
				// encerra o programa...
				System.out.println("Ficamos felizes em ajudar na sua leitura");
				break;

			default:
				System.out.println("Opção Inválida, tente de novo.");
			}
		} while (op != 9);

		System.out.println("\nLer é viajar, viaje sempre conosco.");
	}

}
